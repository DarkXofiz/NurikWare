package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09137 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class09137() {
      super();
      this.u();
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = false;
      }
   }

   private boolean y(int var1, int var2) {
      return var1 == (Integer)this.N_0 || var2 == (Integer)this.N_1;
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
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

   private int[] N(boolean var1, int var2) {
      return !var1 ? new int[]{0} : new int[]{var2, -var2, var2 * 2, -var2 * 2, var2 * 3, -var2 * 3, var2 * 4, -var2 * 4};
   }

   public class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9) {
      if (var3 != null && var4 != null && var5 != null) {
         float f = (float)Math.max(var6, 0.035F);
         int i = this.N(class09170.N(var3.y(), var5.y()), f);
         int j = this.N(var5.R() - var3.R(), f);
         if ((Boolean)this.N_2 && this.y(i, j)) {
            class11499 class11499 = this.N(var1, var2, var3, var4, var6, f, var8, var9, i, j);
            if (class11499 != null) {
               i = this.N(class09170.N(var3.y(), class11499.y()), f);
               j = this.N(class11499.R() - var3.R(), f);
               this.N(i, j);
               return class11499;
            } else {
               this.N(i, j);
               return var5;
            }
         } else {
            this.N(i, j);
            return var5;
         }
      } else {
         return var5;
      }
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      float f = Math.abs(var2);
      float f1 = var4 ? 0.85F : 0.45F;
      if (f <= var3 * f1) {
         return class04995.N(var1, -var3 * (var4 ? 4.0F : 2.0F), var3 * (var4 ? 4.0F : 2.0F));
      } else {
         float f2 = Math.max(var3, Math.abs(var2) + var3 * (var4 ? 1.6F : 0.85F));
         return class04995.N(var1, -f2, f2);
      }
   }

   private boolean N(class11087 var1, class07438 var2, class11499 var3, boolean var4, boolean var5) {
      return var3 != null && (!var4 || var5 || var1.N(var2, var3));
   }

   private class11499 N(
      class11087 var1, class07438 var2, class11499 var3, class11499 var4, double var5, float var7, boolean var8, boolean var9, int var10, int var11
   ) {
      int i = this.N(var10, class09170.N(var3.y(), var4.y()));
      int j = this.N(var11, var4.R() - var3.R());
      int[] aint = this.N(var10 == (Integer)this.N_0, i);

      for (int k : this.N(var11 == (Integer)this.N_1, j)) {
         for (int l : aint) {
            int i1;
            int j1;
            class11499 class11499;
            if ((l != 0 || k != 0)
               && this.N(var1, var2, class11499 = this.N(var3, var4, var5, var7, j1 = var10 + l, i1 = var11 + k), var8, var9)
               && this.N(class11499, var3, var7)) {
               return class11499;
            }
         }
      }

      return null;
   }

   private boolean N(class11499 var1, class11499 var2, float var3) {
      int i = this.N(class09170.N(var2.y(), var1.y()), var3);
      int j = this.N(var1.R() - var2.R(), var3);
      return i != (Integer)this.N_0 && j != (Integer)this.N_1;
   }

   private class11499 N(class11499 var1, class11499 var2, double var3, float var5, int var6, int var7) {
      float f = class09170.N(var1.y(), var2.y());
      float f1 = var2.R() - var1.R();
      float f2 = this.N(var6 * var5, f, var5, true);
      float f3 = this.N(var7 * var5, f1, var5, false);
      return new class11499(var1.y() + this.N(f2, var3), class04995.N(var1.R() + this.N(f3, var3), -90.0F, 90.0F));
   }

   private void N(int var1, int var2) {
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = true;
   }

   public void N() {
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = false;
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
}
