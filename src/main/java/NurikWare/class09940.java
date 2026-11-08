package NurikWare;

public enum class09940 {
   ALPHA8(1),
   RGBA8(4);

   private final int bytesPerPixel;

   private class09940(int var3) {
      this.bytesPerPixel = var3;
   }

   public int N() {
      return this.bytesPerPixel;
   }
}
