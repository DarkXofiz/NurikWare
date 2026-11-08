package NurikWare;

import com.google.common.collect.AbstractIterator;
import minecraft.class07209;
import minecraft.class07218;

public class class10729 extends AbstractIterator<class07209> {
   private final class07218 B;
   private int Z;
   private int z;
   private int U;
   private int E;
   private int W;
   private boolean m;

   public class10729(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = new class07218();
   }

   protected class07209 computeNext() {
      if (this.m) {
         this.m = false;
         this.B.method_20788(this.N - (this.B.method_10260() - this.N));
         return this.B;
      } else {
         class07218 class07218;
         for (class07218 = null; class07218 == null; this.W++) {
            if (this.W > this.U) {
               this.E++;
               if (this.E > this.z) {
                  this.Z++;
                  if (this.Z > this.y) {
                     return (class07209)this.endOfData();
                  }

                  this.z = Math.min(this.L, this.Z);
                  this.E = -this.z;
               }

               this.U = Math.min(this.u, this.Z - Math.abs(this.E));
               this.W = -this.U;
            }

            int ix = this.E;
            int j = this.W;
            int k = this.Z - Math.abs(ix) - Math.abs(j);
            if (k <= this.i) {
               this.m = k != 0;
               class07218 = this.B.N(this.R + ix, this.M + j, this.N + k);
            }
         }

         return class07218;
      }
   }
}
