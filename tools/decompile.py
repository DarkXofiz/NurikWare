#!/usr/bin/env python3
# python3, decompile.py, GitHub Actions runner (ubuntu-latest), hedef: NurikWare.jar (Fabric mod, MC 1.21.11)
#
# Akis:
#   1. original/NurikWare.jar bozuk mu / boyutu dogru mu kontrol et
#   2. fabric.mod.json'dan MC surumunu oku
#   3. Fabric Meta API'den o MC surumu icin yarn mergedv2 mapping'i indir
#   4. NurikWare.jar'i intermediary -> yarn (named) isimlerine remap et (tiny-remapper)
#   5. Remap edilmis jar'i Vineflower ile decompile et (sadece kendi kod paketleri)
#   6. Gomulu ucuncu parti kutuphaneleri (sodium, iris, via*, vs) ayikla, libs/ altina koy,
#      kendi kaynaktan cikar (bunlar Gradle dependency olarak cekilecek)
#   7. Vineflower'in bozdugu bilinen kaliplari script ile otomatik duzelt
#   8. accesswidener varsa named'e cevir
#   9. src/main/java altina yaz, git commit

import json
import os
import re
import shutil
import subprocess
import sys
import urllib.request
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
ORIGINAL_JAR = ROOT / "original" / "NurikWare.jar"
WORK = ROOT / ".decompile_work"
SRC_OUT = ROOT / "src" / "main" / "java"
RES_OUT = ROOT / "src" / "main" / "resources"
LIBS_OUT = ROOT / "libs"
VINEFLOWER_VERSION = "1.11.1"
TINY_REMAPPER_VERSION = "0.10.4"
VINEFLOWER_URL = f"https://github.com/Vineflower/vineflower/releases/download/{VINEFLOWER_VERSION}/vineflower-{VINEFLOWER_VERSION}.jar"
TINY_REMAPPER_URL = f"https://maven.fabricmc.net/net/fabricmc/tiny-remapper/{TINY_REMAPPER_VERSION}/tiny-remapper-{TINY_REMAPPER_VERSION}-fat.jar"

# kendi kodumuzun yasadigi top-level paketler (jar icindeki klasor adlari).
# bunlarin disindaki her sey gomulu ucuncu parti kutuphane -> libs/'e tasinir, decompile edilmez.
OWN_PACKAGE_PREFIXES = ["NurikWare/", "nurikware/", "page/"]
OWN_ROOT_CLASSES = ["Main.class", "Main$MethodEntry.class", "NurContact.class",
                     "NurContainer.class", "NurContainer$Origin.class",
                     "NurCv.class", "NurCv$Arr.class", "NurCv$Bool.class",
                     "NurCv$Nil.class", "NurCv$Num.class", "NurCv$Obj.class",
                     "NurCv$Str.class", "NurEntry.class", "NurJson.class",
                     "NurMeta.class", "NurPerson.class", "NurVersion.class"]

# jar icindeki top-level paket -> (maven group:artifact:version, repo) haritasi.
# version bilinmiyorsa en yakin bilinen surum yazildi, derleme sirasinda hata verirse
# build.gradle'daki yorumdan degistirilir.
EMBEDDED_LIBS = {
    "net/caffeinemc/mods/sodium": "me.jellysquid.mods:sodium-fabric:UNKNOWN  # jar icinden surum cikarilamadi, mod jar'inin MANIFEST'inde gecmiyor",
    "net/caffeinemc/mods/lithium": "me.jellysquid.mods:lithium-fabric:UNKNOWN",
    "net/caffeinemc/caffeineconfig": "com.caffeinemc:caffeineconfig:UNKNOWN",
    "net/irisshaders/iris": "maven.modrinth:iris:UNKNOWN",
    "net/lenni0451/reflect": "net.lenni0451:Reflect:UNKNOWN",
    "net/lenni0451/commons": "net.lenni0451:Commons:UNKNOWN",
    "net/lenni0451/mcstructs_bedrock": "net.raphimc:mcstructs-bedrock:UNKNOWN",
    "net/raphimc/vialegacy": "net.raphimc:ViaLegacy:UNKNOWN",
    "net/raphimc/viabedrock": "net.raphimc:ViaBedrock:UNKNOWN",
    "net/raphimc/minecraftauth": "net.raphimc:MinecraftAuth:UNKNOWN",
    "baritone": "baritone:baritone-api:UNKNOWN  # cezax auto-dl icin jitpack gerekebilir",
    "oshi": "com.github.oshi:oshi-core:UNKNOWN",
    "mcstructs": "net.raphimc:mcstructs:UNKNOWN",
    "kotlin/jvm": "org.jetbrains.kotlin:kotlin-stdlib:UNKNOWN",
}


