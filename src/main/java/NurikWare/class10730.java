package NurikWare;

import com.google.common.collect.AbstractIterator;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;

public class class10730 extends AbstractIterator<class07209> {
   private final class07218 z;
   private int U;
   private int E;
   private int W;
   private boolean m;
   private final int P;
   private final int s;
   private final int T;
   private final int b;
   private final int j;
   private final int v;
   private final int n;
   private final int t;
   private final int G;

   public class10730(class07211 var1, class07211 var2, class07211 var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
      this.z = new class07218();
      this.P = this.N.P();
      this.s = this.N.s();
      this.T = this.N.T();
      this.b = this.y.P();
      this.j = this.y.s();
      this.v = this.y.T();
      this.n = this.L.P();
      this.t = this.L.s();
      this.G = this.L.T();
   }

   protected class07209 computeNext() {
      if (this.m) {
         return (class07209)this.endOfData();
      } else {
         this.z
            .N(
               this.u + this.P * this.U + this.b * this.E + this.n * this.W,
               this.i + this.s * this.U + this.j * this.E + this.t * this.W,
               this.R + this.T * this.U + this.v * this.E + this.G * this.W
            );
         if (this.W < this.M) {
            this.W++;
         } else if (this.E < this.B) {
            this.E++;
            this.W = 0;
         } else if (this.U < this.Z) {
            this.U++;
            this.W = 0;
            this.E = 0;
         } else {
            this.m = true;
         }

         return this.z;
      }
   }
}
