package NurikWare;

import java.util.List;

public class class11513 extends class11526 {
   public class11513() {
      super();
   }

   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      if ((var2 & 8) != 0) {
         for (class11882 class11882 : class11938.n().y().values()) {
            int i = this.N(class11882.y(), var1);
            if (i != 0) {
               var3.add(new class11510(List.of(class12020.N(class11882.i().N())), class11882, i));
            }
         }
      }
   }
}