def log(msg):
    print(f"[decompile] {msg}", flush=True)


def fail(msg):
    print(f"[decompile] HATA: {msg}", file=sys.stderr, flush=True)
    sys.exit(1)


# ---------- adim 1: jar dogrulama ----------

def verify_jar():
    if not ORIGINAL_JAR.exists():
        fail(f"{ORIGINAL_JAR} yok. jar'i telefonda original/NurikWare.jar olarak yukle, "
             f"GitHub web arayuzunden ISIM DEGISTIRME (dosya bozulur).")

    size = ORIGINAL_JAR.stat().st_size
    log(f"jar boyutu: {size:,} byte")
    if size < 1_000_000:
        fail(f"jar sadece {size} byte, bu bir NurikWare jar'i olamaz (beklenen ~50-60 MB). "
             f"Upload bozuk, tekrar yukle.")

    if not zipfile.is_zipfile(ORIGINAL_JAR):
        fail("jar gecerli bir zip degil (magic bytes uyusmuyor). "
             "GitHub web UI uzerinden rename/duzenleme jar'i bozar - telefonda dosya "
             "yoneticisinden adini degistirip tekrar yukle.")

    with zipfile.ZipFile(ORIGINAL_JAR) as zf:
        bad = zf.testzip()
        if bad is not None:
            fail(f"zip icinde bozuk giris: {bad}")
        names = zf.namelist()
        if "fabric.mod.json" not in names:
            fail("fabric.mod.json jar icinde yok, bu Fabric mod'u degil ya da jar yarim yuklenmis.")
        if "META-INF/MANIFEST.MF" not in names:
            fail("META-INF/MANIFEST.MF yok, jar bozuk.")
    log(f"jar gecerli: {len(names)} giris, zip bütünlüğü OK")


def read_mc_version():
    with zipfile.ZipFile(ORIGINAL_JAR) as zf:
        meta = json.loads(zf.read("fabric.mod.json"))
    mod_id = meta.get("id", "?")
    mod_version = meta.get("version", "?")
    license_ = meta.get("license", "?")
    log(f"mod id={mod_id} version={mod_version} license={license_}")
    # fabric.mod.json'da dogrudan MC surumu yok (depends.minecraft: "*"), bu yuzden
    # versiyonu jar icindeki net/minecraft/ class'larinin bulundugu META-INF/versions
    # veya mod version string'inden al: "1.21.11" bu mod'un kendi surumu VE hedef MC
    # surumuyle ayni (NurikWare Team surum numarasini MC'ye eslemis).
    mc_version = mod_version
    if not re.match(r"^\d+\.\d+(\.\d+)?$", mc_version):
        fail(f"mod version '{mc_version}' bir MC surumune benzemiyor, "
             f"README'de MC surumunu elle belirtip script'i duzenle.")
    log(f"hedef Minecraft surumu: {mc_version} (mod version alanindan)")
    return mc_version


# ---------- adim 2: arac indirme ----------

