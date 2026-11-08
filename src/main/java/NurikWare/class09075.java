package NurikWare;

import minecraft.class00405;

public class class09075 implements class09102 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0;
         this.N_4 = 0.0F;
      }
   }

   class09075(class09106 var1) {
      super();
      this.L();
      this.N_5 = var1;
   }

   private void u() {
      float f = ((class09090)((class09106)this.N_5).N_0).R() - ((class09090)((class09106)this.N_5).N_0).N();
      if (!(f <= 0.0F)) {
         float f1 = ((class09071)this.N_0).N((Float)this.N_1);
         float f2 = ((class09090)((class09106)this.N_5).N_0).y() - (Float)this.N_4;
         float f3 = Math.round((Float)this.N_2) - (Float)this.N_4;
         float f4 = f2 + f + (Float)this.N_4 * 2.0F;
         float f5 = f3 + f1 + (Float)this.N_4 * 2.0F;
         ((class09106)this.N_5).N(f2, f3, f4, f5, (Integer)this.N_3);
      }
   }

   @Override
   public void y() {
      this.u();
   }

   public void N(class09071 var1, float var2, float var3, int var4, float var5) {
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var4;
      this.N_4 = var5;
   }

   @Override
   public void N() {
      this.u();
      this.N_2 = (Float)this.N_2 + ((class09071)this.N_0).N((Float)this.N_1);
   }

   @Override
   public void N(int var1, class00405 var2, boolean var3, class09719 var4, float var5) {
   }
}
