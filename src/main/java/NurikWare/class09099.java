package NurikWare;

import minecraft.class00405;

public class class09099 implements class09102 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   float L() {
      return Math.round((Float)this.N_1);
   }

   class09099() {
      super();
      this.B();
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
      }
   }

   @Override
   public void y() {
      float f = ((class09090)this.N_0).R() - ((class09090)this.N_0).N();
      if (f > (Float)this.N_1) {
         this.N_1 = f;
      }
   }

   @Override
   public void N() {
      float f = ((class09090)this.N_0).R() - ((class09090)this.N_0).N();
      if (f > (Float)this.N_1) {
         this.N_1 = f;
      }
   }

   void N(class09090 var1) {
      this.N_0 = var1;
      this.N_1 = 0.0F;
   }

   @Override
   public void N(int var1, class00405 var2, boolean var3, class09719 var4, float var5) {
      float f = ((class09090)this.N_0).R() - ((class09090)this.N_0).N() + var5;
      if (f > (Float)this.N_1) {
         this.N_1 = f;
      }
   }
}
