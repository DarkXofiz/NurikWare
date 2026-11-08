package NurikWare;

import java.util.List;

public class class11489 extends class11526 {
   private static String[] L;
   public static Object N_0 = new class12018(L[0]);

   public class11489() {
      super();
   }

   static {
      i();
      N();
   }

   private static void i() {
      L = new String[1];
      L[0] = "category.accounts";
   }

   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      if ((var2 & 16) != 0) {
         List list = List.of(class12020.N((class12018)N_0));

         for (class09250 class09250 : class11938.s().u()) {
            int i = this.N(class09250.u(), var1);
            if (i != 0) {
               var3.add(new class11510(list, class09250, i));
            }
         }
      }
   }

   private static void N() {
   }
}
