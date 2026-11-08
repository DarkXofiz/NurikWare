package NurikWare;

import minecraft.class00405;

public class class09059 implements class09102 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
      }
   }

   class09059(class09106 var1) {
      super();
      this.L();
      this.N_4 = var1;
   }

   public void N(int var1, int var2, float var3, float var4) {
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var4;
   }

   @Override
   public void N(int var1, class00405 var2, class09091 var3, float var4, float var5) {
      if ((Integer)((class09106)this.N_4).N_7 != var3.M()) {
         ((class09106)this.N_4).U();
         ((class09106)this.N_4).N_7 = var3.M();
      }

      float f = ((class09090)((class09106)this.N_4).N_0).y() + (((class09090)((class09106)this.N_4).N_0).R() - ((class09090)((class09106)this.N_4).N_0).N());
      float f1 = ((class09090)((class09106)this.N_4).N_0).u();
      float f2 = f + var3.y() * var4;
      float f3 = f1 + (var3.u() - 7.0F) * var4 + 1.0F;
      float f4 = (var3.R() - var3.y()) * var4;
      float f5 = (var3.Z() - var3.u()) * var4;
      class11176.N(((class11174)class09106.y_7).u(), f2, f3, f4, f5, var3.L(), var3.z(), var3.N(), var3.i(), class09106.N(var2, (Integer)this.N_0));
   }

   @Override
   public void N(int var1, class00405 var2, boolean var3, class09719 var4, float var5) {
      if (var3) {
         ((class09106)this.N_4).N(var4, class09106.N(var2, (Integer)this.N_0), (Integer)this.N_1, (Float)this.N_2, (Float)this.N_3);
      }
   }
}
