package NurikWare;

import minecraft.class01194;
import minecraft.class06113;
import minecraft.class06530;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07078;
import minecraft.class07206;
import minecraft.class07210;
import minecraft.class07211;

public class class09395 extends class07206 {
   public class09395() {
      super();
   }

   public class06584 N(class07210 var1, class06584 var2) {
      class07211 class07211 = (class07211)var1.u().L(class06758.y);
      class07078<?> class07078 = ((class06530)var2.B()).u(var2);
      if (class07078 == null) {
         return var2;
      } else {
         try {
            class07078.N(var1.y(), var2, null, var1.L().method_10093(class07211), class06113.field_16470, class07211 != class07211.field_11036, false);
         } catch (Exception exception) {
            y.error("Error while dispensing spawn egg from dispenser at {}", var1.L(), exception);
            return class06584.E;
         }

         var2.B(1);
         var1.y().N(null, class01194.v, var1.L());
         return var2;
      }
   }
}
