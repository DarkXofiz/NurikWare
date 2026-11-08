package NurikWare;

public enum class09688 {
   PROPORTIONAL(0),
   ALWAYS_ONE(1);

   private final int id;

   private class09688(int var3) {
      this.id = var3;
   }

   public static class09688 N(int var0) {
      return var0 == PROPORTIONAL.id ? PROPORTIONAL : ALWAYS_ONE;
   }

   public double N(double var1) {
      switch (this) {
         case PROPORTIONAL:
            return var1;
         case ALWAYS_ONE:
            return Math.signum(var1);
         default:
            throw new AssertionError();
      }
   }

   public int N() {
      return this.id;
   }
}
