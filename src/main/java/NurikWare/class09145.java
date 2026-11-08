package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09145 {
   public static Object N_0;
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
   public boolean L_init;

   private boolean L(int var1) {
      if (var1 == Integer.MIN_VALUE) {
         return false;
      } else {
         int i = 0;

         for (int j = 0; j < (Integer)this.L_0; j++) {
            if (((int[])this.y_0)[j] == var1) {
               i++;
            }
         }

         return i >= 2;
      }
   }

   public class09145() {
      super();
      this.i();
      this.y_0 = new int[20];
      this.y_1 = new int[20];
      this.y_2 = new int[20];
   }

   static {
      R();
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = 0;
         this.y_6 = 0;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
         this.L_3 = 0;
         this.L_4 = false;
      }
   }

   private int y(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   public class11499 N(
      class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9, boolean var10
   ) {
      float f = (float)Math.max(var6, 0.035F);
      float f1 = class09170.N(var3.y(), var5.y());
      float f2 = var8 ? 0.0F : var5.R() - var3.R();
      int i = this.y(f1, f);
      int j = this.y(f2, f);
      int k = this.N(f1, f2);
      int l = this.N(k);
      if (i == 0 && j == 0) {
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = k;
         this.L_4 = true;
         return var5;
      } else {
         boolean flag1 = (Boolean)this.L_4 && i == (Integer)this.y_3 && j == (Integer)this.y_4;
         boolean flag2 = (Boolean)this.L_4 && k == (Integer)this.y_5 && k != Integer.MIN_VALUE && (i != 0 || j != 0);
         boolean flag3 = this.N(i, j);
         boolean flag4 = this.L(k);
         boolean flag = !var8 && i != 0 && Math.abs(i) == Math.abs(j);
         int k1;
         if (flag1) {
            int l1 = (Integer)this.L_1 + 1;
            k1 = l1;
            this.L_1 = l1;
         } else {
            k1 = 0;
         }

         this.L_1 = k1;
         if (flag2) {
            int i1 = (Integer)this.L_2 + 1;
            k1 = i1;
            this.L_2 = i1;
         } else {
            k1 = 0;
         }

         this.L_2 = k1;
         if (l == 0 && k != Integer.MIN_VALUE && (Integer)this.L_0 > 0) {
            int j1 = (Integer)this.L_3 + 1;
            k1 = j1;
            this.L_3 = j1;
         } else {
            k1 = 0;
         }

         this.L_3 = k1;
         class11499 class11499 = var5;
         if (flag1 || flag3 || (Integer)this.L_2 >= 1 || (Integer)this.L_3 >= 1 || flag4 || flag) {
            class11499 = this.N(var1, var2, var3, var4, var5, var6, f, var8, var9, var10, i, j);
            f1 = class09170.N(var3.y(), class11499.y());
            f2 = var8 ? 0.0F : class11499.R() - var3.R();
            i = this.y(f1, f);
            j = this.y(f2, f);
            k = this.N(f1, f2);
            l = this.N(k);
            this.L_1 = i == (Integer)this.y_3 && j == (Integer)this.y_4 ? (Integer)this.L_1 : 0;
            this.L_2 = k == (Integer)this.y_5 ? (Integer)this.L_2 : 0;
            this.L_3 = l == 0 && k != Integer.MIN_VALUE && (Integer)this.L_0 > 0 ? (Integer)this.L_3 : 0;
         }

         this.y_3 = i;
         this.y_4 = j;
         this.y_5 = k;
         this.N(i, j, k);
         this.L_4 = true;
         return class11499;
      }
   }

   private boolean N(int var1, int var2) {
      if (var1 == 0 && var2 == 0) {
         return false;
      } else {
         for (int i = 0; i < (Integer)this.L_0; i++) {
            if (((int[])this.y_1)[i] == var1 && ((int[])this.y_2)[i] == var2) {
               return true;
            }
         }

         return false;
      }
   }

   public void N() {
      this.y_3 = 0;
      this.y_4 = 0;
      this.y_5 = Integer.MIN_VALUE;
      this.y_6 = 0;
      this.L_0 = 0;
      this.L_1 = 0;
      this.L_2 = 0;
      this.L_3 = 0;
      this.L_4 = false;
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
      int var12,
      int var13
   ) {
      int i = this.N(var12, class09170.N(var3.y(), var4.y()));
      int j = this.N(var13, var4.R() - var3.R());
      int[] aint = new int[]{1, -1, 2, -2, 3, -3};
      int[] aint1 = new int[]{1, -1, 2, -2};
      if (!var9) {
         for (int k : aint) {
            class11499 class11499xx = this.N(var3, var4, var6, var8, var12, var13 + j * k, false);
            if (this.N(var1, var2, class11499xx, var10, var11) && this.N(var3, class11499xx, var8)) {
               return class11499xx;
            }
         }
      }

      for (int l : aint1) {
         class11499 class11499 = this.N(var3, var4, var6, var8, var12 + i * l, var9 ? 0 : var13, var9);
         if (this.N(var1, var2, class11499, var10, var11) && this.N(var3, class11499, var8)) {
            return class11499;
         }
      }

      float f = class09170.N(var3.y(), var5.y());
      float f1 = var9 ? 0.0F : var5.R() - var3.R();
      float f2 = i * var8 * class09139.N(0.35F, 0.85F);
      float f3 = var9 ? 0.0F : j * var8 * class09139.N(0.2F, 0.65F);
      class11499 class11499x = new class11499(var3.y() + this.N(f + f2, var6), class04995.N(var3.R() + this.N(f1 + f3, var6), -90.0F, 90.0F));
      return this.N(var1, var2, class11499x, var10, var11) ? class11499x : var5;
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

   private boolean N(class11087 var1, class07438 var2, class11499 var3, boolean var4, boolean var5) {
      return !var4 || var5 || var1.N(var2, var3);
   }

   private void N(int var1, int var2, int var3) {
      if (var3 != Integer.MIN_VALUE) {
         ((int[])this.y_1)[(Integer)this.y_6] = var1;
         ((int[])this.y_2)[(Integer)this.y_6] = var2;
         ((int[])this.y_0)[(Integer)this.y_6] = var3;
         this.y_6 = ((Integer)this.y_6 + 1) % 20;
         this.L_0 = Math.min(20, (Integer)this.L_0 + 1);
      }
   }

   private boolean N(class11499 var1, class11499 var2, float var3) {
      int i = this.y(class09170.N(var1.y(), var2.y()), var3);
      int j = this.y(var2.R() - var1.R(), var3);
      int k = this.N(class09170.N(var1.y(), var2.y()), var2.R() - var1.R());
      return (i != (Integer)this.y_3 || j != (Integer)this.y_4)
         && k != (Integer)this.y_5
         && !this.N(i, j)
         && !this.L(k)
         && (j == 0 || Math.abs(i) != Math.abs(j));
   }

   private class11499 N(class11499 var1, class11499 var2, double var3, float var5, int var6, int var7, boolean var8) {
      float f = class09170.N(var1.y(), var2.y());
      float f1 = var2.R() - var1.R();
      float f2 = this.N(var6 * var5, f, var5);
      float f3 = var8 ? 0.0F : this.N(var7 * var5, f1, var5);
      return new class11499(var1.y() + this.N(f2, var3), class04995.N(var1.R() + this.N(f3, var3), -90.0F, 90.0F));
   }

   private float N(float var1, float var2, float var3) {
      if (Math.abs(var2) <= var3 * 1.15F) {
         return var1;
      } else {
         float f = Math.max(var3, Math.abs(var2) - var3 * 0.35F);
         return class04995.N(var1, -f, f);
      }
   }

   private int N(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1 : -1;
      } else {
         return Math.random() > 0.5 ? 1 : -1;
      }
   }

   private int N(int var1) {
      if (var1 != Integer.MIN_VALUE && (Integer)this.L_0 != 0) {
         int i = ((int[])this.y_0)[((Integer)this.y_6 - 1 + 20) % 20];
         return Math.abs(var1 - i);
      } else {
         return Integer.MIN_VALUE;
      }
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F && Math.abs(var2) <= 1.0E-4F
         ? Integer.MIN_VALUE
         : (int)Math.round(Math.toDegrees(Math.atan2(Math.abs(var2), Math.abs(var1))) % 90.0 * 10.0);
   }

   private static void R() {
      N_0 = 20;
   }
}
