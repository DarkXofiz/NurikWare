package NurikWare;

final class class10067 {
   static boolean L(String var0, int var1, int var2) {
      return N(var0, var1, var2) != y(var0, var1, var2);
   }

   static int L(String var0, int var1) {
      if (var0 != null && !var0.isEmpty()) {
         int i = N(var0, var1);
         return i >= var0.length() ? var0.length() : var0.offsetByCodePoints(i, 1);
      } else {
         return 0;
      }
   }

   private class10067() {
      super();
   }

   static int y(String var0, int var1) {
      if (var0 != null && !var0.isEmpty()) {
         int i = N(var0, var1);
         return i <= 0 ? 0 : var0.offsetByCodePoints(i, -1);
      } else {
         return 0;
      }
   }

   static int y(String var0, int var1, int var2) {
      return Math.max(N(var0, var1), N(var0, var2));
   }

   static int N(String var0, int var1) {
      String s = var0 == null ? "" : var0;
      int i = class09693.N(var1, 0, s.length());
      return i > 0 && i < s.length() && Character.isLowSurrogate(s.charAt(i)) && Character.isHighSurrogate(s.charAt(i - 1)) ? i - 1 : i;
   }

   static int N(String var0, int var1, int var2) {
      return Math.min(N(var0, var1), N(var0, var2));
   }
}
