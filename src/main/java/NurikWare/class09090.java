package NurikWare;

import minecraft.class00405;
import minecraft.class01028;

public class class09090 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;

   public float L() {
      return (Float)this.N_4;
   }

   public float M() {
      return (Float)this.y_0;
   }

   public class09090() {
      super();
      this.z();
      this.N_0 = new class09094(this);
      this.N_1 = new class09719();
   }

   private void B() {
      if ((Integer)this.y_5 != -1) {
         this.L_2 = (Float)this.L_2 + Math.round((Float)this.y_6);
         this.y_6 = 0.0F;
      }
   }

   public float i() {
      return (Float)this.y_3;
   }

   private void z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0.0F;
         this.y_5 = 0;
         this.y_6 = 0.0F;
      }
   }

   public float u() {
      return (Float)this.y_2;
   }

   public float y() {
      return (Float)this.y_1;
   }

   public void N(class09071 var1, float var2, float var3, String var4, float var5, float var6, class09102 var7) {
      this.N(var1, var2, var3, var5, var6, var7);
      int i = 0;

      while (i < var4.length()) {
         int j = var4.codePointAt(i);
         i += Character.charCount(j);
         this.N(null, j);
      }

      this.B();
      var7.y();
      this.W();
   }

   void N(class00405 var1, int var2) {
      switch (var2) {
         case 9:
            this.L_2 = (Float)this.L_2 + Math.round((Float)this.y_6 + (Float)this.y_4);
            this.y_5 = -1;
            this.y_6 = 0.0F;
            return;
         case 10:
            this.B();
            ((class09102)this.L_0).N();
            this.L_2 = (Float)this.L_1;
            this.y_0 = (Float)this.y_0 + (Float)this.y_3;
            this.y_2 = (float)Math.round((Float)this.y_0);
            this.y_5 = -1;
            return;
         case 11:
         case 12:
         default:
            if ((Integer)this.y_5 != -1) {
               float f = ((class09071)this.N_2).N((Integer)this.y_5, var2, (Float)this.N_3);
               this.L_2 = (Float)this.L_2 + Math.round((Float)this.y_6 + f);
            }

            if (!class09103.N(var1) && !class09103.N(var2) && ((class09071)this.N_2).y(var2)) {
               boolean flag = ((class09071)this.N_2).N(var2, (Float)this.N_3, (class09719)this.N_1);
               float f3 = ((class09071)this.N_2).N(var2, (Float)this.N_3);
               ((class09102)this.L_0).N(var2, var1, flag, (class09719)this.N_1, f3);
               this.y_6 = f3;
               this.y_5 = var2;
               return;
            }

            class09091 class09091 = class09103.N(var2, var1);
            float f1 = 0.0F;
            if (class09091 != null) {
               float f2 = (Float)this.y_3 / 9.0F;
               f1 = class09091.B() * f2;
               ((class09102)this.L_0).N(var2, var1, class09091, f2, f1);
            }

            this.y_6 = f1;
            this.y_5 = var2;
            return;
         case 13:
            this.y_5 = -1;
            this.y_6 = 0.0F;
      }
   }

   public void N(class09071 var1, float var2, float var3, class01028 var4, float var5, float var6, class09102 var7) {
      this.N(var1, var2, var3, var5, var6, var7);
      var4.accept((class09094)this.N_0);
      this.B();
      var7.y();
      this.W();
   }

   public float N() {
      return (Float)this.L_1;
   }

   private void N(class09071 var1, float var2, float var3, float var4, float var5, class09102 var6) {
      this.N_2 = var1;
      this.N_3 = var2;
      this.N_4 = var3 > 0.0F ? var3 : 1.0F;
      this.L_0 = var6;
      this.L_1 = var4 * (Float)this.N_4;
      this.L_2 = (Float)this.L_1;
      this.y_0 = var5 * (Float)this.N_4 + var1.y(var2);
      this.y_1 = (float)Math.round((Float)this.L_1);
      this.y_2 = (float)Math.round((Float)this.y_0);
      this.y_3 = var1.N(var2);
      this.y_4 = var1.N(32, var2) * 4.0F;
      this.y_5 = -1;
      this.y_6 = 0.0F;
   }

   private void W() {
      this.N_2 = null;
      this.L_0 = null;
   }

   public float R() {
      return (Float)this.L_2;
   }
}
