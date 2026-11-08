package NurikWare;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class class11539 extends class11526 {
   public class11539() {
      super();
   }

   private void N(class11067 var1, String var2, List<String> var3, List<class11510> var4) {
      int i = this.N(var1.L(), var2);
      if (i != 0) {
         var4.add(new class11510(var3, var1, i));
      } else {
         i = this.N(var1.N(), var2);
         if (i != 0) {
            var4.add(new class11510(var3, var1, i));
         }
      }
   }

   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      boolean flag = (var2 & 1) != 0;
      boolean flag1 = (var2 & 2) != 0;
      if (flag || flag1) {
         for (class11067 class11067 : class11938.u().NN()) {
            String s = class12020.N(class11067.M().N());
            String s1 = class11067.L();
            if (flag) {
               this.N(class11067, var1, List.of(s), var3);
            }

            if (flag1) {
               this.N((class11512)class11067, var1, List.of(s, s1), var3);
            }
         }
      }
   }

   private void N(class11512 var1, String var2, List<String> var3, List<class11510> var4) {
      Iterator<Entry<String, class11536<?>>> iterator = var1.w().entrySet().iterator();

      while (iterator.hasNext()) {
         class11536<?> class11536 = iterator.next().getValue();
         class11536.m();
         if (!class11536.E()) {
            return;
         }

         String s = class12020.N(class11536.P());
         int i = this.N(s, var2);
         if (i != 0) {
            var4.add(new class11510(var3, class11536, i));
         }

         this.N(class11536, var2, this.N(var3, s), var4);
      }
   }
}
