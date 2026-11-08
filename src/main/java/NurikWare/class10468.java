package NurikWare;

import java.util.Map;
import minecraft.class00780;
import minecraft.class03543;
import minecraft.class04426;
import minecraft.class04758;
import minecraft.class06040;
import minecraft.class07428;
import minecraft.class07852;

public class class10468 {
   private final class03543<class00780> N;
   private Map<class07428, class04426> y = class04758.i.y();
   private class07852 L = class04758.i.L();
   private class06040 u = class04758.i.u();

   public class10468(class03543<class00780> var1) {
      super();
      this.N = var1;
   }

   public class04758 N() {
      return new class04758(this.N, this.y, this.L, this.u);
   }

   public class10468 N(class06040 var1) {
      this.u = var1;
      return this;
   }

   public class10468 N(class07852 var1) {
      this.L = var1;
      return this;
   }

   public class10468 N(Map<class07428, class04426> var1) {
      this.y = var1;
      return this;
   }
}