def download(url, dest):
    if dest.exists():
        log(f"zaten var, atlaniyor: {dest.name}")
        return
    log(f"indiriliyor: {url}")
    urllib.request.urlretrieve(url, dest)
    log(f"indirildi: {dest} ({dest.stat().st_size:,} byte)")


def fetch_yarn_mappings(mc_version, dest_tiny):
    # Fabric Meta API: hangi yarn build'i bu MC surumune ait, en yenisini al
    meta_url = f"https://meta.fabricmc.net/v2/versions/yarn/{mc_version}"
    log(f"yarn meta sorgulaniyor: {meta_url}")
    with urllib.request.urlopen(meta_url) as r:
        builds = json.loads(r.read())
    if not builds:
        fail(f"Fabric Meta'da MC {mc_version} icin yarn mapping bulunamadi. "
             f"MC surumu yanlis olabilir, fabric.mod.json'u elle kontrol et.")
    latest = builds[0]
    yarn_version = latest["version"]
    log(f"yarn surumu: {yarn_version}")
    jar_url = f"https://maven.fabricmc.net/net/fabricmc/yarn/{yarn_version}/yarn-{yarn_version}-mergedv2.jar"
    tmp_jar = WORK / "yarn-mergedv2.jar"
    download(jar_url, tmp_jar)
    with zipfile.ZipFile(tmp_jar) as zf:
        tiny_name = next((n for n in zf.namelist() if n.endswith(".tiny")), None)
        if not tiny_name:
            fail("yarn mergedv2 jar icinde .tiny dosyasi bulunamadi.")
        with zf.open(tiny_name) as src, open(dest_tiny, "wb") as dst:
            shutil.copyfileobj(src, dst)
    return yarn_version


# ---------- adim 3: tiny mapping -> remap icin kullanilabilir hale getir ----------
# yarn mergedv2 formati: ilk satir "tiny\t2\t0\tofficial\tintermediary\tnamed"
# basliktaki sira SABIT degil varsayilmamali, elle okunur.

def parse_tiny_header(tiny_path):
    with open(tiny_path, "r", encoding="utf-8") as f:
        header = f.readline().strip().split("\t")
    # header: ["tiny", "2", "0", col0, col1, col2, ...]
    cols = header[3:]
    log(f"tiny mapping sutunlari: {cols}")
    try:
        idx_official = cols.index("official")
        idx_intermediary = cols.index("intermediary")
        idx_named = cols.index("named")
    except ValueError as e:
        fail(f"tiny dosyasinda beklenen sutun yok: {e}. Sutunlar: {cols}")
    return idx_official, idx_intermediary, idx_named


def strip_multi_release(in_jar, out_jar):
    """NurikWare.jar bir multi-release jar: META-INF/versions/<N>/... altinda Java 24
    hedefli alternatif class dosyalari var (lenni0451/reflect ClassFile API, Java 24'te
    eklenen classfile API'sini kullaniyor). tiny-remapper'daki ASM surumu bu bytecode'u
    (major version 68) analiz edemiyor ve patliyor. Bu yollar calisma zamaninda sadece
    o JVM surumu calisirken devreye giriyor - decompile icin gereksiz, temizleyip
    base (Java 21 hedefli) class'larla devam ediyoruz."""
    removed = 0
    with zipfile.ZipFile(in_jar) as zin, zipfile.ZipFile(out_jar, "w", zipfile.ZIP_DEFLATED) as zout:
        for item in zin.infolist():
            if item.filename.startswith("META-INF/versions/"):
                removed += 1
                continue
            if item.filename == "META-INF/MANIFEST.MF":
                data = zin.read(item.filename)
                # Multi-Release: true basligini da kaldir, artik MRJ degil
                data = re.sub(rb"Multi-Release:\s*true\r?\n", b"", data)
                zout.writestr(item, data)
                continue
            zout.writestr(item, zin.read(item.filename))
    log(f"multi-release versions/ temizlendi: {removed} dosya cikarildi -> {out_jar.name}")


