package NurikWare;

import minecraft.class01830;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;
import minecraft.class07321;

public class class09530 implements class01830, class03894 {
   private final class03877 N;
   private long y = class07321.L;
   private double L;

   public class09530(class03877 var1) {
      super();
      this.N = var1;
   }

   public class03909 i() {
      return class03909.field_36564;
   }

   public class03877 u() {
      return this.N;
   }

   public double N(class03875 var1) {
      int i = var1.y();
      int j = var1.u();
      long k = class07321.u(i, j);
      if (this.y == k) {
         return this.L;
      } else {
         this.y = k;
         double d0 = this.N.N(var1);
         this.L = d0;
         return d0;
      }
   }

   public void N(double[] var1, class03912 var2) {
      this.N.N(var1, var2);
   }
}
