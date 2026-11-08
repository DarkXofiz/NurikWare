package NurikWare;

public enum class09690 {
   LEFT(0),
   RIGHT(1);

   private final int id;

   private class09690(int var3) {
      this.id = var3;
   }

   public static class09690 N(int var0) {
      return switch (var0) {
         case 0 -> LEFT;
         case 1 -> RIGHT;
         default -> null;
      };
   }

   public int N() {
      return this.id;
   }
}
