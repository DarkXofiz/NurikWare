package NurikWare;

import minecraft.class04995;

public class class09171 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
         this.L_6 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = 0;
         this.y_6 = false;
      }
   }

   public class09171() {
      super();
      this.M();
      this.N_0 = new class09166();
   }

   private float y() {
      return (Integer)this.y_4 <= 1 ? 1.0F : class04995.N((float)((Integer)this.y_3).intValue() / ((Integer)this.y_4 - 1), 0.0F, 1.0F);
   }

   private float y(float var1) {
      float f = class04995.N(var1, 0.0F, 1.0F);

      return switch ((Integer)this.y_5) {
         case 0 -> (float)Math.sin(f * Math.PI);
         case 1 -> (float)Math.pow(1.0F - f, 0.58);
         case 2 -> (float)Math.pow(f, 0.72);
         case 3 -> f < 0.42F ? 1.0F - f * 0.45F : (float)Math.sin(f * Math.PI) * 0.72F;
         default -> 0.45F + (float)Math.sin((f * 1.7F + (Float)this.y_0) * Math.PI) * 0.55F;
      };
   }

   public class09132 N(
      class11499 var1, class11499 var2, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9, float var10, float var11
   ) {
      float f = class09170.N(var1.y(), var2.y());
      float f1 = var2.R() - var1.R();
      float f2 = Math.abs(f);
      int i = f > 0.0F ? 1 : (f < 0.0F ? -1 : 0);
      boolean flag = (Integer)this.y_1 != 0 && i != 0 && i != (Integer)this.y_1;
      boolean flag1 = var6 && (f2 > 54.0F - var4 * 16.0F || flag && f2 > 22.0F || Math.abs(var5) > 18.0F && f2 > 18.0F);
      if (!flag1 && (Integer)this.y_2 <= 0) {
         if (i != 0) {
            this.y_1 = i;
         }

         this.N(0.0F, 0.0F);
         return class09132.N(var2, var10, var11);
      } else {
         if (flag1) {
            if ((Integer)this.y_2 <= 0) {
               this.N(var4, var6, var7, var8, var9, f2, Math.abs(f1));
            } else {
               this.y_2 = Math.max((Integer)this.y_2, ((class09166)this.N_0).N(2, !var9 && !var8 ? 5 : 4));
            }
         } else {
            this.y_2 = (Integer)this.y_2 - 1;
         }

         float f3 = class04995.N(0.48F + var4 * 0.34F + (var9 ? 0.12F : 0.0F) + (var8 ? 0.1F : 0.0F), 0.0F, 1.0F);
         float f4 = this.y();
         float f5 = this.y(f4);
         float f6 = (Float)this.L_0 + f5 * ((class09166)this.N_0).y(-0.08F, 0.16F);
         float f7 = (Float)this.L_1 - f5 * ((class09166)this.N_0).y(0.03F, 0.14F);
         if (var7) {
            f6 *= ((class09166)this.N_0).N(0.62F, 0.84F);
            f7 *= ((class09166)this.N_0).N(0.55F, 0.78F);
         }

         float f8 = (float)Math.sin((f4 * 2.35F + (Float)this.y_0) * Math.PI);
         float f9 = (float)Math.sin((f4 * 4.7F + (Float)this.y_0 * 0.41F) * Math.PI);
         float f10 = (Float)this.L_6 * var3 * (Float)this.L_2 * (0.55F + f3 * 0.45F) * f5;
         float f11 = f * f6 + f10 + f8 * var3 * (Float)this.L_4 + f9 * var3 * ((class09166)this.N_0).y(-0.8F, 0.8F);
         float f12 = -var3 * (Float)this.L_3 * (0.35F + f5) * (f1 > 0.0F ? 1.0F : 0.42F);
         float f13 = f1 * f7 + f12 + f8 * var3 * (Float)this.L_5;
         if ((Boolean)this.y_6) {
            float f14 = Math.max(var3 * ((class09166)this.N_0).N(26.0F, 48.0F), f2 * ((class09166)this.N_0).N(0.54F, 0.92F));
            float f15 = Math.max(var3 * ((class09166)this.N_0).N(10.0F, 22.0F), Math.abs(f1) * ((class09166)this.N_0).N(0.46F, 0.82F));
            if ((Integer)this.y_5 == 2 || (Integer)this.y_5 == 4) {
               f14 *= ((class09166)this.N_0).y(1.18F, 1.65F);
            }

            f11 = (Float)this.N_1 + class04995.N(f11 - (Float)this.N_1, -f14, f14);
            f13 = (Float)this.N_2 + class04995.N(f13 - (Float)this.N_2, -f15, f15);
         }

         float f18 = Math.min(f2, Math.max(var3 * 7.0F, f2 * (!var8 && !var9 ? 0.34F : 0.42F)));
         if (f2 > var3 && Math.abs(f11) < f18) {
            f11 = Math.signum(f) * f18;
         }

         f11 = class04995.N(f11, -Math.max(var3 * 12.0F, f2 * 0.94F), Math.max(var3 * 12.0F, f2 * 0.94F));
         f13 = class04995.N(f13, -Math.max(var3 * 3.5F, Math.abs(f1) * 0.86F + var3), Math.max(var3 * 3.5F, Math.abs(f1) * 0.86F + var3));
         class11499 class11499 = new class11499(var1.y() + f11, class04995.N(var1.R() + f13, -90.0F, 90.0F));
         float f16 = ((class09166)this.N_0).N(1.6232324F, 1.9373773F);
         float f17 = ((class09166)this.N_0).N(1.1736283F, 1.6737733F);
         this.y_1 = i != 0 ? i : (Integer)this.y_1;
         this.N(f11, f13);
         this.y_3 = (Integer)this.y_3 + 1;
         return new class09132(class11499, Math.max(var10, Math.abs(f11) * f16), Math.max(var11, Math.abs(f13) * f17), true);
      }
   }

   private void N(float var1, boolean var2, boolean var3, boolean var4, boolean var5, float var6, float var7) {
      float f = class04995.N(var1 + (var2 ? 0.32F : 0.0F) + (var4 ? 0.18F : 0.0F) + (var5 ? 0.16F : 0.0F), 0.0F, 1.35F);
      this.y_5 = ((class09166)this.N_0).N(0, 4);
      this.y_4 = ((class09166)this.N_0).N(3, !var5 && !var4 ? 7 : 5);
      this.y_2 = (Integer)this.y_4;
      this.y_3 = 0;
      this.L_0 = ((class09166)this.N_0).y(var3 ? 0.42F : 0.56F, var3 ? 0.76F : 0.92F) + f * ((class09166)this.N_0).y(0.04F, 0.16F);
      this.L_1 = ((class09166)this.N_0).y(0.26F, 0.58F) + f * ((class09166)this.N_0).y(0.02F, 0.1F);
      this.L_2 = ((class09166)this.N_0).y(1.4F, 6.8F + f * 2.2F);
      this.L_3 = ((class09166)this.N_0).y(0.85F, var2 ? 4.1F : 2.6F) + class04995.N(var7 / 8.0F, 0.0F, 1.4F);
      this.L_4 = ((class09166)this.N_0).y(0.8F, 3.4F + f);
      this.L_5 = ((class09166)this.N_0).y(0.22F, 1.25F);
      this.L_6 = this.N(var6);
      this.y_0 = ((class09166)this.N_0).N(0.0F, 2.0F);
      if ((Integer)this.y_5 == 1) {
         this.L_0 = (Float)this.L_0 * ((class09166)this.N_0).y(0.82F, 0.96F);
         this.L_2 = (Float)this.L_2 * ((class09166)this.N_0).y(1.25F, 1.7F);
      } else if ((Integer)this.y_5 == 2) {
         this.L_0 = (Float)this.L_0 * ((class09166)this.N_0).y(1.04F, 1.18F);
         this.L_1 = (Float)this.L_1 * ((class09166)this.N_0).y(0.72F, 0.9F);
      } else if ((Integer)this.y_5 == 3) {
         this.L_3 = (Float)this.L_3 * ((class09166)this.N_0).y(1.25F, 1.75F);
         this.L_1 = (Float)this.L_1 * ((class09166)this.N_0).y(0.58F, 0.82F);
      } else if ((Integer)this.y_5 == 4) {
         this.L_4 = (Float)this.L_4 * ((class09166)this.N_0).y(1.35F, 1.9F);
      }
   }

   private float N(float var1) {
      if ((Integer)this.y_1 != 0 && var1 > 18.0F && ((class09166)this.N_0).N(0.58F)) {
         return -(Integer)this.y_1;
      } else {
         return (Boolean)this.y_6 && Math.abs((Float)this.N_1) > 1.0E-4F && ((class09166)this.N_0).N(0.52F)
            ? -Math.signum((Float)this.N_1)
            : ((class09166)this.N_0).N();
      }
   }

   private void N(float var1, float var2) {
      this.N_1 = var1;
      this.N_2 = var2;
      this.y_6 = true;
   }

   public void N() {
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = 0.0F;
      this.L_3 = 0.0F;
      this.L_4 = 0.0F;
      this.L_5 = 0.0F;
      this.L_6 = 1.0F;
      this.y_0 = 0.0F;
      this.y_1 = 0;
      this.y_2 = 0;
      this.y_3 = 0;
      this.y_4 = 0;
      this.y_5 = 0;
      this.y_6 = false;
      ((class09166)this.N_0).y();
   }
}
