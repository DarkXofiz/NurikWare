package NurikWare;

import minecraft.class05143;
import minecraft.class05169;
import minecraft.class06069;
import minecraft.class06433;
import minecraft.class06476;
import minecraft.class07211;

public class class10493 implements class05143 {
   public class10493() {
      super();
   }

   public boolean N(class06433 var1) {
      return var1.L[class07211.field_11036.L()] && !var1.y[class07211.field_11036.L()].u;
   }

   public class06476 N(class07211 var1, class06433 var2, class06069 var3) {
      var2.u = true;
      var2.y[class07211.field_11036.L()].u = true;
      return new class05169(var1, var2);
   }
}
