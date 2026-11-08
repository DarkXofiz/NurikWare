package NurikWare;

final class class10048 {
   static final float N = 0.01F;
   static final int y = 1000;

   static float L(class09980 var0, class10036 var1) {
      return var1 == class10036.WIDTH ? var0.U().N() : var0.U().y();
   }

   static float L(class09980 var0) {
      return var0.P() == class09981.OUTSIDE ? y(var0) * 2.0F : 0.0F;
   }

   static float L(float var0, float var1) {
      return class09693.N(var0, var1);
   }

   static float L(class09980 var0, class10036 var1, float var2) {
      class09962 class09962 = y(var0, var1);
      float f = y(var0, var1, var2);
      return N(var0, var1, class09962.L(f));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static float M(class09980 var0, class10036 var1, float var2) {
      class09962 class09962 = y(var0, var1);
      float f = y(var0, var1, var2);

      float f1 = switch (class10024.L[class09962.u().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> class09962.M();
         case 3, 4 -> class09962.L(Math.max(f, class09962.i()));
         default -> throw new MatchException(null, null);
      };
      return N(var0, var1, f1);
   }

   private class10048() {
      super();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static float i(class09980 var0, class10036 var1) {
      float f = u(var0);

      return switch (class10024.N[var1.ordinal()]) {
         case 1 -> var0.U().L() + f;
         case 2 -> var0.U().i() + f;
         default -> throw new MatchException(null, null);
      };
   }

   static float i(class09980 var0, class10036 var1, float var2) {
      float f = y(var0, var1).i(var2);
      float f1 = N(var0, var1, f);
      return class09693.N(var2, 0.0F, f1);
   }

   static float u(class09980 var0) {
      return var0.P() == class09981.OUTSIDE ? y(var0) : 0.0F;
   }

   static float u(class09980 var0, class10036 var1, float var2) {
      class09962 class09962 = y(var0, var1);
      float f = y(var0, var1, var2);
      return N(var0, var1, y(class09962.R(), f));
   }

   static float u(class09980 var0, class10036 var1) {
      return L(var0, var1) + L(var0);
   }

   static float y(class09980 var0, class10036 var1, float var2) {
      float f = var0.z() == class09983.CONTENT_BOX ? u(var0, var1) : 0.0F;
      return Math.max(0.0F, var2 - f);
   }

   static float y(class09973 var0, float var1) {
      return N(var0, var1);
   }

   static float y(float var0, float var1) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(var1, var0);
   }

   static class09962 y(class09980 var0, class10036 var1) {
      return var1 == class10036.WIDTH ? var0.Q() : var0.O();
   }

   static float y(class09980 var0) {
      return Math.max(0.0F, var0.m());
   }

   static boolean N(float var0, float var1) {
      return Math.abs(var0 - var1) < 0.01F;
   }

   static boolean N(class10009 var0) {
      return var0.y();
   }

   static boolean N(class09980 var0, class10036 var1) {
      return var0.M() == class09975.ROW && var1 == class10036.WIDTH || var0.M() == class09975.COLUMN && var1 == class10036.HEIGHT;
   }

   static boolean N(class09962 var0) {
      return var0.u() == class09982.FIT || var0.u() == class09982.GROW;
   }

   static float N(int var0, float var1) {
      return var0 <= 1 ? 0.0F : (var0 - 1) * Math.max(0.0F, var1);
   }

   static float N(int var0, class10009 var1, float var2) {
      if (var0 <= 1) {
         return 0.0F;
      } else {
         return N(var1) ? Math.max(0.0F, var2) / (var0 - 1) : var1.u();
      }
   }

   static float N(int var0, class10009 var1) {
      return var0 > 1 && !N(var1) ? N(var0, var1.u()) : 0.0F;
   }

   static float N(class10061 var0, class09980 var1, class10036 var2) {
      float f = var0.L(var2);
      float f1 = u(var1, var2);
      float f2 = var2 == class10036.WIDTH ? N(var1) : 0.0F;
      return Math.max(0.0F, f - f1 - f2);
   }

   static float N(class09980 var0) {
      return var0.y() && var0.k() == class09970.CLASSIC ? var0.Y().N() : 0.0F;
   }

   static float N(class09980 var0, class10036 var1, float var2) {
      float f = var0.z() == class09983.CONTENT_BOX ? u(var0, var1) : 0.0F;
      return Math.max(0.0F, var2 + f);
   }

   static boolean N(class10021 var0) {
      return class10019.y(var0);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static float N(class09973 var0, float var1) {
      float f = Math.max(0.0F, var1);

      return switch (class10024.y[var0.ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> f * 0.5F;
         case 3 -> f;
         default -> throw new MatchException(null, null);
      };
   }

   static float R(class09980 var0, class10036 var1, float var2) {
      class09962 class09962 = y(var0, var1);
      if (class09962.u() == class09982.PERCENT) {
         return class09962.u(var2);
      } else {
         float f = y(var0, var1, var2);
         return N(var0, var1, class09962.u(f));
      }
   }

   static float R(class09980 var0, class10036 var1) {
      return N(var0, var1, 0.0F);
   }
}
