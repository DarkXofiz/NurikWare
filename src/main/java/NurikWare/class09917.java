package NurikWare;

import java.util.List;

final class class09917 {
   private static final class09916 N = new class09916(0.0F, 0.0F, 0.0F, 0.0F);
   private final class09781 y;
   private final class10066 L;
   private final class10062 u;

   class09917(class09781 var1) {
      super();
      this.y = var1;
      this.L = class10066.N(var1);
      this.u = class10062.N(var1);
   }

   private void N(class09915 var1, class09980 var2, List<class09924> var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var1.y()) {
         class10041 class10041 = var1.N();
         float f = class09693.N(var6, 0.0F, var8);
         if (!(f <= 0.0F)) {
            float f1 = this.N(class10041, var2, class10041.i(), var9);
            float f2 = var4 + Math.max(0.0F, var5 - 1.0F);
            float f3 = class09693.N(f1, var4, f2);
            float f4 = var10 > 0.0F ? 1.0F / var10 : 1.0F;
            float f5 = class09693.N(f3, var10);
            float f6 = class09693.N(f3 + 1.0F, var10);
            if (f6 - f5 < f4) {
               f6 = f5 + f4;
            }

            float f7 = class09693.N(var7, var10);
            float f8 = class09693.N(var7 + f, var10);
            if (!(f8 <= f7)) {
               var3.add(new class09925(f5, f7, f6 - f5, f8 - f7, class09889.N, var2.H(), 0, 0.0F, 0, 0.0F));
            }
         }
      }
   }

   private float N(class10041 var1, class09980 var2, int var3, float var4) {
      String s = var1.y();
      int i = class09693.N(var3, 0, s.length());
      float f = this.y.y().N(s.substring(0, i), var2.c(), var2.X());
      return var4 + f;
   }

   private static class09924 N(String var0, float var1, float var2, int var3, class09980 var4) {
      float f = var4.F();
      int i = var4.p();
      return (class09924)(f > 0.0F && class09662.R(i)
         ? new class09931(var0, var1, var2, var3, var4.c(), var4.X(), i, f)
         : new class09902(var0, var1, var2, var3, var4.c(), var4.X()));
   }

   private static int N(class10041 var0, class09980 var1) {
      int i = var1.H();
      if (!var0.u()) {
         return i;
      } else {
         int j = Math.max(1, Math.round(class09662.N(i) * 0.55F));
         return class09662.N(i, class09677.ALPHA, j);
      }
   }

   private static int N(class09980 var0) {
      int i = var0.H();
      int j = Math.max(1, Math.round(class09662.N(i) * 0.28F));
      return class09662.N(i, class09677.ALPHA, j);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float N(class09980 var1, float var2, float var3, float var4) {
      float f = Math.max(0.0F, var3 - var4);

      return var2 + switch (class09894.N[var1.Z().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> f * 0.5F;
         case 3 -> f;
         default -> throw new MatchException(null, null);
      };
   }

   void N(class09915 var1, class09980 var2, List<class09924> var3, float var4, float var5, float var6, float var7) {
      class10041 class10041 = var1.N();
      float f = this.y.u().N();
      float f1 = this.y.y().N(var2.c(), var2.X());
      float f2 = this.N(var2, var5, var7, f1);
      float f3 = this.N(var2, class10041.y(), var4, var6) - class10041.B();
      this.N(class10041, var2, var3, var4, var6, var7, f2, f1, f3, f);
      if (!class10041.L().isEmpty()) {
         float f4 = class10041.u() ? this.N(var2, class10041.L(), var4, var6) - class10041.B() : f3;
         var3.add(N(class10041.L(), class09693.N(f4, f), class09693.N(f2, f), N(class10041, var2), var2));
      }

      this.N(var1, var2, var3, var4, var6, var7, f2, f1, f3, f);
   }

   class09916 N(class10021 var1, class09980 var2) {
      if (var1.y() != class10049.INPUT) {
         return N;
      } else {
         class10041 class10041 = this.u.i(var1);
         String s = class10041.L();
         if (s.isEmpty()) {
            return N;
         } else {
            float f = var1.c().R();
            float f1 = var1.c().M();
            float f2 = var1.c().B();
            float f3 = var1.c().Z();
            float f4 = this.y.y().N(var2.c(), var2.X());
            float f5 = this.N(var2, f1, f3, f4);
            float f6 = this.N(var2, s, f, f2) - class10041.B();
            float f7 = this.y.y().N(s, var2.c(), var2.X());
            return new class09916(f6, f5, f7, f4);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float N(class09980 var1, String var2, float var3, float var4) {
      float f = this.y.y().N(var2, var1.c(), var1.X());
      float f1 = Math.max(0.0F, var4 - f);

      return var3 + switch (class09894.N[var1.B().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> f1 * 0.5F;
         case 3 -> f1;
         default -> throw new MatchException(null, null);
      };
   }

   private void N(class10041 var1, class09980 var2, List<class09924> var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var1.u() && var1.N()) {
         float f = this.N(var1, var2, var1.R(), var9);
         float f1 = this.N(var1, var2, var1.M(), var9);
         float f2 = class09693.N(f, var4, var4 + var5);
         float f3 = class09693.N(f1, var4, var4 + var5);
         if (!(f3 <= f2)) {
            float f4 = class09693.N(var6, 0.0F, var8);
            if (!(f4 <= 0.0F)) {
               float f5 = class09693.N(f2, var10);
               float f6 = class09693.N(f3, var10);
               float f7 = class09693.N(var7, var10);
               float f8 = class09693.N(var7 + f4, var10);
               if (!(f6 <= f5) && !(f8 <= f7)) {
                  var3.add(new class09925(f5, f7, f6 - f5, f8 - f7, class09889.N, N(var2), 0, 0.0F, 0, 0.0F));
               }
            }
         }
      }
   }

   class09915 N(class10021 var1) {
      if (var1.y() != class10049.INPUT) {
         return class09915.N;
      } else {
         class10041 class10041 = this.u.i(var1);
         boolean flag = this.L.y(var1) && var1.c().B() > 0.0F && var1.c().Z() > 0.0F;
         return new class09915(class10041, flag);
      }
   }
}
