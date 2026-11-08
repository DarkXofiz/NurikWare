package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class11083 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
      }
   }

   public class11083() {
      super();
      this.M();
   }

   public class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      if (var1.N(var2, var3) && !var5 && !var7) {
         float f = class09170.N(var3.y(), var4.y());
         float f1 = var4.R() - var3.R();
         float f2 = Math.abs(f);
         float f3 = Math.abs(f1);
         if (f2 <= 0.55F && f3 <= 0.28F) {
            class11499 class11499x = this.N(var1, var2, var3, var6);
            return class11499x == null ? var4 : class11499x;
         } else if (!(f2 > 6.4F) && !(f3 > 3.1F)) {
            long i = System.currentTimeMillis();
            if (i >= (Long)this.N_0) {
               float f4 = var6 ? 1.0F : 0.0F;
               this.N_1 = class09139.N((double)(-0.42F - f4 * 0.22F), (double)(0.52F + f4 * 0.28F));
               this.N_2 = class09139.N((double)(-0.18F - f4 * 0.08F), (double)(0.22F + f4 * 0.1F));
               this.N_0 = i + (long)class09139.N(95.0, var6 ? 210.0 : 310.0);
            }

            class11499 class11499xxx;
            if (var1.N(
               var2,
               class11499xxx = new class11499(
                  var3.y() + class04995.N(f * 0.22F + (Float)this.N_1, -0.88F, 0.94F),
                  class04995.N(var3.R() + class04995.N(f1 * 0.16F + (Float)this.N_2, -0.38F, 0.42F), -90.0F, 90.0F)
               )
            )) {
               return class11499xxx;
            } else {
               class11499 class11499x = new class11499(var3.y() + class04995.N(f * 0.16F, -0.54F, 0.56F), var3.R());
               if (var1.N(var2, class11499x)) {
                  return class11499x;
               } else {
                  class11499 class11499xx = this.N(var1, var2, var3, var6);
                  return class11499xx == null ? var4 : class11499xx;
               }
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, boolean var4) {
      float f = var4 ? 1.0F : 0.0F;

      for (float[] afloat : new float[][]{
         {class09139.N((double)(-0.72F - f * 0.22F), (double)(0.82F + f * 0.28F)), class09139.N(-0.22F, 0.26F)},
         {class09139.N(-0.46F, 0.52F), class09139.N((double)(-0.34F - f * 0.08F), (double)(0.34F + f * 0.1F))},
         {class09139.N(-1.05F, 1.12F), class09139.N(-0.08F, 0.08F)},
         {class09139.N(-0.22F, 0.22F), class09139.N(-0.42F, 0.46F)},
         {class09139.N(-1.38F, 1.46F), class09139.N(-0.28F, 0.32F)}
      }) {
         class11499 class11499 = new class11499(var3.y() + afloat[0], class04995.N(var3.R() + afloat[1], -90.0F, 90.0F));
         if (var1.N(var2, class11499)) {
            return class11499;
         }
      }

      return null;
   }
}
