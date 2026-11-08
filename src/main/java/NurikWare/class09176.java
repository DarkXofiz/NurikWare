package NurikWare;

import minecraft.class08522;
import minecraft.class08524;
import minecraft.class08876;

public class class09176 extends class08522 {
   public class09176(int var1) {
      super(var1, var1, class08524.N(class08876.N, String.valueOf(var1)));
   }

   protected boolean N(char var1) {
      return switch (var1) {
         case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
         default -> false;
      };
   }
}
