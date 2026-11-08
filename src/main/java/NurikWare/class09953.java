package NurikWare;

public final class class09953 {
   public static final int N = Integer.MAX_VALUE;
   public static final int y = 0;
   public static final int L = 1;
   private int[] u;
   private int[] i;
   private int[] R;
   private int M;
   private int B;
   private int Z;
   private int z;
   private int U;
   private int E;
   private int W;
   private int[] m;
   private int P;
   private int s;
   private int T;
   private int b;
   private static final int j = -2;
   private static final int v = -1;

   private boolean L(int var1, int var2) {
      this.y(var1, var2);
      if (this.b != -2 && this.T + var2 <= this.B && this.W != -1) {
         int ix = this.W;
         this.u[ix] = this.s;
         this.i[ix] = this.T + var2;
         this.W = this.R[ix];
         int jx = this.y(this.b);
         if (this.u[jx] < this.s) {
            int k = this.R[jx];
            this.R[jx] = ix;
            jx = k;
         } else {
            this.N(this.b, ix);
         }

         int i1 = this.s + var1;

         while (this.R[jx] != -1 && this.u[this.R[jx]] <= i1) {
            int l = this.R[jx];
            this.R[jx] = this.W;
            this.W = jx;
            jx = l;
         }

         this.R[ix] = jx;
         if (this.u[jx] < i1) {
            this.u[jx] = i1;
         }

         return true;
      } else {
         this.b = -2;
         return false;
      }
   }

   public class09953() {
      super();
   }

   private int y(int var1) {
      return var1 == -1 ? this.E : this.R[var1];
   }

   private int y(int var1, int var2, int var3) {
      int ix = var1;
      int jx = var2 + var3;
      int k = 0;
      int l = 0;
      int i1 = 0;

      while (this.u[ix] < jx) {
         int j1 = this.i[ix];
         int k1 = this.u[ix];
         int l1 = this.u[this.R[ix]];
         if (j1 > k) {
            l += i1 * (j1 - k);
            k = j1;
            i1 += k1 < var2 ? l1 - var2 : l1 - k1;
         } else {
            int i2 = l1 - k1;
            if (i2 + i1 > var3) {
               i2 = var3 - i1;
            }

            l += i2 * (k - j1);
            i1 += i2;
         }

         ix = this.R[ix];
      }

      this.P = l;
      return k;
   }

   private void y(int var1, int var2) {
      int ix = 1073741824;
      int jx = 1073741824;
      int k = 0;
      int l = -2;
      var1 = var1 + this.Z - 1;
      var1 -= var1 % this.Z;
      if (var1 <= this.M && var2 <= this.B) {
         int i1 = this.E;

         for (int j1 = -1; this.u[i1] + var1 <= this.M; i1 = this.R[i1]) {
            int k1 = this.y(i1, this.u[i1], var1);
            int l1 = this.P;
            if (this.z == 0) {
               if (k1 < jx) {
                  jx = k1;
                  l = j1;
               }
            } else if (k1 + var2 <= this.B && (k1 < jx || k1 == jx && l1 < ix)) {
               jx = k1;
               ix = l1;
               l = j1;
            }

            j1 = i1;
         }

         k = l == -2 ? 0 : this.u[this.y(l)];
         if (this.z == 1) {
            int l2 = this.E;
            i1 = this.E;
            int k2 = -1;

            while (this.u[l2] < var1) {
               l2 = this.R[l2];
            }

            for (; l2 != -1; l2 = this.R[l2]) {
               int i3;
               for (i3 = this.u[l2] - var1; this.u[this.R[i1]] <= i3; i1 = this.R[i1]) {
                  k2 = i1;
               }

               int i2 = this.y(i1, i3, var1);
               int j2 = this.P;
               if (i2 + var2 <= this.B && i2 <= jx && (i2 < jx || j2 < ix || j2 == ix && i3 < k)) {
                  k = i3;
                  jx = i2;
                  ix = j2;
                  l = k2;
               }
            }
         }

         this.b = l;
         this.s = k;
         this.T = jx;
      } else {
         this.b = -2;
         this.s = 0;
         this.T = 0;
      }
   }

   private static int y(int[] var0, class09957[] var1, int var2, int var3) {
      int ix = var2 + (var3 - var2 >>> 1);
      if (N(var1, var0[var2], var0[ix]) > 0) {
         N(var0, var2, ix);
      }

      if (N(var1, var0[var2], var0[var3]) > 0) {
         N(var0, var2, var3);
      }

      if (N(var1, var0[ix], var0[var3]) > 0) {
         N(var0, ix, var3);
      }

      N(var0, ix, var3);
      int jx = var0[var3];
      int k = var2 - 1;

      for (int l = var2; l < var3; l++) {
         if (N(var1, var0[l], jx) <= 0) {
            N(var0, ++k, l);
         }
      }

      N(var0, k + 1, var3);
      return k + 1;
   }

