#!/usr/bin/env python3
# python3, verify_jar.py, GitHub Actions runner - original/NurikWare.jar icin zip bütünlüğü
# ve temel Fabric mod sanity check. decompile.py icindeki verify_jar()'dan ayri, cunku
# bootstrap.yml bu kontrolu Gradle wrapper uretmeden ONCE, hizlica yapmak istiyor.
import sys
import zipfile

JAR_PATH = "original/NurikWare.jar"

try:
    zf = zipfile.ZipFile(JAR_PATH)
    bad = zf.testzip()
    if bad:
        print(f"::error::zip icinde bozuk giris: {bad}")
        sys.exit(1)
    names = zf.namelist()
    if "fabric.mod.json" not in names:
        print("::error::fabric.mod.json jar icinde yok")
        sys.exit(1)
    if "META-INF/MANIFEST.MF" not in names:
        print("::error::META-INF/MANIFEST.MF jar icinde yok")
        sys.exit(1)
    print(f"zip gecerli, {len(names)} giris, fabric.mod.json mevcut")
except Exception as e:
    print(f"::error::jar okunamadi: {e}")
    sys.exit(1)
