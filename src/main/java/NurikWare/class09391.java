package NurikWare;

import minecraft.class04782;
import minecraft.class04799;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09391 extends class07206 {
   private final class07206 N = new class07206();

   public class09391() {
      super();
   }

   public class06584 N(class07210 var1, class06584 var2) {
      class04799 class04799 = (class04799)var2.B();
      class07209 class07209 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      class04782 class04782 = var1.y();
      if (class04799.N(null, class04782, class07209, null)) {
         class04799.N(null, class04782, var2, class07209);
         return this.N(var1, var2, new class06584(class06570.jU));
      } else {
         return this.N.dispense(var1, var2);
      }
   }
}
