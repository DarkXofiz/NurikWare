package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09135 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0L;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
      }
   }

   public class09135() {
      super();
      this.L();
      this.N_0 = new class09166();
   }

   public class09153 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      double var5,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      float var12,
      float var13
   ) {
      if (var3 != null && var4 != null && !(var5 <= 1.0E-5)) {
         float f = (float)Math.max(var5, 0.035F);
         this.N(System.currentTimeMillis(), f, var10, var11);
         class11499 class11499 = new class11499(var4.y() + (Float)this.N_2, var7 ? var4.R() : class04995.N(var4.R() + (Float)this.N_3, -90.0F, 90.0F));
         if (var8 && !var9 && !var1.N(var2, class11499)) {
            class11499 = this.N(var1, var2, var4, var7);
         }

         float f1 = Math.max(0.01F, var12 + (Float)this.N_4);
         float f2 = Math.max(0.01F, var13 + (var7 ? 0.0F : (Float)this.N_5));
         return new class09153(class11499, f1, f2);
      } else {
         return new class09153(var4, var12, var13);
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5) {
      if (var1 >= (Long)this.N_1) {
         float f = (var4 ? 1.0F : 0.0F) + (var5 ? 0.55F : 0.0F);
         float f1 = var3 * (0.18F + f * 0.08F);
         float f2 = var3 * (0.075F + f * 0.035F);
         this.N_2 = this.N(f1);
         this.N_3 = this.N(f2);
         this.N_4 = this.N(var3 * (0.2F + f * 0.11F));
         this.N_5 = this.N(var3 * (0.1F + f * 0.05F));
         this.N_1 = var1 + (long)((class09166)this.N_0).y(var4 ? 34.0F : 48.0F, var5 ? 96.0F : 145.0F);
      }
   }

   public void N() {
      this.N_1 = 0L;
      this.N_2 = 0.0F;
      this.N_3 = 0.0F;
      this.N_4 = 0.0F;
      this.N_5 = 0.0F;
      ((class09166)this.N_0).y();
   }

   private float N(float var1) {
      float f = ((class09166)this.N_0).N();
      float f1 = ((class09166)this.N_0).y(0.19F, 0.83F);
      if (f1 > 0.46F && f1 < 0.56F) {
         f1 += ((class09166)this.N_0).N() * ((class09166)this.N_0).N(0.08F, 0.18F);
      }

      return f * var1 * class04995.N(f1, 0.12F, 0.92F);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, boolean var4) {
      for (float f : new float[]{0.72F, 0.48F, 0.26F, -0.38F, -0.18F}) {
         class11499 class11499 = new class11499(var3.y() + (Float)this.N_2 * f, var4 ? var3.R() : class04995.N(var3.R() + (Float)this.N_3 * f, -90.0F, 90.0F));
         if (var1.N(var2, class11499)) {
            return class11499;
         }
      }

      return var3;
   }
}
