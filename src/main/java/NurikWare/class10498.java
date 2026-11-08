package NurikWare;

import minecraft.class07209;

public class class10498 {
   private final class07209 N;
   private final double y;

   public class10498(class07209 var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public double N(class07209 var1) {
      double d0 = this.N.method_10262(var1);
      return d0 == 0.0 ? Double.POSITIVE_INFINITY : this.y / Math.sqrt(d0);
   }
}
