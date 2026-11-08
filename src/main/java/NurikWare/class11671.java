package NurikWare;

import java.util.stream.IntStream;

public class class11671 extends class11676 {
   public class11671(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      N();
   }

   private static void N() {
   }

   @Override
   public int[] N(int var1) {
      return IntStream.iterate(0, var1x -> var1x < var1, var0 -> var0 + 1).toArray();
   }
}
