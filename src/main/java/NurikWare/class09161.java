package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09161 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
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
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public static Object i_0;

   private int L() {
      return (Boolean)this.N_4 && (Integer)this.y_7 != 0 ? ((int[])this.L_2)[((Integer)this.y_6 - 1 + 18) % 18] : 0;
   }

   private int M() {
      return (Boolean)this.N_4 && (Integer)this.y_7 != 0 ? ((int[])this.L_1)[((Integer)this.y_6 - 1 + 18) % 18] : 0;
   }

   public class09161() {
      super();
      this.R();
      this.u_0 = new class09166();
      this.u_1 = new int[18];
      this.u_2 = new int[18];
      this.u_3 = new int[18];
      this.L_0 = new int[18];
      this.L_1 = new int[18];
      this.L_2 = new int[18];
      this.L_3 = new int[18];
      this.L_4 = new int[18];
      this.L_5 = new int[18];
      this.y_0 = new int[18];
   }

   static {
      z();
   }

   private static void z() {
      i_0 = 18;
   }

   private boolean y(int var1, boolean var2) {
      if (!(Boolean)this.N_4) {
         return false;
      } else {
         int i = var2 ? (Integer)this.N_2 : (Integer)this.N_3;
         int j = var1 - i;
         int k = this.N(var2);
         if (var1 != i && (j != k || Math.abs(j) > 2)) {
            int l = 0;
            int i1 = 0;
            int j1 = 0;

            for (int k1 = 0; k1 < (Integer)this.y_7; k1++) {
               int l1 = var2 ? ((int[])this.L_3)[k1] : ((int[])this.L_4)[k1];
               int i2 = var2 ? ((int[])this.L_5)[k1] : ((int[])this.y_0)[k1];
               if (l1 == var1) {
                  l++;
               }

               if (Math.abs(l1) == Math.abs(var1)) {
                  i1++;
               }

               if (i2 == j && j != 0) {
                  j1++;
               }
            }

            if (l <= 0 && i1 <= 1 && j1 <= 0) {
               if ((Integer)this.y_7 >= 4) {
                  int i3 = ((Integer)this.y_6 - 1 + 18) % 18;
                  int j3 = ((Integer)this.y_6 - 2 + 18) % 18;
                  int k3 = var2 ? ((int[])this.L_3)[i3] : ((int[])this.L_4)[i3];
                  int j2 = var2 ? ((int[])this.L_3)[j3] : ((int[])this.L_4)[j3];
                  int k2 = var1 - k3;
                  int l2 = k3 - j2;
                  if (k2 == l2) {
                     return true;
                  }
               }

               return false;
            } else {
               return true;
            }
         } else {
            return true;
         }
      }
   }

   private float y(float var1, double var2) {
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

   private void N(long var1, float var3, boolean var4, boolean var5) {
      if (var1 >= (Long)this.y_1) {
         float f = (var4 ? 0.58F : 0.0F) + (var5 ? 0.42F : 0.0F);
         this.y_2 = ((class09166)this.u_0).y(-var3 * (0.28F + f * 0.22F), var3 * (0.36F + f * 0.36F));
         this.y_3 = ((class09166)this.u_0).y(-var3 * (0.14F + f * 0.12F), var3 * (0.18F + f * 0.18F));
         this.y_4 = ((class09166)this.u_0).y(-0.083728F - f * 0.027362F, 0.117263F + f * 0.043728F);
         this.y_5 = ((class09166)this.u_0).y(-0.063728F - f * 0.018273F, 0.092736F + f * 0.027362F);
         this.y_1 = var1 + (long)((class09166)this.u_0).y(var4 ? 28.372639F : 42.736282F, var5 ? 88.82736F : 136.37263F);
      }
   }

   public void N() {
      this.y_1 = 0L;
      this.y_2 = 0.0F;
      this.y_3 = 0.0F;
      this.y_4 = 0.0F;
      this.y_5 = 0.0F;
      this.y_6 = 0;
      this.y_7 = 0;
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = false;

      for (int i = 0; i < 18; i++) {
         ((int[])this.u_1)[i] = 0;
         ((int[])this.u_2)[i] = 0;
         ((int[])this.u_3)[i] = 0;
         ((int[])this.L_0)[i] = 0;
         ((int[])this.L_1)[i] = 0;
         ((int[])this.L_2)[i] = 0;
         ((int[])this.L_3)[i] = 0;
         ((int[])this.L_4)[i] = 0;
         ((int[])this.L_5)[i] = 0;
         ((int[])this.y_0)[i] = 0;
      }

      ((class09166)this.u_0).y();
   }

   private int N(boolean var1) {
      if ((Boolean)this.N_4 && (Integer)this.y_7 != 0) {
         int i = ((Integer)this.y_6 - 1 + 18) % 18;
         return var1 ? ((int[])this.L_5)[i] : ((int[])this.y_0)[i];
      } else {
         return 0;
      }
   }

   private int N(float var1, double var2) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         int i = Math.round(var1 / (float)var2);
         return i == 0 ? (var1 > 0.0F ? 1 : -1) : i;
      } else {
         return 0;
      }
   }

   private int N(int var1, int var2, boolean var3) {
      if (var1 > var2) {
         return ((class09166)this.u_0).N(0.68F) ? 1 : -1;
      } else if (var1 < var2) {
         return ((class09166)this.u_0).N(0.68F) ? -1 : 1;
      } else {
         int i = this.N(var3);
         return i != 0 ? -Integer.signum(i) : ((class09166)this.u_0).N();
      }
   }

   private void N(float var1, float var2, float var3, float var4, double var5, float var7) {
      int i = this.N(var1, var5);
      int j = this.N(var2, var5);
      int k = (Boolean)this.N_4 ? i - (Integer)this.N_0 : 0;
      int l = (Boolean)this.N_4 ? j - (Integer)this.N_1 : 0;
      int i1 = Math.round(var3 / var7);
      int j1 = Math.round(var4 / var7);
      int k1 = (Boolean)this.N_4 ? i1 - (Integer)this.N_2 : 0;
      int l1 = (Boolean)this.N_4 ? j1 - (Integer)this.N_3 : 0;
      ((int[])this.u_1)[(Integer)this.y_6] = (i + 32768) * 65537 ^ j + 32768;
      ((int[])this.u_2)[(Integer)this.y_6] = (i1 + 32768) * 65537 ^ j1 + 32768;
      ((int[])this.u_3)[(Integer)this.y_6] = i;
      ((int[])this.L_0)[(Integer)this.y_6] = j;
      ((int[])this.L_1)[(Integer)this.y_6] = k;
      ((int[])this.L_2)[(Integer)this.y_6] = l;
      ((int[])this.L_3)[(Integer)this.y_6] = i1;
      ((int[])this.L_4)[(Integer)this.y_6] = j1;
      ((int[])this.L_5)[(Integer)this.y_6] = k1;
      ((int[])this.y_0)[(Integer)this.y_6] = l1;
      this.y_6 = ((Integer)this.y_6 + 1) % 18;
      this.y_7 = Math.min(18, (Integer)this.y_7 + 1);
      this.N_0 = i;
      this.N_1 = j;
      this.N_2 = i1;
      this.N_3 = j1;
      this.N_4 = true;
   }

   private float N(float var1, float var2, boolean var3, boolean var4) {
      int i = Math.max(1, Math.round(var1 / var2));
      int j = var3 ? (Integer)this.N_2 : (Integer)this.N_3;

      for (int k = 0; k < 7 && this.y(i, var3); k++) {
         int l = this.N(i, j, var3);
         int i1 = var3 ? (var4 ? 9 : 6) : (var4 ? 6 : 4);
         i += l * ((class09166)this.u_0).N(1 + k / 2, i1);
         i = Math.max(1, i);
      }

      return i * var2;
   }

   private boolean N(float var1, float var2, double var3, boolean var5) {
      int i = this.N(var1, var3);
      int j = var5 ? 0 : this.N(var2, var3);
      if (i == 0 && j == 0) {
         return false;
      } else {
         int k = (Boolean)this.N_4 ? i - (Integer)this.N_0 : 0;
         int l = (Boolean)this.N_4 ? j - (Integer)this.N_1 : 0;
         if ((Boolean)this.N_4 && i == (Integer)this.N_0 && j == (Integer)this.N_1) {
            return true;
         } else if ((Boolean)this.N_4 && k == this.M() && l == this.L() && Math.abs(i) + Math.abs(j) > 1) {
            return true;
         } else {
            int i1 = 0;
            int j1 = 0;
            int k1 = 0;

            for (int l1 = 0; l1 < (Integer)this.y_7; l1++) {
               if (((int[])this.u_3)[l1] == i && ((int[])this.L_0)[l1] == j) {
                  i1++;
               }

               if (((int[])this.L_1)[l1] == k && ((int[])this.L_2)[l1] == l && (k != 0 || l != 0)) {
                  j1++;
               }

               if (Math.abs(((int[])this.u_3)[l1]) == Math.abs(i) && Math.abs(((int[])this.L_0)[l1]) == Math.abs(j)) {
                  k1++;
               }
            }

            if (i1 <= 0 && j1 <= 0 && k1 <= 1) {
               if ((Integer)this.y_7 < 4) {
                  return false;
               } else {
                  int j3 = ((Integer)this.y_6 - 1 + 18) % 18;
                  int i2 = ((Integer)this.y_6 - 2 + 18) % 18;
                  int j2 = i - ((int[])this.u_3)[j3];
                  int k2 = j - ((int[])this.L_0)[j3];
                  int l2 = ((int[])this.u_3)[j3] - ((int[])this.u_3)[i2];
                  int i3 = ((int[])this.L_0)[j3] - ((int[])this.L_0)[i2];
                  return j2 == l2 && k2 == i3 && (j2 != 0 || k2 != 0);
               }
            } else {
               return true;
            }
         }
      }
   }

   public class09131 N(
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
      float var13,
      float var14
   ) {
      if (var3 != null && var4 != null && var5 != null) {
         float f = (float)Math.max(var6, 0.035F);
         this.N(System.currentTimeMillis(), f, var11, var12);
         float f1 = class09170.N(var3.y(), var5.y());
         float f2 = var8 ? 0.0F : var5.R() - var3.R();
         float f3 = class09170.N(var3.y(), var4.y());
         float f4 = var4.R() - var3.R();
         float f5 = (Float)this.y_2 + ((class09166)this.u_0).N(true, f * (0.263728F + (var11 ? 0.327362F : 0.0F)));
         float f6 = var8 ? 0.0F : (Float)this.y_3 + ((class09166)this.u_0).N(false, f * (0.127362F + (var12 ? 0.172638F : 0.0F)));
         f1 = this.N(f1 + f5, f3, f, true, var11 || var12);
         f2 = var8 ? 0.0F : this.N(f2 + f6, f4, f, false, var11 || var12);
         f1 = this.N(f1, var6, true);
         f2 = var8 ? 0.0F : this.N(f2, var6, false);
         class09163 class09163 = this.N(f1, f2, f3, f4, var6, var8, var11 || var12);
         f1 = class09163.N();
         f2 = class09163.y();
         class11499 class11499 = new class11499(var3.y() + f1, class04995.N(var3.R() + f2, -90.0F, 90.0F));
         if (var9 && !var10 && var1 != null && !var1.N(var2, class11499)) {
            class11499 = this.N(var1, var2, var3, var5, f1, f2, var6, var8);
            f1 = class09170.N(var3.y(), class11499.y());
            f2 = var8 ? 0.0F : class11499.R() - var3.R();
         }

         float f7 = Math.max(0.004F, f * 0.183728F);
         float f8 = this.N(Math.max(Math.abs(f1) + f7, var13 * (1.0F + (Float)this.y_4)), f7, true, var11 || var12);
         float f9 = this.N(Math.max(Math.abs(f2) + f7, var14 * (1.0F + (Float)this.y_5)), f7, false, var11 || var12);
         this.N(f1, f2, f8, f9, var6, f7);
         return new class09131(class11499, f8, f9);
      } else {
         return new class09131(var5, var13, var14);
      }
   }

   private class09163 N(float var1, float var2, float var3, float var4, double var5, boolean var7, boolean var8) {
      if (var5 <= 1.0E-5) {
         return new class09163(var1, var2);
      } else {
         float f = var1;
         float f1 = var7 ? 0.0F : var2;

         for (int i = 0; i < 8 && this.N(f, f1, var5, var7); i++) {
            float f2 = this.N(var3, f);
            float f3 = var7 ? 0.0F : this.N(var4, f1);
            float f4 = f2 * (float)var5 * ((class09166)this.u_0).y(0.75F + i * 0.24F, var8 ? 4.8F : 3.2F);
            float f5 = var7 ? 0.0F : f3 * (float)var5 * ((class09166)this.u_0).y(0.38F + i * 0.12F, var8 ? 2.8F : 1.75F);
            if ((i & 1) == 1 && !var7) {
               f5 = -f5 * ((class09166)this.u_0).y(0.55F, 1.15F);
            }

            if (i >= 3 && ((class09166)this.u_0).N(0.42F)) {
               f4 = -f4 * ((class09166)this.u_0).y(0.35F, 0.8F);
            }

            f = this.N(f + f4, var3, (float)Math.max(var5, 0.035F), true, var8);
            f1 = var7 ? 0.0F : this.N(f1 + f5, var4, (float)Math.max(var5, 0.035F), false, var8);
            f = this.y(f, var5);
            f1 = var7 ? 0.0F : this.y(f1, var5);
         }

         return new class09163(f, f1);
      }
   }

   private float N(float var1, double var2, boolean var4) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         int i = Math.round(var1 / (float)var2);
         if (i == 0) {
            i = var1 > 0.0F ? 1 : -1;
         }

         int j = var4 ? (Integer)this.N_0 : (Integer)this.N_1;
         if (i == j && Math.abs(i) > 1 || this.N(i, var4) > 2) {
            int k = i == 0 ? ((class09166)this.u_0).N() : (i > 0 ? 1 : -1);
            i += k * ((class09166)this.u_0).N(1, var4 ? 4 : 3);
            if (i == 0) {
               i = k;
            }
         }

         return i * (float)var2;
      } else {
         return var1;
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var2) <= 1.0E-4F) {
         float f1 = var3 * (var4 ? 4.372638F : 2.172638F);
         return class04995.N(var1, -f1, f1);
      } else {
         float f = var3 * (var4 ? 2.827362F : 1.372638F) * (var5 ? 1.427362F : 1.0F);
         return class04995.N(var1, -Math.abs(var2) - f, Math.abs(var2) + f);
      }
   }

   private float N(float var1, float var2) {
      if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else {
         return ((class09166)this.u_0).N();
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, double var7, boolean var9) {
      for (float f : new float[]{0.82F, 0.64F, 0.46F, 0.28F, -0.22F}) {
         class11499 class11499 = new class11499(
            var3.y() + this.y(var5 * f, var7), class04995.N(var3.R() + (var9 ? 0.0F : this.y(var6 * f, var7)), -90.0F, 90.0F)
         );
         if (var1.N(var2, class11499)) {
            return class11499;
         }
      }

      return var4;
   }

   private int N(int var1, boolean var2) {
      int i = 0;

      for (int j = 0; j < (Integer)this.y_7; j++) {
         int k = var2 ? ((int[])this.u_3)[j] : ((int[])this.L_0)[j];
         if (k == var1 || Math.abs(k) == Math.abs(var1)) {
            i++;
         }
      }

      return i;
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0L;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0.0F;
         this.y_5 = 0.0F;
         this.y_6 = 0;
         this.y_7 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = false;
      }
   }
}
