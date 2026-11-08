package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class class09792 {
   private final class09812 N;
   private final class09769 y;

   private class10021 L(class09799 var1) {
      return Objects.requireNonNull(var1.i(), "resolvedElement");
   }

   class09792(class09812 var1, class09769 var2) {
      super();
      this.N = Objects.requireNonNull(var1, "nodeSpecCompiler");
      this.y = var2 == null ? class09769.N : var2;
   }

   private void y(class10021 var1, List<class09799> var2) {
      if (var1.u() != 0) {
         ArrayList arraylist = new ArrayList(var1.u());
         ArrayList arraylist1 = new ArrayList();
         int i = 0;

         for (int j = 0; j < var1.u(); j++) {
            class10021 class10021 = var1.N(j);
            if (!class09774.N(class10021)) {
               arraylist1.add(class10021);
            } else if (class10021.T()) {
               arraylist.add(class10021);
            } else {
               if (i >= var2.size()) {
                  throw new IllegalStateException("Unplanned active child during reorder: " + class10021);
               }

               arraylist.add(Objects.requireNonNull(((class09799)var2.get(i)).i(), "resolvedElement"));
               i++;
            }
         }

         while (i < var2.size()) {
            arraylist.add(Objects.requireNonNull(((class09799)var2.get(i)).i(), "resolvedElement"));
            i++;
         }

         arraylist.addAll(arraylist1);
         var1.y(arraylist);
      }
   }

   private class10021 y(class09799 var1, class09810 var2) {
      if (!var1.R()) {
         return this.L(var1);
      } else {
         class10021 class10021 = Objects.requireNonNull(var1.y(), "existing");
         class10021.j();
         var1.N(class10021);
         this.N(class10021, var1, var2);
         return class10021;
      }
   }

   private void y(class09799 var1) {
      if (!var1.R()) {
         if (var1.i() == null) {
            this.N(var1);
         }
      } else {
         for (class09799 class09799 : var1.u().y()) {
            this.y(class09799);
         }
      }
   }

   class10021 N(class09799 var1, class09810 var2) {
      Objects.requireNonNull(var1, "plan");
      Objects.requireNonNull(var2, "options");
      if (!var1.R()) {
         return this.L(var1);
      } else {
         class10021 class10021 = Objects.requireNonNull(var1.y(), "existing");
         var1.N(class10021);
         this.N(class10021, var1, var2);
         return class10021;
      }
   }

   private class10021 N(class09799 var1) {
      class10021 class10021 = this.N.N(var1.N());
      this.N(var1, class10021);
      return class10021;
   }

   void N(class09811 var1) {
      Objects.requireNonNull(var1, "plan");
      this.y(var1.N());
   }

   class10021 N(class09798 var1) {
      return this.N.N(var1);
   }

   private void N(class09799 var1, class10021 var2) {
      var1.N(var2);
      List<class09799> list = var1.u().y();

      for (int i = 0; i < list.size(); i++) {
         this.N(list.get(i), var2.N(i));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void N(class10021 var1, class09798 var2) {
      switch (class09795.N[var2.y().ordinal()]) {
         case 1:
            var1.N(var2.M());
            break;
         case 2:
            var1.N(var2.M());
            var1.y(var2.B());
            break;
         case 3:
            var1.L(var2.Z());
            break;
         case 4:
            var1.N(var2.z());
         case 5:
      }
   }

   private void N(class10021 var1, class09779 var2, class09810 var3) {
      this.N(var1, var2.L());

      for (class09799 class09799 : var2.y()) {
         class10021 class10021x = this.y(class09799, var3);
         if (!class09799.R()) {
            var1.N(class10021x);
         }
      }

      for (class10021 class10021 : var2.u()) {
         if (class10021.X() == var1 && !class10021.T()) {
            class10021.b();
         }
      }

      this.y(var1, var2.y());
   }

   private void N(class10021 var1, class09799 var2, class09810 var3) {
      class09798 class09798 = var2.N();
      class09793<class09904> class09793 = class09817.y(class09798);
      if (class09793 != null) {
         class09793.N(var1);
      }

      var1.N(class09798.R());
      var1.N(class09798.i());
      var1.V();

      for (class09816 class09816 : class09798.u()) {
         var1.N(class09816.N(), class09816.y(), class09816.L());
      }

      this.N(var1, class09798);
      this.N(var1, var2.u(), var3);
   }

   private void N(class10021 var1, List<class10021> var2) {
      for (class10021 class10021 : var2) {
         if (class10021.X() == var1) {
            this.y.beforeDetach(class10021);
            var1.y(class10021);
         }
      }
   }
}
