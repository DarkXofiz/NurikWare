package NurikWare;

import minecraft.class00405;
import minecraft.class05197;

public class class09070 implements class05197 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   float L() {
      return ((Integer)this.N_1).intValue() * (Float)this.N_0;
   }

   class09070() {
      super();
      this.u();
   }

   public boolean accept(int var1, class00405 var2, int var3) {
      if (var3 == 10) {
         this.N_1 = (Integer)this.N_1 + 1;
      }

      return true;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0;
      }
   }

   void N(float var1) {
      this.N_0 = var1;
      this.N_1 = 1;
   }
}
