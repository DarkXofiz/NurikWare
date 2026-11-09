#!/usr/bin/env python3
# original/NurikWare.jar (orijinal jar) -> NurikWare.jar : sinif dosyalarinin icindeki
# isimleri (constant pool), dosya yollarini ve metin kaynaklarini Nursultan -> NurikWare yapar.
# Derleme GEREKTIRMEZ. Kullanim:  python3 tools/repack.py [girdi.jar] [cikti.jar]
import re
import struct
import sys
import zipfile

TRACE_MODE = "--trace" in sys.argv
_args = [a for a in sys.argv[1:] if not a.startswith("--")]
SRC = _args[0] if len(_args) > 0 else "original/NurikWare.jar"
DST = _args[1] if len(_args) > 1 else "NurikWare.jar"

# Gercek dis kaynaklar degismez (sunucu adresi, uzak resim)
PROTECT = [b"socket.nursultan.fun", b"nursultan-gif"]
NUR = b"Nur(?=(?:Contact|Container|Cv|Entry|Json|Meta|Person|Version)\\b)"
NUR_RE = re.compile(NUR)
SUBS = [(b"Nursultan", b"NurikWare"), (b"nursultan", b"nurikware"), (b"NURSULTAN", b"NURIKWARE")]


def conv(b: bytes) -> bytes:
    if b"ursultan" not in b and b"URSULTAN" not in b and b"Nur" not in b:
        return b
    hold = {}
    for i, p in enumerate(PROTECT):
        key = b"\x01P%d\x01" % i
        hold[key] = p
        b = b.replace(p, key)
    for a, c in SUBS:
        b = b.replace(a, c)
    b = NUR_RE.sub(b"NurikWare", b)
    for k, p in hold.items():
        b = b.replace(k, p)
    return b


def rewrite_class(data: bytes) -> bytes:
    if data[:4] != b"\xca\xfe\xba\xbe":
        return data
    magic_ver = data[:8]
    count = struct.unpack(">H", data[8:10])[0]
    pos = 10
    out = [magic_ver, struct.pack(">H", count)]
    i = 1
    while i < count:
        tag = data[pos]
        if tag == 1:
            ln = struct.unpack(">H", data[pos + 1:pos + 3])[0]
            raw = data[pos + 3:pos + 3 + ln]
            new = conv(raw)
            if len(new) > 65535:
                new = raw
            out.append(b"\x01" + struct.pack(">H", len(new)) + new)
            pos += 3 + ln
        elif tag in (3, 4, 9, 10, 11, 12, 17, 18):
            out.append(data[pos:pos + 5]); pos += 5
        elif tag in (5, 6):
            out.append(data[pos:pos + 9]); pos += 9; i += 1
        elif tag in (7, 8, 16, 19, 20):
            out.append(data[pos:pos + 3]); pos += 3
        elif tag == 15:
            out.append(data[pos:pos + 4]); pos += 4
        else:
            raise ValueError("bilinmeyen constant pool tag %d" % tag)
        i += 1
    out.append(data[pos:])
    return b"".join(out)


# --- Telefon uyumlulugu: client'in instanced GL cagrilarini PhoneCompat'a yonlendir ---
GL_TARGETS = {b"glVertexAttribDivisor", b"glDrawElementsInstanced", b"glDrawArraysInstanced"}
GL_OWNER = b"org/lwjgl/opengl/GL33"
COMPAT_CLASS = b"NurikWare/PhoneCompat"
TRACE_CLASS = b"NurikWare/GLTrace"


