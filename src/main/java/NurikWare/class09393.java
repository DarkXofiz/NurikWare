package NurikWare;

import minecraft.class00394;
import minecraft.class00399;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class03795;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07000;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07237;
import minecraft.class08711;

public class class09393 extends class01989 {
   public class09393() {
      super();
   }

   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 class04782 = var1.y();
      class07211 class07211 = (class07211)var1.u().L(class06758.y);
      class07209 class07209 = var1.L().method_10093(class07211);
      if (class04782.R(class07209) && class00399.y(class04782, class07209, var2)) {
         class04782.method_8652(class07209, (class00500)class00869.Bl.W().y(class07000.i, class03795.N(class07211)), 3);
         class04782.N(null, class01194.Z, class07209);
         class00394 class00394 = class04782.method_8321(class07209);
         if (class00394 instanceof class07237) {
            class00399.N(class04782, class07209, (class07237)class00394);
         }

         var2.B(1);
         this.N(true);
      } else {
         this.N(class08711.y(var1, var2));
      }

      return var2;
   }
}
