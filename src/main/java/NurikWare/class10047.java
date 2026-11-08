package NurikWare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class class10047 {
   private class10047() {
      super();
   }

   private static boolean y(class10021 var0) {
      return class10019.L(var0) || !var0.o().T();
   }

   public static List<class10021> N(class10021 var0) {
      if (var0 != null && var0.u() != 0) {
         int i = var0.u();
         class09908 class09908 = var0.q();
         int j = var0.Y();
         int k = var0.Q();
         if (class09908.N(j, k, i)) {
            return class09908.N();
         } else {
            ArrayList arraylist = new ArrayList(i);
            ArrayList arraylist1 = new ArrayList();

            for (int l = 0; l < i; l++) {
               class10021 class10021 = var0.N(l);
               if (y(class10021)) {
                  arraylist1.add(class10021);
               } else {
                  arraylist.add(class10021);
               }
            }

            arraylist1.sort(Comparator.comparingInt(var0x -> var0x.c().z()));
            ArrayList arraylist2 = new ArrayList(i);
            arraylist2.addAll(arraylist);
            arraylist2.addAll(arraylist1);
            class09908.N(arraylist2, j, k, i);
            return class09908.N();
         }
      } else {
         return List.of();
      }
   }
}
