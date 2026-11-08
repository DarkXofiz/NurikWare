package NurikWare;

import java.util.Objects;

final class class09786 implements class09869 {
   private static final int N = 0;
   private static final int y = 99;
   private static final int L = 67;
   private static final int u = 118;
   private static final int i = 86;
   private static final int R = 120;
   private static final int M = 88;
   private final class09781 B;
   private final class09961 Z;
   private final class09851 z;
   private final class09828 U;
   private final class10066 E;
   private final class10062 W;
   private final class10017 m;
   private class10021 P;
   private class10021 s;
   private class10021 T;
   private class10021 b;
   private class10021 j;
   private class10021 v;
   private float n;
   private float t;
   private boolean G;

   @Override
   public class09904 L() {
      return this.T;
   }

   @Override
   public boolean L(class09904 var1) {
      if (var1 == null) {
         this.y(null);
         return false;
      } else if (var1 instanceof class10021 class10021 && class10021.P() && y(this.P, class10021)) {
         this.y(class10021);
         this.E.N(class10021);
         return true;
      } else {
         return false;
      }
   }

   private void L(class10021 var1) {
      if (this.b != var1) {
         class10021 class10021 = this.b;
         this.b = var1;
         if (class10021 != null) {
            this.Z.N(class10021, class10021 == this.s, class10021 == this.T, false);
         }

         if (var1 != null) {
            this.Z.N(var1, var1 == this.s, var1 == this.T, true);
         }
      }
   }

   private float L(float var1) {
      return var1 / this.B.u().N();
   }

   private class09854 M() {
      return this.P == null ? class09854.N : this.z.N(this.P, this.n, this.t);
   }

   private static void M(class10021 var0) {
      var0.y(false);
      var0.L(false);
      var0.u(false);

      for (int ix = 0; ix < var0.u(); ix++) {
         M(var0.N(ix));
      }
   }

   class09786(class09781 var1) {
      super();
      this.B = Objects.requireNonNull(var1, "context");
      this.Z = class09961.N(var1);
      this.z = new class09851(var1);
      this.U = class09828.N(var1);
      this.E = class10066.N(var1);
      this.W = class10062.N(var1);
      this.m = new class10017(var1);
   }

   private static class10021 i(class10021 var0) {
      if (var0 == null) {
         return null;
      } else {
         for (class10021 class10021 = var0; class10021 != null; class10021 = class10021.X()) {
            if (class10021.N(class09867.CLICK)) {
               return class10021;
            }
         }

         return u(var0);
      }
   }

   @Override
   public class09904 i() {
      return this.j;
   }

   @Override
   public class09904 u() {
      return this.b;
   }

   private static class10021 u(class10021 var0) {
      if (var0 == null) {
         return null;
      } else {
         for (class10021 class10021 = var0; class10021 != null; class10021 = class10021.X()) {
            if (class10021.P()) {
               return class10021;
            }
         }

         return var0;
      }
   }

   @Override
   public void y(class09904 var1) {
      if (var1 instanceof class10021 class10021x) {
         if (y(class10021x, this.T)) {
            this.E.N(this.T, null);
            this.W.N(this.T, null);
            this.T = null;
         }

         if (y(class10021x, this.s)) {
            class10021 class10021x = class10021x.X();
            if (class10021x != null) {
               this.N(class10021x);
            } else {
               this.s = null;
            }
         }

         if (y(class10021x, this.b)) {
            this.b = null;
         }

         if (y(class10021x, this.j)) {
            this.j = null;
         }

         if (y(class10021x, this.v)) {
            this.v = null;
         }

         M(class10021x);
      }
   }