def run_tiny_remapper(remapper_jar, tiny_path, in_jar, out_jar, from_ns, to_ns):
    classpath = str(WORK / "cp")
    cmd = [
        "java", "-jar", str(remapper_jar),
        str(in_jar), str(out_jar), str(tiny_path),
        from_ns, to_ns,
    ]
    log(f"tiny-remapper calistiriliyor: {from_ns} -> {to_ns}")
    r = subprocess.run(cmd, capture_output=True, text=True)
    if r.returncode != 0:
        log(r.stdout[-3000:])
        log(r.stderr[-3000:])
        fail(f"tiny-remapper basarisiz (exit {r.returncode})")
    log(f"remap tamam: {out_jar}")


# ---------- adim 4: gomulu kutuphaneleri ayir ----------

def split_own_vs_libs(jar_path, own_jar_path, libs_dir):
    """jar icindeki class/resource'lari kendi kod (own_jar_path) ve gomulu
    kutuphaneler (libs_dir/<lib>.jar) olarak ikiye ayirir."""
    libs_dir.mkdir(parents=True, exist_ok=True)
    lib_buffers = {}  # top-level prefix -> list of (name, bytes)
    own_entries = []

    with zipfile.ZipFile(jar_path) as zf:
        for info in zf.infolist():
            name = info.filename
            if name.endswith("/"):
                continue
            data = zf.read(name)

            if any(name.startswith(p) for p in OWN_PACKAGE_PREFIXES) or name in OWN_ROOT_CLASSES \
               or name in ("fabric.mod.json", "META-INF/MANIFEST.MF") or name.startswith("assets/nurikware"):
                own_entries.append((name, data))
                continue

            matched_prefix = None
            for prefix in EMBEDDED_LIBS:
                if name.startswith(prefix):
                    matched_prefix = prefix
                    break
            if matched_prefix:
                lib_buffers.setdefault(matched_prefix, []).append((name, data))
            else:
                # taninmayan ekstra dosya (baska embedded lib ya da assets) -> own'a dahil
                # etme, ayri "misc" lib'e at ki kaynak agacini kirletmesin
                lib_buffers.setdefault("_misc", []).append((name, data))

    with zipfile.ZipFile(own_jar_path, "w", zipfile.ZIP_DEFLATED) as out:
        for name, data in own_entries:
            out.writestr(name, data)
    log(f"kendi kod jar'i: {len(own_entries)} giris -> {own_jar_path.name}")

    for prefix, entries in lib_buffers.items():
        safe_name = prefix.strip("/").replace("/", "_") or "misc"
        lib_jar = libs_dir / f"{safe_name}.jar"
        with zipfile.ZipFile(lib_jar, "w", zipfile.ZIP_DEFLATED) as out:
            for name, data in entries:
                out.writestr(name, data)
        log(f"gomulu lib ayristi: {prefix or '(misc)'} -> {lib_jar.name} ({len(entries)} giris)")

    log("NOT: libs/ altindaki jar'lar sadece referans icin duruyor, build.gradle bunlari "
        "DEGIL gercek Maven koordinatlariyla cekiyor (bkz. EMBEDDED_LIBS haritasi script basinda). "
        "UNKNOWN surumu olanlari build hata verirse elle duzelt.")


# ---------- adim 5: vineflower decompile ----------

def run_vineflower(vf_jar, in_jar, out_dir):
    out_dir.mkdir(parents=True, exist_ok=True)
    cmd = [
        "java", "-jar", str(vf_jar),
        "-dgs=1",        # decompile generic signatures
        "-rsy=1",        # remove synthetic
        "-rbr=1",        # remove bridge methods
        "-das=1",        # decompile assert statements
        "-hes=0", "-hdc=0",
        "-jvn=1",        # java var names kullan (LVT varsa)
        "-iec=1",        # include entry classes dis bilgisi
        str(in_jar), str(out_dir),
    ]
    log("Vineflower calistiriliyor (bu adim buyuk jar icin uzun surebilir)...")
    r = subprocess.run(cmd, capture_output=True, text=True)
    log(r.stdout[-5000:])
    if r.returncode != 0:
        log(r.stderr[-5000:])
        fail(f"Vineflower basarisiz (exit {r.returncode})")
    log("Vineflower tamamlandi")


