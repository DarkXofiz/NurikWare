# Vineflower otomatik duzeltme raporu

- (boolean)0/1 -> false/true duzeltmesi: 0 yer
- getValue() ternary (Boolean) cast eklendi: 0 yer

StringConcatFactory.makeConcatWithConstants kalibina rastlanmadi.

## mixin duck-interface cast (IFoo)x

Bu otomatik ACIK DEGIL (yanlis pozitif riski yuksek). Build hata verip `cannot find symbol: class IFoo` gibi bir sey gorursen, o satirdaki `(IFoo)x` kalibini `((IFoo)(Object)x)` yap.

## Ozet

- Kaynak jar: `NurikWare.jar` (sha256 original/'de kontrol edilir)
- Minecraft: `1.21.11`
- Yarn: `1.21.11+build.6`
- Vineflower: `1.11.1`
- tiny-remapper: `0.10.4`
- Yazilan .java dosyasi: 3073
- Gomulu kutuphane sayisi: 15

Decompile ciktisi orijinal kaynakla BIREBIR AYNI DEGILDIR: degisken isimleri, bazi kontrol akislari ve generic bilgiler kayip olabilir. Derleme hata verirse build.yml 'Hata ozeti' adiminin ciktisini kullanip dosya bazinda elle duzelt.