   private static boolean y(class10021 var0, class10021 var1) {
      if (var0 != null && var1 != null) {
         for (class10021 class10021 = var1; class10021 != null; class10021 = class10021.X()) {
            if (class10021 == var0) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void y(int var1, class10021 var2) {
      class10021 class10021xx = u(var2);
      class10021 class10021x = this.j != null ? this.j : class10021xx;
      if (class10021x != null) {
         class09863.N(new class09864(class09867.POINTER_UP, class10021x, this.n, this.t, var1, false));
      }

      if (var1 == 0) {
         class10021 class10021xx = i(var2);
         if (this.v != null && class10021xx == this.v && var2 != null) {
            class09863.N(new class09864(class09867.CLICK, var2, this.n, this.t, var1, false));
         }

         this.v = null;
         if (this.j != null && this.j.y() == class10049.INPUT) {
            this.W.u(this.j);
         }

         this.j = null;
         this.L(null);
      }
   }

   private void y(class10021 var1) {
      if (this.T != var1) {
         class10021 class10021 = this.T;
         this.T = var1;
         if (class10021 != null) {
            this.Z.N(class10021, class10021 == this.s, false, class10021 == this.b);
            class09863.N(new class09873(class09867.BLUR, class10021, var1));
         }

         if (var1 != null) {
            this.Z.N(var1, var1 == this.s, true, var1 == this.b);
            class09863.N(new class09873(class09867.FOCUS, var1, class10021));
         }

         this.E.N(class10021, var1);
         this.W.N(class10021, var1);
      }
   }

   @Override
   public class09904 y() {
      return this.s;
   }

   private float y(float var1) {
      return var1 / this.B.u().N();
   }

   private void N(int var1, class10021 var2) {
      class10021 class10021x = u(var2);
      class10021 class10021x = this.j != null ? this.j : class10021x;
      if (class10021x != null) {
         class09863.N(new class09864(class09867.POINTER_DOWN, class10021x, this.n, this.t, var1, true));
      }

      if (var1 == 0) {
         this.v = i(var2);
         this.j = class10021x;
         this.y(class10021x != null && class10021x.P() ? class10021x : null);
         this.L(class10021x);
         if (class10021x != null && class10021x.y() == class10049.INPUT) {
            this.W.N(class10021x, this.n);
         }

         this.E.N(class10021x);
      }
   }

   @Override
   public void N(class09904 var1) {
      this.E.N(this.T, null);
      this.W.N(this.T, null);
      this.P = (class10021)var1;
      this.s = null;
      this.T = null;
      this.b = null;
      this.j = null;
      this.v = null;
      this.G = false;
      this.U.N(this.P);
   }

   private void N(class09854 var1) {
      if (var1.N()) {
         this.U.N(var1.L(), var1.u());
      } else {
         this.U.N(null, null);
      }
   }

   private static class10021 N(class10021 var0, class10021 var1) {
      int ix = R(var0);
      int jx = R(var1);
      class10021 class10021x = var0;

      class10021 class10021x;
      for (class10021x = var1; ix > jx && class10021x != null; ix--) {
         class10021x = class10021x.X();
      }

      while (jx > ix && class10021x != null) {
         class10021x = class10021x.X();
         jx--;
      }

      while (class10021x != class10021x) {
         if (class10021x != null) {
            class10021x = class10021x.X();
         }

         if (class10021x != null) {
            class10021x = class10021x.X();
         }
      }

      return class10021x;
   }

   private boolean N(class10021 var1, int var2) {
      if (this.m.y(var1, var2)) {
         return true;
      } else if (this.T == null) {
         return false;
      } else if (var2 == 99 || var2 == 67) {
         this.B.N().N(this.T.B());
         return true;
      } else if (var2 == 120 || var2 == 88) {
         this.B.N().N(this.T.B());
         return true;
      } else if (var2 != 118 && var2 != 86) {
         return false;
      } else {
         this.B.N().N();
         return true;
      }
   }

   @Override
   public void N(int var1, boolean var2, class09857 var3, boolean var4) {
      class10021 class10021 = this.T != null ? this.T : this.P;
      if (class10021 != null) {
         class09867 class09867 = var2 ? class09867.KEY_DOWN : class09867.KEY_UP;
         class09865 class09865 = new class09865(class09867, class10021, var1, var2, var3, var4);
         class09863.N(class09865);
         if (var2 && !class09865.P() && !class09865.m()) {
            if (!var4 && var3 != null && var3.N() && this.N(class10021, var1)) {
               this.E.N(class10021);
            } else {
               if (this.m.N(class10021, var1, var3, var4)) {
                  this.E.N(class10021);
               }
            }
         }
      }
   }

   @Override
   public void N(int var1, boolean var2) {
      class09854 class09854 = this.M();
      this.N(class09854.L());
      if (var2) {
         if (class09854.N() && var1 == 0) {
            this.U.N(class09854.L(), class09854.u(), this.t, class09854.i());
         } else {
            this.N(var1, this.N(class09854, var1));
         }
      } else {
         boolean flag = var1 == 0 && this.U.L();
         this.N(class09854);
         if (!flag) {
            this.y(var1, this.N(class09854, var1));
         }
      }
   }

   private class10021 N(class09854 var1, int var2) {
      return var1.N() && var2 != 0 ? this.z.y(this.P, this.n, this.t) : var1.L();
   }

   @Override
   public void N(int var1) {
      class10021 class10021 = this.T != null ? this.T : this.P;
      if (class10021 != null) {
         class09852 class09852 = new class09852(class10021, var1);
         class09863.N(class09852);
         if (!class09852.P() && !class09852.m() && this.m.N(class10021, var1)) {
            this.E.N(class10021);
         }
      }
   }

   @Override
   public void N(float var1, float var2) {
      var1 = this.y(var1);
      var2 = this.L(var2);
      if (!this.G || Float.compare(this.n, var1) != 0 || Float.compare(this.t, var2) != 0) {
         this.G = true;
         this.n = var1;
         this.t = var2;
         if (this.j != null && this.j.y() == class10049.INPUT) {
            this.W.y(this.j, this.n);
            this.E.N(this.j);
         }

         if (!this.U.L(this.P, this.t)) {
            class09854 class09854 = this.M();
            this.N(class09854);
            this.N(class09854.L());
            class10021 class10021 = this.j != null ? this.j : class09854.L();
            if (class10021 != null) {
               class09863.N(new class09864(class09867.POINTER_MOVE, class10021, var1, var2, -1, false));
            }
         }
      }
   }

   private void N(class10021 var1) {
      if (this.s != var1) {
         class10021 class10021xxxxx = this.s;
         this.s = var1;
         class10021 class10021x = N(class10021xxxxx, var1);

         for (class10021 class10021xx = class10021xxxxx; class10021xx != null && class10021xx != class10021x; class10021xx = class10021xx.X()) {
            this.Z.N(class10021xx, false, class10021xx == this.T, class10021xx == this.b);
         }

         for (class10021 class10021xx = var1; class10021xx != null && class10021xx != class10021x; class10021xx = class10021xx.X()) {
            this.Z.N(class10021xx, true, class10021xx == this.T, class10021xx == this.b);
         }

         for (class10021 class10021xx = class10021xxxxx; class10021xx != null && class10021xx != class10021x; class10021xx = class10021xx.X()) {
            class09863.N(new class09834(class09867.HOVER_LEAVE, class10021xx, this.n, this.t, var1));
         }

         for (class10021 class10021xx = var1; class10021xx != null && class10021xx != class10021x; class10021xx = class10021xx.X()) {
            class09863.N(new class09834(class09867.HOVER_ENTER, class10021xx, this.n, this.t, class10021xxxxx));
         }
      }
   }

   @Override
   public void N() {
      if (this.G && this.P != null) {
         if (this.j == null && !this.U.y()) {
            class09854 class09854 = this.M();
            this.N(class09854);
            this.N(class09854.L());
         }
      }
   }

   @Override
   public void N(float var1) {
      class09854 class09854 = this.M();
      this.N(class09854.L());
      if (this.P != null) {
         class10021 class10021 = this.j != null ? this.j : class09854.L();
         if (class10021 != null) {
            class09837 class09837 = new class09837(class10021, this.n, this.t, var1);
            class09863.N(class09837);
            if (!class09837.P() && !class09837.m()) {
               this.U.N(class10021, this.P, var1);
            }
         }
      }
   }

   private static int R(class10021 var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.M() >= 0) {
         return var0.M();
      } else {
         int ix = 0;

         for (class10021 class10021 = var0; class10021 != null; class10021 = class10021.X()) {
            ix++;
         }

         return ix;
      }
   }

   @Override
   public void R() {
      this.y(null);
   }
}
