package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09158 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public boolean i_init;
   public static Object R_0;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public boolean M_init;

   private void L(float var1, float var2, float var3) {
      int i = this.L(var1, var3);
      int j = this.L(var2, var3);
      int k = (Boolean)this.i_6 ? i - (Integer)this.i_2 : 0;
      int l = (Boolean)this.i_6 ? j - (Integer)this.i_3 : 0;
      ((int[])this.N_1)[(Integer)this.i_0] = i;
      ((int[])this.N_2)[(Integer)this.i_0] = j;
      ((int[])this.N_3)[(Integer)this.i_0] = k;
      ((int[])this.N_4)[(Integer)this.i_0] = l;
      this.i_0 = ((Integer)this.i_0 + 1) % 14;
      this.i_1 = Math.min(14, (Integer)this.i_1 + 1);
      this.i_2 = i;
      this.i_3 = j;
      this.i_4 = k;
      this.i_5 = l;
      this.i_6 = true;
   }

   private int L(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   public class09158() {
      super();
      this.i();
      this.N_0 = new class09166();
      this.N_1 = new int[14];
      this.N_2 = new int[14];
      this.N_3 = new int[14];
      this.N_4 = new int[14];
      this.M_3 = 1.0F;
      this.u_1 = 1.0F;
      this.u_3 = 1.0F;
      this.y_1 = 1.0F;
      this.y_2 = 1.0F;
      this.y_3 = 1.0F;
   }

   static {
      u();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0L;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0L;
         this.L_1 = 0L;
         this.L_2 = 0L;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = 0L;
         this.M_1 = 0L;
         this.M_2 = 0L;
         this.M_3 = 0.0F;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0.0F;
         this.u_1 = 0.0F;
         this.u_2 = 0.0F;
         this.u_3 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0.0F;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0;
         this.i_1 = 0;
         this.i_2 = 0;
         this.i_3 = 0;
         this.i_4 = 0;
         this.i_5 = 0;
         this.i_6 = false;
      }
   }

   private static void u() {
      R_0 = 14;
   }

   private float y(long var1) {
      if (var1 >= (Long)this.L_0 && var1 < (Long)this.L_1) {
         float f = class04995.N((float)(var1 - (Long)this.L_0) / (float)Math.max(1L, (Long)this.L_1 - (Long)this.L_0), 0.0F, 1.0F);
         float f1 = (float)Math.sin(f * Math.PI);
         float f2 = 1.0F + (float)Math.sin(f * Math.PI * 2.0 + ((Float)this.y_0).floatValue()) * 0.22F;
         return class04995.N((float)Math.pow(f1, ((Float)this.u_3).floatValue()) * f2, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   private boolean y(float var1, float var2, float var3) {
      int j = this.L(var1, var3);
      int k = this.L(var2, var3);
      if (j == 0 && k == 0) {
         return false;
      } else {
         int l = (Boolean)this.i_6 ? j - (Integer)this.i_2 : 0;
         int i = (Boolean)this.i_6 ? k - (Integer)this.i_3 : 0;
         if ((Boolean)this.i_6 && j == (Integer)this.i_2 && k == (Integer)this.i_3) {
            return true;
         } else if ((Boolean)this.i_6 && (l != 0 || i != 0) && l == (Integer)this.i_4 && i == (Integer)this.i_5 && Math.abs(j) + Math.abs(k) > 3) {
            return true;
         } else {
            for (int i1 = 0; i1 < (Integer)this.i_1; i1++) {
               if (((int[])this.N_1)[i1] == j && ((int[])this.N_2)[i1] == k) {
                  return true;
               }

               if (((int[])this.N_3)[i1] == l && ((int[])this.N_4)[i1] == i && (l != 0 || i != 0)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   private float y(float var1, float var2) {
      if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else {
         return ((class09166)this.N_0).N();
      }
   }

   private class09150 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      double var9,
      boolean var11,
      boolean var12,
      boolean var13
   ) {
      float f = var4;
      float f1 = var5;

      for (int i = 0; i < 8 && this.y(f, f1, var8); i++) {
         float f3 = this.y(f, var6);
         float f4 = var11 ? this.y(f1, var7) : 0.0F;
         float f5 = 0.45F + i * 0.22F;
         float f6 = f3 * var8 * ((class09166)this.N_0).y(0.28F, 1.18F + f5);
         float f2 = var11 ? f4 * var8 * ((class09166)this.N_0).y(0.22F, 0.86F + f5 * 0.55F) : 0.0F;
         if (i % 2 == 1 && var11) {
            f2 = -f2 * ((class09166)this.N_0).y(0.56F, 1.16F);
         }

         float f7 = this.N(this.N(f + f6, var6, var8, true, var13), var9);
         float f8 = var11 ? this.N(this.N(f1 + f2, var7, var8, false, var13), var9) : 0.0F;
         class11499 class11499 = new class11499(var3.y() + f7, class04995.N(var3.R() + f8, -90.0F, 90.0F));
         if (!var12 || var13 || var2 == null || var1.N(var2, class11499)) {
            f = f7;
            f1 = f8;
            break;
         }
      }

      return new class09150(f, f1);
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      if (!var4) {
         return 0.0F;
      } else {
         return Math.abs(var1) > var3 * 0.35F
            ? var1
            : (Math.abs(var2) > var3 ? Math.signum(var2) * (Float)this.M_3 : ((class09166)this.N_0).N()) * var3 * ((class09166)this.N_0).y(0.45F, 1.75F);
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5, boolean var6) {
      if (var1 >= (Long)this.L_2) {
         float f = (var4 ? 0.16F : 0.0F) + (var5 ? 0.1F : 0.0F) + (var6 ? 0.12F : 0.0F);
         float f1 = 0.9F - f * 0.04F;
         float f2 = 1.14F + f * 0.12F;
         float f3 = 0.86F - f * 0.035F;
         float f4 = 1.1F + f * 0.08F;
         this.y_1 = this.N((Float)this.y_1, f1, f2);
         this.y_2 = this.N((Float)this.y_2, f3, f4);
         if (((class09166)this.N_0).N(!var4 && !var6 ? 0.12F : 0.26F)) {
            this.y_3 = ((class09166)this.N_0).N(0.58F) ? ((class09166)this.N_0).y(1.08F, var4 ? 1.34F : 1.22F) : ((class09166)this.N_0).y(0.76F, 0.92F);
            this.M_0 = var1 + (long)((class09166)this.N_0).y(35.0F, var5 ? 92.0F : 120.0F);
         }

         this.L_2 = var1 + (long)((class09166)this.N_0).y(var4 ? 95.0F : 140.0F, var5 ? 260.0F : 420.0F);
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

   private boolean N(long var1, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      if (var1 >= (Long)this.N_5 && var1 >= (Long)this.L_1 && !(var4 <= var5 * 0.65F)) {
         float f1 = var8 && !var9 ? var5 * 6.0F : var5 * 3.2F;
         if (var3 < f1 && !var7) {
            return false;
         } else {
            float f = var9 ? 0.46F : (var6 ? 0.38F : (var7 ? 0.3F : 0.18F));
            if (var8 && !var9) {
               f -= 0.06F;
            }

            return ((class09166)this.N_0).N(class04995.N(f, 0.08F, 0.55F));
         }
      } else {
         return false;
      }
   }

   private boolean N(long var1, class11087 var3, class07438 var4, class11499 var5, float var6, float var7, boolean var8, boolean var9) {
      if (var4 != null && var8 && !var9 && var1 < (Long)this.M_2 && !(Math.abs((Float)this.y_4) <= 1.0E-4F)) {
         float f = this.N(var1, var7, false, false);
         class11499 class11499 = new class11499(var5.y() + var6, class04995.N(var5.R() + f, -90.0F, 90.0F));
         return var3.N(var4, class11499);
      } else {
         return false;
      }
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      if (var5 && var8 && !var9) {
         if (var1 >= (Long)this.M_2 && var1 >= (Long)this.M_1) {
            float f = var7 ? 0.1F : (var6 ? 0.13F : 0.075F);
            if (!((class09166)this.N_0).N(f)) {
               this.M_1 = var1 + (long)((class09166)this.N_0).y(180.0F, 420.0F);
            } else {
               float f1 = Math.abs(var3) > var4 * 0.45F ? Math.signum(var3) : ((class09166)this.N_0).N();
               this.y_4 = f1 * var4 * ((class09166)this.N_0).y(var6 ? 0.42F : 0.28F, var6 ? 1.65F : 1.1F);
               this.M_2 = var1 + (long)((class09166)this.N_0).y(var6 ? 42.0F : 58.0F, var7 ? 115.0F : 165.0F);
               this.M_1 = var1 + (long)((class09166)this.N_0).y(var7 ? 420.0F : 620.0F, var7 ? 980.0F : 1450.0F);
            }
         }
      } else {
         if (var1 >= (Long)this.M_2) {
            this.y_4 = 0.0F;
         }
      }
   }

   private float N(long var1, float var3, boolean var4, boolean var5) {
      if (var1 < (Long)this.M_2 && (Long)this.M_2 > 0L) {
         float f = class04995.N(
            (float)Math.sin(class04995.N((float)((Long)this.M_2 - var1) / Math.max(1.0F, var4 ? 95.0F : 145.0F), 0.0F, 1.0F) * Math.PI), 0.28F, 1.0F
         );
         float f1 = var5 ? 1.16F : 1.0F;
         return (Float)this.y_4 * f * f1 + ((class09166)this.N_0).N(false, var3 * 0.34F);
      } else {
         return 0.0F;
      }
   }

   private float N(float var1, float var2, float var3) {
      float f = ((class09166)this.N_0).y(var2, var3);
      if (Math.abs(f - var1) < 0.045F) {
         f += ((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.055F, 0.16F);
      }

      return class04995.N(f, var2, var3);
   }

   private class09150 N(class11087 var1, class07438 var2, class11499 var3, float var4, float var5, float var6, float var7, boolean var8) {
      for (float f : new float[]{0.82F, 0.66F, 0.48F, 0.32F, 0.18F, 0.0F}) {
         float f1 = class04995.B(f, var4, var6);
         float f2 = var8 ? class04995.B(f, var5, var7) : 0.0F;
         class11499 class11499 = new class11499(var3.y() + f1, class04995.N(var3.R() + f2, -90.0F, 90.0F));
         if (var1.N(var2, class11499)) {
            return new class09150(f1, f2);
         }
      }

      return new class09150(var4, var5);
   }

   private float[] N(long var1, float var3, float var4, float var5, float var6, float var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      float f = this.y(var1);
      float f2 = var6;
      float f3 = var8 && Math.abs(var6) > var7 * 0.18F ? var6 : this.N(var4, var3, var7, var8);
      float f4 = this.N(var5, f3);
      if (f4 <= 1.0E-4F) {
         return new float[]{var5, var6};
      } else {
         float f5 = (var9 ? 1.18F : 1.0F) + (var10 ? 0.14F : 0.0F) + (var11 ? 0.18F : 0.0F);
         float f6 = Math.min(var7 * (var9 ? 4.8F : 3.1F) * f5, Math.max(var7 * 0.35F, f4 * (Float)this.u_0)) * f;
         float f7 = (float)Math.sin(f * Math.PI * 2.7F + ((Float)this.y_0).floatValue()) * var7 * ((class09166)this.N_0).y(0.16F, 0.58F);
         float f8 = -f3 / f4 * (Float)this.M_3;
         float f9 = var5 / f4 * (Float)this.M_3 * (Float)this.u_1;
         float f1 = var5 + (f8 * f6 - Math.signum(var5) * Math.abs(var5) * (Float)this.u_2 * f);
         if (var8) {
            f2 = var6 + (f9 * f6 + f7);
         }

         return new float[]{f1, f2};
      }
   }

   private float N(float var1, float var2) {
      return (float)Math.sqrt(var1 * var1 + var2 * var2);
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var1) <= 1.0E-4F) {
         return 0.0F;
      } else if (Math.abs(var2) <= 1.0E-4F) {
         float f2 = var3 * (var4 ? 2.4F : (var5 ? 3.2F : 1.65F));
         return class04995.N(var1, -f2, f2);
      } else {
         float f = Math.signum(var2);
         if (Math.signum(var1) != f && Math.abs(var2) > var3 * 3.0F) {
            float f3 = var3 * (var4 ? 0.85F : 1.45F);
            return class04995.N(var1, -f3, f3);
         } else {
            float f1 = var3 * (var4 ? 2.8F : (var5 ? 2.2F : 1.25F));
            return class04995.N(var1, -Math.abs(var2) - f1, Math.abs(var2) + f1);
         }
      }
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      this.M_3 = ((class09166)this.N_0).N(0.54F) ? -(Float)this.M_3 : ((class09166)this.N_0).N();
      float f = (var5 ? 0.18F : 0.0F) + (var6 ? 0.1F : 0.0F) + (var7 ? 0.14F : 0.0F);
      float f1 = class04995.N(var3 / Math.max(var4 * 16.0F, 8.0F), 0.0F, 1.0F);
      this.u_0 = ((class09166)this.N_0).y(0.035F + f * 0.02F, 0.12F + f * 0.05F + f1 * 0.035F);
      this.u_1 = ((class09166)this.N_0).y(0.38F, 0.92F + f * 0.16F);
      this.u_2 = ((class09166)this.N_0).y(0.0F, var5 ? 0.07F : 0.045F);
      this.u_3 = ((class09166)this.N_0).y(0.86F, 1.34F);
      this.y_0 = ((class09166)this.N_0).N(0.0F, (float) (Math.PI * 2));
      this.L_0 = var1;
      this.L_1 = var1 + (long)((class09166)this.N_0).y(var5 ? 70.0F : 95.0F, var6 ? 170.0F : 245.0F);
      this.N_5 = var1 + (long)((class09166)this.N_0).y(var5 ? 210.0F : 320.0F, var6 ? 620.0F : 980.0F);
   }

   public void N() {
      this.N_5 = 0L;
      this.L_0 = 0L;
      this.L_1 = 0L;
      this.L_2 = 0L;
      this.M_0 = 0L;
      this.M_1 = 0L;
      this.M_2 = 0L;
      this.M_3 = 1.0F;
      this.u_0 = 0.0F;
      this.u_1 = 1.0F;
      this.u_2 = 0.0F;
      this.u_3 = 1.0F;
      this.y_0 = 0.0F;
      this.y_1 = 1.0F;
      this.y_2 = 1.0F;
      this.y_3 = 1.0F;
      this.y_4 = 0.0F;
      this.i_0 = 0;
      this.i_1 = 0;
      this.i_2 = 0;
      this.i_3 = 0;
      this.i_4 = 0;
      this.i_5 = 0;
      this.i_6 = false;

      for (int i = 0; i < 14; i++) {
         ((int[])this.N_1)[i] = 0;
         ((int[])this.N_2)[i] = 0;
         ((int[])this.N_3)[i] = 0;
         ((int[])this.N_4)[i] = 0;
      }

      ((class09166)this.N_0).y();
   }

   public class09169 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      double var10,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      if (var3 == null) {
         return new class09169(var6, var7, var8, var9, var12);
      } else {
         float f1 = (float)Math.max(var10, 0.035F);
         long i = System.currentTimeMillis();
         this.N(i, f1, var13, var14, var16);
         this.N(i, var5, f1, var12, var13, var14, var15, var16);
         float f2 = this.N(var4, var5);
         float f3 = this.N(var6, var7);
         if (this.N(i, f2, f3, f1, var13, var14, var15, var16)) {
            this.N(i, f2, f1, var13, var14, var16);
         }

         boolean flag = !var12 || this.N(i, var1, var2, var3, var6, f1, var15, var16);
         float f4 = var6;
         float f = flag ? var7 : 0.0F;
         if (var12 && flag && Math.abs(f) <= f1 * 0.18F) {
            f = this.N(i, f1, var13, var14);
         }

         if (f3 > f1 * 0.55F || Math.abs(f) > f1 * 0.35F) {
            float[] afloat = this.N(i, var4, var5, var6, f, f1, flag, var13, var14, var16);
            f4 = afloat[0];
            f = flag ? afloat[1] : 0.0F;
         }

         f4 = this.N(this.N(f4, var4, f1, true, var16), var10);
         f = flag ? this.N(this.N(f, var5, f1, false, var16 || var12), var10) : 0.0F;
         class09150 class09150x = this.N(var1, var2, var3, f4, f, var4, var5, f1, var10, flag, var15, var16);
         f4 = class09150x.y();
         f = flag ? class09150x.N() : 0.0F;
         class11499 class11499 = new class11499(var3.y() + f4, class04995.N(var3.R() + f, -90.0F, 90.0F));
         if (var15 && !var16 && var2 != null && !var1.N(var2, class11499)) {
            class09150 class09150x = this.N(var1, var2, var3, var6, var12 ? 0.0F : var7, f4, f, flag);
            f4 = class09150x.y();
            f = class09150x.N();
            flag = !var12 || Math.abs(f) > 1.0E-4F;
         }

         this.L(f4, f, f1);
         float f7 = i < (Long)this.M_0 ? (Float)this.y_3 : 1.0F;
         float f5 = Math.max(f1, var8 * (Float)this.y_1 * f7);
         float f6 = Math.max(f1, var9 * (Float)this.y_2 * class04995.B(0.58F, f7, 1.0F));
         return new class09169(f4, flag ? f : 0.0F, f5, f6, var12 && !flag);
      }
   }
}
