package NurikWare;

public enum class09686 {
   SIMPLE(0),
   EVENT_BASED(1);

   private final int id;

   private class09686(int var3) {
      this.id = var3;
   }

   public static class09686 N(int var0) {
      return var0 == EVENT_BASED.id ? EVENT_BASED : SIMPLE;
   }

   public int N() {
      return this.id;
   }
}
