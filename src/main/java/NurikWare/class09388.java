package NurikWare;

import minecraft.class00869;
import minecraft.class00885;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class08711;

public class class09388 extends class01989 {
   public class09388() {
      super();
   }

   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 class04782 = var1.y();
      class07209 class07209 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      class00885 class00885 = (class00885)class00869.iK;
      if (class04782.R(class07209) && class00885.N(class04782, class07209)) {
         if (!class04782.method_8608()) {
            class04782.method_8652(class07209, class00885.W(), 3);
            class04782.N(null, class01194.Z, class07209);
         }

         var2.B(1);
         this.N(true);
      } else {
         this.N(class08711.y(var1, var2));
      }

      return var2;
   }
}
