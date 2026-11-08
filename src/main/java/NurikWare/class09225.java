package NurikWare;

public class class09225 implements class09819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   class09225(float var1) {
      super();
      this.R();
      this.N_3 = (Runnable)() -> {};
      this.N_0 = var1;
   }

   void i() {
      this.N_1 = true;
      this.N_2 = 0.0F;
   }

   void y() {
      this.N_1 = false;
      this.N_2 = 0.0F;
   }

   @Override
   public boolean N(float var1) {
      if (!(Boolean)this.N_1) {
         return false;
      } else {
         this.N_2 = (Float)this.N_2 + var1;
         if ((Float)this.N_2 >= (Float)this.N_0) {
            this.N_1 = false;
            ((Runnable)this.N_3).run();
            return true;
         } else {
            return false;
         }
      }
   }

   void N(Runnable var1) {
      this.N_3 = var1 == null ? () -> {} : var1;
   }

   @Override
   public boolean N() {
      return (Boolean)this.N_1;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = false;
         this.N_2 = 0.0F;
      }
   }
}
