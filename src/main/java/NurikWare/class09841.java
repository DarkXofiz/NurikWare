package NurikWare;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class class09841 {
   private final class09781 N;
   private final class09715 y;
   private final class10037 L;
   private final class09961 u;
   private final class09792 i;
   private final class09776 R;
   private class10021 M;
   private float B;
   private float Z;
   private final Map<String, class10021> z = new HashMap<>();
   private final List<class10021> U = new ArrayList<>();
   private final List<class10021> E = new ArrayList<>();
   private int W;
   private int m;
   private List<class10021> P = List.of();
   private final ArrayList<class10021> s = new ArrayList<>();
   private class10021 T;
   private int b = -1;
   private boolean j;

   private void L(class10021 var1) {
      if (var1 != null) {
         this.N.i().y(var1);
         this.y.u(var1);
         this.L.N(var1);
      }
   }

   public String L() {
      return class09820.y(this.M, class09791.N());
   }

   public float M() {
      return this.Z;
   }

   public class09841(class09781 var1, class09798 var2) {
      super();
      this.N = Objects.requireNonNull(var1, "context");
      this.y = class09715.N(var1);
      this.L = class10037.N(var1);
      this.u = class09961.N(var1);
      this.i = new class09792(new class09812(), this::L);
      this.R = new class09776();
      class09798 class09798 = Objects.requireNonNull(var2, "rootSpec");
      this.M = this.i.N(class09798);
      this.M.N(this);
      this.u.N((class09904)this.M);
   }

   public class09841(class09781 var1, class09904 var2) {
      this(var1, var2, new class09812());
   }

   class09841(class09781 var1, class09904 var2, class09812 var3) {
      super();
      this.N = Objects.requireNonNull(var1, "context");
      this.y = class09715.N(var1);
      this.L = class10037.N(var1);
      this.u = class09961.N(var1);
      this.i = new class09792(Objects.requireNonNull(var3, "nodeSpecCompiler"), this::L);
      this.R = new class09776();
      this.M = Objects.requireNonNull((class10021)var2, "root");
      this.M.N(this);
   }

   public boolean B() {
      ArrayList arraylist = new ArrayList();
      this.y(this.M, arraylist);
      if (arraylist.isEmpty()) {
         return false;
      } else {
         for (class10021 class10021 : arraylist) {
            this.L(class10021);
            if (class10021.X() != null) {
               class10021.X().y(class10021);
            }
         }

         return true;
      }
   }

   private boolean Z() {
      this.U.clear();
      this.E.clear();
      N(this.M, this.U, this.E);
      if (this.U.isEmpty() && this.E.isEmpty()) {
         return false;
      } else {
         this.z.clear();
         N(this.M, this.z);
         boolean flag = false;

         for (class10021 class10021xxx : this.U) {
            class10021 class10021x = this.z.get(class10021xxx.o().x());
            if (class10021x != null && class10021x != class10021xxx) {
               flag |= class09818.N(class10021xxx, class09878.N(class10021x), this.B, this.Z);
            }
         }

         for (class10021 class10021x : this.E) {
            class10021 class10021xx = this.z.get(class10021x.o().x());
            if (class10021xx != null && class10021xx != class10021x) {
               flag |= class09818.N(class10021x, N(class10021xx), this.B, this.Z);
            }
         }

         return flag;
      }
   }

   public boolean i() {
      return this.W > 0;
   }

   public List<class10021> u() {
      if (this.M == null) {
         return List.of();
      } else {
         int ix = this.M.O();
         if (this.j && this.T == this.M && this.b == ix) {
            return this.P;
         } else {
            this.s.clear();
            N(this.M, this.s);
            if (this.s.size() > 1) {
               this.s.sort(Comparator.comparingInt(var0 -> var0.c().z()));
            }

            this.P = this.s.isEmpty() ? List.of() : List.copyOf(this.s);
            this.T = this.M;
            this.b = ix;
            this.j = true;
            return this.P;
         }
      }
   }

   public void y(int var1) {
      this.m = Math.max(0, this.m + var1);
   }

   public class09904 y() {
      return this.M;
   }

   private void y(class10021 var1, List<class10021> var2) {
      if (var1 != null) {
         for (int ix = var1.u() - 1; ix >= 0; ix--) {
            class10021 class10021 = var1.N(ix);
            if (class10021.T() && !this.y.N(class10021)) {
               var2.add(class10021);
            } else {
               this.y(class10021, var2);
            }
         }
      }
   }

   public class09773 y(class09791 var1) {
      return class09820.N(this.M, var1);
   }

   private void y(class10021 var1) {
      if (var1 != null) {
         ArrayDeque arraydeque = new ArrayDeque();
         arraydeque.push(var1);

         while (!arraydeque.isEmpty()) {
            class10021 class10021 = (class10021)arraydeque.pop();
            if (class10021.T()) {
               this.N.i().y(class10021);
            } else {
               for (int ix = 0; ix < class10021.u(); ix++) {
                  arraydeque.push(class10021.N(ix));
               }
            }
         }
      }
   }

   private static class10021 N(class10021 var0, String var1) {
      if (var1.equals(var0.N())) {
         return var0;
      } else {
         for (int ix = 0; ix < var0.u(); ix++) {
            class10021 class10021 = N(var0.N(ix), var1);
            if (class10021 != null) {
               return class10021;
            }
         }

         return null;
      }
   }

   private static void N(class10021 var0, List<class10021> var1, List<class10021> var2) {
      class09980 class09980 = var0.o();
      if (class09980.x() != null) {
         if (class09980.s() == class09969.FIXED) {
            var1.add(var0);
         } else if (class09980.s() == class09969.FLOATING) {
            var2.add(var0);
         }
      }

      for (int ix = 0; ix < var0.u(); ix++) {
         N(var0.N(ix), var1, var2);
      }
   }

   private static void N(class10021 var0, Map<String, class10021> var1) {
      String sx = var0.N();
      if (sx != null) {
         var1.putIfAbsent(sx, var0);
      }

      for (int ix = 0; ix < var0.u(); ix++) {
         N(var0.N(ix), var1);
      }
   }

   public boolean N(float var1, float var2, float var3, boolean var4) {
      this.B = Math.max(0.0F, var1);
      this.Z = Math.max(0.0F, var2);
      if (var4 && this.M != null && this.m != 0) {
         class09839.N(this.M);
         boolean flag = this.Z();
         return flag | class09839.N(this.M, var3);
      } else {
         return false;
      }
   }

   public class09781 N() {
      return this.N;
   }

   private void N(class09799 var1) {
      this.L(this.M);
      this.M.N(null);
      this.M = Objects.requireNonNull(var1.i(), "resolvedElement");
      this.M.N(this);
   }

   public void N(int var1) {
      this.W = Math.max(0, this.W + var1);
   }

   private static void N(class10021 var0, List<class10021> var1) {
      class09980 class09980 = var0.o();
      if (class09980.g() && !(class09980.f() <= 0.0F)) {
         for (class10021 class10021 : class10047.N(var0)) {
            if (class10019.N(class10021)) {
               var1.add(class10021);
            }

            N(class10021, var1);
         }
      }
   }

   public class09904 N(class09798 var1, class09810 var2) {
      Objects.requireNonNull(var1, "spec");
      Objects.requireNonNull(var2, "options");
      class09811 class09811 = this.R.N(this.M, var1, var2, this.y);
      this.i.N(class09811);
      if (class09811.N().R()) {
         this.i.N(class09811.N(), var2);
      } else {
         this.N(class09811.N());
      }

      this.y(this.M);
      this.u.N(this.M);
      this.B();
      return this.M;
   }

   public class09904 N(class09798 var1) {
      return this.N(var1, class09810.N());
   }

   public String N(class09791 var1) {
      return class09820.y(this.M, var1);
   }

   public class09849 N(String var1) {
      if (var1 != null && this.M != null) {
         class10021 class10021 = N(this.M, var1);
         return class10021 == null ? null : class09878.N(class10021);
      } else {
         return null;
      }
   }

   private static class09849 N(class10021 var0) {
      return new class09849(var0.c().y(), var0.c().L(), var0.c().u(), var0.c().i());
   }

   public float R() {
      return this.B;
   }
}