def extract_decompiled_jar(decompiled_out_dir, dest_src_dir):
    """Vineflower'a cikti olarak bir DIZIN verildiginde (jar degil), .java dosyalarini
    dogrudan paket yapisiyla o dizine yazar - ayrica bir jar/zip uretmez. decompiled_out_dir
    altindaki her .java dosyasini dest_src_dir'e, paket yolunu koruyarak tasir.
    Not: Vineflower bazen input jar'in adini tasiyan bir alt-dizin de olusturabilir
    (ornegin <out>/NurikWare-own/...), o yuzden rglob ile tum agac taraniyor."""
    found = list(decompiled_out_dir.rglob("*.java"))
    if not found:
        # bazi Vineflower surumleri ayrica <isim>.jar da uretebilir (eski davranis), yedek kontrol
        jar_candidates = list(decompiled_out_dir.glob("*.jar"))
        if jar_candidates:
            dest_src_dir.mkdir(parents=True, exist_ok=True)
            with zipfile.ZipFile(jar_candidates[0]) as zf:
                for info in zf.infolist():
                    if info.filename.endswith(".java"):
                        zf.extract(info, dest_src_dir)
            found = list(dest_src_dir.rglob("*.java"))
        if not found:
            fail(f"Vineflower ciktisinda .java dosyasi bulunamadi. "
                 f"Bakilan dizin: {decompiled_out_dir}")
            return []
        return found

    dest_src_dir.mkdir(parents=True, exist_ok=True)
    moved = []
    for java_file in found:
        rel = java_file.relative_to(decompiled_out_dir)
        target = dest_src_dir / rel
        target.parent.mkdir(parents=True, exist_ok=True)
        shutil.move(str(java_file), str(target))
        moved.append(target)
    log(f"{len(moved)} .java dosyasi cikarildi -> {dest_src_dir}")
    return moved


# ---------- adim 6: vineflower bozukluklarini otomatik duzelt ----------

FIX_PATTERNS = [
    # 1) StringConcatFactory.makeConcatWithConstants(...) -> okunabilir string concat.
    #    Vineflower bazen invokedynamic string concat'i cozemez ve ham cagriyi birakir.
    #    Guvenli genel donusum yok (parametre sayisi degisken), bu yuzden sadece
    #    isaretleyip yoruma not dusuyoruz; elle duzeltme gerekir.
    (
        re.compile(r"StringConcatFactory\.makeConcatWithConstants"),
        None,  # ozel islenir, asagida
        "StringConcatFactory.makeConcatWithConstants cozulemedi, elle string concat'e cevir",
    ),
    # 2) (boolean)0 ile x++ karismasi: Vineflower bazen post-increment'i
    #    yanlis bir bool cast olarak basar. "(boolean)0" -> "false", "(boolean)1" -> "true"
    (re.compile(r"\(boolean\)\s*0\b"), "false", None),
    (re.compile(r"\(boolean\)\s*1\b"), "true", None),
]


def fix_concat_factory(text, filename):
    """StringConcatFactory.makeConcatWithConstants(...) satirlarini bulup
    TODO degil ama acik bir FIXME_CONCAT isaretiyle birakir, satir numarasiyla rapora yazilir."""
    hits = []
    for i, line in enumerate(text.splitlines(), 1):
        if "StringConcatFactory.makeConcatWithConstants" in line:
            hits.append((i, line.strip()))
    return hits


