package NurikWare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

final class class09797 {
   private final class10021 N;
   private final class09798 y;
   private final class09810 L;
   private final class09715 u;
   private final Set<class10021> i = Collections.newSetFromMap(new IdentityHashMap<>());

   private void L(class10021 var1) {
      if (var1 != null && !this.u(var1)) {
         this.i.add(var1);
      }
   }

   class09797(class10021 var1, class09798 var2, class09810 var3, class09715 var4) {
      super();
      this.N = Objects.requireNonNull(var1, "root");
      this.y = Objects.requireNonNull(var2, "spec");
      this.L = Objects.requireNonNull(var3, "options");
      this.u = Objects.requireNonNull(var4, "animationManager");
   }

   private boolean u(class10021 var1) {
      for (class10021 class10021 = var1; class10021 != null; class10021 = class10021.X()) {
         if (this.i.contains(class10021)) {
            return true;
         }
      }

      return false;
   }

   private boolean y(class10021 var1) {
      return !this.N(var1);
   }

   private void N(class10021 var1, class09798 var2, Set<class10021> var3, Set<class10021> var4, List<class10021> var5) {
      String s = class09800.N(var2);
      if (s != null) {
         for (int ix = var1.u() - 1; ix >= 0; ix--) {
            class10021 class10021 = var1.N(ix);
            if (class09774.N(class10021)
               && !var3.contains(class10021)
               && !var4.contains(class10021)
               && !this.u(class10021)
               && s.equals(class09800.N(class10021))
               && !class09800.N(class10021, var2)) {
               this.N(class10021, var4, var5);
            }
         }
      }
   }

   private class10021 N(class10021 var1, int var2) {
      int ix = 0;

      for (int j = 0; j < var1.u(); j++) {
         class10021 class10021 = var1.N(j);
         if (class09774.y(class10021) && !this.u(class10021)) {
            if (ix == var2) {
               return class10021;
            }

            ix++;
         }
      }

      return null;
   }

   private boolean N(class10021 var1) {
      return this.L.L() != class09787.REMOVE_IMMEDIATELY && class09771.N(var1, this.u);
   }

   private void N(class10021 var1, Set<class10021> var2, List<class10021> var3) {
      if (var2.add(var1)) {
         var3.add(var1);
         this.L(var1);
      }
   }

   class09811 N() {
      class09799 class09799 = class09800.N(this.N, this.y) ? this.N(this.N, this.y) : this.N(this.y);
      if (!class09799.R()) {
         this.L(this.N);
      }

      return new class09811(class09799);
   }

   private class09799 N(class09798 var1) {
      class09799 class09799 = new class09799(var1, null, class09790.INSERT);
      ArrayList arraylist = new ArrayList(var1.L().size());

      for (class09798 class09798 : var1.L()) {
         arraylist.add(this.N(class09798));
      }

      class09799.N(new class09779(arraylist, List.of(), List.of()));
      return class09799;
   }

   private class09779 N(class10021 var1, List<class09798> var2) {
      int ix = var1.u();
      if (var2.isEmpty() && ix == 0) {
         return class09779.N();
      } else {
         Set set = Collections.newSetFromMap(new IdentityHashMap(var2.size()));
         Set set1 = Collections.newSetFromMap(new IdentityHashMap(ix));
         Set set2 = Collections.newSetFromMap(new IdentityHashMap(ix));
         ArrayList arraylist = new ArrayList();
         ArrayList arraylist1 = new ArrayList();
         ArrayList arraylist2 = new ArrayList(var2.size());

         for (int j = 0; j < var2.size(); j++) {
            class09798 class09798 = (class09798)var2.get(j);
            this.N(var1, class09798, set, set1, arraylist);
            class10021 class10021 = this.N(var1, class09798, j, set);
            if (class10021 == null) {
               arraylist2.add(this.N(class09798));
            } else {
               set.add(class10021);
               set2.add(class10021);
               arraylist2.add(this.N(class10021, class09798));
            }
         }

         this.N(var1, set, set1, set2, arraylist, arraylist1);
         this.N(var1, set2);
         return new class09779(arraylist2, arraylist, arraylist1);
      }
   }

   private void N(class10021 var1, Set<class10021> var2, Set<class10021> var3, Set<class10021> var4, List<class10021> var5, List<class10021> var6) {
      for (int ix = 0; ix < var1.u(); ix++) {
         class10021 class10021 = var1.N(ix);
         if (class09774.N(class10021) && !var2.contains(class10021) && !var3.contains(class10021) && !this.u(class10021)) {
            if (this.y(class10021)) {
               this.N(class10021, var3, var5);
               var4.add(class10021);
            } else {
               if (!class10021.T()) {
                  var6.add(class10021);
               }

               var4.add(class10021);
            }
         }
      }
   }

   private void N(class10021 var1, Set<class10021> var2) {
      for (int ix = 0; ix < var1.u(); ix++) {
         class10021 class10021 = var1.N(ix);
         if (class09774.N(class10021) && !this.u(class10021) && !var2.contains(class10021)) {
            throw new IllegalStateException("Unplanned normal child during reconciliation: " + class10021);
         }
      }
   }

   private class09799 N(class10021 var1, class09798 var2) {
      class09799 class09799 = new class09799(var2, var1, class09790.REUSE);
      class09799.N(this.N(var1, var2.L()));
      return class09799;
   }

   private class10021 N(class10021 var1, class09798 var2, int var3, Set<class10021> var4) {
      if (class09800.N(var2) != null) {
         for (int ix = 0; ix < var1.u(); ix++) {
            class10021 class10021 = var1.N(ix);
            if (class09774.N(class10021) && !var4.contains(class10021) && !this.u(class10021) && class09800.N(class10021, var2)) {
               return class10021;
            }
         }

         return null;
      } else {
         class10021 class10021x = this.N(var1, var3);
         return class10021x != null && !var4.contains(class10021x) && class09800.N(class10021x, var2) ? class10021x : null;
      }
   }
}
