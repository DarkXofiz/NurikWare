package NurikWare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class class10021 implements class09904 {
   private final String N;
   private final class10049 y;
   private final List<class10021> L = new ArrayList<>();
   private final List<class10021> u = Collections.unmodifiableList(this.L);
   private Map<class09867, List<class10016>> i;
   private final class09937 R = new class09937(this);
   private final class09908 M = new class09908();
   private final class10034 B;
   private class09841 Z;
   private class10021 z;
   private int U = -1;
   private boolean E;
   private boolean W;
   private boolean m;
   private boolean P;
   private String s;
   private int T = 3;
   private int b = 3;
   private int j = 1;
   private class09991 v = class09991.N;
   private List<class09992> n = List.of();
   private class09980 t = class09968.N();
   private class10002 G;
   private class09980 l;
   private boolean d;
   private int w;
   private int k;
   private int Y;
   private int Q;
   private int O;
   private int g;
   private int I;
   private int J;

   public int w() {
      return this.Q;
   }

   public void L(int var1) {
      this.z(var1);
   }

   @Override
   public void L(String var1) {
      String sx = var1 == null ? "" : var1;
      if (!this.B.u().equals(sx)) {
         this.B.L(sx);
         this.p();
         this.i(1);
      }
   }

   private static boolean L(class09980 var0, class09980 var1) {
      return var0.M() == var1.M()
         && var0.w() == var1.w()
         && var0.k() == var1.k()
         && N(var0.Y().N(), var1.Y().N())
         && N(var0.Y().y(), var1.Y().y())
         && N(var0.Y().L(), var1.Y().L())
         && N(var0.Y().u(), var1.Y().u());
   }

   private boolean L(List<class10021> var1) {
      for (int ix = 0; ix < this.L.size(); ix++) {
         if (this.L.get(ix) != var1.get(ix)) {
            return false;
         }
      }

      return true;
   }

   public void L(boolean var1) {
      this.m = var1;
   }

   @Override
   public List<class10021> L() {
      return this.u;
   }

   public int M() {
      return this.U;
   }

   public boolean M(int var1) {
      return var1 == 1 ? this.x() : class10057.N(this.T, var1);
   }

   @Override
   public boolean P() {
      return this.E;
   }

   @Override
   public class09841 K() {
      return this.Z;
   }

   public boolean T() {
      return this.d;
   }

   public int Q() {
      return this.I;
   }

   public class10021(class10049 var1) {
      this(null, var1);
   }

   public class10021(String var1, class10049 var2) {
      super();
      this.N = var1 != null && !var1.isBlank() ? var1 : null;
      this.y = Objects.requireNonNull(var2, "type");
      this.B = class10034.N(var2);
   }

   public class10021 B(int var1) {
      if (var1 >= 0 && var1 < this.L.size()) {
         class10021 class10021 = this.L.remove(var1);
         if (class10021 != null) {
            if (class10021.j > 0) {
               this.U(-class10021.j);
            }

            class10021.z = null;
            class10021.a();
            class10021.N(null);
         }

         this.A();
         this.i(2);
         return class10021;
      } else {
         return null;
      }
   }

   @Override
   public String B() {
      return this.B.y();
   }

   private void C() {
      for (class10021 class10021 = this; class10021 != null; class10021 = class10021.z) {
         class10021.J++;
      }
   }

   private void D() {
      if (this.j > 0) {
         this.b |= 1;
      } else {
         this.b &= -2;
      }
   }

   private void F() {
      this.Q++;
      this.O++;
      this.C();
   }

   public void I() {
      this.S();
   }

   public class09937 c() {
      return this.R;
   }

   private int S() {
      if (this.j == 0) {
         return 0;
      } else {
         boolean flag = this.x();
         this.T &= -2;
         int ix = flag && !this.x() ? 1 : 0;

         for (class10021 class10021 : this.L) {
            if (class10021.j != 0) {
               ix += class10021.S();
            }
         }

         if (ix > 0) {
            this.j -= ix;
         }

         this.D();
         return ix;
      }
   }

   @Override
   public String Z() {
      return this.B.L();
   }

   private int Z(int var1) {
      boolean flag = this.x();
      this.T = class10057.y(this.T, var1);
      this.b = class10057.y(this.b, var1);
      this.M.U();
      this.M.E();
      int ix = !flag && this.x() ? 1 : 0;

      for (class10021 class10021 : this.L) {
         ix += class10021.Z(var1);
      }

      if (ix > 0) {
         this.j += ix;
      }

      return ix;
   }

   public void V() {
      if (this.i != null) {
         Iterator<List<class10016>> iterator = this.i.values().iterator();

         while (iterator.hasNext()) {
            Iterator<class10016> iterator1 = iterator.next().iterator();

            while (iterator1.hasNext()) {
               iterator1.next().L = true;
            }
         }

         this.i = null;
      }
   }

   void e() {
      this.C();
   }

   @Override
   public class09991 i() {
      return this.v;
   }

   public void i(int var1) {
      int ix = class10057.y(0, var1);
      boolean flag = this.x();
      this.T = class10057.y(this.T, ix);
      this.b = class10057.y(this.b, ix);
      if (!flag && this.x()) {
         this.U(1);
      }

      this.M.U();
      this.M.E();

      for (class10021 class10021 = this.z; class10021 != null; class10021 = class10021.z) {
         class10021.b = class10057.y(class10021.b, ix);
         class10021.M.E();
      }
   }

   public void b() {
      if (!this.d) {
         this.d = true;
         this.u(1);
      }
   }

   private boolean x() {
      return class10057.N(this.T, 1) || class10057.N(this.T, 2) || class10057.N(this.T, 4) || class10057.N(this.T, 8);
   }

   String s() {
      return this.s;
   }

   public class10002 n() {
      return this.G;
   }

   private void f() {
      this.I++;
   }

   public int l() {
      return this.k;
   }

   public int d() {
      return this.Y;
   }

   private void a() {
      this.U = -1;
      Iterator<class10021> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         iterator.next().a();
      }
   }

   @Override
   public boolean m() {
      return this.P;
   }

   public class09980 o() {
      return this.t;
   }

   private void p() {
      this.Q++;
      this.C();
   }

   public int k() {
      return this.O;
   }

   public class09980 t() {
      return this.l;
   }

   public int g() {
      return this.b;
   }

   public List<class09992> v() {
      return this.n;
   }

   public void j() {
      if (this.d) {
         this.d = false;
         this.u(1);
      }
   }

   public class09908 q() {
      return this.M;
   }

   @Override
   public class09938 U() {
      return this.B.N();
   }

   private void U(int var1) {
      if (var1 != 0) {
         for (class10021 class10021 = this; class10021 != null; class10021 = class10021.z) {
            class10021.j += var1;
            class10021.D();
         }
      }
   }

   private int z(int var1) {
      boolean flag = this.x();
      this.T &= ~var1;
      int ix = (var1 & 1) != 0 && flag && !this.x() ? 1 : 0;

      for (class10021 class10021 : this.L) {
         ix += class10021.z(var1);
      }

      this.b &= ~var1;
      if ((var1 & 1) != 0 && ix > 0) {
         this.j -= ix;
      }

      this.D();
      return ix;
   }

   @Override
   public String z() {
      return this.B.u();
   }

   public int u() {
      return this.L.size();
   }

   private void u(List<class10021> var1) {
      IdentityHashMap identityhashmap = new IdentityHashMap();

      for (class10021 class10021x : this.L) {
         identityhashmap.put(class10021x, Boolean.TRUE);
      }

      IdentityHashMap identityhashmap1 = new IdentityHashMap();

      for (class10021 class10021 : var1) {
         if (class10021 == null || class10021.z != this || !identityhashmap.containsKey(class10021)) {
            throw new IllegalArgumentException("Reordered child list contains an element outside this parent");
         }

         if (identityhashmap1.put(class10021, Boolean.TRUE) != null) {
            throw new IllegalArgumentException("Reordered child list contains duplicate elements");
         }
      }
   }

   public void u(boolean var1) {
      this.P = var1;
   }

   void u(String var1) {
      this.s = var1 != null && !var1.isBlank() ? var1 : null;
   }

   private static boolean u(class09980 var0, class09980 var1) {
      return var0.s() == var1.s() && var0.T() == var1.T() && var0.b() == var1.b();
   }

   public void u(int var1) {
      int ix = class10057.y(0, var1);
      int jx = this.Z(ix);

      for (class10021 class10021 = this.z; class10021 != null; class10021 = class10021.z) {
         class10021.b = class10057.y(class10021.b, ix);
         if (jx > 0) {
            class10021.j += jx;
         }

         class10021.M.E();
      }
   }

   public boolean y(class10021 var1) {
      if (var1 == null) {
         return false;
      } else {
         int ix = this.L.indexOf(var1);
         if (ix < 0) {
            return false;
         } else {
            this.B(ix);
            return true;
         }
      }
   }

   @Override
   public void y(class09867 var1, class09836 var2) {
      if (var1 != null && var2 != null && this.i != null) {
         List<class10016> list = this.i.get(var1);
         if (list != null) {
            list.removeIf(var1x -> {
               if (var1x.N != var2) {
                  return false;
               } else {
                  var1x.L = true;
                  return true;
               }
            });
            if (list.isEmpty()) {
               this.i.remove(var1);
            }
         }
      }
   }

   @Override
   public class10049 y() {
      return this.y;
   }

   public void y(int var1) {
      this.U = Math.max(-1, var1);
   }

   private static boolean y(class09980 var0, class09980 var1) {
      return N(var0.c(), var1.c()) && Objects.equals(var0.X(), var1.X());
   }

   @Override
   public void y(String var1) {
      String sx = var1 == null ? "" : var1;
      if (!this.B.L().equals(sx)) {
         this.B.y(sx);
         this.p();
         this.i(1);
      }
   }

   public void y(List<class10021> var1) {
      if (var1 == null || var1.size() != this.L.size()) {
         throw new IllegalArgumentException("Reordered child list must contain every current child exactly once");
      } else if (!this.L(var1)) {
         this.u(var1);
         this.L.clear();
         this.L.addAll(var1);
         this.A();
         this.i(2);
      }
   }

   public void y(boolean var1) {
      this.W = var1;
   }

   @Override
   public boolean E() {
      return this.W;
   }

   private void A() {
      this.g++;
      this.I++;
      this.C();
   }

   public boolean N(class09992 var1) {
      return var1 != null && class09963.N(this.n, var1);
   }

   @Override
   public void N(String var1) {
      String sx = var1 == null ? "" : var1;
      if (!this.B.y().equals(sx)) {
         this.B.N(sx);
         if (this.y == class10049.TEXT) {
            this.R.N("");
         }

         this.F();
         this.i(this.y == class10049.TEXT ? 2 : 1);
      }
   }

   public void N(class09991 var1) {
      this.v = var1 == null ? class09991.N : var1;
   }

   public void N(boolean var1) {
      this.E = var1;
   }

   private static boolean N(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   public class10021 N(int var1) {
      return this.L.get(var1);
   }

   public void N(class10002 var1, class09980 var2) {
      this.G = var1;
      this.l = var2;
   }

   public void N(class09980 var1) {
      class09980 class09980x = var1 == null ? class09968.N() : var1;
      class09980 class09980x = this.t;
      if (!Objects.equals(class09980x, class09980x)) {
         boolean flag = class09980x != null && class09980x.s() == class09969.FIXED;
         boolean flag1 = class09980x.s() == class09969.FIXED;
         if (this.Z != null && flag != flag1) {
            this.Z.N(flag1 ? 1 : -1);
         }

         boolean flag2 = class09980x != null && class09980x.L();
         boolean flag3 = class09980x.L();
         if (this.Z != null && flag2 != flag3) {
            this.Z.y(flag3 ? 1 : -1);
         }

         this.t = class09980x;
         this.N(class09980x, class09980x);
      }
   }

   @Override
   public String N() {
      return this.N;
   }

   public void N(List<class09992> var1) {
      this.n = class09963.N(var1);
   }

   @Override
   public void N(class09938 var1) {
      if (this.B.N() != var1) {
         this.B.N(var1);
         this.p();
         this.i(1);
      }
   }

   @Override
   public void N(class09867 var1, class09836 var2, class09876 var3) {
      if (var1 != null && var2 != null) {
         class09876 class09876 = var3 == null ? class09876.N : var3;
         if (this.i == null) {
            this.i = new EnumMap<>(class09867.class);
         }

         this.i.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(new class10016(var2, class09876));
      }
   }

   public void N(class09860 var1, boolean var2) {
      if (var1 != null && var1.i() != null && this.i != null) {
         List<class10016> list = this.i.get(var1.i());
         if (list != null && !list.isEmpty()) {
            for (class10016 class10016 : List.copyOf(list)) {
               if (!class10016.L && class10016.y.u() == var2) {
                  var1.N(class10016.y.R());

                  try {
                     class10016.N.handle(var1);
                  } finally {
                     var1.v();
                  }

                  if (class10016.y.i()) {
                     class10016.L = true;
                     list.remove(class10016);
                  }

                  if (var1.W()) {
                     break;
                  }
               }
            }

            if (list.isEmpty()) {
               this.i.remove(var1.i());
            }
         }
      }
   }

   public boolean N(class09867 var1) {
      if (var1 != null && this.i != null) {
         List<class10016> list = this.i.get(var1);
         if (list != null && !list.isEmpty()) {
            Iterator<class10016> iterator = list.iterator();

            while (iterator.hasNext()) {
               if (!iterator.next().L) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void N(int var1, class10021 var2) {
      if (var2 != null) {
         if (this.y == class10049.CANVAS) {
            throw new IllegalStateException("Element type '" + this.y + "' cannot have children");
         } else {
            int ix = class09693.N(var1, 0, this.L.size());
            var2.z = this;
            var2.a();
            var2.N(this.Z);
            this.L.add(ix, var2);
            if (var2.j > 0) {
               this.U(var2.j);
            }

            this.A();
            this.i(2);
         }
      }
   }

   public void N(class09841 var1) {
      class09841 class09841 = this.Z;
      if (class09841 != var1 && this.t != null && this.t.s() == class09969.FIXED) {
         if (class09841 != null) {
            class09841.N(-1);
         }

         if (var1 != null) {
            var1.N(1);
         }
      }

      if (class09841 != var1 && this.t != null && this.t.L()) {
         if (class09841 != null) {
            class09841.y(-1);
         }

         if (var1 != null) {
            var1.y(1);
         }
      }

      this.Z = var1;
      Iterator<class10021> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1);
      }
   }

   private void N(class09980 var1, class09980 var2) {
      this.w++;
      if (!y(var1, var2)) {
         this.k++;
      }

      if (!L(var1, var2)) {
         this.Y++;
      }

      this.C();
      if (!u(var1, var2)) {
         this.H();
      }
   }

   public void N(class10021 var1) {
      this.N(this.L.size(), var1);
   }

   @Override
   public void N(class09867 var1, class09836 var2) {
      this.N(var1, var2, class09876.N);
   }

   @Override
   public boolean W() {
      return this.m;
   }

   public boolean R(int var1) {
      return var1 == 1 ? this.j > 0 : class10057.N(this.b, var1);
   }

   public class10021 X() {
      return this.z;
   }

   public int O() {
      return this.J;
   }

   void H() {
      if (this.z != null) {
         this.z.f();
      }
   }

   public int G() {
      return this.w;
   }

   public int Y() {
      return this.g;
   }
}
