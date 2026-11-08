package NurikWare;

import minecraft.class00500;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class04782;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09390 extends class07206 {
   public class09390() {
      super();
   }

   public class06584 N(class07210 var1, class06584 var2) {
      class04782 class04782 = var1.y();
      class07209 class07209 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      class00500 class00500 = class04782.method_8320(class07209);
      class00891 class00891 = class00500.i();
      if (class00891 instanceof class00886) {
         class06584 class06584 = ((class00886)class00891).N(null, class04782, class07209, class00500);
         if (class06584.R()) {
            return super.N(var1, var2);
         } else {
            class04782.N(null, class01194.d, class07209);
            class06581 class06581 = class06584.B();
            return this.N(var1, var2, new class06584(class06581));
         }
      } else {
         return super.N(var1, var2);
      }
   }
}