def fix_mixin_duck_casts(text):
    """mixin duck-interface cast kaliplari: ((IFoo)someObj).fooMethod() seklindeki
    cast'lerde hedef tip jar icinde yoksa (mixin tarafindan runtime'da eklendigi icin)
    derleme patlar. (Object) araya eklenerek erasure bypass edilir - cast sonucu yine
    de calisma zamaninda dogru tipe gider, derleyici sadece statik tip kontrolunu atlar.
    Bu donusum SADECE bilinen 'I' + BuyukHarf ile baslayan interface cast kaliplarina uygulanir."""
    pattern = re.compile(r"\(\s*(I[A-Z][A-Za-z0-9_]*)\s*\)\s*(\([^()]*\)|[A-Za-z_][A-Za-z0-9_.]*)")

    def repl(m):
        iface, expr = m.group(1), m.group(2)
        return f"(({iface})(Object){expr})"

    # bu donusum agresif oldugu icin varsayilan KAPALI: build.yml hata verdiginde
    # dosya bazinda elle acilir. Burada sadece fonksiyon taniml, cagrilmiyor.
    return pattern, repl


def fix_boolean_cast_confusion(text):
    new_text = text
    changed = 0
    for pattern, repl, _ in FIX_PATTERNS:
        if repl is None:
            continue
        new_text, n = pattern.subn(repl, new_text)
        changed += n
    return new_text, changed


def fix_getvalue_ternary(text):
    """'someCv.getValue() ? a : b' kalibinda getValue() Object donuyorsa
    (NurCv.Bool gibi kutulanmis tipler icin sik), derleyici 'bad operand types
    for ?' hatasi verir. (Boolean) cast ekleyip auto-unboxing'i tetikleriz."""
    pattern = re.compile(r"(\b\w+(?:\.\w+)*\.getValue\(\))(\s*\?)")
    new_text, n = pattern.subn(r"((Boolean)\1)\2", text)
    return new_text, n


def apply_fixes(java_files, report_path):
    report_lines = ["# Vineflower otomatik duzeltme raporu", ""]
    total_bool_fix = 0
    total_getvalue_fix = 0
    concat_warnings = []

    for path in java_files:
        text = path.read_text(encoding="utf-8", errors="replace")
        original = text

        text, n_bool = fix_boolean_cast_confusion(text)
        total_bool_fix += n_bool

        text, n_getval = fix_getvalue_ternary(text)
        total_getvalue_fix += n_getval

        concat_hits = fix_concat_factory(text, path.name)
        if concat_hits:
            rel = path.relative_to(path.parents[len(path.parts) - path.parts.index("java") - 1]) \
                if "java" in path.parts else path.name
            for line_no, line_text in concat_hits:
                concat_warnings.append(f"- `{path.name}:{line_no}` → `{line_text[:120]}`")

        if text != original:
            path.write_text(text, encoding="utf-8")

    report_lines.append(f"- (boolean)0/1 -> false/true duzeltmesi: {total_bool_fix} yer")
    report_lines.append(f"- getValue() ternary (Boolean) cast eklendi: {total_getvalue_fix} yer")
    report_lines.append("")
    if concat_warnings:
        report_lines.append(f"## StringConcatFactory.makeConcatWithConstants - ELLE DUZELT ({len(concat_warnings)} yer)")
        report_lines.append("")
        report_lines.append("Bu cagrilar otomatik cozulemiyor, derleme hatasi verecek. Her biri icin "
                             "satiri okuyup gercek string concat ifadesine (`\"a\" + b + \"c\"`) cevir.")
        report_lines.append("")
        report_lines.extend(concat_warnings)
        report_lines.append("")
    else:
        report_lines.append("StringConcatFactory.makeConcatWithConstants kalibina rastlanmadi.")
        report_lines.append("")

    report_lines.append("## mixin duck-interface cast (IFoo)x")
    report_lines.append("")
    report_lines.append("Bu otomatik ACIK DEGIL (yanlis pozitif riski yuksek). Build hata verip "
                         "`cannot find symbol: class IFoo` gibi bir sey gorursen, o satirdaki "
                         "`(IFoo)x` kalibini `((IFoo)(Object)x)` yap.")
    report_lines.append("")

    report_path.write_text("\n".join(report_lines), encoding="utf-8")
    log(f"duzeltme raporu yazildi: {report_path}")
    log(f"  bool cast duzeltmesi: {total_bool_fix}")
    log(f"  getValue ternary cast: {total_getvalue_fix}")
    log(f"  concat elle-duzelt: {len(concat_warnings)}")


