package NurikWare;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class04995;
import minecraft.class07003;
import minecraft.class08057;
import minecraft.class08067;
import minecraft.class08072;

public class class10871 implements class08067 {
   private final double y;
   private final double L;
   private final long u;
   private final long i;
   private final double R;
   private long M;
   private double B;
   private double Z;

   public double L(float var1) {
      return class04995.N(this.N.B() - class04995.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public long L() {
      return this.M;
   }

   public void M() {
   }

   public class10871(class08057 var1, double var2, double var4, long var6, long var8) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var4;
      this.R = var6;
      this.M = var6;
      this.i = var8;
      this.u = this.i + var6;
      double d0 = this.U();
      this.B = d0;
      this.Z = d0;
   }

   public class08067 B() {
      this.M--;
      this.Z = this.B;
      this.B = this.U();
      if (this.M <= 0L) {
         this.N.method_80();
         return new class10869(this.N, this.L);
      } else {
         return this;
      }
   }

   public class00494 Z() {
      return class00389.N(
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

   public class08072 i() {
      return this.L < this.y ? class08072.field_12756 : class08072.field_12754;
   }

   private double U() {
      double d0 = (this.R - this.M) / this.R;
      return d0 < 1.0 ? class04995.u(d0, this.y, this.L) : this.L;
   }

   public double z() {
      return this.Z;
   }

   public double u(float var1) {
      return class04995.N(this.N.B() + class04995.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public double u() {
      return this.L;
   }

   public double y(float var1) {
      return class04995.N(this.N.M() + class04995.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public double y() {
      return Math.abs(this.y - this.L) / (this.u - this.i);
   }

   public double N(float var1) {
      return class04995.N(this.N.M() - class04995.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public double N() {
      return this.B;
   }

   public void R() {
   }
}
