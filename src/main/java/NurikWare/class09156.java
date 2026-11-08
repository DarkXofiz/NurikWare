package NurikWare;

public class class09156 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class09156() {
      super();
      this.u();
      this.N_2 = 1.0F;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0.0F;
      }
   }

   private float y(boolean var1, boolean var2, boolean var3, float var4) {
      float f = var3 ? 1.48F : (var2 ? 1.34F : 1.38F);
      float f1 = var3 ? 2.2F : (!var1 && !(var4 >= 9.0F) ? 2.04F : 2.2F);
      return (float)(class09139.N((double)f, (double)f1) + Math.random() * 9.7137E-4);
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      if (var1 >= (Long)this.N_0) {
         if (var1 >= (Long)this.N_1 && !(var3 <= var4 * 3.0F)) {
            float f = this.N(var5, var6, var7, var3);
            if (Math.random() > f) {
               this.N_1 = var1 + (long)class09139.N(45.0, var6 ? 135.0 : 95.0);
            } else {
               this.N_2 = this.y(var5, var6, var7, var3);
               this.N_0 = var1 + (long)class09139.N(var7 ? 42.0 : 58.0, var7 ? 92.0 : 148.0);
               this.N_1 = var1 + (long)class09139.N(var5 ? 95.0 : 145.0, var6 ? 360.0 : 280.0);
            }
         }
      }
   }

   public class09168 N(float var1, float var2, float var3, boolean var4, boolean var5, boolean var6) {
      long i = System.currentTimeMillis();
      this.N(i, var2, var3, var4, var5, var6);
      return i >= (Long)this.N_0 ? new class09168(var1, false) : new class09168(var1 * (Float)this.N_2, true);
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 1.0F;
   }

   private float N(boolean var1, boolean var2, boolean var3, float var4) {
      float f = var3 ? 0.72F : (var1 ? 0.58F : 0.38F);
      if (var2) {
         f += 0.2F;
      }

      if (var4 >= 7.0F) {
         f += 0.1F;
      }

      return Math.min(f, 0.86F);
   }
}
