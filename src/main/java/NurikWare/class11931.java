package NurikWare;

import minecraft.class00381;
import minecraft.class08082;

public class class11931 extends class11889 {
   private static String[] N;

   public class11931() {
      super();
   }

   static {
      N();
   }

   @Override
   public boolean N(class00381<?> var1) {
      return var1 instanceof class08082 ? ((class08082)var1).N().getString().replace(N[0], N[1]).replace(N[2], N[3]).startsWith(N[4]) : false;
   }

   private static void N() {
      N = new String[5];
      N[0] = "\n";
      N[1] = "";
      N[2] = " ";
      N[3] = "";
      N[4] = "╔════╗⚡FunTime.su⚡Режим:Хаб#";
   }
}
