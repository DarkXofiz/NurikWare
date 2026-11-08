package NurikWare;

import minecraft.class00381;
import minecraft.class08082;

public class class11912 extends class11889 {
   private static String[] y;

   public class11912() {
      super();
   }

   static {
      y();
   }

   private static void y() {
      y = new String[5];
      y[0] = "\n";
      y[1] = "";
      y[2] = " ";
      y[3] = "";
      y[4] = "╔════╗⚡FunTime.su⚡Режим:Гриферский-";
   }

   @Override
   public boolean N(class00381<?> var1) {
      return var1 instanceof class08082 ? ((class08082)var1).N().getString().replace(y[0], y[1]).replace(y[2], y[3]).startsWith(y[4]) : false;
   }
}
