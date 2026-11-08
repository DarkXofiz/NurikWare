package NurikWare;

import java.util.stream.IntStream;

public class class11702 extends class11676 {
   public class11702(String var1) {
      super(var1);
   }

   @Override
   public int[] N(int var1) {
      return IntStream.iterate(var1 - 1, var0 -> var0 >= 0, var0 -> var0 - 1).toArray();
   }
}
