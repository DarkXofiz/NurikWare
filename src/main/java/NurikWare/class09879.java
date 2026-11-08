package NurikWare;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;

final class class09879 {
   private final class09872 N;
   private final Runnable y;
   private final class09874 L;
   private final Map<class09829, class09840<?>> u = new HashMap<>();
   private final Map<String, class09840<?>> i = new HashMap<>();
   private final Map<class09829, class09848<?>> R = new HashMap<>();
   private final Set<class09874> M = new HashSet<>();
   private final Set<class09829> B = new HashSet<>();
   private final Set<class09829> Z = new HashSet<>();
   private class09862 z;
   private boolean U;

   void L() {
      if (this.U) {
         for (class09829 class09829 : this.Z) {
            class09848<?> class09848 = this.R.get(class09829);
            if (class09848 != null) {
               class09848.y();
            }
         }

         this.u.entrySet().removeIf(var1 -> this.N(var1.getKey(), var1.getValue()));
         this.R.keySet().removeIf(var1 -> !this.Z.contains(var1));
         this.M.clear();
         this.B.clear();
         this.Z.clear();
         this.z = null;
         this.U = false;
      }
   }

   class09879(class09872 var1, Runnable var2, String var3) {
      super();
      this.N = Objects.requireNonNull(var1, "tickerManager");
      this.y = Objects.requireNonNull(var2, "requestRender");
      this.L = class09874.N(var3);
   }

   boolean i() {
      if (this.R.isEmpty()) {
         return false;
      } else {
         Iterator<class09848<?>> iterator = this.R.values().iterator();

         while (iterator.hasNext()) {
            if (iterator.next().N()) {
               return true;
            }
         }

         return false;
      }
   }

   void u() {
      for (class09829 class09829 : this.B) {
         class09840<?> class09840 = this.u.get(class09829);
         if (class09840 != null && class09840.L) {
            this.N(class09840);
         }
      }

      this.M.clear();
      this.B.clear();
      this.Z.clear();
      this.z = null;
      this.U = false;
   }

   <T extends class09819> T y(class09874 var1, String var2, Supplier<T> var3, class09783 var4) {
      class09829 class09829 = this.N(var1, var2, "ticker name");
      class09783 class09783 = this.N(var4);
      class09840<?> class09840 = this.u.get(class09829);
      if (class09840 != null) {
         if (!class09840.L) {
            throw new IllegalStateException("State name is already used by a value: " + class09829);
         } else {
            class09840.y = class09783;
            class09819 class09819 = (class09819)class09840.N;
            this.N(class09829, class09819);
            return (T)class09819;
         }
      } else {
         class09819 class09819x = this.N(var3, class09829);
         class09840 class09840x = new class09840<>(class09819x, class09783, true, this.y);
         this.u.put(class09829, class09840x);
         this.N(class09829, class09819x);
         return (T)class09819x;
      }
   }

   class09809 y() {
      return this.N(this.L);
   }

   private class09829 N(class09874 var1, String var2, String var3) {
      return new class09829(var1, class09853.N(var2, var3));
   }

   private void N(class09829 var1, class09819 var2) {
      this.B.add(var1);
      this.N.N(var2, this.y);
   }

   private void N(class09840<?> var1) {
      this.N.N((class09819)var1.N);
   }

   private boolean N(class09829 var1, class09840<?> var2) {
      boolean flag = this.B.contains(var1);
      if (var2.L && !flag) {
         this.N(var2);
      }

      boolean flag1 = var2.y == class09783.WHILE_MOUNTED && !this.M.contains(var1.N());
      if (flag1 && var2.L && flag) {
         this.N(var2);
      }

      return flag1;
   }

   private <T extends class09819> T N(Supplier<T> var1, class09829 var2) {
      return Objects.requireNonNull((T)Objects.requireNonNull(var1, "initialValue").get(), "Ticker supplier returned null: " + var2);
   }

   private <T> T N(Supplier<T> var1) {
      return (T)(var1 == null ? null : var1.get());
   }

