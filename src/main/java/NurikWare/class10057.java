package NurikWare;

public final class class10057 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 2;
   public static final int u = 4;
   public static final int i = 8;

   private class10057() {
      super();
   }

   public static int y(int var0, int var1) {
      int ix = var0 | var1;
      if (N(ix, 2) || N(ix, 4) || N(ix, 8)) {
         ix |= 1;
      }

      return ix;
   }

   public static boolean N(int var0, int var1) {
      return (var0 & var1) == var1;
   }
}
