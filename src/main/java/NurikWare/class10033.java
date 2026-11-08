package NurikWare;

import java.util.Objects;

final class class10033 {
   private static final float N = 1.0F;
   private final class09781 y;

   class10033(class09781 var1) {
      super();
      this.y = Objects.requireNonNull(var1, "context");
   }

   private float N(String var1, float var2, class09838 var3) {
      return this.y.y().N(var1, var2, var3);
   }

   private float N(class09980 var1, String var2, float var3, float var4) {
      float f = this.N(var2, var1.c(), var1.X());
      float f1 = Math.max(0.0F, var4 - f);
      class09973 class09973 = var1.B();

      return var3 + switch (class09973) {
         case START -> 0.0F;
         case CENTER -> f1 * 0.5F;
         case END -> f1;
      };
   }

   float N(class10021 var1, int var2, float var3) {
      String s = var1.B();
      class09980 class09980 = var1.o();
      float f = Math.max(0.0F, var1.c().B());
      if (!(f <= 0.0F) && !s.isEmpty()) {
         float f1 = this.N(s, class09980.c(), class09980.X());
         float f2 = Math.max(0.0F, f1 - f);
         int i = class10067.N(s, var2);
         float f3 = this.N(s.substring(0, i), class09980.c(), class09980.X());
         float f4 = Math.max(0.0F, var3);
         float f5 = f4 + Math.max(0.0F, f - 1.0F);
         if (f3 < f4) {
            f4 = f3;
         } else if (f3 > f5) {
            f4 = f3 - Math.max(0.0F, f - 1.0F);
         }

         return class09693.N(f4, 0.0F, f2);
      } else {
         return 0.0F;
      }
   }

   int N(class10021 var1, float var2, float var3) {
      String s = var1.B();
      class09980 class09980 = var1.o();
      float f = this.N(class09980, s, var1.c().R(), var1.c().B());
      float f1 = var2 - f + Math.max(0.0F, var3);
      if (!(f1 <= 0.0F) && !s.isEmpty()) {
         class09868 class09868 = this.y.y();
         float f2 = class09980.c();
         class09838 class09838 = class09980.X();
         float f3 = 0.0F;
         int i = -1;
         int j = 0;

         while (j < s.length()) {
            int k = s.codePointAt(j);
            int l = j + Character.charCount(k);
            if (i >= 0) {
               f3 += class09868.N(i, k, f2, class09838);
            }

            float f4 = class09868.N(k, f2, class09838);
            if (f1 < f3 + f4 * 0.5F) {
               return j;
            }

            f3 += f4;
            if (f1 < f3) {
               return l;
            }

            i = k;
            j = l;
         }

         return s.length();
      } else {
         return 0;
      }
   }
}
