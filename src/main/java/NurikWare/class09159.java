package NurikWare;

import minecraft.class04995;

public class class09159 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public class09159() {
      super();
      this.y();
      this.N_3 = 1.0F;
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 1.0F;
   }

   public class09136 N(class11097 var1, float var2, float var3, float var4, boolean var5) {
      if (var1.N()) {
         return new class09136(var4, 0.0F);
      } else {
         long i = System.currentTimeMillis();
         this.N(i, var1, var5);
         float f = var2;
         float f1 = var3;
         if (var1.z() && !var1.M() && !var1.B()) {
            float f2 = class04995.N(var1.L() / 2.8F, 0.16F, 0.72F);
            f = Math.min(var2, Math.max(var4, var1.L() * f2 + var4 * 0.65F));
            f1 = var3 * class04995.N(f2, 0.18F, 0.58F);
         }

         if (i < (Long)this.N_1 && !var1.B()) {
            f = Math.min(f, var4 * class09139.N(0.7, 1.35));
            f1 *= 0.18F;
         }

         if (i < (Long)this.N_2 || var1.B()) {
            float f3 = var1.B() ? class09139.N(0.72, 0.92) : class09139.N(0.42, 0.66);
            f = Math.max(f, var1.L() * f3);
            f1 = Math.max(f1, var1.B() ? class09139.N(0.72, 0.94) : class09139.N(0.48, 0.72));
         }

         return new class09136(Math.max(var4, f * (Float)this.N_3), class04995.N(f1, 0.0F, 1.0F));
      }
   }

   private void N(long var1, class11097 var3, boolean var4) {
      if (var1 >= (Long)this.N_0) {
         this.N_3 = class09139.N(0.74, var4 ? 1.28 : 1.08);
         if (!var3.B() && var3.L() < 3.0F) {
            double d0 = Math.random();
            double d1 = var3.z() ? 0.46 : 0.24;
            if (d0 < d1) {
               this.N_1 = var1 + (long)class09139.N(45.0, 115.0);
            }
         }

         if (var3.M() || var3.L() > 2.4F) {
            double d2 = Math.random();
            double d3 = var4 ? 0.42 : 0.2;
            if (d2 < d3) {
               this.N_2 = var1 + (long)class09139.N(55.0, 125.0);
            }
         }

         this.N_0 = var1 + (long)class09139.N(var4 ? 70.0 : 115.0, var4 ? 180.0 : 310.0);
      }
   }
}
