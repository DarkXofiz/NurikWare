package NurikWare;

import minecraft.class04995;

public class class09162 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0;
         this.y_5 = false;
      }
   }

   public class09162() {
      super();
      this.M();
   }

   private float z() {
      return (Long)this.N_2 <= 0L ? 1.0F : class04995.N((float)(System.currentTimeMillis() - (Long)this.N_1) / (float)((Long)this.N_2).longValue(), 0.0F, 1.0F);
   }

   private int y(float var1) {
      if (Math.abs(var1) <= 1.0E-4F) {
         return 0;
      } else {
         return var1 > 0.0F ? 1 : -1;
      }
   }

   private float y(long var1) {
      if ((Long)this.N_0 <= 0L) {
         this.N_0 = var1;
         return 1.0F;
      } else {
         float f = class04995.N((float)(var1 - (Long)this.N_0) / 50.0F, 0.35F, 1.8F);
         this.N_0 = var1;
         return f;
      }
   }

   private float y(float var1, float var2, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float f = Math.abs(var1);
      if (!(f <= 1.0E-4F) && !(Math.abs(var2) <= 1.0E-4F)) {
         float f1 = this.z();
         float f2 = this.N(f1);
         float f3 = (var5 ? 0.66F : 0.52F) + (float)Math.pow(class04995.N(f / 28.0F, 0.0F, 1.0F), 0.34) * 0.24F;
         if (var6 || var7) {
            f3 += 0.14F;
         }

         float f4 = this.R() && !var7 ? class04995.B(f2, Math.min(f3, 0.62F), f3) : f3;
         float f5 = Math.max(var3 * 0.45F, f * f4 + var3 * class09139.N(1.2F, 5.0));
         float f6 = class04995.N(var2, -f5, f5);
         float f7 = (
               var3 * (this.R() ? class04995.B(f2, var5 ? 8.0F : 5.6F, var5 ? 17.0F : 11.5F) : (var5 ? 13.5F : 8.8F))
                  + (float)Math.pow(Math.abs(f6 - (Float)this.y_1) + var3 * 0.5F, 0.92) * 1.35F
            )
            * class04995.N(var4, 0.45F, 1.65F);
         float f8 = (Float)this.y_1 + class04995.N(f6 - (Float)this.y_1, -f7, f7);
         this.y_3 = (Float)this.y_3 * 0.18F + f8 * 0.82F;
         f8 = class04995.B(this.R() ? 0.035F : 0.02F, f8, (Float)this.y_3);
         if (Math.signum(f8) != Math.signum(var1) && f > var3) {
            f8 = Math.signum(var1) * Math.min(Math.abs(f8), f5);
         }

         return class04995.N(f8, -f, f);
      } else {
         this.y_3 = (Float)this.y_3 * 0.45F;
         return 0.0F;
      }
   }

   public class09126 N(float var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      long i = System.currentTimeMillis();
      float f = this.y(i);
      int j = this.y(var1);
      float f1 = (Boolean)this.y_5 ? Math.abs(var1 - (Float)this.N_3) : 0.0F;
      boolean flag1 = (Boolean)this.y_5 && j != 0 && (Integer)this.y_4 != 0 && j != (Integer)this.y_4 && Math.abs(var1) > Math.max(4.2F, var5 * 12.0F);
      boolean flag = Math.abs(var1) > Math.max(7.2F, var5 * 17.0F)
         && (f1 > Math.max(3.6F, var5 * 8.5F) || flag1 || Math.abs(var3) > Math.max(4.0F, var5 * 9.0F));
      if (flag && !var10) {
         this.N(i, var1, f1, var7, var8, var9);
      }

      float f2 = this.N(var1, var3, var5, f, var7, var8, var10);
      float f3 = var6 ? 0.0F : this.y(var2, var4, var5, f, var7, var8, var10);
      this.N_3 = var1;
      this.y_0 = f2;
      this.y_1 = f3;
      if (j != 0) {
         this.y_4 = j;
      }

      this.y_5 = true;
      return new class09126(f2, f3);
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float f = class04995.N((Math.abs(var3) + var4 * 0.45F) / 120.0F, 0.0F, 1.0F);
      float f1 = !var5 && !var6 ? 16.0F : 12.0F;
      float f2 = var7 ? 34.0F : 52.0F;
      this.N_1 = var1;
      this.N_2 = (long)class09139.N((double)(f1 + f * 6.0F), (double)(f2 + f * 14.0F));
      this.y_4 = this.y(var3);
      this.y_2 = (Float)this.y_2 * 0.96F;
      this.y_3 = (Float)this.y_3 * 0.88F;
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0.0F;
      this.y_0 = 0.0F;
      this.y_1 = 0.0F;
      this.y_2 = 0.0F;
      this.y_3 = 0.0F;
      this.y_4 = 0;
      this.y_5 = false;
   }

   private float N(float var1, float var2, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float f = Math.abs(var1);
      if (!(f <= 1.0E-4F) && !(Math.abs(var2) <= 1.0E-4F)) {
         float f1 = this.z();
         float f2 = this.N(f1);
         float f3 = class04995.N(f / 96.0F, 0.0F, 1.0F);
         float f4 = (var5 ? 0.82F : 0.7F) + (float)Math.pow(f3, 0.28) * (var5 ? 0.22F : 0.24F);
         if (var6) {
            f4 += 0.14F;
         }

         if (var7) {
            f4 += 0.2F;
         }

         float f5 = this.R() && !var7 ? class04995.B(f2, Math.min(f4, var5 ? 0.78F : 0.7F), f4) : f4;
         float f6 = Math.max(var3, f * f5 + var3 * class09139.N(4.0, var5 ? 18.0 : 13.0));
         float f7 = class04995.N(var2, -f6, f6);
         float f8 = var3 * (this.R() ? class04995.B(f2, var5 ? 22.0F : 16.0F, var5 ? 46.0F : 34.0F) : (var5 ? 36.0F : 26.0F));
         float f9 = (float)Math.pow(Math.abs(f7 - (Float)this.y_0) + var3, 0.94) * (var5 ? 2.35F : 1.85F);
         float f10 = (f8 + f9) * class04995.N(var4, 0.45F, 1.65F);
         float f11 = (Float)this.y_0 + class04995.N(f7 - (Float)this.y_0, -f10, f10);
         float f12 = this.R() ? class04995.B(f2, 0.88F, 0.96F) : (var5 ? 0.92F : 0.84F);
         this.y_2 = (Float)this.y_2 * (1.0F - f12) + f11 * f12;
         f11 = class04995.B(this.R() ? 0.04F : 0.03F, f11, (Float)this.y_2);
         if (Math.signum(f11) != Math.signum(var1) && f > var3 * 2.0F) {
            f11 = Math.signum(var1) * Math.min(Math.abs(f11), f6);
         }

         return class04995.N(f11, -f, f);
      } else {
         this.y_2 = (Float)this.y_2 * 0.35F;
         return 0.0F;
      }
   }

   private float N(float var1) {
      float f = class04995.N(var1, 0.0F, 1.0F);
      float f1 = 1.0F - (float)Math.pow(1.0F - f, 8.0);
      float f2 = (float)Math.sin(f * Math.PI) * 0.06F;
      return class04995.N(f1 + f2, 0.0F, 1.0F);
   }

   private boolean R() {
      return (Long)this.N_2 > 0L && System.currentTimeMillis() - (Long)this.N_1 < (Long)this.N_2;
   }
}
