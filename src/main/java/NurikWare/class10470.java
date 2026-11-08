package NurikWare;

import java.util.function.Predicate;
import minecraft.class04803;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07438;

public class class10470 implements class04803 {
   public class10470(class07438 var1, class07085 var2, Predicate var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public class06584 N() {
      return this.N.method_6118(this.y);
   }

   public boolean N(class06584 var1) {
      if (!this.L.test(var1)) {
         return false;
      } else {
         this.N.method_5673(this.y, var1);
         return true;
      }
   }
}
