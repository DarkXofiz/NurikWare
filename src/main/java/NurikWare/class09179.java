package NurikWare;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class class09179 {
   private static String[] L;
   public static Object N_0 = new class09179()::N;

   private class09179() {
      super();
   }

   static {
      y();
      u();
      N();
   }

   private static void u() {
      L = new String[1];
      L[0] = "presetsRevision";
   }

   private static void y() {
   }

   private static void N() {
   }

   private class09798 N(Void var1, class09809 var2) {
      var2.L(L[0], class11938.G()::N);
      ArrayList arraylist = new ArrayList();

      for (class11290 class11290 : class11938.G().L()) {
         if (class11290.M() != class11296.DELETING) {
            arraylist.add(class11290);
         }
      }

      arraylist.sort((var0, var1x) -> Long.compare(var1x.B(), var0.B()));
      class09184.N(arraylist.stream().map(class11290::u).collect(Collectors.toSet()));
      return class09778.N((class09991)class09198.N_0, var2x -> var2x.N_3((class09991)class09198.N_2, var2xx -> {
         for (int i = 0; i < arraylist.size(); i++) {
            class11290 class11290x = (class11290)arraylist.get(i);
            var2xx.y(var2.N("preset:" + class11290x.u(), (class09788<class09207>)class09184.L_1, new class09207(class11290x, i == arraylist.size() - 1)));
         }
      }));
   }
}
