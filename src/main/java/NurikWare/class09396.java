package NurikWare;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01338;
import minecraft.class01989;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09396 extends class01989 {
   public class09396() {
      super();
   }

   public class06584 N(class07210 var1, class06584 var2) {
      class07211 class07211 = (class07211)var1.u().L(class06758.y);
      class07209 class07209 = var1.L().method_10093(class07211);
      class04782 class04782 = var1.y();
      class00500 class00500 = class04782.method_8320(class07209);
      this.N(true);
      if (class00500.N(class00869.TE)) {
         if ((Integer)class00500.L(class01338.u) != 4) {
            class01338.N(null, class04782, class07209, class00500);
            var2.B(1);
         } else {
            this.N(false);
         }

         return var2;
      } else {
         return super.N(var1, var2);
      }
   }
}
