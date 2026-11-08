package NurikWare;

import minecraft.class04995;

public class class09140 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
         this.N_6 = 0;
         this.N_7 = 0;
      }
   }

   public class09140() {
      super();
      this.L();
      this.N_3 = 1.0F;
      this.N_4 = 0.0F;
   }

   private boolean N(class11087 var1, class11097 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (var5 || var3 <= 1.65F || var1.y().y() < 42L) {
         return false;
      } else if (var2.B() || var2.M()) {
         return true;
      } else if (!var2.z() && var3 > 3.4F) {
         return true;
      } else if (var6 && var3 > 2.4F) {
         return true;
      } else {
         return var4 && var3 > 5.0F ? Math.random() < 0.64F : (Integer)this.N_7 >= 2 && var3 > 4.2F || var3 > 10.0F && Math.random() < 0.34F;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 1.0F;
      this.N_4 = 0.0F;
      this.N_5 = 0.0F;
      this.N_6 = 0;
      this.N_7 = 0;
   }

   private void N(long var1, class11097 var3, float var4, boolean var5) {
      boolean flag = var3.M() || var3.B() || !var3.z() || var4 > 12.0F;
      this.N_3 = class09139.N(flag ? 1.34F : 1.08F, flag ? 2.18F : 1.62F);
      this.N_4 = class09139.N(flag ? 0.46F : 0.3F, var5 ? 0.82F : (flag ? 0.74F : 0.58F));
      this.N_1 = var1;
      this.N_2 = var1 + (long)class09139.N(flag ? 58.0 : 46.0, flag ? 128.0 : 96.0);
      this.N_0 = var1 + (long)class09139.N(flag ? 120.0 : 185.0, flag ? 420.0 : 680.0);
   }

   public class09148 N(class11087 var1, class11499 var2, class11097 var3, float var4, float var5, boolean var6, boolean var7, boolean var8) {
      long j = System.currentTimeMillis();
      float f = var3.U();
      int k = Math.max(1, Math.round(var4 / var5));
      int l;
      if (k == (Integer)this.N_6) {
         int i1 = (Integer)this.N_7 + 1;
         l = i1;
         this.N_7 = i1;
      } else {
         l = 0;
      }

      this.N_7 = l;
      boolean flag = j < (Long)this.N_2;
      if (!flag && j >= (Long)this.N_0 && this.N(var1, var3, f, var6, var7, var8)) {
         this.N(j, var3, f, var8);
         flag = true;
      }

      float f1 = var4;
      boolean flag1 = false;
      if (flag) {
         float f2 = class04995.N((float)(j - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F);
         float f3 = (float)Math.pow(1.0F - f2, 0.42F);
         float f4 = 0.34F + f3 * (Float)this.N_3;
         float f5 = f * (Float)this.N_4 * f4;
         f1 = Math.max(var4, f5);
         f1 *= class09139.N(1.08F, (double)(1.0F + (Float)this.N_3 * 0.18F));
         flag1 = true;
      }

      if ((Integer)this.N_7 >= 1 && f > var5 * 4.0F) {
         float f6 = Math.signum(class09170.N(var2.y(), var3.y().y()));
         float f7 = f6 == 0.0F ? class09139.N(-2.0, 2.0) : f6 * class09139.N(1.0, var6 ? 6.0 : 3.0);
         f1 = Math.max(var5, f1 + f7 * var5);
         flag1 |= var6 || (Integer)this.N_7 >= 2;
      }

      int i;
      if ((i = Math.max(1, Math.round(f1 / var5))) == (Integer)this.N_6 && i > 1) {
         i += Math.random() > 0.5 ? 1 : -1;
      }

      f1 = Math.max(var5, i * var5);
      this.N_6 = i;
      this.N_5 = f1;
      return new class09148(f1, flag1);
   }
}
