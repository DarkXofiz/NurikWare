package NurikWare;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11062 {
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
   public boolean y_init;

   public class11062() {
      super();
      this.y();
      this.y_1 = 1.0F;
   }

   private void y(long var1) {
      this.N_2 = var1;
      this.y_5 = true;
      this.y_0 = var1 + (long)class09139.N(95.0, 165.0);
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0L;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0.0F;
         this.y_5 = false;
      }
   }

   private boolean N(class11087 var1, boolean var2, boolean var3) {
      return var2 || var3 || var1.y().y() > 545L;
   }

   private boolean N(long var1, float var3, float var4, float var5, boolean var6, boolean var7) {
      if (!var6 && !var7 && !(var3 < 0.34F)) {
         boolean flag = var4 <= 1.75F && var5 <= 0.95F;
         boolean flag1 = var3 >= 0.72F && var4 <= 4.2F && var5 <= 2.0F;
         return flag || flag1 || var1 >= (Long)this.N_2 - 45L;
      } else {
         return false;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.y_0 = 0L;
      this.y_1 = 1.0F;
      this.y_2 = 0.0F;
      this.y_3 = 0.0F;
      this.y_4 = 0.16F;
      this.y_5 = false;
   }

   private boolean N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      long i = System.currentTimeMillis();
      if (var5 && !var6 && !var7 && var1.y().y() >= 120L) {
         float f = Math.abs(class09170.N(var3.y(), var4.y()));
         float f1 = Math.abs(var4.R() - var3.R());
         if (!(f > 5.8F) && !(f1 > 2.65F)) {
            double d0 = ((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class11064.y(var2));
            float f2 = class04995.N((float)(3.6 - d0) / 3.6F, 0.0F, 1.0F);
            float f3 = class04995.N((5.8F - f) / 5.8F, 0.0F, 1.0F);
            double d1 = 0.12 + f2 * 0.12 + f3 * 0.16;
            if (Math.random() > d1) {
               this.N_0 = i + (long)class09139.N(140.0, 360.0);
               return false;
            } else {
               return true;
            }
         } else {
            this.N_0 = i + (long)class09139.N(95.0, 210.0);
            return false;
         }
      } else {
         this.N_0 = i + (long)class09139.N(110.0, 260.0);
         return false;
      }
   }

   private void N(long var1, class00734 var3) {
      float f = class09139.N(0.0, Math.PI * 2);
      this.y_1 = (float)Math.cos(f);
      this.y_2 = (float)Math.sin(f);
      double d0 = var3.i - var3.y;
      boolean flag = Math.random() < 0.36;
      this.y_3 = class09139.N(-d0 * (flag ? 0.22 : 0.13), d0 * (flag ? 0.24 : 0.16));
      this.y_4 = class09139.N(flag ? 0.2 : 0.12, flag ? 0.42 : 0.26);
      this.N_1 = var1;
      this.N_2 = var1 + (long)class09139.N(flag ? 230.0 : 190.0, flag ? 420.0 : 340.0);
      this.N_0 = var1 + (long)class09139.N(flag ? 620.0 : 460.0, flag ? 1250.0 : 980.0);
      this.y_5 = false;
      this.y_0 = 0L;
   }

   private class06889 N(class06889 var1, class06889 var2, double var3) {
      return new class06889(class04995.u(var3, var1.M, var2.M), class04995.u(var3, var1.B, var2.B), class04995.u(var3, var1.Z, var2.Z));
   }

   public class11065 N(
      class11087 var1, class07438 var2, class00734 var3, class06889 var4, class11499 var5, class11499 var6, boolean var7, boolean var8, boolean var9
   ) {
      long i = System.currentTimeMillis();
      if (this.N(var1, var8, var9)) {
         this.N_2 = i;
         this.y_5 = false;
      }

      if (i >= (Long)this.N_2 && i >= (Long)this.N_0 && this.N(var1, var2, var5, var6, var7, var8, var9)) {
         this.N(i, var3);
      }

      if ((Boolean)this.y_5 && i < (Long)this.y_0) {
         return new class11065(var4, false, true);
      } else {
         if (i >= (Long)this.y_0) {
            this.y_5 = false;
         }

         if (i >= (Long)this.N_2) {
            return new class11065(var4, false);
         } else {
            float f = class04995.N((float)(i - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F);
            float f1 = (float)Math.sin(f * Math.PI);
            if (f1 <= 0.08F) {
               return new class11065(var4, false);
            } else {
               class06889 class06889xx = var3.R();
               double d0 = Math.max(0.08, (var3.u - var3.N) * 0.5);
               double d1 = Math.max(0.08, (var3.R - var3.L) * 0.5);
               class06889 class06889x = new class06889(
                  class06889xx.M + ((Float)this.y_1).floatValue() * (d0 + ((Float)this.y_4).floatValue()),
                  class04995.N(var4.B + ((Float)this.y_3).floatValue(), var3.y - (var3.i - var3.y) * 0.18, var3.i + (var3.i - var3.y) * 0.16),
                  class06889xx.Z + ((Float)this.y_2).floatValue() * (d1 + ((Float)this.y_4).floatValue())
               );
               class06889 class06889xx = this.N(var4, class06889x, f1);
               class11499 class11499 = class09170.N(class06889xx);
               float f2 = Math.abs(class09170.N(var5.y(), class11499.y()));
               if (this.N(i, f, f2, Math.abs(class11499.R() - var5.R()), var8, var9)) {
                  this.y(i);
                  return new class11065(var4, false, true);
               } else {
                  return new class11065(class06889xx, true);
               }
            }
         }
      }
   }
}
