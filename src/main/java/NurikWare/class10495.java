package NurikWare;

import minecraft.class05143;
import minecraft.class05144;
import minecraft.class06069;
import minecraft.class06433;
import minecraft.class06476;
import minecraft.class07211;

public class class10495 implements class05143 {
   public class10495() {
      super();
   }

   public boolean N(class06433 var1) {
      if (var1.L[class07211.field_11034.L()]
         && !var1.y[class07211.field_11034.L()].u
         && var1.L[class07211.field_11036.L()]
         && !var1.y[class07211.field_11036.L()].u) {
         class06433 class06433 = var1.y[class07211.field_11034.L()];
         return class06433.L[class07211.field_11036.L()] && !class06433.y[class07211.field_11036.L()].u;
      } else {
         return false;
      }
   }

   public class06476 N(class07211 var1, class06433 var2, class06069 var3) {
      var2.u = true;
      var2.y[class07211.field_11034.L()].u = true;
      var2.y[class07211.field_11036.L()].u = true;
      var2.y[class07211.field_11034.L()].y[class07211.field_11036.L()].u = true;
      return new class05144(var1, var2);
   }
}
