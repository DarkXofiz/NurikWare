package NurikWare;

import minecraft.class04995;

public class class09172 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   private void M() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0L;
         this.y_1 = 0L;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = false;
         this.L_3 = false;
      }
   }

   public class09172() {
      super();
      this.M();
      this.N_1 = 11.0F;
      this.N_2 = 1.0F;
      this.N_3 = 1.0F;
      this.N_4 = 0.55F;
      this.N_5 = 0.42F;
   }

   private boolean y(class11097 var1, boolean var2, boolean var3, boolean var4, long var5) {
      if (!var1.B() && (!var4 || var5 < 500L)) {
         if (var3) {
            boolean flag3 = var5 >= 18L && var5 <= 98L;
            return flag3 && (var1.U() >= 2.2F || var1.L() >= 1.1F || !var1.z()) && Math.random() < 0.38;
         } else if (var1.M() && var5 >= 32L) {
            return Math.random() < 0.24;
         } else if (var1.z() && var1.U() < (Float)this.N_1 && var1.L() < 3.2F) {
            return var1.U() <= 4.8F && var5 >= 70L && Math.random() < 0.18;
         } else {
            float f = var1.z() ? (Float)this.N_1 * 0.86F : Math.max(4.4F, (Float)this.N_1 * 0.58F);
            boolean flag = var1.U() >= f;
            boolean flag1 = !var1.z() && var1.U() >= 4.8F;
            boolean flag2 = var4 && var2 && (var1.U() >= 3.4F || var1.L() >= 1.8F);
            return flag || flag1 || flag2;
         }
      } else {
         return false;
      }
   }

   public void N() {
      this.y_0 = 0L;
      this.y_1 = 0L;
      this.N_0 = 0L;
      this.N_1 = class09139.N(8.5, 14.5);
      this.N_2 = 1.0F;
      this.N_3 = 1.0F;
      this.N_4 = 0.55F;
      this.N_5 = 0.42F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = false;
      this.L_3 = false;
   }

   private void N(long var1, class11097 var3, boolean var4, boolean var5) {
      float f = var3.U();
      boolean flag = var3.M() || f >= 14.0F || !var3.z() && f >= 8.0F;
      this.N_2 = class09139.N(flag ? 1.48 : 1.24, flag ? 2.36 : 1.82);
      this.N_3 = class09139.N(var5 && var4 ? 1.12 : 1.02, flag ? 1.46 : 1.28);
      this.N_4 = class09139.N(flag ? 0.52 : 0.38, flag ? 0.86 : 0.68);
      this.N_5 = class09139.N(0.24, flag ? 0.52 : 0.42);
      this.L_2 = var3.M() && f <= 12.0F || var3.z() && f <= 5.6F || Math.random() < 0.18;
      if ((Boolean)this.L_2) {
         float f1 = Math.random() > 0.5 ? 1.0F : -1.0F;
         this.L_0 = f1 * class09139.N(flag ? 2.2 : 1.25, flag ? 5.4 : 3.6);
         this.L_1 = class09139.N(flag ? -1.75 : -0.95, flag ? 1.75 : 0.95);
         this.N_2 = Math.max((Float)this.N_2, class09139.N(1.74, 2.42));
         this.N_3 = Math.max((Float)this.N_3, class09139.N(1.18, 1.52));
         this.N_4 = Math.max((Float)this.N_4, class09139.N(0.62, 0.9));
         this.N_5 = Math.max((Float)this.N_5, class09139.N(0.34, 0.58));
      } else {
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
      }

      this.y_1 = var1;
      this.N_0 = var1 + (long)class09139.N((Boolean)this.L_2 ? 120.0 : 72.0, (Boolean)this.L_2 ? 230.0 : (flag ? 150.0 : 126.0));
      this.y_0 = var1 + (long)class09139.N((Boolean)this.L_2 ? 260.0 : 340.0, (Boolean)this.L_2 ? 760.0 : (flag ? 880.0 : 1120.0));
      this.N_1 = class09139.N(4.8, flag ? 12.5 : 9.8);
      this.L_3 = true;
   }

   public class09141 N(class11097 var1, boolean var2, boolean var3, boolean var4, long var5) {
      long i = System.currentTimeMillis();
      boolean flag = var5 >= 500L && var4;
      if (flag || var1.B()) {
         this.L_3 = false;
         this.L_2 = false;
      }

      if (i >= (Long)this.N_0) {
         this.L_3 = false;
         this.L_2 = false;
      }

      if (!(Boolean)this.L_3 && i >= (Long)this.y_0 && this.y(var1, var2, var3, var4, var5)) {
         this.N(i, var1, var2, var4);
      }

      if (!(Boolean)this.L_3) {
         return class09141.Z();
      } else {
         float f = class04995.N((float)(i - (Long)this.y_1) / (float)Math.max(1L, (Long)this.N_0 - (Long)this.y_1), 0.0F, 1.0F);
         float f1 = (float)Math.pow(Math.max(0.0F, 1.0F - f), 0.54F);
         float f2 = 0.16F + f1 * 0.96F;
         float f3 = (Boolean)this.L_2 ? Math.max(0.74F, (float)Math.sin(f * Math.PI)) : 0.0F;
         return new class09141(
            true,
            class04995.B(f2, 1.0F, (Float)this.N_2),
            class04995.B(f2, 1.0F, (Float)this.N_3),
            class04995.B(f2, 0.72F, 1.22F),
            (Float)this.N_4,
            (Float)this.N_5,
            (Float)this.L_0 * f3,
            (Float)this.L_1 * f3,
            (Boolean)this.L_2 && f3 > 0.08F
         );
      }
   }
}