   private class09783 N(class09783 var1) {
      return var1 == null ? class09783.WHILE_MOUNTED : var1;
   }

   void N(class09874 var1, String var2) {
      class09840<?> class09840 = this.u.remove(this.N(var1, var2, "state name"));
      if (class09840 != null && class09840.L) {
         this.N(class09840);
      }
   }

   <T> class09785<T> N(String var1, Supplier<T> var2) {
      String s = class09853.N(var1, "app state name");
      class09840<?> class09840 = this.i.get(s);
      if (class09840 != null) {
         return (class09785<T>)class09840;
      } else {
         class09840 class09840x = new class09840<>(this.N(var2), class09783.MANUAL, false, this.y);
         this.i.put(s, class09840x);
         return class09840x;
      }
   }

   <T> class09785<T> N(class09874 var1, String var2, Supplier<T> var3, class09783 var4) {
      class09829 class09829 = this.N(var1, var2, "state name");
      class09783 class09783 = this.N(var4);
      class09840<?> class09840 = this.u.get(class09829);
      if (class09840 != null) {
         if (class09840.L) {
            throw new IllegalStateException("State name is already used by a ticker: " + class09829);
         } else {
            class09840.y = class09783;
            return (class09785<T>)class09840;
         }
      } else {
         class09840 class09840x = new class09840<>(this.N(var3), class09783, false, this.y);
         this.u.put(class09829, class09840x);
         return class09840x;
      }
   }

   class09809 N(class09874 var1) {
      if (!this.U) {
         throw new IllegalStateException("State scope can only be opened while rendering");
      } else if (!this.M.add(var1)) {
         throw new IllegalStateException("Duplicate state scope path: " + var1);
      } else {
         return new class09845(this, var1);
      }
   }

   void N() {
      if (this.U) {
         throw new IllegalStateException("Stateful render is already in progress");
      } else {
         this.M.clear();
         this.B.clear();
         this.Z.clear();
         this.z = null;
         this.U = true;
      }
   }

   <C> class09798 N(class09874 var1, String var2, class09788<C> var3, C var4) {
      String s = class09853.N(var2, "component key");
      class09788 class09788 = Objects.requireNonNull(var3, "component");
      class09874 class09874 = var1.y(s);
      class09809 class09809 = this.N(class09874);
      return Objects.requireNonNull(class09788.render(var4, class09809), "Stateful component returned null: " + class09874);
   }

   <T> class09798 N(class09804<T> var1, T var2, Supplier<class09798> var3) {
      Objects.requireNonNull(var1, "context");
      Objects.requireNonNull(var3, "render");
      class09862 class09862 = this.z;
      this.z = new class09862(class09862, var1, var2);

      class09798 class09798;
      try {
         class09798 = Objects.requireNonNull((class09798)var3.get(), "Context provider returned null: " + var1);
      } finally {
         this.z = class09862;
      }

      return class09798;
   }

   <T> T N(class09804<T> var1) {
      class09804 class09804 = Objects.requireNonNull(var1, "context");
      Object object = this.z == null ? class09862.N : this.z.N(class09804);
      if (object != class09862.N) {
         return (T)object;
      } else if (class09804.N()) {
         return (T)class09804.y();
      } else {
         throw new class09775("Missing context: " + class09804);
      }
   }

   <T> T N(class09874 var1, String var2, Supplier<T> var3, class09805<T> var4) {
      class09829 class09829 = this.N(var1, var2, "observable name");
      Supplier supplier = Objects.requireNonNull(var3, "snapshot");
      class09805 class09805 = Objects.requireNonNull(var4, "changeDetector");
      Object object = supplier.get();
      class09848<?> class09848 = this.R.get(class09829);
      if (class09848 == null) {
         this.R.put(class09829, new class09848<>(object, supplier, class09805));
      } else {
         class09848.y = object;
         class09848.L = supplier;
         class09848.u = class09805;
      }

      this.Z.add(class09829);
      return (T)object;
   }
}
