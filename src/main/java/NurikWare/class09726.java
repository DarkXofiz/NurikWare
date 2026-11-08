package NurikWare;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.lwjgl.system.MemoryUtil;

final class class09726 {
   private final int N;
   private final int y;
   private final int L;
   private final ByteBuffer u;
   private int[] i;
   private int[] R;
   private int[] M;
   private int B;

   int L() {
      return this.L;
   }

   class09726(int var1, int var2, int var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = MemoryUtil.memCalloc(var1 * var2 * var3);
      this.i = new int[16];
      this.R = new int[16];
      this.M = new int[16];
      this.i[0] = 0;
      this.R[0] = 0;
      this.M[0] = var1;
      this.B = 1;
   }

   void i() {
      MemoryUtil.memFree(this.u);
   }

   ByteBuffer u() {
      return this.u;
   }

   private void y(int var1) {
      if (var1 > this.i.length) {
         int ix = Math.max(var1, this.i.length * 2);
         this.i = Arrays.copyOf(this.i, ix);
         this.R = Arrays.copyOf(this.R, ix);
         this.M = Arrays.copyOf(this.M, ix);
      }
   }

   int y() {
      return this.y;
   }

   private void N(int var1) {
      int ix = this.B - var1 - 1;
      if (ix > 0) {
         System.arraycopy(this.i, var1 + 1, this.i, var1, ix);
         System.arraycopy(this.R, var1 + 1, this.R, var1, ix);
         System.arraycopy(this.M, var1 + 1, this.M, var1, ix);
      }

      this.B--;
   }

   private void N(int var1, int var2, int var3, int var4) {
      this.y(this.B + 1);
      int ix = this.B - var1;
      if (ix > 0) {
         System.arraycopy(this.i, var1, this.i, var1 + 1, ix);
         System.arraycopy(this.R, var1, this.R, var1 + 1, ix);
         System.arraycopy(this.M, var1, this.M, var1 + 1, ix);
      }

      this.i[var1] = var2;
      this.R[var1] = var3;
      this.M[var1] = var4;
      this.B++;
   }

   void N(byte[] var1, int var2, int var3, int var4, int var5) {
      int ix = var2 * this.L;

      for (int j = 0; j < var3; j++) {
         int k = j * ix;
         int l = ((var5 + j) * this.N + var4) * this.L;
         this.u.put(l, var1, k, ix);
      }
   }

   void N(class09726 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long ix = MemoryUtil.memAddress(var1.u);
      long j = MemoryUtil.memAddress(this.u);
      int k = var4 * this.L;

      for (int l = 0; l < var5; l++) {
         long i1 = ix + (long)((var3 + l) * var1.N + var2) * this.L;
         long j1 = j + (long)((var7 + l) * this.N + var6) * this.L;
         MemoryUtil.memCopy(i1, j1, k);
      }
   }

   void N(int var1, int var2, int var3, int var4, byte[] var5) {
      int ix = var3 * this.L;

      for (int j = 0; j < var4; j++) {
         int k = ((var2 + j) * this.N + var1) * this.L;
         int l = j * ix;
         this.u.get(k, var5, l, ix);
      }
   }

   boolean N(int var1, int var2, int var3, int[] var4) {
      int ix = var1 + var3;
      int j = var2 + var3;
      if (ix <= this.N && j <= this.y) {
         int k = Integer.MAX_VALUE;
         int l = -1;
         int i1 = -1;

         for (int j1 = 0; j1 < this.B; j1++) {
            int k1 = this.N(j1, ix);
            if (k1 >= 0 && k1 + j <= this.y && (k1 < k || k1 == k && this.i[j1] < l)) {
               k = k1;
               l = this.i[j1];
               i1 = j1;
            }
         }

         if (i1 < 0) {
            return false;
         } else {
            this.N(i1, l, k, ix, j);
            var4[0] = l;
            var4[1] = k;
            return true;
         }
      } else {
         return false;
      }
   }

   int N() {
      return this.N;
   }

   private void N(int var1, int var2, int var3, int var4, int var5) {
      this.N(var1, var2, var3 + var5, var4);
      int ix = var2 + var4;
      int j = var1 + 1;

      while (j < this.B && this.i[j] < ix) {
         if (this.i[j] + this.M[j] > ix) {
            int k = ix - this.i[j];
            this.i[j] = this.i[j] + k;
            this.M[j] = this.M[j] - k;
            break;
         }

         this.N(j);
      }

      this.R();
   }

   private int N(int var1, int var2) {
      if (this.i[var1] + var2 > this.N) {
         return -1;
      } else {
         int ix = var2;
         int j = 0;

         for (int k = var1; ix > 0; k++) {
            if (k >= this.B) {
               return -1;
            }

            if (this.R[k] > j) {
               j = this.R[k];
            }

            ix -= this.M[k];
         }

         return j;
      }
   }

   private void R() {
      int ix = 1;

      while (ix < this.B) {
         if (this.R[ix] == this.R[ix - 1]) {
            this.M[ix - 1] = this.M[ix - 1] + this.M[ix];
            this.N(ix);
         } else {
            ix++;
         }
      }
   }
}
