package NurikWare;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class04995;
import minecraft.class07003;
import minecraft.class08057;
import minecraft.class08067;
import minecraft.class08072;

public class class10869 implements class08067 {
   private final double y;
   private double L;
   private double u;
   private double i;
   private double R;
   private class00494 M;

   public double L(float var1) {
      return this.u;
   }

   public long L() {
      return 0L;
   }

   public void M() {
      this.z();
   }

   public class10869(class08057 var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.z();
   }

   public class08067 B() {
      return this;
   }

   public class00494 Z() {
      return this.M;
   }

   public class08072 i() {
      return class08072.field_12753;
   }

   private void z() {
      this.L = class04995.N(this.N.M() - this.y / 2.0, -this.N.U, this.N.U);
      this.u = class04995.N(this.N.B() - this.y / 2.0, -this.N.U, this.N.U);
      this.i = class04995.N(this.N.M() + this.y / 2.0, -this.N.U, this.N.U);
      this.R = class04995.N(this.N.B() + this.y / 2.0, -this.N.U, this.N.U);
      this.M = class00389.N(
         class00389.L,
         class00389.N(
            Math.floor(this.N(0.0F)),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.L(0.0F)),
            Math.ceil(this.y(0.0F)),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.u(0.0F))
         ),
         class07003.i
      );
   }

   public double u(float var1) {
      return this.R;
   }

   public double u() {
      return this.y;
   }

   public double y() {
      return 0.0;
   }

   public double y(float var1) {
      return this.i;
   }

   public double N() {
      return this.y;
   }

   public double N(float var1) {
      return this.L;
   }

   public void R() {
      this.z();
   }
}
