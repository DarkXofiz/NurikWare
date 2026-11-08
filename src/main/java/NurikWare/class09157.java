package NurikWare;

import java.util.Arrays;
import minecraft.class04995;
import minecraft.class07438;

public class class09157 {
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
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public static Object u_0;

   private void L(int var1, int var2) {
      int i = (Boolean)this.y_3 ? var1 - (Integer)this.N_2 : 0;
      int j = (Boolean)this.y_3 ? var2 - (Integer)this.N_3 : 0;
      int k = (Boolean)this.y_3 ? i - (Integer)this.N_4 : 0;
      int l = (Boolean)this.y_3 ? j - (Integer)this.y_0 : 0;
      ((int[])this.L_1)[(Integer)this.N_0] = var1;
      ((int[])this.L_2)[(Integer)this.N_0] = var2;
      ((int[])this.L_3)[(Integer)this.N_0] = i;
      ((int[])this.L_4)[(Integer)this.N_0] = j;
      ((int[])this.L_5)[(Integer)this.N_0] = this.y(var1, var2);
      this.N_0 = ((Integer)this.N_0 + 1) % 34;
      this.N_1 = Math.min(34, (Integer)this.N_1 + 1);
      this.N_2 = var1;
      this.N_3 = var2;
      this.N_4 = i;
      this.y_0 = j;
      this.y_1 = k;
      this.y_2 = l;
      this.y_3 = true;
   }

   private float L() {
      if ((Integer)this.N_1 < 12) {
         return 0.0F;
      } else {
         int i = 0;
         int j = 0;
         int k = 0;
         int l = 0;
         int i1 = 0;
         int j1 = 0;

         for (int k1 = 0; k1 < (Integer)this.N_1; k1++) {
            boolean flag = true;
            boolean flag1 = true;
            boolean flag2 = true;
            boolean flag3 = ((int[])this.L_5)[k1] != Integer.MIN_VALUE;
            int i2 = 0;

            for (int l1 = 0; l1 < k1; l1++) {
               if (((int[])this.L_1)[k1] == ((int[])this.L_1)[l1] && ((int[])this.L_2)[k1] == ((int[])this.L_2)[l1]) {
                  flag = false;
               }

               if (Math.abs(((int[])this.L_1)[k1]) == Math.abs(((int[])this.L_1)[l1]) && Math.abs(((int[])this.L_2)[k1]) == Math.abs(((int[])this.L_2)[l1])) {
                  flag1 = false;
               }

               if (((int[])this.L_3)[k1] == ((int[])this.L_3)[l1] && ((int[])this.L_4)[k1] == ((int[])this.L_4)[l1]) {
                  flag2 = false;
               }

               if (((int[])this.L_5)[k1] == ((int[])this.L_5)[l1]) {
                  flag3 = false;
               }
            }

            for (int j2 = 0; j2 < (Integer)this.N_1; j2++) {
               if (((int[])this.L_1)[k1] == ((int[])this.L_1)[j2] && ((int[])this.L_2)[k1] == ((int[])this.L_2)[j2]) {
                  i2++;
               }
            }

            if (((int[])this.L_3)[k1] == 0 && ((int[])this.L_4)[k1] == 0 && (((int[])this.L_1)[k1] != 0 || ((int[])this.L_2)[k1] != 0)) {
               j1++;
            }

            if (flag) {
               i++;
            }

            if (flag1) {
               j++;
            }

            if (flag2) {
               k++;
            }

            if (flag3) {
               l++;
            }

            i1 = Math.max(i1, i2);
         }

         float f = 0.0F;
         if (i < Math.max(5, (Integer)this.N_1 / 4)) {
            f += 0.25F;
         }

         if (j < Math.max(4, (Integer)this.N_1 / 5)) {
            f += 0.18F;
         }

         if (k < Math.max(4, (Integer)this.N_1 / 5)) {
            f += 0.25F;
         }

         if (l < 3 && (Integer)this.N_1 >= 16) {
            f += 0.22F;
         }

         if ((float)i1 / ((Integer)this.N_1).intValue() > 0.24F) {
            f += 0.28F;
         }

         if ((float)j1 / ((Integer)this.N_1).intValue() > 0.34F) {
            f += 0.24F;
         }

         return f;
      }
   }

   public class09157() {
      super();
      this.i();
      this.L_0 = new class09166();
      this.L_1 = new int[34];
      this.L_2 = new int[34];
      this.L_3 = new int[34];
      this.L_4 = new int[34];
      this.L_5 = new int[34];
   }

   static {
      Z();
   }

