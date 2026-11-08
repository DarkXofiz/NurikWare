package NurikWare;

import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08036;

public class class10894 extends class11807<Speed> {
   public class10894(Speed var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10996) {
         class00734 class00734 = ((class04453)((class06202)super.N_0).T_4).method_5829().L(1.0, 0.0, 1.0);
         if (((class03448)((class06202)super.N_0).T_3).N(class08036.class, class00734).size() > 1) {
            ((class11822)((class04453)((class06202)super.N_0).T_4)).dataManager().L().N(4.0F);
         }
      }
   }
}