   private static int y(int[] var0, int[] var1, int[] var2, int var3, int var4) {
      int ix = var3 + (var4 - var3 >>> 1);
      if (N(var2, var1, var0[var3], var0[ix]) > 0) {
         N(var0, var3, ix);
      }

      if (N(var2, var1, var0[var3], var0[var4]) > 0) {
         N(var0, var3, var4);
      }

      if (N(var2, var1, var0[ix], var0[var4]) > 0) {
         N(var0, ix, var4);
      }

      N(var0, ix, var4);
      int jx = var0[var4];
      int k = var3 - 1;

      for (int l = var3; l < var4; l++) {
         if (N(var2, var1, var0[l], jx) <= 0) {
            N(var0, ++k, l);
         }
      }

      N(var0, k + 1, var4);
      return k + 1;
   }

   public void N(int var1) {
      this.z = var1;
   }

   private static int N(int[] var0, int[] var1, int var2, int var3) {
      int ix = var0[var3] - var0[var2];
      if (ix != 0) {
         return ix;
      } else {
         int jx = var1[var3] - var1[var2];
         return jx != 0 ? jx : var2 - var3;
      }
   }

   private static void N(int[] var0, int var1, int var2) {
      int ix = var0[var1];
      var0[var1] = var0[var2];
      var0[var2] = ix;
   }

   private static void N(int[] var0, class09957[] var1, int var2, int var3) {
      while (var2 < var3) {
         int ix = y(var0, var1, var2, var3);
         if (ix - var2 < var3 - ix) {
            N(var0, var1, var2, ix - 1);
            var2 = ix + 1;
         } else {
            N(var0, var1, ix + 1, var3);
            var3 = ix - 1;
         }
      }
   }

   public void N(int var1, int var2, int var3) {
      this.M = var1;
      this.B = var2;
      this.U = var3;
      this.z = 0;
      int ix = var3 + 2;
      if (this.u == null || this.u.length < ix) {
         this.u = new int[ix];
         this.i = new int[ix];
         this.R = new int[ix];
      }

      for (int jx = 0; jx < var3 - 1; jx++) {
         this.R[jx] = jx + 1;
      }

      this.R[var3 - 1] = -1;
      this.W = 0;
      int k = var3 + 1;
      this.u[var3] = 0;
      this.i[var3] = 0;
      this.R[var3] = k;
      this.u[k] = var1;
      this.i[k] = 1073741824;
      this.R[k] = -1;
      this.E = var3;
      this.N(false);
   }

   private static int N(class09957[] var0, int var1, int var2) {
      int ix = var0[var2].L - var0[var1].L;
      if (ix != 0) {
         return ix;
      } else {
         int jx = var0[var2].y - var0[var1].y;
         return jx != 0 ? jx : var0[var1].N - var0[var2].N;
      }
   }

   private void N(int var1, int var2) {
      if (var1 == -1) {
         this.E = var2;
      } else {
         this.R[var1] = var2;
      }
   }

   public boolean N(class09957[] var1, int var2) {
      if (this.m == null || this.m.length < var2) {
         this.m = new int[var2];
      }

      int ix = 0;

      while (ix < var2) {
         this.m[ix] = ix++;
      }

      N(this.m, var1, 0, var2 - 1);
      boolean flag = true;

      for (int jx = 0; jx < var2; jx++) {
         int k = this.m[jx];
         class09957 class09957 = var1[k];
         if (class09957.y == 0 || class09957.L == 0) {
            class09957.u = 0;
            class09957.i = 0;
            class09957.R = true;
         } else if (this.L(class09957.y, class09957.L)) {
            class09957.u = this.s;
            class09957.i = this.T;
            class09957.R = true;
         } else {
            class09957.u = Integer.MAX_VALUE;
            class09957.i = Integer.MAX_VALUE;
            class09957.R = false;
            flag = false;
         }
      }

      return flag;
   }

   public boolean N(int[] var1, int[] var2, int[] var3, int[] var4, int[] var5, boolean[] var6, int var7) {
      if (this.m == null || this.m.length < var7) {
         this.m = new int[var7];
      }

      int ix = 0;

      while (ix < var7) {
         this.m[ix] = ix++;
      }

      N(this.m, var2, var3, 0, var7 - 1);
      boolean flag = true;

      for (int jx = 0; jx < var7; jx++) {
         int k = this.m[jx];
         int l = var2[k];
         int i1 = var3[k];
         if (l == 0 || i1 == 0) {
            var4[k] = 0;
            var5[k] = 0;
            var6[k] = true;
         } else if (this.L(l, i1)) {
            var4[k] = this.s;
            var5[k] = this.T;
            var6[k] = true;
         } else {
            var4[k] = Integer.MAX_VALUE;
            var5[k] = Integer.MAX_VALUE;
            var6[k] = false;
            flag = false;
         }
      }

      return flag;
   }

   public void N(boolean var1) {
      this.Z = var1 ? 1 : (this.M + this.U - 1) / this.U;
   }

   private static void N(int[] var0, int[] var1, int[] var2, int var3, int var4) {
      while (var3 < var4) {
         int ix = y(var0, var1, var2, var3, var4);
         if (ix - var3 < var4 - ix) {
            N(var0, var1, var2, var3, ix - 1);
            var3 = ix + 1;
         } else {
            N(var0, var1, var2, ix + 1, var4);
            var4 = ix - 1;
         }
      }
   }
}
