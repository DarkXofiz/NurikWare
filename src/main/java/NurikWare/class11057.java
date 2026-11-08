package NurikWare;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11057 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public class11057() {
      super();
      this.u();
      this.N_5 = class11073.IDLE;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
      }
   }

   private float y(float var1) {
      return 1.0F - (float)Math.pow(1.0F - var1, 2.2);
   }

   private void N(long var1, boolean var3) {
      this.N_5 = class11073.IDLE;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = null;
      this.N_4 = null;
      if (!var3 && var1 >= (Long)this.N_0) {
         this.N_0 = var1 + (long)class09139.N(260.0, 680.0);
      }
   }

   private boolean N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      if (var5 && !var6 && !var7 && var3 != null) {
         long i = var1.y().y();
         if (i >= 135L && i <= 485L) {
            float f = Math.abs(class09170.N(var3.y(), var4.y()));
            float f1 = Math.abs(var4.R() - var3.R());
            if (!(f > 4.8F) && !(f1 > 2.35F)) {
               return ((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class11064.y(var2)) > var1.N(var2) + 0.7F ? false : Math.random() < 0.34F;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4) {
      float f = var3 == null ? var4.y() : var3.y();
      float f1 = var3 == null ? var4.R() : var3.R();
      float f2 = class09170.N(f, var4.y());
      float f3 = Math.abs(f2) > 0.1F ? -Math.signum(f2) : (Math.random() > 0.5 ? 1.0F : -1.0F);
      float f4 = Math.random() > 0.5 ? 1.0F : -1.0F;
      float[] afloat = new float[]{14.0F, 18.5F, 23.0F, 28.5F, 34.0F, 41.0F, -16.0F, -22.0F, -30.0F, -38.0F};
      float[] afloat1 = new float[]{0.0F, 3.5F, -3.5F, 6.5F, -6.5F, 10.0F, -10.0F, 14.0F, -14.0F};
      class11499 class11499x = null;
      float f5 = 0.0F;

      for (float f6 : afloat) {
         for (float f7 : afloat1) {
            class11499 class11499x = new class11499(f + f3 * f6, class04995.N(f1 + f4 * f7, -90.0F, 90.0F));
            float f8;
            if (!var1.N(var2, class11499x)
               && (f8 = Math.abs(class09170.N(var4.y(), class11499x.y())) + Math.abs(class11499x.R() - var4.R()) * 1.75F) >= 16.0F
               && f8 > f5) {
               class11499x = class11499x;
               f5 = f8;
            }
         }
      }

      return class11499x;
   }

   private class11499 N(class11499 var1, class11499 var2, float var3) {
      return var1 == null
         ? var2
         : new class11499(var1.y() + class09170.N(var1.y(), var2.y()) * var3, class04995.N(class04995.B(var3, var1.R(), var2.R()), -90.0F, 90.0F));
   }

   private float N(float var1) {
      return (float)Math.pow(var1, 0.38);
   }

   private boolean N(class11087 var1, boolean var2, boolean var3, boolean var4) {
      return var3 || var2 && var4 || var1.y().y() > 540L;
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = null;
      this.N_4 = null;
      this.N_5 = class11073.IDLE;
   }

   private boolean N(class11087 var1, class07438 var2, long var3, class00734 var5, class06889 var6, class11499 var7, class11499 var8) {
      this.N_4 = this.N(var1, var2, var7, var8);
      if ((class11499)this.N_4 == null) {
         return false;
      } else {
         float f = class09139.N(0.0, Math.PI * 2);
         double d0 = Math.max(0.08, (var5.u - var5.N) * 0.5);
         double d1 = Math.max(0.08, (var5.R - var5.L) * 0.5);
         double d2 = class09139.N(1.05, 1.85);
         double d3 = class09139.N(-(var5.i - var5.y) * 0.22, (var5.i - var5.y) * 0.18);
         class06889 class06889 = var5.R();
         this.N_3 = new class06889(
            class06889.M + Math.cos(f) * (d0 + d2),
            class04995.N(var6.B + d3, var5.y - (var5.i - var5.y) * 0.28, var5.i + (var5.i - var5.y) * 0.22),
            class06889.Z + Math.sin(f) * (d1 + d2)
         );
         this.N_5 = class11073.RELEASE;
         this.N_1 = var3;
         this.N_2 = var3 + (long)class09139.N(145.0, 245.0);
         this.N_0 = var3 + (long)class09139.N(520.0, 1180.0);
         return true;
      }
   }

   private class06889 N(class06889 var1, class06889 var2, float var3) {
      return var2 == null ? var1 : new class06889(class04995.u(var3, var1.M, var2.M), class04995.u(var3, var1.B, var2.B), class04995.u(var3, var1.Z, var2.Z));
   }

   public class11104 N(
      class11087 var1, class07438 var2, class00734 var3, class06889 var4, class11499 var5, boolean var6, boolean var7, boolean var8, boolean var9
   ) {
      long i = System.currentTimeMillis();
      if (this.N(var1, var7, var8, var9)) {
         this.N(i, false);
      }

      class11499 class11499x = class09170.N(var4);
      if ((class11073)this.N_5 == class11073.IDLE
         && i >= (Long)this.N_0
         && this.N(var1, var2, var5, class11499x, var6, var7, var8)
         && !this.N(var1, var2, i, var3, var4, var5, class11499x)) {
         this.N_0 = i + (long)class09139.N(85.0, 180.0);
      }

      if ((class11073)this.N_5 == class11073.IDLE) {
         return class11104.N(var4, class11499x);
      } else {
         if (i >= (Long)this.N_2) {
            if ((class11073)this.N_5 != class11073.RELEASE) {
               this.N(i, true);
               return class11104.N(var4, class11499x);
            }

            this.N_5 = class11073.FLICK;
            this.N_1 = i;
            this.N_2 = i + (long)class09139.N(145.0, 235.0);
         }

         float f = class04995.N((float)(i - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F);
         if ((class11073)this.N_5 == class11073.RELEASE) {
            float f2 = this.y(f);
            class06889 class06889 = this.N(var4, (class06889)this.N_3, f2);
            return new class11104(class06889, (class11499)this.N_4, true, false);
         } else {
            float f1 = 1.0F - this.N(f);
            class06889 class06889x = this.N(var4, (class06889)this.N_3, f1);
            class11499 class11499x = this.N((class11499)this.N_4, class11499x, 1.0F - f1);
            return new class11104(class06889x, class11499x, true, true);
         }
      }
   }
}
