package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;

public class class11687 extends class11807<AutoSwap> {
   public class11687(AutoSwap var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   private void u() {
      class06584 class06584 = ((class04453)((class06202)super.N_0).T_4).method_6079();
      class11679 class11679x = (class11679)((class11517)((AutoSwap)super.N_1).R_5).i();
      class11679 class11679x = (class11679)((class11517)((AutoSwap)super.N_1).R_6).i();
      if (((class11328)class11679x.N_0).test(class06584)) {
         ((AutoSwap)super.N_1).N(class11679x::N);
      } else if (((class11328)class11679x.N_0).test(class06584)) {
         ((AutoSwap)super.N_1).N(class11679x::N);
      } else if (!((AutoSwap)super.N_1).N(class11679x::N)) {
         ((AutoSwap)super.N_1).N(class11679x::N);
      }
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class11389 class11389) {
         if (this.N(class11389)) {
            return;
         }

         class11938.Z().N(this::u);
      }
   }

   private boolean N(class11389 var1) {
      class11527 class11527 = (class11527)((AutoSwap)super.N_1).u_0;
      return !var1.y(class11527.i(), class11527.L());
   }
}
