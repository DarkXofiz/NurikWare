package NurikWare;

final class class09818 {
   private static final float N = 0.001F;

   private class09818() {
      super();
   }

   private static class10003 N(class10003 var0, class10003 var1, class10003 var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      boolean flag = var3 + var5 <= var8;
      boolean flag1 = var4 >= 0.0F;
      if (var0 == var1) {
         if (flag) {
            return var1;
         } else if (flag1) {
            return var2;
         } else {
            return var6 > var7 ? var2 : var1;
         }
      } else if (flag1) {
         return var2;
      } else if (flag) {
         return var1;
      } else {
         return var7 > var6 ? var1 : var2;
      }
   }

   private static float N(float var0, float var1, float var2) {
      float f = Math.max(0.0F, var2 - var1);
      return class09693.N(var0, 0.0F, f);
   }

   private static void N(class10021 var0, float var1, float var2) {
      class09937 class09937 = var0.c();
      class09937.L(class09937.y() + var1, class09937.L() + var2);
      class09937.N(class09937.R() + var1, class09937.M() + var2, class09937.B(), class09937.Z());

      for (int i = 0; i < var0.u(); i++) {
         class10021 class10021 = var0.N(i);
         if (!class10019.N(class10021)) {
            N(class10021, var1, var2);
         }
      }
   }

   private static boolean N(float var0, float var1) {
      return Math.abs(var0 - var1) <= 0.001F;
   }

   static boolean N(class10021 var0, class09849 var1, float var2, float var3) {
      class09980 class09980 = var0.o();
      class09937 class09937 = var0.c();
      class09802 class09802 = N(
         class09980.D(),
         class09980.h(),
         class09980.r(),
         class09980.NN(),
         class09980.Ny(),
         var1,
         class09937.u(),
         class09937.i(),
         Math.max(0.0F, var2),
         Math.max(0.0F, var3)
      );
      float f = class09802.N() - class09937.y();
      float f1 = class09802.y() - class09937.L();
      if (N(f, 0.0F) && N(f1, 0.0F)) {
         return false;
      } else {
         N(var0, f, f1);
         var0.u(1);
         return true;
      }
   }

   static class09802 N(
      class10003 var0, float var1, class09973 var2, boolean var3, boolean var4, class09849 var5, float var6, float var7, float var8, float var9
   ) {
      class10003 class10003 = var3 ? N(var0, var1, var5, var6, var7, var8, var9) : var0;
      float f;
      float f1;
      switch (class10003) {
         case TOP:
            f1 = var5.y() + var1;
            f = N(var2, var5.i(), var5.M(), var6);
            break;
         case BOTTOM:
            f1 = var5.R() - var1 - var7;
            f = N(var2, var5.i(), var5.M(), var6);
            break;
         case LEFT:
            f = var5.N() + var1;
            f1 = N(var2, var5.R(), var5.B(), var7);
            break;
         case RIGHT:
            f = var5.i() - var1 - var6;
            f1 = N(var2, var5.R(), var5.B(), var7);
            break;
         default:
            throw new IllegalStateException("Unhandled side: " + class10003);
      }

      if (var4) {
         f = N(f, var6, var8);
         f1 = N(f1, var7, var9);
      }

      return new class09802(f, f1, class10003);
   }

   private static float N(class09973 var0, float var1, float var2, float var3) {
      return switch (var0) {
         case START -> var1;
         case CENTER -> var1 + (var2 - var3) * 0.5F;
         case END -> var1 + var2 - var3;
      };
   }

   private static class10003 N(class10003 var0, float var1, class09849 var2, float var3, float var4, float var5, float var6) {
      return switch (var0) {
         case TOP, BOTTOM -> N(
            var0, class10003.BOTTOM, class10003.TOP, var2.y() + var1, var2.R() - var1 - var4, var4, var2.R(), Math.max(0.0F, var6 - var2.y()), var6
         );
         case LEFT, RIGHT -> N(
            var0, class10003.RIGHT, class10003.LEFT, var2.N() + var1, var2.i() - var1 - var3, var3, var2.i(), Math.max(0.0F, var5 - var2.N()), var5
         );
      };
   }
}
