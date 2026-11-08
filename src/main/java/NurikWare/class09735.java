package NurikWare;

public enum class09735 {
   SDF(1, 0, false),
   MSDF(3, 2, true),
   MTSDF(4, 3, true);

   private final int channels;
   private final int bitmapType;
   private final boolean colored;

   public boolean L() {
      return this.colored;
   }

   private class09735(int var3, int var4, boolean var5) {
      this.channels = var3;
      this.bitmapType = var4;
      this.colored = var5;
   }

   public int y() {
      return this.bitmapType;
   }

   public int N() {
      return this.channels;
   }
}
