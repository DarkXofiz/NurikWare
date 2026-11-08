package NurikWare;

import minecraft.class04522;

public class class10434 implements class04522 {
   private final float N;
   private double y = Double.MIN_VALUE;

   public class10434(float var1) {
      super();
      this.N = var1;
   }

   public boolean method_34792(double var1) {
      boolean flag;
      if (this.y != Double.MIN_VALUE && !(var1 <= this.y)) {
         flag = (var1 - this.y) / this.y >= this.N;
      } else {
         flag = false;
      }

      this.y = var1;
      return flag;
   }
}
