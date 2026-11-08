package NurikWare;

final class class09721 {
   private final int[] N;
   private final int[] y;
   private final int[] L;
   private final int[] u;
   private int i;
   private boolean R;

   class09960[] L() {
      class09960[] aclass09960 = this.y();
      this.u();
      return aclass09960;
   }

   class09721(int var1) {
      super();
      this.N = new int[var1];
      this.y = new int[var1];
      this.L = new int[var1];
      this.u = new int[var1];
   }

   void u() {
      this.i = 0;
      this.R = false;
   }

   private void y(int var1, int var2, int var3, int var4) {
      int ix = var1;
      int j = var2;
      int k = var1 + var3;
      int l = var2 + var4;

      for (int i1 = 0; i1 < this.i; i1++) {
         ix = Math.min(ix, this.N[i1]);
         j = Math.min(j, this.y[i1]);
         k = Math.max(k, this.N[i1] + this.L[i1]);
         l = Math.max(l, this.y[i1] + this.u[i1]);
      }

      this.N[0] = ix;
      this.y[0] = j;
      this.L[0] = k - ix;
      this.u[0] = l - j;
      this.i = 1;
   }

   class09960[] y() {
      if (this.i == 0) {
         return class09723.L;
      } else {
         class09960[] aclass09960 = new class09960[this.i];

         for (int ix = 0; ix < this.i; ix++) {
            aclass09960[ix] = new class09960(this.N[ix], this.y[ix], this.L[ix], this.u[ix]);
         }

         return aclass09960;
      }
   }

   private boolean N(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var1 <= var5 + var7 && var5 <= var1 + var3 && var2 <= var6 + var8 && var6 <= var2 + var4;
   }

   private void N(int var1) {
      int ix = this.i - 1;
      this.N[var1] = this.N[ix];
      this.y[var1] = this.y[ix];
      this.L[var1] = this.L[ix];
      this.u[var1] = this.u[ix];
      this.i = ix;
   }

   boolean N() {
      return this.R;
   }

   void N(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         this.R = true;
         int ix = var1;
         int j = var2;
         int k = var3;
         int l = var4;
         int i1 = 0;

         while (i1 < this.i) {
            if (this.N(ix, j, k, l, this.N[i1], this.y[i1], this.L[i1], this.u[i1])) {
               int j1 = Math.min(ix, this.N[i1]);
               int k1 = Math.min(j, this.y[i1]);
               int l1 = Math.max(ix + k, this.N[i1] + this.L[i1]);
               int i2 = Math.max(j + l, this.y[i1] + this.u[i1]);
               ix = j1;
               j = k1;
               k = l1 - j1;
               l = i2 - k1;
               this.N(i1);
               i1 = 0;
            } else {
               i1++;
            }
         }

         if (this.i < this.N.length) {
            this.N[this.i] = ix;
            this.y[this.i] = j;
            this.L[this.i] = k;
            this.u[this.i] = l;
            this.i++;
         } else {
            this.y(ix, j, k, l);
         }
      }
   }
}
