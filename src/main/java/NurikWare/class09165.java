package NurikWare;

import minecraft.class04995;

public class class09165 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
      }
   }

   public class09165() {
      super();
      this.M();
      this.N_5 = class09139.N(0.0, Math.PI * 2);
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6) {
      if (var1 >= (Long)this.N_0 && var1 >= (Long)this.N_2) {
         boolean flag = var3 > var4 * (var6 ? 2.4F : 4.0F);
         if (flag || var5) {
            float f = var6 ? 0.62F : (var5 ? 0.48F : 0.24F);
            if (Math.random() > f) {
               this.N_0 = var1 + (long)class09139.N(85.0, 210.0);
            } else {
               this.N_3 = class09139.N(var6 ? 0.26 : 0.16, var5 ? 0.72 : 0.48);
               this.N_4 = class09139.N(0.08, var5 ? 0.32 : 0.22);
               this.N_5 = class09139.N(0.0, Math.PI * 2);
               this.N_1 = var1;
               this.N_2 = var1 + (long)class09139.N(45.0, 125.0);
               this.N_0 = var1 + (long)class09139.N(135.0, 360.0);
            }
         }
      }
   }

   public float N(float var1, float var2, float var3, boolean var4, boolean var5, boolean var6) {
      long i = System.currentTimeMillis();
      this.N(i, var2, var3, var4, var5);
      float f1 = var6 ? 34.0F : 9.0F;
      float f2 = class04995.N(var2 / f1, 0.0F, 1.0F);
      float f3 = 0.82F + (float)Math.sqrt(f2) * (var6 ? 0.44F : 0.32F);
      float f4 = (float)Math.sin(i * (var6 ? 0.028 : 0.021) + ((Float)this.N_5).floatValue()) * (var6 ? 0.085F : 0.055F);
      float f5 = this.N(i, var6);
      float f = var5 ? (var6 ? 1.16F : 1.08F) : 1.0F;
      float f6 = var4 ? (var6 ? 1.08F : 1.04F) : 1.0F;
      return Math.max(var3, var1 * Math.max(0.72F, f3 + f4) * f5 * f * f6);
   }

   private float N(long var1, boolean var3) {
      if (var1 >= (Long)this.N_1 && var1 < (Long)this.N_2) {
         float f = (float)Math.sin(class04995.N((float)(var1 - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F) * Math.PI);
         float f1 = var3 ? (Float)this.N_3 : (Float)this.N_4;
         return 1.0F + f * f1;
      } else {
         return 1.0F;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0.0F;
      this.N_4 = 0.0F;
      this.N_5 = class09139.N(0.0, Math.PI * 2);
   }
}
