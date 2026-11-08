package NurikWare;

import minecraft.class01955;
import minecraft.class06584;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class08036;

public class class10748 implements class01955 {
   public class10748(class07079 var1, class07085 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public void N(class06584 var1) {
      this.y.method_5673(this.N, var1);
      if (!var1.R()) {
         this.y.N(this.N);
         this.y.NW();
      }
   }

   public class06584 N() {
      return this.y.method_6118(this.N);
   }

   public boolean method_5443(class08036 var1) {
      return var1.method_5854() == this.y || var1.method_56094(this.y, 4.0);
   }

   public void method_5431() {
   }
}
