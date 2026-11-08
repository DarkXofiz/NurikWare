package NurikWare;

import java.util.List;

public class class11508 extends class11526 {
   private static String[] L;
   public static Object N_0 = new class12018(L[0]);

   private static void L() {
   }

   public class11508() {
      super();
   }

   static {
      i();
      L();
   }

   private static void i() {
      L = new String[1];
      L[0] = "category.configs";
   }

   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      if ((var2 & 4) != 0) {
         List list = List.of(class12020.N((class12018)N_0));

         for (class11290 class11290 : class11938.G().L()) {
            if (class11290.M() != class11296.DELETING) {
               int i = this.N(class11290.i(), var1);
               int j = this.N(class11290.z(), var1);
               int k = Math.max(i, j);
               if (k != 0) {
                  var3.add(new class11510(list, class11290, k));
               }
            }
         }
      }
   }
}
