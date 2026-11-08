package NurikWare;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06202;
import minecraft.class07438;
import minecraft.class08036;

public class class11497 {
   public Object N_0;

   public class11497() {
      super();
      this.y();
      this.N_0 = class06202.Nq();
   }

   private void y() {
   }

   @class11782
   public void N(class10996 var1) {
      class11528.N();
   }

   private static void N(class07438 var0, class04891 var1) {
      class06202 class06202 = class06202.Nq();
      if ((class03448)class06202.T_3 != null) {
         ((class03448)class06202.T_3).method_55116(var0, var1, var0.method_5634(), 1.0F, 0.8F + var0.method_59922().z() * 0.4F);
      }
   }

   @class11782
   public void N(class11373 var1) {
      if ((class04453)((class06202)this.N_0).T_4 != null && var1.N() instanceof class08036 class08036) {
         if (class11528.N(class08036, ((class04453)((class06202)this.N_0).T_4).method_73189(), true) && !class11528.N((class04453)((class06202)this.N_0).T_4)) {
            N(class08036, (class04891)class04909.wV.N());
         }
      }
   }

   public static void N(class07438 var0) {
      N(var0, (class04891)class04909.we.N());
   }
}
