package NurikWare;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11058 {
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
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public boolean u_init;

   private void L(int var1) {
      this.y_5 = var1;
      this.y_6 = 0L;
      this.y_7 = 0.0F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = 0.0F;
      this.N_0 = 0.0F;
      this.N_1 = 0.0F;
      this.N_2 = 0L;
      this.N_3 = 0.5F;
      this.N_4 = 0.68F;
      this.N_5 = 0.5F;
      this.N_6 = false;
      this.u_0 = false;
      this.u_1 = false;
      ((class09166)this.y_0).y();
      ((class09167)this.y_1).N();
      ((class11088)this.y_2).y();
      ((class09171)this.y_3).N();
      ((class09133)this.y_4).N();
   }

   public class11058() {
      super();
      this.R();
      this.y_0 = new class09166();
      this.y_1 = new class09167();
      this.y_2 = new class11088();
      this.y_3 = new class09171();
      this.y_4 = new class09133();
      this.y_5 = Integer.MIN_VALUE;
      this.N_3 = 0.5F;
      this.N_4 = 0.68F;
      this.N_5 = 0.5F;
   }

   public boolean y() {
      return ((class11088)this.y_2).N();
   }

   private float y(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      float f = var1 * (!var4 && !var5 ? 9.0F : 14.0F);
      float f1 = var2 * (var3 ? 0.66F : 0.84F);
      return Math.max(f, f1);
   }

   private boolean N(class00734 var1, class06889 var2, double var3) {
      boolean flag = var1.M(0.025).u(var2);
      boolean flag1 = var2.M >= var1.N - 0.34
         && var2.M <= var1.u + 0.34
         && var2.Z >= var1.L - 0.34
         && var2.Z <= var1.R + 0.34
         && var2.B >= var1.y - 0.45
         && var2.B <= var1.i + 0.95;
      return flag || flag1 || var3 <= 0.82;
   }

   private float N(float var1, float var2, float var3, float var4) {
      float f = Math.abs(var2);
      if (f <= 1.0E-4F) {
         return var1;
      } else {
         float f1 = Math.signum(var2);
         if (Math.signum(var1) != f1) {
            return var2 * var3;
         } else {
            float f2 = f * var3;
            return Math.abs(var1) < f2 ? f1 * f2 : class04995.N(var1, -f * var4, f * var4);
         }
      }
   }

   private float N(float var1, float var2, boolean var3) {
      float f = 9.0F - var2 * 1.6F + (var3 ? 2.2F : 0.0F);
      return Math.max(var1 * 3.0F, class04995.N(f, 5.0F, 12.0F));
   }

   private float N(float var1, float var2, boolean var3, boolean var4) {
      float f = 42.0F - var2 * 7.5F - (Float)this.L_0 * 4.5F;
      if (var3) {
         f += 10.0F;
      }

      if (var4) {
         f += 4.0F;
      }

      return Math.max(var1 * 10.0F, class04995.N(f, 26.0F, var3 ? 56.0F : 46.0F));
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, boolean var6, boolean var7) {
      long i = System.currentTimeMillis();
      if (i >= (Long)this.y_6) {
         float f = var7 ? 1.0F : 0.0F;
         this.L_1 = ((class09166)this.y_0).N(true, var5 * (0.28F + f * 0.18F));
         this.L_2 = ((class09166)this.y_0).N(false, var5 * (0.16F + f * 0.08F));
         this.y_6 = i + (long)((class09166)this.y_0).y(var7 ? 65.0F : 105.0F, var7 ? 150.0F : 260.0F);
      }

      class11499 class11499 = new class11499(var4.y() + (Float)this.L_1, class04995.N(var4.R() + (Float)this.L_2, -90.0F, 90.0F));
      return var6 && !var1.N(var2, class11499) ? var4 : class11499;
   }

   private class06889 N(class00734 var1, float var2, float var3, float var4) {
      return new class06889(class04995.u(var2, var1.N, var1.u), class04995.u(var3, var1.y, var1.i), class04995.u(var4, var1.L, var1.R));
   }

   private class06889 N(class00734 var1, boolean var2) {
      long i = System.currentTimeMillis();
      if (var2 || i >= (Long)this.N_2) {
         float f = ((class09166)this.y_0).N();
         this.N_3 = class04995.N(0.5F + f * ((class09166)this.y_0).y(0.08F, 0.28F), 0.2F, 0.8F);
         this.N_4 = ((class09166)this.y_0).y(0.58F, 0.86F);
         this.N_5 = class04995.N(0.5F + ((class09166)this.y_0).y(-0.24F, 0.24F), 0.2F, 0.8F);
         this.N_2 = i + (long)((class09166)this.y_0).y(58.0F, 155.0F);
      }

      return this.N(var1, (Float)this.N_3, (Float)this.N_4, (Float)this.N_5);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, boolean var7, boolean var8, boolean var9) {
      float f1 = this.N(var5, var6, var7, var8);
      float f;
      class11499 class11499xx = this.N(var3, var4, f1, f = this.N(var5, var6, var7));
      if (var1.N(var2, class11499xx)) {
         return class11499xx;
      } else {
         class11499 class11499x = this.N(var3, class09170.N(this.N(class11064.u(var2), true)), f1, f);
         if (var1.N(var2, class11499x)) {
            return class11499x;
         } else {
            class11499 class11499xx = this.N(var3, class09170.N(class11064.y(var2)), f1 * 1.18F, f);
            if (var1.N(var2, class11499xx)) {
               return class11499xx;
            } else {
               return var9 && var1.N(var2, var3) ? this.N(var1, var2, var3, var5, var8) : class11499xx;
            }
         }
      }
   }

   private void N(class11499 var1, class11499 var2) {
      this.N_0 = class09170.N(var1.y(), var2.y());
      this.N_1 = var2.R() - var1.R();
      this.u_0 = true;
   }

   private class11499 N(class11499 var1, class11499 var2, float var3, float var4) {
      float f = class09170.N(var1.y(), var2.y());
      float f1 = var2.R() - var1.R();
      return new class11499(var1.y() + class04995.N(f, -var3, var3), class04995.N(var1.R() + class04995.N(f1, -var4, var4), -90.0F, 90.0F));
   }

   public void N() {
      this.y_5 = Integer.MIN_VALUE;
      this.y_6 = 0L;
      this.y_7 = 0.0F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = 0.0F;
      this.N_0 = 0.0F;
      this.N_1 = 0.0F;
      this.N_2 = 0L;
      this.N_3 = 0.5F;
      this.N_4 = 0.68F;
      this.N_5 = 0.5F;
      this.N_6 = false;
      this.u_0 = false;
      this.u_1 = false;
      ((class09166)this.y_0).y();
      ((class09167)this.y_1).N();
      ((class11088)this.y_2).y();
      ((class09171)this.y_3).N();
      ((class09133)this.y_4).N();
   }

   private float N(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      float f = var1 * (!var4 && !var5 ? 24.0F : 34.0F);
      float f1 = var2 * (var3 ? 0.72F : 0.92F);
      return Math.max(f, f1);
   }

   private class11499 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      float var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12
   ) {
      float f = class09170.N(var3.y(), var4.y());
      float f1 = var4.R() - var3.R();
      float f2 = Math.abs(f);
      float f3 = Math.abs(f1);
      if (f2 <= var5 * 0.8F && f3 <= var5 * 0.55F) {
         class11499 class11499x = this.N(var1, var2, var3, var4, var5, var8, var11);
         this.N(var3, class11499x);
         return class11499x;
      } else {
         class09138 class09138 = ((class09167)this.y_1).N(f, f1, var5, var6, (Float)this.L_0, var7, var8, var9, var10, var11, var12);
         float f4 = class09138.R();
         float f5 = class09138.i();
         float f6 = class09138.B();
         float f7 = class09138.Z();
         float f8 = class09138.z();
         float f9 = class09138.M();
         this.u_1 = class09138.N();
         f8 = this.N(f8, f, f4, f6);
         f9 = this.N(f9, f1, f5, f7);
         if ((Boolean)this.u_0 && !class09138.u()) {
            float f10 = this.N(var5, f2, var8, var10, var11) * class09138.L();
            float f11 = this.y(var5, f3, var8, var10, var11) * class09138.y();
            f8 = (Float)this.N_0 + class04995.N(f8 - (Float)this.N_0, -f10, f10);
            f9 = (Float)this.N_1 + class04995.N(f9 - (Float)this.N_1, -f11, f11);
            f8 = this.N(f8, f, f4, f6);
            f9 = this.N(f9, f1, f5, f7);
         }

         class11499 class11499 = new class11499(var3.y() + f8, class04995.N(var3.R() + f9, -90.0F, 90.0F));
         if (var8 && !var1.N(var2, class11499)) {
            class11499 = this.N(var1, var2, var3, var4, f8, f9, var5);
         }

         this.N(var3, class11499);
         return class11499;
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, float var7) {
      for (float f : new float[]{0.82F, 0.66F, 0.48F, 0.3F}) {
         class11499 class11499x = new class11499(
            var3.y() + class04995.B(f, class09170.N(var3.y(), var4.y()), var5),
            class04995.N(var3.R() + class04995.B(f, var4.R() - var3.R(), var6), -90.0F, 90.0F)
         );
         if (var1.N(var2, class11499x)) {
            return class11499x;
         }
      }

      class11499 class11499 = new class11499(
         var3.y() + ((class09166)this.y_0).N(true, var7 * 0.22F), class04995.N(var3.R() + ((class09166)this.y_0).N(false, var7 * 0.12F), -90.0F, 90.0F)
      );
      return var1.N(var2, class11499) ? class11499 : var4;
   }

   public class09122 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      double var7,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14
   ) {
      if ((class04453)((class06202)class11087.N_0).T_4 != null && var1 != null && var2 != null && var3 != null && var4 != null) {
         if ((Integer)this.y_5 != var2.method_5628()) {
            this.L(var2.method_5628());
         }

         float f = (float)Math.max(var7, 0.035F);
         class06889 class06889 = class11064.y(var2);
         class06889 class06889x = ((class04453)((class06202)class11087.N_0).T_4).method_33571();
         class00734 class00734 = class11064.u(var2);
         double d0 = Math.hypot(
            ((class04453)((class06202)class11087.N_0).T_4).method_23317() - class06889.M,
            ((class04453)((class06202)class11087.N_0).T_4).method_23321() - class06889.Z
         );
         double d1 = class06889x.R(class06889);
         float f1 = var1.N(var2);
         boolean flag1 = d0 <= Math.min(2.85, (double)(f1 + 0.45F)) && d1 <= f1 + 1.35F;
         float f2 = this.N(class06889, flag1);
         this.u_1 = false;
         boolean flag2 = this.N(class00734, class06889x, d0);
         boolean flag3 = ((class09133)this.y_4).N(var2, class00734, class06889x, d0, f1);
         float f3 = class04995.N((float)((2.85 - d0) / 1.65) + (flag3 ? 0.22F : 0.0F), 0.0F, 1.0F);
         if (!((class11088)this.y_2).N(var1, var2, var3, var4, class00734, class06889x, class06889, d0, d1, f1, flag1, flag2, flag3, var10)) {
            return new class09122(var4, var5, var6, var9, var11, var12, false, false, f3, flag2, flag3);
         } else {
            float f4 = class09170.N(var3.y(), var4.y());
            float f5 = var4.R() - var3.R();
            boolean flag = Math.abs(f4) > class04995.N(96.0F - f3 * 18.0F, 72.0F, 96.0F);
            class09132 class09132 = ((class09171)this.y_3).N(var3, var4, f, f3, f2, flag2, var10, var12, var13, var5, var6);
            if (class09132.u() && !var10) {
               this.N(var3, class09132.N());
               return new class09122(class09132.N(), class09132.y(), class09132.L(), false, false, true, true, true, f3, flag2, flag3);
            } else if (var10) {
               if (flag && flag2) {
                  class11499 class11499 = this.N(var1, var2, var3, f, var13);
                  this.N(var3, class11499);
                  return new class09122(class11499, var5, var6, var9 && !flag3, false, false, false, true, f3, flag2, flag3);
               } else {
                  class11499 class11499xx = this.N(var1, var2, var3, var4, f, f3, f2, true, flag2, var12 || flag3, var13, var14);
                  return new class09122(class11499xx, var5, var6, var9 && !flag3, false, var12 || (Boolean)this.u_1 || flag3, false, true, f3, flag2, flag3);
               }
            } else if (flag2 && flag) {
               class11499 class11499x = this.N(var1, var2, var3, var4, f, f3, var12, var13);
               return new class09122(class11499x, var5, var6, false, false, true, false, true, f3, flag2, flag3);
            } else {
               return new class09122(
                  this.N(var1, var2, var3, var4, f, f3, f2, false, flag2, var12 || flag3, var13, var14),
                  var5,
                  var6,
                  var9 && !flag3,
                  var11,
                  var12 || (Boolean)this.u_1 || flag3,
                  false,
                  true,
                  f3,
                  flag2,
                  flag3
               );
            }
         }
      } else {
         return new class09122(var4, var5, var6, var9, var11, var12);
      }
   }

   private float N(class06889 var1, boolean var2) {
      if (!var2) {
         this.L_0 = (Float)this.L_0 * 0.72F;
         this.N_6 = false;
         return 0.0F;
      } else {
         float f = (float)Math.toDegrees(
            Math.atan2(
               ((class04453)((class06202)class11087.N_0).T_4).method_23321() - var1.Z, ((class04453)((class06202)class11087.N_0).T_4).method_23317() - var1.M
            )
         );
         float f1 = (Boolean)this.N_6 ? class09170.N((Float)this.y_7, f) : 0.0F;
         this.y_7 = f;
         this.N_6 = true;
         this.L_0 = (Float)this.L_0 * 0.68F + class04995.N(Math.abs(f1) / 18.0F, 0.0F, 1.0F) * 0.32F;
         return f1;
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, boolean var7, boolean var8) {
      float f = this.N(var5, var6, true, var8);
      float f1 = this.N(var5, var6, true);
      class11499 class11499xx = class09170.N(this.N(class11064.u(var2), true));
      float f2 = class11499xx.R() - var3.R();
      float[] afloat = new float[]{
         0.0F,
         ((class09166)this.y_0).N() * var5 * ((class09166)this.y_0).y(1.0F, 3.0F),
         -((class09166)this.y_0).N() * var5 * ((class09166)this.y_0).y(1.0F, 3.0F),
         7.5F,
         -7.5F,
         15.0F,
         -15.0F,
         26.0F,
         -26.0F,
         class04995.N(class09170.N(var3.y(), var4.y()), -f, f)
      };
      float[] afloat1 = new float[]{
         class04995.N(f2, -f1, f1),
         0.0F,
         class04995.N(var4.R() - var3.R(), -f1, f1),
         class04995.N(f2 * 0.58F, -f1, f1),
         class04995.N(f2 - 2.8F, -f1, f1),
         class04995.N(f2 - 5.0F, -f1, f1)
      };
      class11499 class11499x = null;
      double d0 = Double.MAX_VALUE;

      for (float f3 : afloat) {
         for (float f4 : afloat1) {
            class11499 class11499xx = new class11499(var3.y() + f3, class04995.N(var3.R() + f4, -90.0F, 90.0F));
            double d1;
            if (var1.N(var2, class11499xx) && (d1 = Math.abs(f3) * 1.35 + Math.abs(f4) * 0.72) < d0) {
               class11499x = class11499xx;
               d0 = d1;
            }
         }
      }

      return class11499x != null ? class11499x : this.N(var3, class11499xx, f, f1);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, float var4, boolean var5) {
      long i = System.currentTimeMillis();
      if (i >= (Long)this.y_6) {
         float f = var5 ? 1.0F : 0.0F;
         this.L_1 = ((class09166)this.y_0).N(true, var4 * (0.55F + f * 0.25F));
         this.L_2 = ((class09166)this.y_0).N(false, var4 * (0.22F + f * 0.12F));
         this.y_6 = i + (long)((class09166)this.y_0).y(var5 ? 90.0F : 145.0F, var5 ? 210.0F : 360.0F);
      }

      class11499 class11499;
      return var1.N(var2, class11499 = new class11499(var3.y() + (Float)this.L_1, class04995.N(var3.R() + (Float)this.L_2, -90.0F, 90.0F))) ? class11499 : var3;
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_5 = 0;
         this.y_6 = 0L;
         this.y_7 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
         this.N_6 = false;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = false;
         this.u_1 = false;
      }
   }
}
