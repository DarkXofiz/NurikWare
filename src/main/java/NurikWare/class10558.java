package NurikWare;

import minecraft.class01317;
import minecraft.class04782;
import minecraft.class06165;
import minecraft.class07150;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07628;
import minecraft.class07879;
import minecraft.class08036;

public class class10558 implements class01317 {
   public class10558(class06165 var1) {
      super();
      this.N = var1;
   }

   public boolean method_18303(class07438 var1, class04782 var2) {
      if (var1 instanceof class06165) {
         return false;
      } else if (var1 instanceof class07628 || var1 instanceof class07879 || var1 instanceof class07150) {
         return true;
      } else if (var1 instanceof class07453) {
         return !((class07453)var1).NQ();
      } else if (var1 instanceof class08036 class08036 && (class08036.method_7325() || class08036.method_68878())) {
         return false;
      } else {
         return this.N.u(var1) ? false : !var1.method_6113() && !var1.method_21751();
      }
   }
}