# ---------- adim 7: accesswidener ----------

def remap_accesswidener(idx_official, idx_intermediary, idx_named, tiny_path):
    aw_files = list(ROOT.glob("**/*.accesswidener"))
    with zipfile.ZipFile(ORIGINAL_JAR) as zf:
        aw_in_jar = [n for n in zf.namelist() if n.endswith(".accesswidener")]
        if not aw_in_jar:
            log("jar icinde .accesswidener yok, atlaniyor.")
            return
        for name in aw_in_jar:
            raw = zf.read(name).decode("utf-8")

    # intermediary -> named class/method/field eslemesi tiny dosyasindan okunur
    class_map = {}
    member_map = {}  # (owner_intermediary, name, desc) -> named_name  (basit versiyon: sadece isim)
    with open(tiny_path, "r", encoding="utf-8") as f:
        next(f)  # header
        current_class_inter = None
        current_class_named = None
        for line in f:
            parts = line.rstrip("\n").split("\t")
            if not parts or not parts[0]:
                continue
            kind = parts[0]
            cols = parts[1:]
            if kind == "c":
                current_class_inter = cols[idx_intermediary]
                current_class_named = cols[idx_named]
                class_map[current_class_inter] = current_class_named
            elif kind in ("m", "f") and current_class_inter:
                inter_name = cols[idx_intermediary + 1] if kind == "m" else cols[idx_intermediary]
                # tiny v2 method/field satir formati: m <desc> <official> <intermediary> <named>
                # basitlik icin sadece isim eslemesi tutuluyor (named class + named member adi)
                try:
                    named_name = cols[idx_named + (1 if kind == "m" else 0)]
                except IndexError:
                    continue
                member_map[(current_class_inter, inter_name)] = named_name

    def remap_class_token(token):
        return class_map.get(token.replace(".", "/"), token).replace("/", ".")

    out_lines = []
    for line in raw.splitlines():
        stripped = line.strip()
        if not stripped or stripped.startswith("#"):
            out_lines.append(line)
            continue
        tokens = stripped.split()
        if tokens[0] == "accessWidener":
            out_lines.append(line)
            continue
        # format: <access> <type> <owner> [<member> <descriptor>]
        if len(tokens) >= 3:
            access, kind = tokens[0], tokens[1]
            owner = tokens[2]
            owner_named = remap_class_token(owner)
            if len(tokens) >= 4 and kind in ("method", "field"):
                member = tokens[3]
                owner_inter_slash = owner.replace(".", "/")
                named_member = member_map.get((owner_inter_slash, member), member)
                rest = " ".join(tokens[4:])
                out_lines.append(f"{access}\t{kind}\t{owner_named.replace('.', '/')}\t{named_member}\t{rest}".rstrip())
            else:
                out_lines.append(f"{access}\t{kind}\t{owner_named.replace('.', '/')}")
        else:
            out_lines.append(line)

    out_path = RES_OUT / "nurikware.accesswidener"
    RES_OUT.mkdir(parents=True, exist_ok=True)
    out_path.write_text("\n".join(out_lines) + "\n", encoding="utf-8")
    log(f"accesswidener named'e cevrildi -> {out_path}")


# ---------- main ----------

