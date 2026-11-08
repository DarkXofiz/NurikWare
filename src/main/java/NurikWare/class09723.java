package NurikWare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public final class class09723 {
   private static final int N = 16;
   private static final int y = 8;
   static final class09960[] L;
   private final class09940 u;
   private final int i;
   private final int R;
   private final int M;
   private final int B;
   private final int Z;
   private final int z;
   private final byte[] U;
   private final ArrayList<class09946> E = new ArrayList<>();
   private final ArrayList<class09756> W = new ArrayList<>();
   private final class09953 m = new class09953();
   private final class09721 P = new class09721(16);
   private byte[] s;
   private int T;
   private int b;
   private int j;
   private int v;
   private int n;
   private int t;

   public int L() {
      return this.T;
   }

   private class09946 L(class09946 var1) {
      class09946 class09946 = Objects.requireNonNull(var1, "texture");
      if (class09946.z() != this) {
         throw new IllegalArgumentException("Texture handle does not belong to this atlas");
      } else {
         return class09946;
      }
   }

   private boolean L(class09946 var1, byte[] var2, int var3, int var4) {
      int ix = this.y(var1);
      class09760 class09760 = this.b();
      class09722 class09722 = this.u(var1);
      this.E.remove(ix);
      this.L(class09722.N(), class09722.y(), class09722.i(), class09722.R());
      this.s();
      this.v();
      class09727 class09727 = this.N(var3, var4);
      if (class09727 != null) {
         this.N(var1, ix, var2, var3, var4, class09722, class09727, class09760.L());
         return true;
      } else {
         this.N(var1, ix, class09760);
         return this.N(var1, var2, var3, var4, true);
      }
   }

   private void L(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0 && var1 >= 0 && var2 >= 0 && var1 + var3 <= this.i) {
         if (var2 < this.R && var2 + var4 <= this.R) {
            if (var3 >= 8 && var4 >= 8) {
               class09756 class09756x = new class09756(var1, var2, var3, var4);
               int ix = 0;

               while (ix < this.W.size()) {
                  class09756 class09756x = this.W.get(ix);
                  if (N(class09756x, class09756x)) {
                     this.W.remove(ix);
                  } else {
                     if (N(class09756x, class09756x)) {
                        return;
                     }

                     if (y(class09756x, class09756x)) {
                        class09756x = L(class09756x, class09756x);
                        this.W.remove(ix);
                        ix = 0;
                     } else {
                        ix++;
                     }
                  }
               }

               this.W.add(class09756x);
            }
         }
      }
   }

   private class09727 L(int var1, int var2) {
      class09711 class09711 = this.B(var1, var2);
      int ix = -1;
      int jx = Integer.MAX_VALUE;
      int k = Integer.MAX_VALUE;
      int l = Integer.MAX_VALUE;
      int i1 = Integer.MAX_VALUE;

      for (int j1 = 0; j1 < this.W.size(); j1++) {
         class09756 class09756x = this.W.get(j1);
         if (class09711.N() <= class09756x.L && class09711.y() <= class09756x.u) {
            int k1 = class09756x.L * class09756x.u - class09711.N() * class09711.y();
            int l1 = Math.min(class09756x.L - class09711.N(), class09756x.u - class09711.y());
            if (k1 < jx || k1 == jx && l1 < k || k1 == jx && l1 == k && (class09756x.y < l || class09756x.y == l && class09756x.N < i1)) {
               ix = j1;
               jx = k1;
               k = l1;
               i1 = class09756x.N;
               l = class09756x.y;
            }
         }
      }

      if (ix < 0) {
         return null;
      } else {
         class09756 class09756 = this.W.remove(ix);
         this.L(class09756.N + class09711.N(), class09756.y, class09756.L - class09711.N(), class09756.u);
         this.L(class09756.N, class09756.y + class09711.y(), class09711.N(), class09756.u - class09711.y());
         int i2 = Math.max(this.b, class09756.y + var2);
         int j2 = this.y(i2);
         return new class09727(class09756.N, class09756.y, class09711.N(), class09711.y(), j2, 0, false);
      }
   }

   private static class09756 L(class09756 var0, class09756 var1) {
      int ix = Math.min(var0.N, var1.N);
      int jx = Math.min(var0.y, var1.y);
      int k = Math.max(var0.N(), var1.N());
      int l = Math.max(var0.y(), var1.y());
      return new class09756(ix, jx, k - ix, l - jx);
   }

   private int L(int var1) {
      return N((long)var1 + this.M, "padded width is too large");
   }

   public byte[] M() {
      return this.U;
   }

   private int M(int var1, int var2) {
      return var1 >= this.T ? 0 : Math.min(var1 + var2, this.T) - var1;
   }

   private int P() {
      int ix = 0;

      for (class09946 class09946 : this.E) {
         ix = Math.max(ix, class09946.y() + this.u(class09946.u()));
      }

      return ix;
   }

   private void T() {
      this.b = 0;
      this.j = 0;
      this.T = this.B;
      this.W.clear();
      this.v();
   }

   public class09723(class09940 var1, int var2, int var3) {
      this(var1, var2, var3, 0, 1);
   }

   public class09723(class09940 var1, int var2, int var3, int var4, int var5) {
      super();
      this.u = Objects.requireNonNull(var1, "format");
      if (var2 <= 0) {
         throw new IllegalArgumentException("maxWidth must be > 0");
      } else if (var3 <= 0) {
         throw new IllegalArgumentException("maxHeight must be > 0");
      } else if (var4 < 0) {
         throw new IllegalArgumentException("padding must be >= 0");
      } else if (var5 <= 0) {
         throw new IllegalArgumentException("minHeight must be > 0");
      } else if (var5 > var3) {
         throw new IllegalArgumentException("minHeight must be <= maxHeight");
      } else {
         this.i = var2;
         this.R = var3;
         this.M = var4;
         this.B = var5;
         this.Z = var1.N();
         this.z = N(var2, this.Z, "maxWidth * bytesPerPixel");
         this.U = new byte[N((long)this.z * var3, "atlas pixel buffer is too large")];
         this.T = var5;
      }
   }

   public class09723(class09940 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 1);
   }

   private class09711 B(int var1, int var2) {
      return new class09711(this.L(var1), this.u(var2));
   }

   public boolean B() {
      return this.P.N();
   }

   public class09960[] Z() {
      return this.P.y();
   }

   private void i(int var1, int var2) {
      if (var2 > var1) {
         this.u(var1, var2 - var1);
      }
   }

   public int i() {
      return this.R;
   }

   private void i(int var1) {
      if (this.s == null || this.s.length < var1) {
         this.s = new byte[var1];
      }
   }

   private class09722 i(int var1, int var2, int var3, int var4) {
      class09711 class09711 = this.B(var3, var4);
      return new class09722(var1, var2, var3, var4, class09711.N(), class09711.y());
   }

   private class09760 b() {
      return new class09760(this.b, this.j, this.T, this.v, this.n, this.t, new ArrayList<>(this.W));
   }

   private void s() {
      this.b = this.m();
      this.j = this.P();
      this.T = this.y(this.b);
   }

   private int m() {
      int ix = 0;

      for (class09946 class09946 : this.E) {
         ix = Math.max(ix, class09946.y() + class09946.u());
      }

      return ix;
   }

   private void v() {
      this.v = 0;
      this.n = this.j;
      this.t = 0;
   }

   private void j() {
      this.P.N(0, 0, this.i, this.T);
   }

   public class09960[] U() {
      if (this.W.isEmpty()) {
         return L;
      } else {
         class09960[] aclass09960 = new class09960[this.W.size()];
         int ix = 0;

         for (int jx = 0; jx < this.W.size(); jx++) {
            class09756 class09756 = this.W.get(jx);
            int k = this.M(class09756.y, class09756.u);
            if (k > 0) {
               aclass09960[ix++] = new class09960(class09756.N, class09756.y, class09756.L, k);
            }
         }

         if (ix == 0) {
            return L;
         } else {
            if (ix != aclass09960.length) {
               aclass09960 = Arrays.copyOf(aclass09960, ix);
            }

            return aclass09960;
         }
      }
   }

   public class09960[] z() {
      return this.P.L();
   }

   private class09722 u(class09946 var1) {
      return this.i(var1.N(), var1.y(), var1.L(), var1.u());
   }

   private void u(int var1, int var2) {
      if (var2 > 0) {
         Arrays.fill(this.U, this.R(var1), this.R(var1 + var2), (byte)0);
      }
   }

   public int u() {
      return this.i;
   }

   private void u(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0 && !this.W.isEmpty()) {
         int ix = var1 + var3;
         int jx = var2 + var4;
         ArrayList arraylist = new ArrayList<>(this.W);
         this.W.clear();

         for (int k = 0; k < arraylist.size(); k++) {
            class09756 class09756 = (class09756)arraylist.get(k);
            int l = Math.max(class09756.N, var1);
            int i1 = Math.max(class09756.y, var2);
            int j1 = Math.min(class09756.N(), ix);
            int k1 = Math.min(class09756.y(), jx);
            if (l < j1 && i1 < k1) {
               this.L(class09756.N, class09756.y, class09756.L, i1 - class09756.y);
               this.L(class09756.N, k1, class09756.L, class09756.y() - k1);
               this.L(class09756.N, i1, l - class09756.N, k1 - i1);
               this.L(j1, i1, class09756.N() - j1, k1 - i1);
            } else {
               this.L(class09756.N, class09756.y, class09756.L, class09756.u);
            }
         }
      }
   }

   private int u(int var1) {
      return N((long)var1 + this.M, "padded height is too large");
   }

   public int y() {
      return this.i;
   }

   private int y(int var1) {
      if (var1 <= 0) {
         return this.B;
      } else {
         return var1 <= this.B ? this.B : Math.min(class09941.N(var1), this.R);
      }
   }

   private static boolean y(class09756 var0, class09756 var1) {
      return var0.y == var1.y && var0.u == var1.u && var0.N <= var1.N() && var1.N <= var0.N()
         || var0.N == var1.N && var0.L == var1.L && var0.y <= var1.y() && var1.y <= var0.y();
   }

   private void y(class09946 var1, byte[] var2, int var3, int var4) {
      int ix = this.T;
      int jx = var1.N();
      int k = var1.y();
      class09722 class09722x = this.u(var1);
      class09722 class09722x = this.i(jx, k, var3, var4);
      this.N(jx, k, class09722x.i(), class09722x.R());
      this.N(var2, jx, k, var3, var4);
      var1.N(jx, k, var3, var4);
      this.L(jx + class09722x.i(), k, class09722x.i() - class09722x.i(), class09722x.R());
      this.L(jx, k + class09722x.R(), class09722x.i(), class09722x.R() - class09722x.R());
      this.s();
      this.v();
      this.N(ix, jx, k, class09722x.i(), class09722x.R());
   }

   private void y(int var1, int var2, int var3, int var4, int var5) {
      if (this.T != var1) {
         this.j();
      } else {
         this.y(var2, var3, var4, var5);
      }
   }

   private void y(byte[] var1, int var2, int var3) {
      Objects.requireNonNull(var1, "bytes");
      if (var2 <= 0) {
         throw new IllegalArgumentException("width must be > 0");
      } else if (var3 <= 0) {
         throw new IllegalArgumentException("height must be > 0");
      } else if (var2 > this.i) {
         throw new IllegalArgumentException("width exceeds atlas maxWidth");
      } else if (var3 > this.R) {
         throw new IllegalArgumentException("height exceeds atlas maxHeight");
      } else {
         int ix = N((long)var2 * var3 * this.Z, "texture byte array is too large");
         if (var1.length != ix) {
            throw new IllegalArgumentException("Expected " + ix + " bytes but got " + var1.length);
         }
      }
   }

   private void y(int var1, int var2, int var3, int var4) {
      int ix = this.M(var2, var4);
      if (ix > 0) {
         this.P.N(var1, var2, var3, ix);
      }
   }

   private int y(class09946 var1) {
      int ix = this.E.indexOf(var1);
      if (ix < 0) {
         throw new IllegalStateException("Texture handle is not registered in the atlas");
      } else {
         return ix;
      }
   }

   private class09727 y(int var1, int var2) {
      class09711 class09711 = this.B(var1, var2);
      int ix = this.v;
      int jx = this.n;
      int k = this.t;
      if (ix + class09711.N() > this.i) {
         ix = 0;
         jx += k;
         k = 0;
      }

      if (jx + class09711.y() > this.R) {
         return null;
      } else if (!this.E.isEmpty() && jx + var2 > this.T) {
         return null;
      } else {
         int l = Math.max(this.b, jx + var2);
         int i1 = this.y(l);
         return new class09727(ix, jx, class09711.N(), class09711.y(), i1, Math.max(k, class09711.y()), true);
      }
   }

   public void E() {
      this.P.u();
   }

   private static int N(int var0, int var1, String var2) {
      return N((long)var0 * var1, var2);
   }

   private static int N(long var0, String var2) {
      if (var0 >= 0L && var0 <= 2147483647L) {
         return (int)var0;
      } else {
         throw new IllegalArgumentException(var2);
      }
   }

   private void N(class09727 var1) {
      if (var1.M()) {
         this.v = var1.N() + var1.L();
         this.n = var1.y();
         this.t = var1.R();
      } else {
         this.v();
      }
   }

   public class09946 N(byte[] var1, int var2, int var3) {
      this.y(var1, var2, var3);
      class09946 class09946 = new class09946(this);
      class09727 class09727 = this.N(var2, var3);
      if (class09727 != null) {
         this.N(class09946, var1, var2, var3, class09727);
         return class09946;
      } else if (!this.N(class09946, var1, var2, var3, false)) {
         throw new IllegalStateException("Texture does not fit into the atlas");
      } else {
         return class09946;
      }
   }

   public boolean N(class09946 var1) {
      class09946 class09946 = this.L(var1);
      if (!class09946.i()) {
         return false;
      } else if (!this.E.remove(class09946)) {
         return false;
      } else {
         class09722 class09722 = this.u(class09946);
         int ix = this.T;
         this.N(class09722.N(), class09722.y(), class09722.i(), class09722.R());
         class09946.U();
         if (this.E.isEmpty()) {
            this.T();
         } else {
            this.s();
            this.L(class09722.N(), class09722.y(), class09722.i(), class09722.R());
            this.v();
         }

         this.N(ix, class09722.N(), class09722.y(), class09722.i(), class09722.R());
         return true;
      }
   }

   public class09940 N() {
      return this.u;
   }

   public class09946 N(class09946 var1, byte[] var2, int var3, int var4) {
      class09946 class09946 = this.L(var1);
      if (!class09946.i()) {
         throw new IllegalStateException("Texture handle is not alive");
      } else {
         this.y(var2, var3, var4);
         if (class09946.L() == var3 && class09946.u() == var4) {
            this.N(var2, class09946.N(), class09946.y(), var3, var4);
            this.P.N(class09946.N(), class09946.y(), var3, var4);
            return class09946;
         } else if (var3 <= class09946.L() && var4 <= class09946.u()) {
            this.y(class09946, var2, var3, var4);
            return class09946;
         } else if (!this.L(class09946, var2, var3, var4)) {
            throw new IllegalStateException("Updated texture does not fit into the atlas");
         } else {
            return class09946;
         }
      }
   }

   private void N(class09946 var1, byte[] var2, class09722 var3, class09727 var4) {
      this.N(var3.N(), var3.y(), var3.i(), var3.R());
      this.N(var2, var3.N(), var3.y(), var3.L(), var3.u());
      if (var4.M()) {
         this.u(var3.N(), var3.y(), var3.i(), var3.R());
      }

      var1.N(var3.N(), var3.y(), var3.L(), var3.u());
      this.b = Math.max(this.b, var3.M());
      this.j = Math.max(this.j, var3.B());
      this.T = var4.i();
      this.N(var4);
   }

   private void N(byte[] var1, int var2, int var3, int var4, int var5) {
      int ix = N(var4, this.Z, "texture row is too large");

      for (int jx = 0; jx < var5; jx++) {
         int k = jx * ix;
         int l = this.R(var2, var3 + jx);
         System.arraycopy(var1, k, this.U, l, ix);
      }
   }

   private void N(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int ix = N(var4, this.Z, "texture row is too large");

      for (int jx = 0; jx < var5; jx++) {
         int k = this.R(var2, var3 + jx);
         int l = this.R(var7, var8 + jx);
         System.arraycopy(var1, k, var6, l, ix);
      }
   }

   private void N(int var1, int var2, int var3, int var4) {
      int ix = N(var3, this.Z, "texture row is too large");

      for (int jx = 0; jx < var4; jx++) {
         int k = this.R(var1, var2 + jx);
         Arrays.fill(this.U, k, k + ix, (byte)0);
      }
   }

   private class09727 N(int var1, int var2) {
      class09727 class09727 = this.L(var1, var2);
      return class09727 != null ? class09727 : this.y(var1, var2);
   }

   private boolean N(class09946 var1, byte[] var2, int var3, int var4, boolean var5) {
      class09744 class09744 = this.N(var1, var3, var4, var5);
      if (class09744 == null) {
         return false;
      } else {
         this.N(class09744, var1, var2, var3, var4, var5);
         return true;
      }
   }

   private class09744 N(class09946 var1, int var2, int var3, boolean var4) {
      int ix = this.T;

      while (true) {
         class09744 class09744 = this.N(var1, var2, var3, var4, ix);
         if (class09744 != null) {
            return class09744;
         }

         int jx = this.N(ix);
         if (jx <= ix) {
            return null;
         }

         ix = jx;
      }
   }

   private class09744 N(class09946 var1, int var2, int var3, boolean var4, int var5) {
      int ix = var1 != null && !var4 ? 1 : 0;
      int jx = this.E.size() + ix;
      if (jx == 0) {
         return class09744.B;
      } else {
         class09946[] aclass09946 = new class09946[jx];
         int[] aint = new int[jx];
         int[] aint1 = new int[jx];
         int[] aint2 = new int[jx];
         int[] aint3 = new int[jx];
         int[] aint4 = new int[jx];
         boolean[] aboolean = new boolean[jx];
         int k = 0;

         for (class09946 class09946x : this.E) {
            aclass09946[k] = class09946x;
            aint[k] = k;
            if (class09946x == var1 && var4) {
               aint1[k] = this.L(var2);
               aint2[k] = this.u(var3);
            } else {
               aint1[k] = this.L(class09946x.L());
               aint2[k] = this.u(class09946x.u());
            }

            k++;
         }

         if (var1 != null && !var4) {
            aclass09946[k] = var1;
            aint[k] = k;
            aint1[k] = this.L(var2);
            aint2[k] = this.u(var3);
         }

         this.m.N(this.i, var5, this.i);
         this.m.N(1);
         if (!this.m.N(aint, aint1, aint2, aint3, aint4, aboolean, jx)) {
            return null;
         } else {
            int j1 = 0;
            int k1 = 0;

            for (int l = 0; l < jx; l++) {
               class09946 class09946 = aclass09946[l];
               int i1 = class09946 == var1 ? var3 : class09946.u();
               j1 = Math.max(j1, aint4[l] + i1);
               k1 = Math.max(k1, aint4[l] + aint2[l]);
            }

            if (k1 > var5) {
               return null;
            } else {
               int l1 = this.y(j1);
               return new class09744(aclass09946, aint3, aint4, jx, j1, k1, l1);
            }
         }
      }
   }

   private void N(class09744 var1, class09946 var2, byte[] var3, int var4, int var5, boolean var6) {
      int ix = this.T;
      int jx = this.R(ix);
      this.i(jx);
      if (jx > 0) {
         System.arraycopy(this.U, 0, this.s, 0, jx);
      }

      int k = Math.max(ix, var1.M());
      Arrays.fill(this.U, 0, this.R(k), (byte)0);

      for (int l = 0; l < var1.u(); l++) {
         class09946 class09946 = var1.N()[l];
         int i1 = var1.y()[l];
         int j1 = var1.L()[l];
         int k1 = class09946 == var2 ? var4 : class09946.L();
         int l1 = class09946 == var2 ? var5 : class09946.u();
         if (class09946 == var2) {
            this.N(var3, i1, j1, k1, l1);
         } else {
            this.N(this.s, class09946.N(), class09946.y(), k1, l1, this.U, i1, j1);
         }

         class09946.N(i1, j1, k1, l1);
      }

      if (var2 != null && !var6) {
         this.E.add(var2);
      }

      this.b = var1.i();
      this.j = var1.R();
      this.T = var1.M();
      this.W.clear();
      this.v();
      this.j();
   }

   private void N(int var1, int var2, int var3, int var4, int var5) {
      if (this.T < var1) {
         this.u(this.T, var1 - this.T);
         this.j();
      } else {
         this.y(var2, var3, var4, var5);
      }
   }

   private int N(int var1) {
      return var1 >= this.R ? var1 : Math.min(class09941.N(var1 + 1), this.R);
   }

   private void N(class09946 var1, byte[] var2, int var3, int var4, class09727 var5) {
      int ix = this.T;
      class09722 class09722 = this.i(var5.N(), var5.y(), var3, var4);
      this.i(ix, var5.i());
      this.N(var1, var2, class09722, var5);
      this.E.add(var1);
      this.y(ix, class09722.N(), class09722.y(), var3, var4);
   }

   private static boolean N(class09756 var0, class09756 var1) {
      return var0.N <= var1.N && var0.y <= var1.y && var0.N() >= var1.N() && var0.y() >= var1.y();
   }

   private void N(class09946 var1, int var2, byte[] var3, int var4, int var5, class09722 var6, class09727 var7, int var8) {
      class09722 class09722 = this.i(var7.N(), var7.y(), var4, var5);
      int ix = this.T;
      this.i(ix, var7.i());
      this.N(var6.N(), var6.y(), var6.i(), var6.R());
      this.N(var1, var3, class09722, var7);
      this.E.add(Math.min(var2, this.E.size()), var1);
      if (this.T < var8) {
         this.u(this.T, var8 - this.T);
      }

      if (this.T != var8) {
         this.j();
      } else {
         this.y(var6.N(), var6.y(), var6.i(), var6.R());
         this.y(class09722.N(), class09722.y(), class09722.i(), class09722.R());
      }
   }

   private void N(class09946 var1, int var2, class09760 var3) {
      this.E.add(Math.min(var2, this.E.size()), var1);
      this.W.clear();
      this.W.addAll(var3.M());
      this.b = var3.N();
      this.j = var3.y();
      this.T = var3.L();
      this.v = var3.u();
      this.n = var3.i();
      this.t = var3.R();
   }

   public void W() {
      if (!this.E.isEmpty()) {
         if (!this.N(null, null, 0, 0, false)) {
            throw new IllegalStateException("Active textures do not fit into the atlas");
         }
      }
   }

   private int R(int var1) {
      return N((long)var1 * this.z, "row byte count is too large");
   }

   public int R() {
      return this.M;
   }

   private int R(int var1, int var2) {
      return var2 * this.z + var1 * this.Z;
   }
}
