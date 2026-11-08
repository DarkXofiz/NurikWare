package NurikWare;

import minecraft.class01989;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class06944;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09394 extends class01989 {
   public class09394() {
      super();
   }

   protected class06584 N(class07210 var1, class06584 var2) {
      this.N(true);
      class04782 class04782 = var1.y();
      class07209 class07209 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      if (!class06944.N(var2, class04782, class07209) && !class06944.N(var2, class04782, class07209, null)) {
         this.N(false);
      } else if (!class04782.method_8608()) {
         class04782.N(1505, class07209, 15);
      }

      return var2;
   }
}
