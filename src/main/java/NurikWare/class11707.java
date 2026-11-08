package NurikWare;

import minecraft.class04453;
import minecraft.class06202;

public class class11707 extends class11807<AutoLeave> {
   public Object y_0;
   public boolean y_init;

   public class11707(AutoLeave var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.u();
   }

   private void u() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }

   @Override
   public void y(Object var1) {
      this.u();
      if (((class11822)((class04453)((class06202)super.N_0).T_4)).dataManager().y().N().N()) {
         this.y_0 = true;
      } else {
         if ((Boolean)this.y_0) {
            this.y_0 = false;
            ((AutoLeave)super.N_1).m();
         }
      }
   }
}
