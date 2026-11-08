package NurikWare;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class class09191 {
   private static String[] u;
   public static Object N_0 = new class09191()::N;

   private class09191() {
      super();
   }

   static {
      N();
      y();
   }

   private static void y() {
   }

   private static void N() {
      u = new String[1];
      u[0] = "accountsRevision";
   }

   private class09798 N(Void var1, class09809 var2) {
      class10945 class10945 = class11938.s();
      var2.L(u[0], class10945::N);
      List<class09250> list = class10945.u()
         .stream()
         .sorted(Comparator.<class09250>comparingInt(var0 -> var0.y() ? 0 : 1).thenComparing(Comparator.comparingLong(class09250::M).reversed()))
         .toList();
      class11727.N(list.stream().map(class09250::R).collect(Collectors.toSet()));
      return class09778.N((class09991)class09198.N_0, var2x -> var2x.N_3((class09991)class09198.N_2, var2xx -> {
         for (class09250 class09250 : list) {
            var2xx.y(var2.N("account:" + class09250.R(), (class09788<class11757>)class11727.B_1, new class11757(class09250)));
         }
      }));
   }
}
