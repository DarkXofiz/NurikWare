package NurikWare;

import java.util.ArrayList;
import java.util.Collections;

public class class11673 extends class11676 {
   public class11673(String var1) {
      super(var1);
   }

   static {
      N();
   }

   @Override
   public int[] N(int var1) {
      ArrayList arraylist = new ArrayList();

      for (int i = 0; i < var1; i++) {
         arraylist.add(i);
      }

      Collections.shuffle(arraylist);
      return arraylist.stream().mapToInt(var0 -> var0).toArray();
   }

   private static void N() {
   }
}
