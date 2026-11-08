package NurikWare;

final class class09839 {
   private class09839() {
      super();
   }

   private static boolean N(class10021 var0, float var1, float var2, float var3) {
      float f = class10019.N(var0) ? 0.0F : var1;
      float f1 = class10019.N(var0) ? 0.0F : var2;
      class09980 class09980 = var0.o();
      class09937 class09937 = var0.c();
      float f2 = f + class09980.n().L(class09937.u());
      float f3 = f1 + class09980.t().L(class09937.i());
      boolean flag = false;
      if (f2 != 0.0F || f3 != 0.0F) {
         float f4 = class09693.N(class09937.y() + f2, var3) - class09937.y();
         float f5 = class09693.N(class09937.L() + f3, var3) - class09937.L();
         if (f4 != 0.0F || f5 != 0.0F) {
            class09937.L(class09937.y() + f4, class09937.L() + f5);
            class09937.N(class09937.R() + f4, class09937.M() + f5, class09937.B(), class09937.Z());
            var0.i(1);
            flag = true;
         }
      }

      for (int i = 0; i < var0.u(); i++) {
         flag |= N(var0.N(i), f2, f3, var3);
      }

      return flag;
   }

   static boolean N(class10021 var0, float var1) {
      return N(var0, 0.0F, 0.0F, var1);
   }

   static void N(class10021 var0) {
      class09937 class09937 = var0.c();
      if (class09937.y() != class09937.l() || class09937.L() != class09937.d()) {
         float f = class09937.R() - class09937.y();
         float f1 = class09937.M() - class09937.L();
         class09937.L(class09937.l(), class09937.d());
         class09937.N(class09937.l() + f, class09937.d() + f1, class09937.B(), class09937.Z());
         var0.i(1);
      }

      for (int i = 0; i < var0.u(); i++) {
         N(var0.N(i));
      }
   }
}
