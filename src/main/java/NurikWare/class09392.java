package NurikWare;

import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02484;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07107;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09392 extends class07206 {
   private final class07206 N = new class07206();

   public class09392() {
      super();
   }

   public class06584 N(class07210 var1, class06584 var2) {
      if (!((class06517)var2.a_(class02484.h, class06517.N)).N(class06506.N)) {
         return this.N.dispense(var1, var2);
      } else {
         class04782 class04782 = var1.y();
         class07209 class07209x = var1.L();
         class07209 class07209x = var1.L().method_10093((class07211)var1.u().L(class06758.y));
         if (!class04782.method_8320(class07209x).N(class01210.Lw)) {
            return this.N.dispense(var1, var2);
         } else {
            if (!class04782.method_8608()) {
               for (int i = 0; i < 5; i++) {
                  class04782.method_65096(
                     class07107.NT,
                     class07209x.method_10263() + class04782.field_9229.U(),
                     class07209x.method_10264() + 1,
                     class07209x.method_10260() + class04782.field_9229.U(),
                     1,
                     0.0,
                     0.0,
                     0.0,
                     1.0
                  );
               }
            }

            class04782.method_8396(null, class07209x, class04909.Lc, class04911.field_15245, 1.0F, 1.0F);
            class04782.N(null, class01194.w, class07209x);
            class04782.method_8501(class07209x, class00869.nB.W());
            return this.N(var1, var2, new class06584(class06570.nP));
         }
      }
   }
}
