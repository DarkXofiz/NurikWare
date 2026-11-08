package NurikWare;

public enum class09677 {
   ALPHA(-16777216, 24),
   RED(16711680, 16),
   GREEN(65280, 8),
   BLUE(255, 0);

   private final int mask;
   private final int shift;

   private class09677(int var3, int var4) {
      this.mask = var3;
      this.shift = var4;
   }

   public int y() {
      return this.shift;
   }

   public int N() {
      return this.mask;
   }
}
