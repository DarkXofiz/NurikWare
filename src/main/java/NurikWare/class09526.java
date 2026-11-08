package NurikWare;

import minecraft.class01830;
import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;
import minecraft.class04995;

public class class09526 implements class01830, class03894 {
   public double[][] N;
   public double[][] y;
   private final class03877 M;
   private double B;
   private double Z;
   private double z;
   private double U;
   private double E;
   private double W;
   private double m;
   private double P;
   private double s;
   private double T;
   private double b;
   private double j;
   private double v;
   private double n;
   private double t;

   public void L(double var1) {
      this.t = class04995.u(var1, this.v, this.n);
   }

   public class09526(class01837 var1, class03877 var2) {
      super();
      this.L = var1;
      this.M = var2;
      this.N = this.y(var1.y, var1.N);
      this.y = this.y(var1.y, var1.N);
      var1.R.add(this);
   }

   public class03909 i() {
      return class03909.field_36562;
   }

   public class03877 u() {
      return this.M;
   }

   private double[][] y(int var1, int var2) {
      int i = var2 + 1;
      int jx = var1 + 1;
      double[][] adouble = new double[i][jx];

      for (int k = 0; k < i; k++) {
         adouble[k] = new double[jx];
      }

      return adouble;
   }

   public void y(double var1) {
      this.v = class04995.u(var1, this.s, this.T);
      this.n = class04995.u(var1, this.b, this.j);
   }

   public void N(int var1, int var2) {
      this.B = this.N[var2][var1];
      this.Z = this.N[var2 + 1][var1];
      this.z = this.y[var2][var1];
      this.U = this.y[var2 + 1][var1];
      this.E = this.N[var2][var1 + 1];
      this.W = this.N[var2 + 1][var1 + 1];
      this.m = this.y[var2][var1 + 1];
      this.P = this.y[var2 + 1][var1 + 1];
   }

   public void N(double[] var1, class03912 var2) {
      if (this.L.E) {
         var2.N(var1, this);
      } else {
         this.u().N(var1, var2);
      }
   }

   public double N(class03875 var1) {
      if (var1 != this.L) {
         return this.M.N(var1);
      } else if (!this.L.U) {
         throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
      } else {
         return this.L.E
            ? class04995.N(
               (double)this.L.m / this.L.Z,
               (double)this.L.P / this.L.z,
               (double)this.L.s / this.L.Z,
               this.B,
               this.z,
               this.E,
               this.m,
               this.Z,
               this.U,
               this.W,
               this.P
            )
            : this.t;
      }
   }

   public void N(double var1) {
      this.s = class04995.u(var1, this.B, this.E);
      this.T = class04995.u(var1, this.z, this.m);
      this.b = class04995.u(var1, this.Z, this.W);
      this.j = class04995.u(var1, this.U, this.P);
   }

   public void W() {
      double[][] adouble = this.N;
      this.N = this.y;
      this.y = adouble;
   }
}
