# nurikware (açık kaynak decompile projesi)

Orijinal: **NurikWare Client** (Fabric, MC 1.21.11), yazar: NurikWare Team.
`fabric.mod.json` lisansı: **Proprietary**. Açık kaynak yayın izni yazar tarafından verildi.

| | |
|---|---|
| Minecraft | 1.21.11 (mod version alanından okundu) |
| Fabric Loader | `>=0.14.0` jar'da yazıyor, tam sürüm **tahmin** — `gradle.properties` içindeki `loader_version` notuna bak |
| Fabric API | jar içinde sürüm bilgisi yok, **tahmin** |
| Java | 21 (class dosyası major version 65'ten doğrulandı) |
| Yarn | bootstrap sırasında Fabric Meta API'den otomatik çekilir |
| Gradle / Loom | 8.8 / 1.9-SNAPSHOT |
| Entrypoint | `nurikware.NurikWareModInit`, `NurikWare.class09676` (obfuscated isim, decompile sonrası gerçek adı netleşir) |

## Önemli: decompile çıktısı orijinalle birebir aynı değil

Vineflower kaynak kodu yeniden üretir ama bazı şeyler kaybolur: değişken isimleri
(obfuscated class/method isimleri `class09643` gibi kalabilir, yarn sadece
bilinen Minecraft/Fabric API isimlerini çözer — modun kendi iç isimlendirmesini değil),
bazı kontrol akışları (switch-case yeniden yapılandırması, lambda senkronizasyonu),
generic tip bilgisi. **Derleme hataları beklenen bir şey**, tek tek düzeltilecek.

## Kullanım (sırayla)

1. Dosyaları repoya yükle (`original/NurikWare.jar` dahil — **GitHub web arayüzünden
   isim değiştirme, dosya bozulur**; telefonda dosya yöneticisinden adını değiştirip öyle yükle).
2. Actions → **Bootstrap (decompile)** → Run workflow. `src/main/java` dolar,
   `DECOMPILE_REPORT.md` otomatik düzeltmelerin ve elle düzeltilmesi gerekenlerin listesini verir.
3. `DECOMPILE_REPORT.md`'deki yarn sürümünü `gradle.properties` → `yarn_mappings` ile eşleştir.
4. Actions → **Build** → Run workflow. Jar: çalışmanın **Artifacts** bölümünde `nurikware-build`,
   `main` branch'e push sonrası ayrıca **Releases**'e de düşer.
5. Build kırmızıysa "Hata özeti" adımının çıktısını kopyala, buraya yapıştır — dosya:satır +
   hata türü + kod satırı halinde geliyor, tek tek düzeltiriz.

Bootstrap'i `force: true` ile tekrar çalıştırmak `src/main/java` içindeki elle
düzenlemeleri **siler**. Elle düzeltme yaptıktan sonra bootstrap'i tekrar çalıştırma.

## Gömülü kütüphaneler

Jar içinde Sodium, Lithium, Iris, ViaLegacy, ViaBedrock, MinecraftAuth, Lenni0451
Reflect/Commons, Baritone, oshi gömülüydü. `decompile.py` bunları `libs/` altına
ayrı jar'lar olarak çıkarır (referans için) ve kendi kaynaktan ayıklamaz —
`build.gradle` bunları gerçek Maven koordinatlarıyla çeker. Koordinatların çoğu
jar içinde sürüm bilgisi taşımadığı için **tahmin** — build hata verirse ilgili
satırı `build.gradle`'da güncelle.

## Lisans

Proprietary → açık kaynak geçişi yazarın (NurikWare Team) izniyle yapıldı.

## NurikWare.jar nasil uretilir (derleme gerekmez)

Kaynak kod, orijinal jar icindeki ozel Minecraft kopyasina (`minecraft.classNNNNN`) bagli
oldugu icin Gradle ile derlenemez. Bunun yerine:

    python3 tools/repack.py original/NurikWare.jar NurikWare.jar

Ya da GitHub Actions -> **Repack (NurikWare.jar)** -> Run workflow. Cikti: Artifacts -> `nurikware-jar`.
