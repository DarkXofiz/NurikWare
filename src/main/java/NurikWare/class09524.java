package NurikWare;

import minecraft.class01830;
import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;
import org.jspecify.annotations.Nullable;

public class class09524 implements class01830, class03894 {
   private final class03877 y;
   private long L;
   private long M;
   private double B;
   @Nullable
   private double[] Z;

   public class09524(class01837 var1, class03877 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class03909 i() {
      return class03909.field_36565;
   }

   public class03877 u() {
      return this.y;
   }

   public double N(class03875 var1) {
      if (var1 != this.N) {
         return this.y.N(var1);
      } else if (this.Z != null && this.M == this.N.b) {
         return this.Z[this.N.j];
      } else if (this.L == this.N.T) {
         return this.B;
      } else {
         this.L = this.N.T;
         double d0 = this.y.N(var1);
         this.B = d0;
         return d0;
      }
   }

   public void N(double[] var1, class03912 var2) {
      if (this.Z != null && this.M == this.N.b) {
         System.arraycopy(this.Z, 0, var1, 0, var1.length);
      } else {
         this.u().N(var1, var2);
         if (this.Z != null && this.Z.length == var1.length) {
            System.arraycopy(var1, 0, this.Z, 0, var1.length);
         } else {
            this.Z = (double[])var1.clone();
         }

         this.M = this.N.b;
      }
   }
}
