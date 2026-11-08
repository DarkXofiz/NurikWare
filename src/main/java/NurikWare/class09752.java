package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;

final class class09752 {
   static final int N = -2;
   static final int y = -1;
   private final Int2IntOpenHashMap L = new Int2IntOpenHashMap(256, 0.7F);
   private int[] u;
   private float[] i;
   private float[] R;
   private float[] M;
   private float[] B;
   private float[] Z;
   private int[] z;
   private int[] U;
   private int[] E;
   private int[] W;
   private int[] m;
   private int P;

   int L(int var1) {
      return this.L.get(var1);
   }

   float M(int var1) {
      return this.M[var1];
   }

   private void P(int var1) {
      if (var1 > this.u.length) {
         int ix = Math.max(var1, this.u.length * 2);
         this.u = Arrays.copyOf(this.u, ix);
         this.i = Arrays.copyOf(this.i, ix);
         this.R = Arrays.copyOf(this.R, ix);
         this.M = Arrays.copyOf(this.M, ix);
         this.B = Arrays.copyOf(this.B, ix);
         this.Z = Arrays.copyOf(this.Z, ix);
         this.z = Arrays.copyOf(this.z, ix);
         this.U = Arrays.copyOf(this.U, ix);
         this.E = Arrays.copyOf(this.E, ix);
         this.W = Arrays.copyOf(this.W, ix);
         this.m = Arrays.copyOf(this.m, ix);
      }
   }

   class09752() {
      super();
      this.L.defaultReturnValue(-2);
      short short1 = 256;
      this.u = new int[short1];
      this.i = new float[short1];
      this.R = new float[short1];
      this.M = new float[short1];
      this.B = new float[short1];
      this.Z = new float[short1];
      this.z = new int[short1];
      this.U = new int[short1];
      this.E = new int[short1];
      this.W = new int[short1];
      this.m = new int[short1];
   }

   float B(int var1) {
      return this.B[var1];
   }

   float Z(int var1) {
      return this.Z[var1];
   }

   float i(int var1) {
      return this.i[var1];
   }

   int m(int var1) {
      return this.m[var1];
   }

   int U(int var1) {
      return this.U[var1];
   }

   int z(int var1) {
      return this.z[var1];
   }

   int u(int var1) {
      return this.u[var1];
   }

   void y(int var1) {
      this.L.put(var1, -1);
   }

   int E(int var1) {
      return this.E[var1];
   }

   void N(int var1, float var2, int var3, int var4, float var5, float var6, class09719 var7) {
      var7.N = this.i[var1] * var2;
      var7.y = this.R[var1] * var2;
      var7.L = this.M[var1] * var2;
      var7.u = this.B[var1] * var2;
      if (this.E[var1] > 0) {
         float f = 1.0F / var3;
         float f1 = 1.0F / var4;
         var7.i = this.z[var1] * f;
         var7.R = this.U[var1] * f1;
         var7.M = (this.z[var1] + this.E[var1]) * f;
         var7.B = (this.U[var1] + this.W[var1]) * f1;
      } else {
         var7.i = var7.R = var7.M = var7.B = 0.0F;
      }

      var7.Z = this.Z[var1] * var2;
      var7.z = var5 * var2 / var6;
      var7.U = this.m[var1];
   }

   void N(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.z[var1] = var2;
      this.U[var1] = var3;
      this.E[var1] = var4;
      this.W[var1] = var5;
      this.m[var1] = var6;
   }

   int N(int var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      int ix = this.P++;
      this.P(this.P);
      this.u[ix] = var1;
      this.i[ix] = var2;
      this.R[ix] = var3;
      this.M[ix] = var4;
      this.B[ix] = var5;
      this.Z[ix] = var6;
      this.z[ix] = var7;
      this.U[ix] = var8;
      this.E[ix] = var9;
      this.W[ix] = var10;
      this.m[ix] = var11;
      this.L.put(var1, ix);
      return ix;
   }

   int N() {
      return this.P;
   }

   int N(int var1) {
      return this.L.get(var1);
   }

   int N(class09750 var1) {
      int ix = this.P++;
      this.P(this.P);
      this.u[ix] = var1.N();
      this.i[ix] = var1.y();
      this.R[ix] = var1.L();
      this.M[ix] = var1.u();
      this.B[ix] = var1.i();
      this.Z[ix] = var1.R();
      this.z[ix] = var1.M();
      this.U[ix] = var1.B();
      this.E[ix] = var1.Z();
      this.W[ix] = var1.z();
      this.m[ix] = var1.U();
      this.L.put(var1.N(), ix);
      return ix;
   }

   int W(int var1) {
      return this.W[var1];
   }

   float R(int var1) {
      return this.R[var1];
   }
}