   private static void Z() {
      u_0 = 34;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = false;
      }
   }

   private int i(int var1) {
      if (var1 == Integer.MIN_VALUE) {
         return 0;
      } else {
         int i = 0;

         for (int j = 0; j < (Integer)this.N_1; j++) {
            if (((int[])this.L_5)[j] == var1) {
               i++;
            }
         }

         return i;
      }
   }

   private int u(int var1, int var2) {
      int i = 0;

      for (int j = 0; j < (Integer)this.N_1; j++) {
         if (((int[])this.L_3)[j] == var1 && ((int[])this.L_4)[j] == var2) {
            i++;
         }
      }

      return i;
   }

   private int y(int var1, int var2) {
      return var1 == 0 && var2 == 0 ? Integer.MIN_VALUE : (int)Math.round(Math.toDegrees(Math.atan2(Math.abs(var2), Math.abs(var1))) * 8.0);
   }

   public class11499 N(
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
      boolean var12
   ) {
      if (var3 != null && var4 != null && var5 != null) {
         float f = (float)Math.max(var6, 0.035F);
         float f1 = class09170.N(var3.y(), var5.y());
         float f2 = var8 ? 0.0F : var5.R() - var3.R();
         int i = this.N(f1, f);
         int j = this.N(f2, f);
         if (i == 0 && j == 0) {
            this.L(i, j);
            return var8 && var5.R() != var3.R() ? new class11499(var5.y(), var3.R()) : var5;
         } else {
            float f3 = this.N(i, j);
            float f4 = !var11 && !var12 ? 0.48F : 0.34F;
            class11499 class11499 = var5;
            class11499 class11499x;
            if ((f3 >= f4 || ((class09166)this.L_0).N(f3 * (var11 ? 0.32F : 0.18F)))
               && (class11499x = this.N(var1, var2, var3, var4, var5, var6, f, var8, var9, var10, var11, var12, i, j, f3)) != null) {
               class11499 = class11499x;
            }

            if (var8 && class11499.R() != var3.R()) {
               class11499 = new class11499(class11499.y(), var3.R());
            }

            this.L(this.N(class09170.N(var3.y(), class11499.y()), f), this.N(class11499.R() - var3.R(), f));
            return class11499;
         }
      } else {
         return var5;
      }
   }

   private boolean N(class11499 var1, class11499 var2, float var3) {
      int i = this.N(class09170.N(var1.y(), var2.y()), var3);
      int j = this.N(var2.R() - var1.R(), var3);
      if (i == 0 && j == 0) {
         return false;
      } else {
         int k = (Boolean)this.y_3 ? i - (Integer)this.N_2 : 0;
         int l = (Boolean)this.y_3 ? j - (Integer)this.N_3 : 0;
         int i1 = this.y(i, j);
         return (!(Boolean)this.y_3 || i != (Integer)this.N_2 || j != (Integer)this.N_3)
            && (!(Boolean)this.y_3 || Math.abs(i) != Math.abs((Integer)this.N_2) || Math.abs(j) != Math.abs((Integer)this.N_3))
            && (!(Boolean)this.y_3 || k != (Integer)this.N_4 || l != (Integer)this.y_0)
            && this.N(i, j, false) == 0
            && this.N(i, j, true) <= 1
            && this.u(k, l) == 0
            && this.i(i1) <= 1;
      }
   }

   private static float N(class11499 var0, class11499 var1) {
      return class09170.N(var1.y(), var0.y());
   }

   public void N() {
      Arrays.fill((int[])this.L_1, 0);
      Arrays.fill((int[])this.L_2, 0);
      Arrays.fill((int[])this.L_3, 0);
      Arrays.fill((int[])this.L_4, 0);
      Arrays.fill((int[])this.L_5, Integer.MIN_VALUE);
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = 0;
      this.y_0 = 0;
      this.y_1 = 0;
      this.y_2 = 0;
      this.y_3 = false;
      ((class09166)this.L_0).y();
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private boolean N(class11087 var1, class07438 var2, class11499 var3, boolean var4, boolean var5) {
      return var3 != null && (!var4 || var5 || var1.N(var2, var3));
   }

   private int N(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1 : -1;
      } else {
         return ((class09166)this.L_0).N();
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, float var5) {
      if (Math.abs(var2) <= 1.0E-4F) {
         float f3 = var3 * (var4 ? 2.6F : 1.2F) * (0.55F + var5);
         return class04995.N(var1, -f3, f3);
      } else {
         float f = Math.signum(var2);
         if (Math.signum(var1) != f && Math.abs(var2) > var3 * 1.15F) {
            var1 = f * Math.abs(var1);
         }

         float f1 = var3 * ((class09166)this.L_0).y(var4 ? 0.35F : 0.22F, var4 ? 2.9F : 1.25F);
         float f2 = Math.max(var3, Math.abs(var2) + f1 * (Math.abs(var2) <= var3 * 3.0F ? 1.0F : -0.45F));
         return class04995.N(var1, -f2, f2);
      }
   }

   private int N(int var1, int var2, int var3) {
      if (var2 <= 0) {
         return 0;
      } else {
         int j = var1 < 6 ? var1 % 3 + 1 : ((class09166)this.L_0).N(1, var2);
         int i = var1 % 2 == 0 ? var3 : -var3;
         if (var1 >= 10 && ((class09166)this.L_0).N(0.38F)) {
            i *= -1;
         }

         return j * i;
      }
   }

   private float N(int var1, int var2) {
      if (!(Boolean)this.y_3) {
         return 0.0F;
      } else {
         int i = var1 - (Integer)this.N_2;
         int j = var2 - (Integer)this.N_3;
         int k = i - (Integer)this.N_4;
         int l = j - (Integer)this.y_0;
         float f = 0.0F;
         if (var1 == (Integer)this.N_2 && var2 == (Integer)this.N_3) {
            f += 0.55F;
         }

         if (Math.abs(var1) == Math.abs((Integer)this.N_2) && Math.abs(var2) == Math.abs((Integer)this.N_3)) {
            f += 0.26F;
         }

         if (i == (Integer)this.N_4 && j == (Integer)this.y_0) {
            f += i == 0 && j == 0 ? 0.45F : 0.36F;
         }

         if (k == (Integer)this.y_1 && l == (Integer)this.y_2) {
            f += 0.22F;
         }

         f += Math.min(0.38F, this.N(var1, var2, false) * 0.11F);
         f += Math.min(0.28F, this.N(var1, var2, true) * 0.07F);
         f += Math.min(0.34F, this.u(i, j) * 0.12F);
         return Math.min(1.6F, f + this.L());
      }
   }

   private int N(int var1, int var2, boolean var3) {
      int i = 0;

      for (int j = 0; j < (Integer)this.N_1; j++) {
         if (var3
            ? Math.abs(((int[])this.L_1)[j]) == Math.abs(var1) && Math.abs(((int[])this.L_2)[j]) == Math.abs(var2)
            : ((int[])this.L_1)[j] == var1 && ((int[])this.L_2)[j] == var2) {
            i++;
         }
      }

      return i;
   }

   private float N(float var1, double var2) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float f = Math.signum(var1);
         float f1 = Math.abs(var1) / (float)var2;
         int i = Math.max(1, (int)Math.floor(f1));
         int j = Math.max(i, (int)Math.ceil(f1));
         int k = ((class09166)this.L_0).N(f1 - i) ? j : i;
         return f * k * (float)var2;
      } else {
         return var1;
      }
   }

   private class11499 N(class11499 var1, float var2, float var3, double var4, float var6, int var7, int var8, boolean var9, float var10) {
      float f = this.N(var7 * var6, var2, var6, true, var10);
      float f1 = var9 ? 0.0F : this.N(var8 * var6, var3, var6, false, var10);
      return new class11499(var1.y() + this.N(f, var4), class04995.N(var1.R() + this.N(f1, var4), -90.0F, 90.0F));
   }

   private class11499 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      float var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      int var14,
      int var15,
      float var16
   ) {
      float f = class09170.N(var3.y(), var4.y());
      float f1 = var9 ? 0.0F : var4.R() - var3.R();
      int i = this.N(var14, f);
      int j = var9 ? 0 : this.N(var15, f1);
      int k = Math.min(9, Math.max(2, Math.round(2.0F + var16 * 5.5F + (var12 ? 2.0F : 0.0F))));
      int l = var9 ? 0 : Math.min(5, Math.max(1, Math.round(1.0F + var16 * 3.0F + (var13 ? 1.0F : 0.0F))));

      for (int i1 = 0; i1 < 28; i1++) {
         int k1 = this.N(i1, k, i);
         int j1 = var9 ? 0 : this.N(i1 + 7, l, j);
         class11499 class11499x;
         if ((k1 != 0 || j1 != 0)
            && this.N(var1, var2, class11499x = this.N(var3, f, f1, var6, var8, var14 + k1, var9 ? 0 : var15 + j1, var9, var16), var10, var11)
            && this.N(var3, class11499x, var8)) {
            return class11499x;
         }
      }

      float f2 = ((class09166)this.L_0).N(true, var8 * class04995.N(var16 * 2.2F, 0.4F, 2.8F));
      float f3 = var9 ? 0.0F : ((class09166)this.L_0).N(false, var8 * class04995.N(var16, 0.18F, 1.2F));
      class11499 class11499 = new class11499(
         var3.y() + this.N(N(var5, var3) + f2, var6), class04995.N(var3.R() + this.N((var9 ? 0.0F : var5.R() - var3.R()) + f3, var6), -90.0F, 90.0F)
      );
      return this.N(var1, var2, class11499, var10, var11) && this.N(var3, class11499, var8) ? class11499 : null;
   }
}
