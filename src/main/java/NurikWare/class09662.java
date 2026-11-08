package NurikWare;

public final class class09662 {
   public static final int N = 0;
   public static final int y = -16777216;
   private static final int L = 255;

   public static int L(int var0) {
      return N(var0, class09677.GREEN);
   }

   private class09662() {
      super();
   }

   public static boolean i(int var0) {
      return N(var0) < 255;
   }

   public static int u(int var0) {
      return N(var0, class09677.BLUE);
   }

   public static int y(int var0) {
      return N(var0, class09677.RED);
   }

   private static int y(int var0, int var1, float var2) {
      return Math.round(var0 + (var1 - var0) * var2);
   }

   public static int N(int var0, int var1, float var2) {
      float f = class09693.N(var2);
      int i = y(y(var0), y(var1), f);
      int j = y(L(var0), L(var1), f);
      int k = y(u(var0), u(var1), f);
      int l = y(N(var0), N(var1), f);
      return N(i, j, k, l);
   }

   public static int N(int var0, float var1) {
      if (!(var1 >= 1.0F) && var0 != 0) {
         int i = (int)((var0 >>> class09677.ALPHA.y() & 0xFF) * var1);
         return var0 & ~class09677.ALPHA.N() | i << class09677.ALPHA.y();
      } else {
         return var0;
      }
   }

   public static int N(int var0, class09677 var1, int var2) {
      class09677 class09677 = var1 == null ? class09677.ALPHA : var1;
      int i = class09693.N(var2, 0, 255);
      return var0 & ~class09677.N() | i << class09677.y();
   }

   public static int N(int var0, int var1, int var2, int var3) {
      int i = class09693.N(var0, 0, 255);
      int j = class09693.N(var1, 0, 255);
      int k = class09693.N(var2, 0, 255);
      return class09693.N(var3, 0, 255) << class09677.ALPHA.y() | i << class09677.RED.y() | j << class09677.GREEN.y() | k << class09677.BLUE.y();
   }

   public static int N(int var0) {
      return N(var0, class09677.ALPHA);
   }

   public static int N(int var0, class09677 var1) {
      class09677 class09677 = var1 == null ? class09677.ALPHA : var1;
      return var0 >>> class09677.y() & 0xFF;
   }

   public static boolean R(int var0) {
      return N(var0) > 0;
   }
}
