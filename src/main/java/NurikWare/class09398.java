package NurikWare;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class01989;
import minecraft.class02859;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09398 extends class01989 {
   public class09398() {
      super();
   }

   public class06584 N(class07210 var1, class06584 var2) {
      class07209 class07209 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      class04782 class04782 = var1.y();
      Optional<class00500> optional = class02859.N(class04782.method_8320(class07209));
      if (optional.isPresent()) {
         class04782.method_8501(class07209, optional.get());
         class04782.N(3003, class07209, 0);
         var2.B(1);
         this.N(true);
         return var2;
      } else {
         return super.N(var1, var2);
      }
   }
}