def patch_gl(data: bytes, trace=None) -> bytes:
    if b"org/lwjgl/opengl" not in data:
        return data
    count = struct.unpack(">H", data[8:10])[0]
    pos = 10
    utf = {}
    cls = {}
    nat = {}
    mref = []
    i = 1
    while i < count:
        tag = data[pos]
        if tag == 1:
            ln = struct.unpack(">H", data[pos + 1:pos + 3])[0]
            utf[i] = data[pos + 3:pos + 3 + ln]; pos += 3 + ln
        elif tag == 7:
            cls[i] = struct.unpack(">H", data[pos + 1:pos + 3])[0]; pos += 3
        elif tag == 12:
            nat[i] = struct.unpack(">HH", data[pos + 1:pos + 5]); pos += 5
        elif tag == 10:
            a, b = struct.unpack(">HH", data[pos + 1:pos + 5]); mref.append((pos, a, b)); pos += 5
        elif tag in (3, 4, 9, 11, 17, 18):
            pos += 5
        elif tag in (5, 6):
            pos += 9; i += 1
        elif tag in (8, 16, 19, 20):
            pos += 3
        elif tag == 15:
            pos += 4
        else:
            return data
        i += 1
    hits = []  # (offset, hedef sinif adi)
    for off, c, n in mref:
        owner = utf.get(cls.get(c))
        if owner is None or n not in nat:
            continue
        name = utf.get(nat[n][0]); desc = utf.get(nat[n][1])
        if owner == GL_OWNER and name in GL_TARGETS:
            hits.append((off, COMPAT_CLASS))
        elif trace and owner.startswith(b"org/lwjgl/opengl/") and (name, desc) in trace:
            hits.append((off, TRACE_CLASS))
    if not hits:
        return data
    buf = bytearray(data)
    newidx = {}
    extra = b""
    nxt = count
    for target in sorted({h[1] for h in hits}):
        newidx[target] = nxt + 1
        extra += (b"\x01" + struct.pack(">H", len(target)) + target + b"\x07" + struct.pack(">H", nxt))
        nxt += 2
    for off, target in hits:
        buf[off + 1:off + 3] = struct.pack(">H", newidx[target])
    buf[8:10] = struct.pack(">H", nxt)
    return bytes(buf[:pos]) + extra + bytes(buf[pos:])


TEXT_EXT = (".json", ".mcmeta", ".txt", ".properties", ".lang", ".fsh", ".vsh", ".frag",
            ".vert", ".glsl", ".cfg", ".toml", ".yml", ".yaml", ".xml", ".mf", ".md", ".csv")


def load_trace_sigs():
    if not TRACE_MODE:
        return None
    here = __import__("os").path.dirname(__import__("os").path.abspath(__file__))
    sigs = set()
    for line in open(here + "/gltrace_sigs.txt", encoding="utf-8"):
        if line.strip():
            a, b = line.split()
            sigs.add((a.encode(), b.encode()))
    return sigs


TRACE_SIGS = load_trace_sigs()


def main():
    zin = zipfile.ZipFile(SRC)
    zout = zipfile.ZipFile(DST, "w", zipfile.ZIP_DEFLATED, compresslevel=6)
    seen = set()
    nclass = nres = npatched = 0
    for info in zin.infolist():
        name = info.filename
        if name == "META-INF/INDEX.LIST":
            continue  # eski isimleri listeler, gereksiz
        new_name = conv(name.encode("utf-8")).decode("utf-8")
        if new_name in seen:
            continue
        seen.add(new_name)
        if info.is_dir():
            zout.writestr(zipfile.ZipInfo(new_name, info.date_time), b"")
            continue
        data = zin.read(name)
        low = name.lower()
        if low.endswith(".class"):
            data = rewrite_class(data); nclass += 1
            if new_name.startswith(("NurikWare/", "nurikware/")):
                pdata = patch_gl(data, TRACE_SIGS)
                if pdata is not data:
                    npatched += 1
                data = pdata
        elif (low.endswith(TEXT_EXT) or low.startswith("meta-inf/services/")) and len(data) < 5_000_000:
            if b"\x00" not in data[:2000]:
                data = conv(data); nres += 1
                if low.endswith((".fsh", ".vsh", ".frag", ".vert", ".glsl")):
                    # Mali/MobileGlues (Zalith) 'noperspective' desteklemiyor -> kaldir
                    data = re.sub(rb"\bnoperspective\s+", b"", data)
        zi = zipfile.ZipInfo(new_name, info.date_time)
        zi.compress_type = zipfile.ZIP_DEFLATED
        zi.external_attr = info.external_attr
        zout.writestr(zi, data)
    import os
    compat = os.path.join(os.path.dirname(os.path.abspath(__file__)), "PhoneCompat.class")
    with open(compat, "rb") as f:
        zi = zipfile.ZipInfo("NurikWare/PhoneCompat.class", (2026, 1, 1, 0, 0, 0))
        zi.compress_type = zipfile.ZIP_DEFLATED
        zout.writestr(zi, f.read())
    if TRACE_MODE:
        with open(os.path.join(os.path.dirname(os.path.abspath(__file__)), "GLTrace.class"), "rb") as f:
            zi = zipfile.ZipInfo("NurikWare/GLTrace.class", (2026, 1, 1, 0, 0, 0))
            zi.compress_type = zipfile.ZIP_DEFLATED
            zout.writestr(zi, f.read())
    zout.close()
    print("tamam: %d sinif, %d metin kaynagi, %d sinifta telefon yamasi -> %s" % (nclass, nres, npatched, DST))


if __name__ == "__main__":
    main()
