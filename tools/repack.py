#!/usr/bin/env python3
# original/NurikWare.jar (orijinal jar) -> NurikWare.jar : sinif dosyalarinin icindeki
# isimleri (constant pool), dosya yollarini ve metin kaynaklarini Nursultan -> NurikWare yapar.
# Derleme GEREKTIRMEZ. Kullanim:  python3 tools/repack.py [girdi.jar] [cikti.jar]
import re
import struct
import sys
import zipfile

SRC = sys.argv[1] if len(sys.argv) > 1 else "original/NurikWare.jar"
DST = sys.argv[2] if len(sys.argv) > 2 else "NurikWare.jar"

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


TEXT_EXT = (".json", ".mcmeta", ".txt", ".properties", ".lang", ".fsh", ".vsh", ".frag",
            ".vert", ".glsl", ".cfg", ".toml", ".yml", ".yaml", ".xml", ".mf", ".md", ".csv")


def main():
    zin = zipfile.ZipFile(SRC)
    zout = zipfile.ZipFile(DST, "w", zipfile.ZIP_DEFLATED, compresslevel=6)
    seen = set()
    nclass = nres = 0
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
    zout.close()
    print("tamam: %d sinif, %d metin kaynagi -> %s" % (nclass, nres, DST))


if __name__ == "__main__":
    main()
