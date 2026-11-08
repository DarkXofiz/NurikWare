package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class11098 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;

   public class11098() {
      super();
      this.i();
      this.L_0 = new class09166();
      this.L_2 = 0.72F;
      this.L_3 = 0.54F;
      this.y_2 = 1.0F;
   }

   private void i() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0L;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
         this.L_6 = 0.0F;
         this.L_7 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = false;
      }
   }

   private float y(float var1, double var2, boolean var4) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float f = (float)var2;
         int i = Math.round(var1 / f);
         if (i == 0) {
            i = var1 > 0.0F ? 1 : -1;
         }

         int j = var4 ? (Integer)this.N_2 : (Integer)this.N_3;
         int k = var4 ? (Integer)this.N_4 : (Integer)this.N_5;
         int l = i - j;
         if (i == j || l == k || Math.abs(i) == Math.abs(j)) {
            int i1 = i == 0 ? ((class09166)this.L_0).N() : (i > 0 ? 1 : -1);
            i += i1 * ((class09166)this.L_0).N(1, var4 ? 3 : 2);
            if (i == 0) {
               i = i1;
            }

            l = i - j;
         }

         if (var4) {
            this.N_2 = i;
            this.N_4 = l;
         } else {
            this.N_3 = i;
            this.N_5 = l;
         }

         this.N_6 = true;
         return i * f;
      } else {
         return var1;
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      if (var1 >= (Long)this.L_1) {
         float f = (var4 ? 0.18F : 0.0F) + (var5 ? 0.32F : 0.0F) + (var6 ? 0.18F : 0.0F) + (var7 ? 0.16F : 0.0F);
         this.N_1 = ((class09166)this.L_0).N(0, 4);
         this.L_2 = ((class09166)this.L_0).y(0.54F, 0.86F + f * 0.12F);
         this.L_3 = ((class09166)this.L_0).y(0.38F, 0.68F + f * 0.08F);
         this.L_4 = ((class09166)this.L_0).y(0.9F, 4.4F + f * 2.0F);
         this.L_5 = ((class09166)this.L_0).y(0.32F, 1.9F + f * 0.85F);
         this.L_6 = ((class09166)this.L_0).y(0.35F, 2.25F + f * 0.9F);
         this.L_7 = ((class09166)this.L_0).y(0.12F, 1.05F + f * 0.45F);
         this.y_0 = ((class09166)this.L_0).y(0.25F, 1.8F);
         this.y_1 = ((class09166)this.L_0).y(0.14F, 1.05F + f * 0.45F);
         this.y_2 = ((class09166)this.L_0).N(0.58F) ? -(Float)this.y_2 : ((class09166)this.L_0).N();
         this.N_0 = ((class09166)this.L_0).N(0.0F, (float) (Math.PI * 2));
         this.L_1 = var1 + (long)((class09166)this.L_0).y(!var6 && !var7 ? 68.0F : 45.0F, var5 ? 150.0F : 230.0F);
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, float var5) {
      float f = Math.abs(var2) > 1.0E-4F ? var2 : var1;
      float f1 = var4 ? (Float)this.L_2 : (Float)this.L_3;
      float f2 = var1 * ((class09166)this.L_0).y(0.72F, 1.08F) + f * f1 * ((class09166)this.L_0).y(0.14F, 0.36F);
      if (Math.abs(f2) < var3 && Math.abs(f) > var3 * 2.0F) {
         f2 = Math.signum(f) * var3 * ((class09166)this.L_0).y(var4 ? 1.4F : 0.7F, var4 ? 4.2F : 1.9F);
      }

      return f2;
   }

   public class09134 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      float var14,
      float var15
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null && (var10 || var11 || var12 || var13)) {
         float f = (float)Math.max(var6, 0.035F);
         long i = System.currentTimeMillis();
         this.N(i, f, var10, var11, var12, var13);
         float f1 = class09170.N(var3.y(), var4.y());
         float f2 = var4.R() - var3.R();
         float f3 = class09170.N(var3.y(), var5.y());
         float f4 = var5.R() - var3.R();
         float f5 = Math.abs(f1) > Math.abs(f3) ? f1 : f3;
         float f6 = Math.abs(f2) > Math.abs(f4) ? f2 : f4;
         float f7 = class04995.N(
            (Math.abs(f5) + Math.abs(f6) * 1.45F) / 76.0F + (var10 ? 0.18F : 0.0F) + (var11 ? 0.24F : 0.0F) + (var13 ? 0.16F : 0.0F), 0.0F, 1.18F
         );
         float f8 = this.N(f3, f1, f, true, f7);
         float f9 = this.N(f4, f2, f, false, f7);
         float f10 = (float)Math.sqrt(f5 * f5 + f6 * f6);
         float f11 = f10 > 1.0E-4F ? -f6 / f10 * (Float)this.y_2 : (Float)this.y_2;
         float f12 = f10 > 1.0E-4F ? f5 / f10 * (Float)this.y_2 : -(Float)this.y_2;
         float f13 = (float)Math.sin(i * 0.027 + ((Float)this.N_0).floatValue());
         float f14 = (float)Math.sin(i * 0.061 + (Float)this.N_0 * 1.73F);
         float f15 = f13 * 0.62F + f14 * 0.38F;
         float f16 = f * (Float)this.L_4 * f7;
         float f17 = f * (Float)this.L_5 * f7;
         f8 += f11 * f16 + f15 * f * (Float)this.L_6;
         f9 += f12 * f17 + f14 * f * (Float)this.L_7;
         if ((Integer)this.N_1 == 1) {
            f8 -= Math.signum(f8) * f * (Float)this.y_0 * class04995.N(f7, 0.25F, 1.0F);
            f9 += Math.signum(f6 == 0.0F ? f9 : f6) * f * (Float)this.y_1;
         } else if ((Integer)this.N_1 == 2) {
            f8 += Math.signum(f5 == 0.0F ? f8 : f5) * f * ((class09166)this.L_0).y(0.65F, 2.6F) * f7;
            f9 -= f * ((class09166)this.L_0).y(0.35F, 1.45F) * (var11 ? 1.0F : 0.55F);
         } else if ((Integer)this.N_1 == 3) {
            f9 *= ((class09166)this.L_0).y(0.62F, 1.28F);
            f8 *= ((class09166)this.L_0).y(0.82F, 1.18F);
         }

         f8 = this.N(f8, f5, f3, f, true, f7);
         f9 = this.N(f9, f6, f4, f, false, f7);
         if (Math.abs(f9) <= f * 0.45F && Math.abs(f6) > f * 1.1F) {
            f9 = Math.signum(f6) * f * ((class09166)this.L_0).y(0.85F, var11 ? 3.4F : 2.1F);
         }

         f8 = this.y(f8, var6, true);
         f9 = this.y(f9, var6, false);
         class11499 class11499 = new class11499(var3.y() + f8, class04995.N(var3.R() + f9, -90.0F, 90.0F));
         class11499 = this.N(var1, var2, var3, var5, class11499, var6, var8, var9);
         float f18 = Math.abs(class09170.N(var3.y(), class11499.y()));
         float f19 = Math.abs(class11499.R() - var3.R());
         return new class09134(
            class11499,
            this.N(Math.max(f18, var14 * ((class09166)this.L_0).y(0.74F, 1.42F)), var6, true),
            this.N(Math.max(f19, var15 * ((class09166)this.L_0).y(0.62F, 1.28F)), var6, false)
         );
      } else {
         return new class09134(var5, var14, var15);
      }
   }

   public void N() {
      this.L_1 = 0L;
      this.L_2 = 0.72F;
      this.L_3 = 0.54F;
      this.L_4 = 0.0F;
      this.L_5 = 0.0F;
      this.L_6 = 0.0F;
      this.L_7 = 0.0F;
      this.y_0 = 0.0F;
      this.y_1 = 0.0F;
      this.y_2 = 1.0F;
      this.N_0 = 0.0F;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = 0;
      this.N_5 = 0;
      this.N_6 = false;
      ((class09166)this.L_0).y();
   }

   private float N(float var1, double var2, boolean var4) {
      if (var2 <= 1.0E-5) {
         return Math.max(var4 ? 0.35F : 0.25F, var1);
      } else {
         float f = var4 ? 0.35F : 0.25F;
         return Math.max(1, Math.round(Math.max(f, var1) / (float)var2)) * (float)var2;
      }
   }

   private float N(float var1, double var2) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         int i = Math.round(var1 / (float)var2);
         if (i == 0) {
            i = var1 > 0.0F ? 1 : -1;
         }

         return i * (float)var2;
      } else {
         return var1;
      }
   }

   private float N(float var1, float var2, float var3, float var4, boolean var5, float var6) {
      float f = Math.abs(var2) > 1.0E-4F ? var2 : var3;
      if (Math.abs(f) <= 1.0E-4F) {
         float f4 = var4 * (var5 ? 6.0F : 2.8F) * (0.7F + var6);
         return class04995.N(var1, -f4, f4);
      } else {
         if (Math.signum(var1) != Math.signum(f) && Math.abs(f) > var4 * 3.2F) {
            float f1 = var4 * (var5 ? 4.2F : 1.6F) * (0.65F + var6 * 0.35F);
            var1 = class04995.N(var1, -f1, f1);
         }

         float f3 = var5 ? 1.18F : 1.08F;
         float f2 = var4 * (var5 ? 4.2F : 1.9F) * (0.5F + var6);
         return class04995.N(var1, -Math.abs(f) * f3 - f2, Math.abs(f) * f3 + f2);
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9) {
      if (var8 && !var9 && !var1.N(var2, var5)) {
         float f = class09170.N(var4.y(), var5.y());
         float f1 = var5.R() - var4.R();

         for (float f2 : new float[]{0.86F, 0.64F, 0.42F, 0.24F}) {
            class11499 class11499 = new class11499(var4.y() + this.N(f * f2, var6), class04995.N(var4.R() + this.N(f1 * f2, var6), -90.0F, 90.0F));
            if (var1.N(var2, class11499)) {
               return class11499;
            }
         }

         return var1.N(var2, var4) ? var4 : var3;
      } else {
         return var5;
      }
   }
}
