package NurikWare;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11076 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   private boolean L(class00734 var1) {
      class06889 class06889 = var1.R();
      double d0 = ((class04453)((class06202)class11087.N_0).T_4).method_23317() - class06889.M;
      double d1 = ((class04453)((class06202)class11087.N_0).T_4).method_23321() - class06889.Z;
      if (!(Boolean)this.y_5) {
         this.y_3 = d0;
         this.y_4 = d1;
         this.y_5 = true;
         return false;
      } else {
         double d2 = (Double)this.y_3 * d0 + (Double)this.y_4 * d1;
         double d3 = (Double)this.y_3 * d1 - (Double)this.y_4 * d0;
         double d4 = d0 - (Double)this.y_3;
         double d5 = d1 - (Double)this.y_4;
         double d6 = Math.hypot(d4, d5);
         boolean flag = d2 <= 0.0 && d6 > 0.12;
         boolean flag1 = Math.abs(d3) > 0.32 && d6 > 0.2;
         this.y_3 = d0;
         this.y_4 = d1;
         return flag || flag1;
      }
   }

   public class11076() {
      super();
      this.u();
      this.L_0 = new class09166();
      this.L_2 = class11085.UPPER_CHEST;
      this.L_3 = 0.5F;
      this.N_0 = 0.68F;
      this.N_1 = 0.5F;
      this.N_2 = 0.5F;
      this.N_3 = 0.68F;
      this.y_0 = 0.5F;
      this.y_1 = class09139.N(0.0, Math.PI * 2);
      this.y_2 = 1.0F;
   }

   private void u() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0L;
         this.L_3 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0;
         this.y_4 = 0.0;
         this.y_5 = false;
      }
   }

   public class06889 y(class00734 var1) {
      return this.N(var1, (Float)this.L_3, (Float)this.N_0, (Float)this.N_1);
   }

   private class06889 N(class06889 var1, class06889 var2, double var3) {
      return new class06889(class04995.u(var3, var1.M, var2.M), class04995.u(var3, var1.B, var2.B), class04995.u(var3, var1.Z, var2.Z));
   }

   public class06889 N(class00734 var1, class07438 var2, boolean var3, boolean var4, boolean var5) {
      long i = System.currentTimeMillis();
      boolean flag = this.L(var1);
      if (flag) {
         this.L_1 = 0L;
      }

      if (i >= (Long)this.L_1 || !var3 || flag) {
         this.N(i, var3, var4, var5);
      }

      class06889 class06889xx = var1.R();
      class06889 class06889x = var2.method_18798();
      class06889 class06889xx = ((class04453)((class06202)class11087.N_0).T_4).method_18798();
      double d0 = class06889x.M - class06889xx.M * 0.42;
      double d1 = class06889x.Z - class06889xx.Z * 0.42;
      double d2 = Math.hypot(d0, d1);
      double d3 = ((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class06889xx);
      double d4 = var3 ? class04995.N(d3 * 0.18 + d2 * 2.4, 0.18, 1.25) : class04995.N(d3 * 0.46 + d2 * 5.8, 0.85, 5.2);
      class06889 class06889xxx = this.y(var1);
      class06889 class06889xxxx = new class06889(
         class06889xx.M + d0 * d4, class06889xx.B + class06889x.B * class04995.N(d4 * 0.42, 0.0, 1.45), class06889xx.Z + d1 * d4
      );
      class06889xxxx = class11064.y(var2, class06889xxxx);
      float f = var3 ? 0.014F : 0.046F;
      double d5 = var1.u - var1.N;
      double d6 = var1.R - var1.L;
      double d7 = var1.i - var1.y;
      double d8 = Math.sin(i * 0.0105 + ((Float)this.y_1).floatValue()) * d5 * f;
      double d9 = Math.cos(i * 0.0073 + (Float)this.y_1 * 0.73F) * d7 * f * 0.28;
      double d10 = Math.sin(i * 0.0121 + (Float)this.y_1 * 1.31F) * d6 * f;
      double d11 = var3 && !flag ? (var4 && var5 ? 0.13 : 0.075) : (var4 && var5 ? 0.58 : 0.38);
      class06889 class06889xxxxx = this.N(class06889xxx, class06889xxxx, d11).y(d8, d9, d10);
      return this.N(var1, class06889xxxxx);
   }

   private class06889 N(class00734 var1, float var2, float var3, float var4) {
      return new class06889(class04995.u(var2, var1.N, var1.u), class04995.u(var3, var1.y, var1.i), class04995.u(var4, var1.L, var1.R));
   }

   private void N(long var1, boolean var3, boolean var4, boolean var5) {
      class11085 class11085 = (class11085)this.L_2;
      this.N_2 = (Float)this.L_3;
      this.N_3 = (Float)this.N_0;
      this.y_0 = (Float)this.N_1;
      this.L_2 = this.N(var3, var4, var5);
      if ((class11085)this.L_2 == class11085 && ((class09166)this.L_0).N(var3 ? 0.62F : 0.44F)) {
         this.L_2 = ((class11085)this.L_2).N((class09166)this.L_0);
      }

      this.y_2 = ((class09166)this.L_0).N(0.55F) ? -(Float)this.y_2 : ((class09166)this.L_0).N();
      switch ((class11085)this.L_2) {
         case MID_CHEST:
            this.L_3 = class04995.N(0.5F + ((class09166)this.L_0).y(-0.22F, 0.22F), 0.24F, 0.76F);
            this.N_0 = ((class09166)this.L_0).y(0.56F, 0.69F);
            this.N_1 = class04995.N(0.5F + ((class09166)this.L_0).y(-0.22F, 0.22F), 0.24F, 0.76F);
            break;
         case UPPER_CHEST:
         default:
            this.L_3 = class04995.N(0.5F + ((class09166)this.L_0).y(-0.19F, 0.19F), 0.26F, 0.74F);
            this.N_0 = ((class09166)this.L_0).y(0.66F, var4 && var5 ? 0.86F : 0.82F);
            this.N_1 = class04995.N(0.5F + ((class09166)this.L_0).y(-0.2F, 0.2F), 0.24F, 0.76F);
            break;
         case SHOULDER:
            this.L_3 = class04995.N(0.5F + (Float)this.y_2 * ((class09166)this.L_0).y(0.17F, 0.32F), 0.18F, 0.82F);
            this.N_0 = ((class09166)this.L_0).y(0.62F, var4 ? 0.82F : 0.78F);
            this.N_1 = class04995.N(0.5F + ((class09166)this.L_0).y(-0.2F, 0.2F), 0.22F, 0.78F);
            break;
         case HEAD_LINE:
            this.L_3 = class04995.N(0.5F + ((class09166)this.L_0).y(-0.13F, 0.13F), 0.34F, 0.66F);
            this.N_0 = ((class09166)this.L_0).y(0.78F, 0.91F);
            this.N_1 = class04995.N(0.5F + ((class09166)this.L_0).y(-0.11F, 0.11F), 0.34F, 0.66F);
      }

      if (var3) {
         this.L_3 = class04995.B(0.46F, (Float)this.N_2, (Float)this.L_3);
         this.N_0 = class04995.B(0.58F, (Float)this.N_3, (Float)this.N_0);
         this.N_1 = class04995.B(0.46F, (Float)this.y_0, (Float)this.N_1);
      }

      this.y_1 = class09139.N(0.0, Math.PI * 2);
      long i = (long)(var3 ? (var4 ? 64.0 : 82.0) : 58.0);
      long j = (long)(var3 ? (var4 ? 145.0 : 205.0) : 165.0);
      this.L_1 = var1 + (long)((class09166)this.L_0).y((float)i, (float)j);
   }

   private class11085 N(boolean var1, boolean var2, boolean var3) {
      float f = ((class09166)this.L_0).N(0.0F, 1.0F);
      if (var2 && var3) {
         if (f < 0.42F) {
            return class11085.UPPER_CHEST;
         } else {
            return f < 0.74F ? class11085.SHOULDER : class11085.HEAD_LINE;
         }
      } else if (var1) {
         if (f < 0.38F) {
            return class11085.SHOULDER;
         } else if (f < 0.76F) {
            return class11085.UPPER_CHEST;
         } else {
            return f < 0.91F ? class11085.MID_CHEST : class11085.HEAD_LINE;
         }
      } else if (f < 0.46F) {
         return class11085.UPPER_CHEST;
      } else if (f < 0.76F) {
         return class11085.SHOULDER;
      } else {
         return f < 0.92F ? class11085.MID_CHEST : class11085.HEAD_LINE;
      }
   }

   public class06889 N(class00734 var1) {
      return this.N(var1, 1.0F - (Float)this.L_3, class04995.N((Float)this.N_0 + ((class09166)this.L_0).N(-0.08F, 0.08F), 0.5F, 0.9F), (Float)this.N_1);
   }

   private class06889 N(class00734 var1, class06889 var2) {
      double d0 = var1.i - var1.y;
      return new class06889(
         class04995.N(var2.M, var1.N, var1.u), class04995.N(var2.B, var1.y + d0 * 0.46, var1.y + d0 * 0.92), class04995.N(var2.Z, var1.L, var1.R)
      );
   }

   public void N() {
      this.L_1 = 0L;
      this.L_2 = class11085.UPPER_CHEST;
      this.L_3 = 0.5F;
      this.N_0 = 0.68F;
      this.N_1 = 0.5F;
      this.N_2 = 0.5F;
      this.N_3 = 0.68F;
      this.y_0 = 0.5F;
      this.y_1 = class09139.N(0.0, Math.PI * 2);
      this.y_2 = 1.0F;
      this.y_3 = 0.0;
      this.y_4 = 0.0;
      this.y_5 = false;
      ((class09166)this.L_0).y();
   }
}
