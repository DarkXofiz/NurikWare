package NurikWare;

import java.util.ArrayList;
import java.util.List;

public final class class09863 {
   private class09863() {
      super();
   }

   public static void N(class09860 var0) {
      if (var0 != null && var0.R() != null && var0.i() != null) {
         List<class10021> list = N(var0.R());
         if (!list.isEmpty()) {
            for (int i = 0; i < list.size() - 1; i++) {
               class10021 class10021xx = list.get(i);
               var0.N(class10021xx);
               var0.N(class09875.CAPTURE);
               class10021xx.N(var0, true);
               if (var0.E()) {
                  return;
               }
            }

            class10021 class10021 = list.getLast();
            var0.N(class10021);
            var0.N(class09875.AT_TARGET);
            class10021.N(var0, true);
            if (!var0.W()) {
               class10021.N(var0, false);
            }

            if (!var0.E() && var0.B()) {
               for (int j = list.size() - 2; j >= 0; j--) {
                  class10021 class10021x = list.get(j);
                  var0.N(class10021x);
                  var0.N(class09875.BUBBLE);
                  class10021x.N(var0, false);
                  if (var0.E()) {
                     return;
                  }
               }
            }
         }
      }
   }

   private static List<class10021> N(class09904 var0) {
      ArrayList arraylist = new ArrayList();

      for (class10021 class10021 = (class10021)var0; class10021 != null; class10021 = class10021.X()) {
         arraylist.add(class10021);
      }

      ArrayList arraylist1 = new ArrayList(arraylist.size());

      for (int i = arraylist.size() - 1; i >= 0; i--) {
         arraylist1.add((class10021)arraylist.get(i));
      }

      return arraylist1;
   }
}
