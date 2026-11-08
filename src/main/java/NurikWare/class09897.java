package NurikWare;

final class class09897 {
   private final class10007 N;

   private static boolean L(class09980 var0) {
      return class09662.R(var0.o());
   }

   class09897(class10007 var1) {
      super();
      this.N = var1;
   }

   static boolean y(class09980 var0) {
      return var0.K() > 0.01F && var0.f() > 0.001F && class09662.R(var0.V());
   }

   static boolean N(class09980 var0) {
      return var0.q() > 0.01F && var0.f() > 0.001F;
   }

   private static boolean N(class10021 var0, class09915 var1) {
      if (var0.c().B() <= 0.0F || var0.c().Z() <= 0.0F) {
         return false;
      } else if (var0.y() == class10049.TEXT) {
         return !var0.B().isEmpty();
      } else if (var0.y() == class10049.INPUT) {
         return !var1.N().L().isEmpty();
      } else {
         return var0.y() == class10049.TEXTURE ? !var0.z().isEmpty() : false;
      }
   }

   private static boolean N(class10021 var0) {
      return var0.y() == class10049.CANVAS && var0.U() != null && var0.c().u() > 0.0F && var0.c().i() > 0.0F;
   }

   boolean N(class10021 var1, class09980 var2, class09830 var3, class09915 var4) {
      if (var1.y() != class10049.CANVAS) {
         if (N(var2)) {
            return true;
         } else if (y(var2)) {
            return true;
         } else if (L(var2)) {
            return true;
         } else if (var2.m() > 0.0F && class09662.R(var2.e())) {
            return true;
         } else if (N(var1, var4)) {
            return true;
         } else {
            return var4.y() ? true : this.N.N(var1, var2, var3);
         }
      } else {
         return N(var2) || N(var1);
      }
   }
}
