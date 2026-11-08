package NurikWare;

import minecraft.class04995;
import minecraft.class07438;

public class class09152 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = 0;
         this.N_7 = 0;
      }
   }

   public class09152() {
      super();
      this.M();
   }

   private float N(float var1, float var2, float var3) {
      if (Math.abs(var2) <= var3 * 2.0F) {
         return var1;
      } else {
         float f = Math.max(var3, Math.abs(var2) - var3 * class09139.N(0.9, 2.6));
         return class04995.N(var1, -f, f);
      }
   }

   private void N(long var1, float var3, boolean var4) {
      if (var1 >= (Long)this.N_0) {
         this.N_1 = class09139.N((double)(-var3 * (var4 ? 1.55F : 0.9F)), (double)(var3 * (var4 ? 1.85F : 0.92F)));
         this.N_2 = class09139.N((double)(-var3 * (var4 ? 0.48F : 0.32F)), (double)(var3 * (var4 ? 0.48F : 0.32F)));
         this.N_0 = var1 + (long)class09139.N(var4 ? 70.0 : 180.0, var4 ? 190.0 : 420.0);
      }
   }

   private float N(float var1, float var2, boolean var3, boolean var4) {
      int j = Math.max(1, Math.round(var1 / var2));
      int i = var3 ? (Integer)this.N_5 : (Integer)this.N_6;
      if (j == i && var4 && Math.random() < 0.46F) {
         int k = Math.random() > 0.5 ? 1 : -1;
         int l = var4 ? 3 : 1;
         j = Math.max(1, j + k * Math.max(1, Math.round(class09139.N(1.0, (double)l))));
      }

      if (var3) {
         this.N_5 = j;
      } else {
         this.N_6 = j;
      }

      return j * var2;
   }

   public void N(class11499 var1) {
      this.N_0 = 0L;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.N_3 = 0;
      this.N_4 = 0;
      this.N_5 = 0;
      this.N_6 = 0;
      this.N_7 = 0;
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   public class09123 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, boolean var7, boolean var8, boolean var9) {
      float f = (float)Math.max(class09170.N(), 0.035F);
      long i = System.currentTimeMillis();
      this.N(i, f, var7);
      float f1 = class09170.N(var3.y(), var4.y());
      float f2 = var8 ? 0.0F : var4.R() - var3.R();
      int j = this.N(f1, f);
      int k = this.N(f2, f);
      int l;
      if (j != (Integer)this.N_3 || k != (Integer)this.N_4 || j == 0 && k == 0) {
         l = 0;
      } else {
         int i1 = (Integer)this.N_7 + 1;
         l = i1;
         this.N_7 = i1;
      }

      this.N_7 = l;
      class11499 class11499 = var4;
      if ((Integer)this.N_7 >= 4 || var7 && (Integer)this.N_7 >= 2 || var7 && Math.random() < 0.16) {
         class11499 = this.N(var1, var2, var3, var4, f1, f2, f, var8, var9, var7);
         f1 = class09170.N(var3.y(), class11499.y());
         f2 = var8 ? 0.0F : class11499.R() - var3.R();
         j = this.N(f1, f);
         k = this.N(f2, f);
      }

      float f3 = this.N(var5, f, true, var7);
      float f4 = var8 ? f : this.N(var6, f, false, var7);
      this.N_3 = j;
      this.N_4 = k;
      return new class09123(class11499, f3, f4);
   }

   private class11499 N(
      class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, float var7, boolean var8, boolean var9, boolean var10
   ) {
      if (var9 && Math.abs(var5) + Math.abs(var6) < var7 * 0.8F) {
         return var4;
      } else {
         float f = Math.abs(var5) > 1.0E-4F ? Math.signum(var5) : (Math.random() > 0.5 ? 1.0F : -1.0F);
         float f1 = Math.abs(var6) > 1.0E-4F ? Math.signum(var6) : (Math.random() > 0.5 ? 1.0F : -1.0F);
         float f2 = f * var7 * class09139.N(0.54, var10 ? 3.25 : 1.72) + (Float)this.N_1;
         float f3 = var8 ? 0.0F : f1 * var7 * class09139.N(0.22, var10 ? 1.08 : 0.58) + (Float)this.N_2;
         class11499 class11499 = new class11499(var3.y() + this.N(var5 + f2, var5, var7), class04995.N(var3.R() + this.N(var6 + f3, var6, var7), -90.0F, 90.0F));
         if (var1.N(var2, class11499)) {
            return class11499;
         } else {
            return var9 && var1.N(var2, var3) ? var3 : var4;
         }
      }
   }
}
