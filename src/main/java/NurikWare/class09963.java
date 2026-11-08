package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class class09963 {
   private class09963() {
      super();
   }

   public static List<class09992> N(List<class09992> var0) {
      if (var0 != null && !var0.isEmpty()) {
         ArrayList arraylist = new ArrayList(var0.size());

         for (class09992 class09992 : var0) {
            if (class09992 != null && !N(arraylist, class09992)) {
               arraylist.add(class09992);
            }
         }

         return arraylist.isEmpty() ? List.of() : List.copyOf(arraylist);
      } else {
         return List.of();
      }
   }

   public static boolean N(List<class09992> var0, class09992 var1) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if ((class09992)iterator.next() == var1) {
            return true;
         }
      }

      return false;
   }
}
