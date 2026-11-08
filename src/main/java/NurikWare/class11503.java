package NurikWare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class class11503 {
   private static String[] u;
   public static Object N_0;

   private class11503() {
      super();
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      N();
      u();
      class11539 class11539 = new class11539();
      class11508 class11508 = new class11508();
      class11513 class11513 = new class11513();
      N_0 = List.of(class11539, class11508, class11513, new class11489());
   }

   private static void u() {
   }

   public static List<class11510> N(String var0, int var1) {
      if (var1 != 0 && var0 != null && !var0.isBlank()) {
         String s = var0.trim().toLowerCase();
         ArrayList arraylist = new ArrayList();
         Iterator iterator = ((List)N_0).iterator();

         while (iterator.hasNext()) {
            ((class11526)iterator.next()).N(s, var1, arraylist);
         }

         arraylist.sort(Comparator.comparingInt(class11510::L).reversed());
         return arraylist;
      } else {
         return List.of();
      }
   }

   private static void N() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }
}
