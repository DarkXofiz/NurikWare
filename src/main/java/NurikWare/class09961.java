package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class class09961 {
   private final class09715 N;

   private void L(class10021 var1) {
      this.u(var1);

      for (int i = 0; i < var1.u(); i++) {
         class10021 class10021 = var1.N(i);
         this.L(class10021);
      }
   }

   private static class10002 M(class10021 var0) {
      class09991 class09991 = var0.i();
      return class09991 == null ? class10002.N : class09991.U();
   }

   private class09961(class09781 var1) {
      super();
      this.N = class09715.N(Objects.requireNonNull(var1, "context"));
   }

   private static class10002 B(class10021 var0) {
      class09991 class09991 = var0.i();
      return class09991 == null ? class10002.N : class09991.E();
   }

   private static class10002 Z(class10021 var0) {
      List<class09992> list = var0.v();
      if (list.isEmpty()) {
         return class10002.N;
      } else {
         ArrayList arraylist = new ArrayList();

         for (class10021 class10021x = var0.X(); class10021x != null; class10021x = class10021x.X()) {
            arraylist.add(class10021x);
         }

         class10002 class10002 = class10002.N;

         for (int i = arraylist.size() - 1; i >= 0; i--) {
            class10021 class10021 = (class10021)arraylist.get(i);
            class09991 class09991 = class10021.i();
            if (class09991 != null && !class09991.z().N()) {
               class10002 class10002x = class09991.z().N(list, class10021.E(), class10021.W(), class10021.m());
               class10002 = class10002.N(class10002x);
            }
         }

         return class10002;
      }
   }

   private void i(class10021 var1) {
      for (int i = 0; i < var1.u(); i++) {
         this.L(var1.N(i));
      }
   }

   private void u(class10021 var1) {
      class09980 class09980xx = var1.o();
      class09980 class09980x = R(var1);
      class09980 class09980xx = this.N.N(var1, class09980xx, class09980x, M(var1));
      var1.N(class09980xx);
      var1.N(class09980xx.I());
      boolean flag = !class09980x.N(class09980xx);
      boolean flag1 = !class09980x.y(class09980xx);
      boolean flag2 = !class09980x.L(class09980xx);
      if (flag) {
         var1.i(2);
      } else if (flag1) {
         var1.i(4);
      } else {
         if (flag2) {
            var1.i(1);
         }
      }
   }

   public void y(class10021 var1) {
      if (var1 != null) {
         this.u(var1);
      }
   }

   private static boolean N(class09991 var0, boolean var1, boolean var2, boolean var3) {
      if (var0 != null && !var0.z().N()) {
         class10006 class10006 = var0.z();
         return var1 && class10006.N(class09979.HOVER) || var2 && class10006.N(class09979.FOCUS) || var3 && class10006.N(class09979.ACTIVE);
      } else {
         return false;
      }
   }

   public static class09961 N(class09781 var0) {
      return var0.N(class09961.class).orElseGet(() -> {
         class09961 class09961 = new class09961(var0);
         var0.N(class09961.class, class09961);
         return class09961;
      });
   }

   public void N(class10021 var1, boolean var2, boolean var3, boolean var4) {
      if (var1 != null) {
         boolean flag = var1.E() != var2;
         boolean flag1 = var1.W() != var3;
         boolean flag2 = var1.m() != var4;
         if (flag || flag1 || flag2) {
            var1.y(var2);
            var1.L(var3);
            var1.u(var4);
            this.y(var1);
            if (N(var1.i(), flag, flag1, flag2)) {
               this.i(var1);
            }
         }
      }
   }

   public void N(class09904 var1) {
      if (var1 instanceof class10021 class10021) {
         this.L(class10021);
      }
   }

   public void N(class10021 var1) {
      if (var1 != null) {
         this.L(var1);
      }
   }

   private static class09980 R(class10021 var0) {
      class09980 class09980x = var0.y() == class10049.INPUT ? class09968.y() : class09968.N();
      class09991 class09991 = var0.i();
      class10002 class10002 = class09991 == null ? class10002.N : class09991.N(var0.E(), var0.W(), var0.m());
      class10002 = class10002.N(Z(var0));
      if (var0.T()) {
         return B(var0).N(class10002.N(class09980x));
      } else if (class10002.equals(var0.n())) {
         return var0.t();
      } else {
         class09980 class09980x = class10002.N(class09980x);
         var0.N(class10002, class09980x);
         return class09980x;
      }
   }
}
