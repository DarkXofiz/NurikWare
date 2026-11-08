package NurikWare;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11095 {
   public static Object N_0;
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;

   private void M() {
   }

   public class11095() {
      super();
      this.M();
      this.y_0 = new class11062();
      this.y_1 = new class11055();
      this.y_2 = new class11081();
      this.y_3 = new class11083();
      this.y_4 = new class11078();
      this.y_5 = new class11057();
      this.y_6 = new class11076();
   }

   static {
      R();
   }

   private boolean y(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      if (!var5) {
         return false;
      } else {
         float f = Math.abs(var4.R() - var3.R());
         if (var7 && f > 1.2F) {
            return false;
         } else {
            class11499 class11499x = new class11499(var4.y(), var3.R());
            if (var1.N(var2, class11499x)) {
               return true;
            } else if (var6) {
               return false;
            } else if (f > 1.15F) {
               return false;
            } else {
               float f1 = class09170.N(var3.y(), var4.y());
               class11499 class11499x = new class11499(var3.y() + f1 * 0.62F, var3.R());
               return var1.N(var2, class11499x);
            }
         }
      }
   }

   public void N() {
      ((class11076)this.y_6).N();
      ((class11062)this.y_0).N();
      ((class11055)this.y_1).N();
      ((class11081)this.y_2).N();
      ((class11083)this.y_3).N();
      ((class11078)this.y_4).N();
      ((class11057)this.y_5).N();
   }

   private double N(class11499 var1, class11499 var2) {
      float f = Math.abs(class09170.N(var1.y(), var2.y()));
      float f1 = Math.abs(var2.R() - var1.R());
      return f * 0.88 + f1 * 1.42;
   }

   private class11499 N(class06889 var1) {
      class11499 class11499 = class09170.N(var1);
      return new class11499(class11499.y(), class04995.N(class11499.R(), -90.0F, 90.0F));
   }

   private class06889 N(class00734 var1, float var2, float var3, float var4) {
      return new class06889(class04995.u(var2, var1.N, var1.u), class04995.u(var3, var1.y, var1.i), class04995.u(var4, var1.L, var1.R));
   }

   public class11097 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      boolean flag3 = var1.N(var2, var3);
      boolean flag4 = var1.N(var2, var4);
      class00734 class00734 = class11064.u(var2);
      class06889 class06889 = ((class04453)((class06202)class11087.N_0).T_4).method_33571();
      class06889 class06889x = this.N(class00734, var2, flag3, var5, var7);
      class11104 class11104 = ((class11057)this.y_5).N(var1, var2, class00734, class06889x, var3, flag3, var5, var6, var7);
      class06889 class06889xx = class11104.u();
      class11499 class11499x = this.N(class06889xx);
      class11065 class11065 = class11104.N()
         ? new class11065(class06889xx, true, class11104.y())
         : ((class11062)this.y_0).N(var1, var2, class00734, class06889xx, var3, class11499x, flag3, var5, var6);
      class11499 class11499x = this.N(class11065.L());
      class11499 class11499xx = class11065.y()
         ? (class11104.N() ? class11104.L() : class11499x)
         : this.N(var1, var2, var3, class11499x, class00734, class11065.L(), flag3);
      boolean flag2 = flag3 && !class11065.y() && !class11065.N();
      if (flag2) {
         class11499xx = ((class11078)this.y_4).N(var1, var2, var3, class11499xx, flag3, var6, var5, false);
      }

      float f = Math.abs(class09170.N(var3.y(), class11499x.y()));
      float f1 = Math.abs(class11499x.R() - var3.R());
      boolean flag5 = false;
      if (!flag2 && !class11065.y() && flag3 && f <= 2.4F && f1 <= 1.15F && !var6) {
         class11096 class11096 = ((class11081)this.y_2).N(var1, var2, var3, class11499xx, flag3, var5, var6, var7);
         class11499xx = class11096.y();
         flag5 = class11096.N();
      }

      class11086 class11086 = flag2 ? class11086.u() : ((class11055)this.y_1).N(var1, var2, var3, class11499xx, flag3, var5, var6, class11065.y());
      if (class11086.N()) {
         class11499xx = new class11499(class11499xx.y() + class11086.y(), class04995.N(class11499xx.R() + class11086.i(), -90.0F, 90.0F));
      }

      boolean flag;
      boolean flag1 = !(flag = class11086.L()) && this.y(var1, var2, var3, class11499xx, flag3, class11065.y(), class11065.N());
      if (flag1) {
         class11499xx = new class11499(class11499xx.y(), var3.R());
      }

      class11499xx = ((class11083)this.y_3).N(var1, var2, var3, class11499xx, var6, var5 && var7, class11065.y() || flag);
      class11499xx = ((class11078)this.y_4).N(var1, var2, var3, class11499xx, flag3, var6, var5, class11065.y() || flag);
      float f2 = Math.abs(class09170.N(var3.y(), class11499xx.y()));
      float f3 = Math.abs(class11499xx.R() - var3.R());
      double d0 = class06889.R(class00734.R());
      boolean flag6 = class11065.y()
         || class11065.N()
         || class11104.y()
         || flag
         || !flag3
         || f2 > class04995.N(7.0F + (float)d0 * 1.6F, 8.0F, 15.5F)
         || var7 && var5 && (f2 > 2.8F || f3 > 1.35F);
      return new class11097(
         class11499xx, flag3, flag4, flag6, flag1, class11065.y() || flag || class11104.N(), flag5, class11065.N() || class11104.y(), f2, f3, d0
      );
   }

   private class06889 N(class00734 var1, class07438 var2, boolean var3, boolean var4, boolean var5) {
      return ((class11076)this.y_6).N(var1, var2, var3, var4, var5);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class00734 var5, class06889 var6, boolean var7) {
      if (var7 && var1.N(var2, var3)) {
         float f = Math.abs(class09170.N(var3.y(), var4.y()));
         float f1 = Math.abs(var4.R() - var3.R());
         if (f <= 4.5F && f1 <= 2.0F) {
            return var4;
         } else {
            class11499 class11499xx = new class11499(
               var3.y() + class09170.N(var3.y(), var4.y()) * 0.38F, class04995.N(var3.R() + (var4.R() - var3.R()) * 0.28F, -90.0F, 90.0F)
            );
            if (var1.N(var2, class11499xx)) {
               return class11499xx;
            } else {
               class11499 class11499x = new class11499(var4.y(), var3.R());
               if (var1.N(var2, class11499x)) {
                  return class11499x;
               } else {
                  return var1.N(var2, var4) ? var4 : var3;
               }
            }
         }
      } else {
         class11499 class11499xxx = var1.N(var2, var4) ? var4 : null;
         double d0 = class11499xxx == null ? Double.MAX_VALUE : this.N(var3, class11499xxx);
         class06889 class06889x = class11064.N(var2, ((class04453)((class06202)class11087.N_0).T_4).method_33571());

         for (class06889 class06889x : new class06889[]{
            var6,
            var5.R(),
            class06889x,
            this.N(var5, 0.5F, 0.54F, 0.5F),
            this.N(var5, 0.5F, 0.74F, 0.5F),
            this.N(var5, 0.32F, 0.67F, 0.5F),
            this.N(var5, 0.68F, 0.67F, 0.5F),
            ((class11076)this.y_6).y(var5),
            ((class11076)this.y_6).N(var5)
         }) {
            class11499 class11499x = this.N(class06889x);
            double d1;
            if (var1.N(var2, class11499x) && (d1 = this.N(var3, class11499x)) < d0) {
               class11499xxx = class11499x;
               d0 = d1;
            }
         }

         return class11499xxx == null ? var4 : class11499xxx;
      }
   }

   private static void R() {
      N_0 = -90.0F;
      N_1 = 90.0F;
   }
}