def main():
    force = "--force" in sys.argv

    if SRC_OUT.exists() and any(SRC_OUT.iterdir()) and not force:
        fail(f"{SRC_OUT} zaten dolu. Elle duzenleme yaptiysan bootstrap'i tekrar "
             f"calistirmak hepsini SILER. Devam etmek icin workflow'u 'force: true' "
             f"parametresiyle tekrar calistir (Actions -> Bootstrap -> Run workflow -> force).")

    if force and SRC_OUT.exists():
        log("force=true: src/main/java siliniyor ve yeniden olusturuluyor.")
        shutil.rmtree(SRC_OUT)

    WORK.mkdir(parents=True, exist_ok=True)

    verify_jar()
    mc_version = read_mc_version()

    vf_jar = WORK / f"vineflower-{VINEFLOWER_VERSION}.jar"
    remapper_jar = WORK / f"tiny-remapper-{TINY_REMAPPER_VERSION}.jar"
    download(VINEFLOWER_URL, vf_jar)
    download(TINY_REMAPPER_URL, remapper_jar)

    tiny_path = WORK / "yarn-mappings.tiny"
    yarn_version = fetch_yarn_mappings(mc_version, tiny_path)
    idx_official, idx_intermediary, idx_named = parse_tiny_header(tiny_path)

    # jar multi-release (META-INF/versions/24/...) - tiny-remapper bunu analiz edemiyor,
    # once temizliyoruz.
    stripped_jar = WORK / "NurikWare-stripped.jar"
    strip_multi_release(ORIGINAL_JAR, stripped_jar)

    # NurikWare.jar intermediary isimlendirmeyle derlenmis (Fabric Loom build ciktisi).
    # tiny-remapper ile intermediary -> named (yarn) remap ediyoruz.
    remapped_jar = WORK / "NurikWare-named.jar"
    run_tiny_remapper(remapper_jar, tiny_path, stripped_jar, remapped_jar,
                       "intermediary", "named")

    own_jar = WORK / "NurikWare-own.jar"
    split_own_vs_libs(remapped_jar, own_jar, LIBS_OUT)

    decompiled_dir = WORK / "decompiled"
    run_vineflower(vf_jar, own_jar, decompiled_dir)
    java_files = extract_decompiled_jar(decompiled_dir, SRC_OUT)

    if not java_files:
        fail("Decompile sonucu 0 .java dosyasi. Vineflower loglarina bak (yukarida).")

    report_path = ROOT / "DECOMPILE_REPORT.md"
    apply_fixes(java_files, report_path)

    remap_accesswidener(idx_official, idx_intermediary, idx_named, tiny_path)

    with open(ROOT / "DECOMPILE_REPORT.md", "a", encoding="utf-8") as f:
        f.write(f"\n## Ozet\n\n")
        f.write(f"- Kaynak jar: `NurikWare.jar` (sha256 original/'de kontrol edilir)\n")
        f.write(f"- Minecraft: `{mc_version}`\n")
        f.write(f"- Yarn: `{yarn_version}`\n")
        f.write(f"- Vineflower: `{VINEFLOWER_VERSION}`\n")
        f.write(f"- tiny-remapper: `{TINY_REMAPPER_VERSION}`\n")
        f.write(f"- Yazilan .java dosyasi: {len(java_files)}\n")
        f.write(f"- Gomulu kutuphane sayisi: {len(list(LIBS_OUT.glob('*.jar')))}\n")
        f.write("\nDecompile ciktisi orijinal kaynakla BIREBIR AYNI DEGILDIR: degisken "
                "isimleri, bazi kontrol akislari ve generic bilgiler kayip olabilir. "
                "Derleme hata verirse build.yml 'Hata ozeti' adiminin ciktisini kullanip "
                "dosya bazinda elle duzelt.\n")

    log("decompile akisi tamamlandi.")


if __name__ == "__main__":
    main()
