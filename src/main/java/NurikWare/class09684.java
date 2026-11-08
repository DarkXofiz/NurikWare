package NurikWare;

public enum class09684 {
   FIRST_TO_LAST(0),
   LAST_TO_FIRST(1);

   private final int id;

   private class09684(int var3) {
      this.id = var3;
   }

   public static class09684 N(int var0) {
      return var0 == FIRST_TO_LAST.id ? FIRST_TO_LAST : LAST_TO_FIRST;
   }

   public int N() {
      return this.id;
   }
}
