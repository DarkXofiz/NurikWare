package NurikWare;

public class class11608 implements class09819 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   float L() {
      return class09759.EASE_OUT.N((Float)this.N_0);
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
      }
   }

   public class11608() {
      super();
      this.M();
   }

   float B() {
      return (Float)this.N_0;
   }

   void N(boolean var1) {
      this.N_1 = var1 ? 1.0F : 0.0F;
   }

   @Override
   public boolean N() {
      return (Float)this.N_0 != (Float)this.N_1;
   }

   @Override
   public boolean N(float var1) {
      float f = var1 / 0.18F;
      if ((Float)this.N_0 < (Float)this.N_1) {
         this.N_0 = Math.min((Float)this.N_1, (Float)this.N_0 + f);
      } else {
         this.N_0 = Math.max((Float)this.N_1, (Float)this.N_0 - f);
      }

      return true;
   }
}
