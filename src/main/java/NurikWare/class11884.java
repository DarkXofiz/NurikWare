package NurikWare;

import minecraft.class00734;
import minecraft.class06889;
import minecraft.class07209;
import org.joml.Vector3d;

public class class11884 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;

   public void L(double var1) {
      this.N_1 = var1;
   }

   public static class11884 L() {
      return new class11884(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   }

   public void M(double var1) {
      this.N_5 = var1;
   }

   public double M() {
      return (Double)this.N_1;
   }

   public class11884(double var1, double var3, double var5, double var7, double var9, double var11) {
      super();
      this.E();
      this.N_0 = Math.min(var1, var7);
      this.N_1 = Math.min(var3, var9);
      this.N_2 = Math.min(var5, var11);
      this.N_3 = Math.max(var1, var7);
      this.N_4 = Math.max(var3, var9);
      this.N_5 = Math.max(var5, var11);
   }

   public class11884 i(double var1) {
      return this.y(var1, var1, var1);
   }

   public double i() {
      return (Double)this.N_0;
   }

   public double u() {
      return (Double)this.N_5;
   }

   public void u(double var1) {
      this.N_3 = var1;
   }

   public class11884 y(double var1, double var3, double var5) {
      double d0 = (Double)this.N_0 - var1;
      double d1 = (Double)this.N_1 - var3;
      double d2 = (Double)this.N_2 - var5;
      double d3 = (Double)this.N_3 + var1;
      double d4 = (Double)this.N_4 + var3;
      double d5 = (Double)this.N_5 + var5;
      return this.N(d0, d1, d2, d3, d4, d5);
   }

   public double y() {
      return (Double)this.N_4;
   }

   public void y(double var1) {
      this.N_4 = var1;
   }

   public class11884 y(class07209 var1) {
      this.N(var1.method_10263());
      this.L(var1.method_10264());
      this.R(var1.method_10260());
      this.u(var1.method_10263() + 1);
      this.y(var1.method_10264() + 1);
      this.M(var1.method_10260() + 1);
      return this;
   }

   private void E() {
      this.N_0 = 0.0;
      this.N_1 = 0.0;
      this.N_2 = 0.0;
      this.N_3 = 0.0;
      this.N_4 = 0.0;
      this.N_5 = 0.0;
   }

   public class11884 N(Vector3d var1) {
      return this.N(var1.x, var1.y, var1.z);
   }

   public class11884 N(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.N(var1);
      this.L(var3);
      this.R(var5);
      this.u(var7);
      this.y(var9);
      this.M(var11);
      return this;
   }

   public static class11884 N(class07209 var0) {
      return new class11884(
         var0.method_10263(), var0.method_10264(), var0.method_10260(), var0.method_10263() + 1, var0.method_10264() + 1, var0.method_10260() + 1
      );
   }

   public static class11884 N(class00734 var0) {
      return new class11884(var0.N, var0.y, var0.L, var0.u, var0.i, var0.R);
   }

   public class11884 N(class06889 var1) {
      return this.N(var1.M, var1.B, var1.Z);
   }

   public static class11884 N(class11884 var0) {
      return new class11884((Double)var0.N_0, (Double)var0.N_1, (Double)var0.N_2, (Double)var0.N_3, (Double)var0.N_4, (Double)var0.N_5);
   }

   public double N() {
      return (Double)this.N_3;
   }

   public void N(double var1) {
      this.N_0 = var1;
   }

   public class11884 N(double var1, double var3, double var5) {
      double d0 = (Double)this.N_0;
      double d1 = (Double)this.N_1;
      double d2 = (Double)this.N_2;
      double d3 = (Double)this.N_3;
      double d4 = (Double)this.N_4;
      double d5 = (Double)this.N_5;
      if (var1 < 0.0) {
         d0 += var1;
      } else if (var1 > 0.0) {
         d3 += var1;
      }

      if (var3 < 0.0) {
         d1 += var3;
      } else if (var3 > 0.0) {
         d4 += var3;
      }

      if (var5 < 0.0) {
         d2 += var5;
      } else if (var5 > 0.0) {
         d5 += var5;
      }

      return this.N(d0, d1, d2, d3, d4, d5);
   }

   public void R(double var1) {
      this.N_2 = var1;
   }

   public double R() {
      return (Double)this.N_2;
   }
}
