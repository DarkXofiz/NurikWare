package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09142 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public static Object y_0;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;

   private boolean L(long var1) {
      if (!(Boolean)this.u_3) {
         return false;
      } else if (var1 <= (Long)this.u_2 && (Integer)this.L_4 < (Integer)this.L_5) {
         return true;
      } else {
         this.u_3 = false;
         return false;
      }
   }

   public class09142() {
      super();
      this.u();
      this.N_0 = new class09166();
      this.N_1 = new float[8];
      this.N_2 = new float[8];
      this.N_3 = new float[8];
      this.N_4 = new float[8];
      this.N_5 = new float[8];
      this.L_0 = new float[8];
      this.L_1 = new float[8];
      this.L_2 = new float[8];
      this.L_3 = Integer.MIN_VALUE;
   }

   static {
      Z();
   }

   private static void Z() {
      y_0 = 8;
   }

   private void u() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_3 = 0;
         this.L_4 = 0;
         this.L_5 = 0;
         this.L_6 = 0;
         this.L_7 = 0;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0;
         this.u_1 = 0;
         this.u_2 = 0L;
         this.u_3 = false;
      }
   }

   private float y(float var1, double var2, boolean var4) {
      if (var2 <= 1.0E-5) {
         return Math.max(var4 ? 0.35F : 0.25F, var1);
      } else {
         float f = var4 ? 0.35F : 0.25F;
         return Math.max(1, Math.round(Math.max(f, var1) / (float)var2)) * (float)var2;
      }
   }

   private float y(int var1, float var2) {
      if (var1 == 0) {
         return ((class09166)this.N_0).y(0.18F, 0.42F);
      } else if (var1 == 1) {
         return ((class09166)this.N_0).y(0.38F, 0.68F);
      } else {
         return var1 >= (Integer)this.L_5 - 2
            ? ((class09166)this.N_0).y(0.86F, 1.18F)
            : ((class09166)this.N_0).y(0.58F, 1.02F) + (float)Math.sin(var2 * Math.PI * 1.25) * ((class09166)this.N_0).y(-0.1F, 0.16F);
      }
   }

   private float y(float var1, float var2, float var3, float var4, boolean var5) {
      float f = Math.abs(var3) > var4 ? var3 : var2;
      if (Math.abs(f) <= 1.0E-4F) {
         float f3 = var4 * (var5 ? 2.4F : 0.9F);
         return class04995.N(var1, -f3, f3);
      } else {
         if (Math.signum(var1) != Math.signum(f) && Math.abs(f) > var4 * 1.6F) {
            var1 = Math.signum(f) * Math.abs(var1);
         }

         float f1 = var4 * ((class09166)this.N_0).y(var5 ? 1.8F : 0.75F, var5 ? 5.6F : 2.1F);
         float f2 = Math.abs(f) + f1;
         return class04995.N(var1, -f2, f2);
      }
   }

   private int y(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private float N(float var1, float var2, float var3) {
      float f = Math.abs(var3) > 1.0E-4F ? var3 : var2;
      return Math.abs(f) <= 1.0E-4F ? var1 : Math.signum(f) * Math.abs(var1);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9) {
      if (var8 && !var9 && !var1.N(var2, var4)) {
         float f = class09170.N(var3.y(), var4.y());
         float f1 = var4.R() - var3.R();

         for (float f2 : new float[]{0.74F, 0.52F, 0.31F, 0.16F}) {
            class11499 class11499 = new class11499(var3.y() + this.N(f * f2, var6), class04995.N(var3.R() + this.N(f1 * f2, var6), -90.0F, 90.0F));
            if (var1.N(var2, class11499)) {
               return class11499;
            }
         }

         return var1.N(var2, var3) ? var3 : var5;
      } else {
         return var4;
      }
   }

   private void N(class11499 var1, class11499 var2, class11499 var3, double var4, boolean var6, boolean var7, boolean var8, long var9) {
      float f = (float)Math.max(var4, 0.035F);
      float f1 = class09170.N(var1.y(), var3.y());
      float f2 = var3.R() - var1.R();
      float f3 = class09170.N(var1.y(), var2.y());
      float f4 = var2.R() - var1.R();
      float f5 = this.N(f1, f3);
      float f6 = this.N(f2, f4);
      this.L_4 = 0;
      this.L_5 = var8 ? ((class09166)this.N_0).N(5, 7) : (var6 ? ((class09166)this.N_0).N(5, 8) : ((class09166)this.N_0).N(4, 7));
      this.u_2 = var9 + (long)((class09166)this.N_0).y(var7 ? 118.0F : 145.0F, var8 ? 230.0F : (var6 ? 245.0F : 285.0F));
      this.L_6 = 0;
      this.L_7 = 0;
      this.u_0 = 0;
      this.u_1 = 0;

      for (int i = 0; i < (Integer)this.L_5; i++) {
         float f7 = (float)i / Math.max(1, (Integer)this.L_5 - 1);
         float f8 = (float)Math.sin(f7 * Math.PI);
         float f9 = i == 0 ? ((class09166)this.N_0).y(0.12F, var8 ? 0.18F : (var6 ? 0.32F : 0.24F)) : 0.0F;
         float f10 = i >= (Integer)this.L_5 - 2 ? ((class09166)this.N_0).y(0.08F, 0.22F) : 0.0F;
         if (var8) {
            float f11 = this.N(i, f7);
            float f12 = this.y(i, f7);
            ((float[])this.N_1)[i] = class04995.N(f11 + f8 * ((class09166)this.N_0).y(-0.08F, 0.16F) + f9 - f10 * 0.72F, 0.58F, 1.22F);
            ((float[])this.N_2)[i] = class04995.N(
               f12 + f8 * ((class09166)this.N_0).y(-0.06F, 0.14F) - (i == 0 ? ((class09166)this.N_0).y(0.04F, 0.12F) : 0.0F), 0.28F, 1.16F
            );
         } else {
            ((float[])this.N_1)[i] = class04995.N(
               ((class09166)this.N_0).y(0.72F, 1.08F) + f8 * ((class09166)this.N_0).y(-0.18F, 0.28F) + f9 - f10, 0.48F, 1.34F
            );
            ((float[])this.N_2)[i] = class04995.N(
               ((class09166)this.N_0).y(0.54F, 0.98F) + f8 * ((class09166)this.N_0).y(-0.12F, 0.24F) - (i == 0 ? ((class09166)this.N_0).y(0.1F, 0.24F) : 0.0F),
               0.34F,
               1.22F
            );
         }

         if (i > 0 && Math.abs(((float[])this.N_1)[i] - ((float[])this.N_1)[i - 1]) < 0.045F) {
            ((float[])this.N_1)[i] = ((float[])this.N_1)[i] + ((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.05F, 0.16F);
         }

         if (i > 0 && Math.abs(((float[])this.N_2)[i] - ((float[])this.N_2)[i - 1]) < 0.035F) {
            ((float[])this.N_2)[i] = ((float[])this.N_2)[i] + ((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.04F, 0.12F);
         }

         ((float[])this.N_3)[i] = f5 * f * ((class09166)this.N_0).y(var8 ? 0.16F : (var6 ? 0.42F : 0.25F), var8 ? 1.45F : (var6 ? 2.85F : 1.95F));
         ((float[])this.N_4)[i] = f6 * f * ((class09166)this.N_0).y(var8 ? 0.14F : 0.12F, var8 ? 0.95F : (var6 ? 1.08F : 0.72F));
         if (i > 0 && ((class09166)this.N_0).N(0.34F)) {
            ((float[])this.N_3)[i] = -((float[])this.N_3)[i] * ((class09166)this.N_0).y(0.35F, 0.86F);
         }

         if (i > 1 && ((class09166)this.N_0).N(0.28F)) {
            ((float[])this.N_4)[i] = -((float[])this.N_4)[i] * ((class09166)this.N_0).y(0.25F, 0.72F);
         }

         if (var8) {
            this.N(i, f7, f5, f6, f);
         }

         if (var8) {
            ((float[])this.N_5)[i] = ((class09166)this.N_0).y(i == 0 ? 0.92F : 0.78F, i == 0 ? 1.22F : 1.12F);
            ((float[])this.L_0)[i] = ((class09166)this.N_0).y(i <= 1 ? 0.62F : 0.78F, i <= 1 ? 0.92F : 1.16F);
         } else {
            ((float[])this.N_5)[i] = ((class09166)this.N_0).y(0.82F, var6 ? 1.44F : 1.26F);
            ((float[])this.L_0)[i] = ((class09166)this.N_0).y(0.68F, var6 ? 1.22F : 1.08F);
         }
      }

      this.u_3 = true;
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

   public void N() {
      this.L_3 = Integer.MIN_VALUE;
      this.L_4 = 0;
      this.L_5 = 0;
      this.L_6 = 0;
      this.L_7 = 0;
      this.u_0 = 0;
      this.u_1 = 0;
      this.u_2 = 0L;
      this.u_3 = false;
      ((class09166)this.N_0).y();

      for (int i = 0; i < 8; i++) {
         ((float[])this.N_1)[i] = 1.0F;
         ((float[])this.N_2)[i] = 1.0F;
         ((float[])this.N_3)[i] = 0.0F;
         ((float[])this.N_4)[i] = 0.0F;
         ((float[])this.N_5)[i] = 1.0F;
         ((float[])this.L_0)[i] = 1.0F;
         ((float[])this.L_1)[i] = 0.0F;
         ((float[])this.L_2)[i] = 0.0F;
      }
   }

   private float N(float var1, double var2, boolean var4) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float f = (float)var2;
         int i = Math.round(var1 / f);
         if (i == 0) {
            i = var1 > 0.0F ? 1 : -1;
         }

         int j = var4 ? (Integer)this.L_6 : (Integer)this.L_7;
         int k = var4 ? (Integer)this.u_0 : (Integer)this.u_1;
         int l = i - j;
         if (i == j || l == k && Math.abs(i) > 1) {
            i += (i > 0 ? 1 : -1) * ((class09166)this.N_0).N(1, var4 ? 3 : 2);
            if (i == 0) {
               i = j >= 0 ? 1 : -1;
            }

            l = i - j;
         }

         if (var4) {
            this.L_6 = i;
            this.u_0 = l;
         } else {
            this.L_7 = i;
            this.u_1 = l;
         }

         return i * f;
      } else {
         return var1;
      }
   }

   public class09151 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      float var11,
      float var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         long i = System.currentTimeMillis();
         this.N(var1, var3, var4, var5, var6, var13, var14, var15, i);
         if (!this.L(i)) {
            return class09151.N(var5, var11, var12);
         } else {
            int k = (Integer)this.L_4;
            this.L_4 = k + 1;
            int j = k;
            float f = (float)Math.max(var6, 0.035F);
            float f1 = class09170.N(var3.y(), var5.y());
            float f2 = var8 ? 0.0F : var5.R() - var3.R();
            if (Math.abs(f1) <= f * 0.35F && Math.abs(f2) <= f * 0.25F) {
               if (!var15 || var8) {
                  return class09151.N(var5, var11, var12);
               }

               float f3 = class09170.N(var3.y(), var4.y());
               float f4 = var4.R() - var3.R();
               f1 += this.N(f3, f1) * f * ((class09166)this.N_0).y(0.32F, 0.86F);
               f2 += this.N(f4, f2) * f * ((class09166)this.N_0).y(0.24F, 0.62F);
            }

            float f11 = class09170.N(var3.y(), var4.y());
            float f12 = var8 ? 0.0F : var4.R() - var3.R();
            float f5 = f1 * ((float[])this.N_1)[j] + this.N(((float[])this.N_3)[j], f1, f11);
            float f6 = var8 ? 0.0F : f2 * ((float[])this.N_2)[j] + this.N(((float[])this.N_4)[j], f2, f12);
            if (var15) {
               f5 += ((float[])this.L_1)[j] + this.N(f12, f, true, j);
               f6 += var8 ? 0.0F : ((float[])this.L_2)[j] + this.N(f11, f, false, j);
               f5 = this.N(f5, f1, f11, f, true);
               f6 = var8 ? 0.0F : this.N(f6, f2, f12, f, false);
            }

            f5 = this.y(f5, f1, f11, f, true);
            f6 = var8 ? 0.0F : this.y(f6, f2, f12, f, false);
            f5 = this.N(f5, var6, true);
            f6 = var8 ? 0.0F : this.N(f6, var6, false);
            class11499 class11499 = new class11499(var3.y() + f5, class04995.N(var3.R() + f6, -90.0F, 90.0F));
            class11499 = this.N(var1, var2, var5, class11499, var3, var6, var9, var10);
            float f7 = Math.abs(class09170.N(var3.y(), class11499.y()));
            float f8 = Math.abs(class11499.R() - var3.R());
            float f9 = this.y(Math.max(f7, var11 * ((float[])this.N_5)[j]), var6, true);
            float f10 = this.y(Math.max(f8, var12 * ((float[])this.L_0)[j]), var6, false);
            return new class09151(class11499, f9, f10, true);
         }
      } else {
         return class09151.N(var5, var11, var12);
      }
   }

   private float N(int var1, float var2) {
      if (var1 == 0) {
         return ((class09166)this.N_0).y(0.82F, 1.08F);
      } else if (var1 == 1) {
         return ((class09166)this.N_0).y(0.54F, 0.82F);
      } else {
         return var1 >= (Integer)this.L_5 - 2
            ? ((class09166)this.N_0).y(0.74F, 1.04F)
            : ((class09166)this.N_0).y(0.68F, 1.12F) + (float)Math.sin(var2 * Math.PI * 1.7) * ((class09166)this.N_0).y(-0.12F, 0.18F);
      }
   }

   private float N(float var1, float var2, float var3, float var4, boolean var5) {
      int i = this.y(var1, var4);
      int j = this.y(var2, var4);
      int k = var5 ? (Integer)this.L_6 : (Integer)this.L_7;
      int l = var5 ? (Integer)this.u_0 : (Integer)this.u_1;
      int i1 = i - k;
      if (i == j || i == k || i1 == l) {
         float f = this.N(var3, var1);
         float f1 = var4 * ((class09166)this.N_0).y(var5 ? 0.55F : 0.28F, var5 ? 1.85F : 1.08F);
         var1 += f * f1;
      }

      return var1;
   }

   private void N(class11087 var1, class11499 var2, class11499 var3, class11499 var4, double var5, boolean var7, boolean var8, boolean var9, long var10) {
      int i = var1.u();
      if ((Integer)this.L_3 == Integer.MIN_VALUE) {
         this.L_3 = i;
         if (i <= 0 || var1.y().y() > 95L) {
            return;
         }
      } else {
         if (i == (Integer)this.L_3) {
            return;
         }

         this.L_3 = i;
      }

      if (var1.y().y() <= 95L) {
         this.N(var2, var3, var4, var5, var7, var8, var9, var10);
      }
   }

   private void N(int var1, float var2, float var3, float var4, float var5) {
      float f = (float)Math.sin(var2 * Math.PI);
      float f1 = var1 >= (Integer)this.L_5 - 2 ? -1.0F : 1.0F;
      float f2 = var1 != 1 && var1 != (Integer)this.L_5 - 1 ? var3 : -var3;
      float f3 = var1 <= 1 ? -var4 : var4;
      ((float[])this.L_1)[var1] = f2 * var5 * ((class09166)this.N_0).y(0.18F, 1.65F) * (0.42F + f * 0.78F) * f1;
      ((float[])this.L_2)[var1] = f3 * var5 * ((class09166)this.N_0).y(0.12F, 0.95F) * (0.28F + f * 0.9F);
      if (var1 > 0 && Math.abs(((float[])this.L_1)[var1] - ((float[])this.L_1)[var1 - 1]) < var5 * 0.28F) {
         ((float[])this.L_1)[var1] = ((float[])this.L_1)[var1] + f2 * var5 * ((class09166)this.N_0).y(0.32F, 0.9F);
      }

      if (var1 > 0 && Math.abs(((float[])this.L_2)[var1] - ((float[])this.L_2)[var1 - 1]) < var5 * 0.18F) {
         ((float[])this.L_2)[var1] = ((float[])this.L_2)[var1] + f3 * var5 * ((class09166)this.N_0).y(0.2F, 0.62F);
      }
   }

   private float N(float var1, float var2, boolean var3, int var4) {
      if (Math.abs(var1) <= var2 * 0.7F) {
         return 0.0F;
      } else {
         float f = Math.signum(var1);
         float f1 = var3 ? (var4 <= 1 ? 0.46F : 0.18F) : (var4 <= 1 ? -0.32F : 0.28F);
         float f2 = var3 ? 0.52F : 0.34F;
         return f * var2 * f2 * f1;
      }
   }

   private float N(float var1, float var2) {
      if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else {
         return ((class09166)this.N_0).N();
      }
   }
}
