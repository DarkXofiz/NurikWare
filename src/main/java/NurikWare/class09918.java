package NurikWare;

final class class09918 {
   private static final class09887 N = new class09887(-Float.MAX_VALUE, -Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);

   private class09918() {
      super();
   }

   static boolean y(class09887 var0, float var1, class09887 var2) {
      return var0.y() <= var2.y() && var0.L() + var1 <= var2.L() && var0.u() >= var2.u() && var0.i() + var1 >= var2.i();
   }

   private static class09858 y(class09887 var0) {
      return var0 == null ? null : new class09858(var0.y(), var0.L(), var0.u(), var0.i());
   }

   static boolean N(class09887 var0, class10021 var1, float var2) {
      return class09835.N(var1, var2).N(y(var0));
   }

   static boolean N(class09887 var0) {
      return var0.u() <= var0.y() || var0.i() <= var0.L();
   }

   static boolean N(class09887 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (!N(var0, var5, var6, var7, var8)) {
         return false;
      } else if (var5 < var0.y() + var1 && var6 < var0.L() + var1) {
         return false;
      } else if (var7 > var0.u() - var2 && var6 < var0.L() + var2) {
         return false;
      } else {
         return var7 > var0.u() - var3 && var8 > var0.i() - var3 ? false : !(var5 < var0.y() + var4) || !(var8 > var0.i() - var4);
      }
   }

   private static class09887 N(class09858 var0) {
      return var0 == null ? null : new class09887(var0.y(), var0.L(), var0.u(), var0.i());
   }

   static class09887 N(class10021 var0, class09980 var1) {
      return N(class09835.N(var0, var1));
   }

   static class09887 N(class09887 var0, float var1, class09887 var2) {
      return var0 == null ? var2 : N(class09835.N(y(var0), var1, y(var2)));
   }

   static boolean N(class09887 var0, float var1, float var2, float var3, float var4) {
      return var1 >= var0.y() && var2 >= var0.L() && var3 <= var0.u() && var4 <= var0.i();
   }

   static float N(class10021 var0) {
      return class09835.N(var0);
   }

   static class09887 N(float var0, float var1) {
      return Float.isFinite(var0) && Float.isFinite(var1) ? new class09887(0.0F, 0.0F, Math.max(0.0F, var0), Math.max(0.0F, var1)) : N;
   }
}
