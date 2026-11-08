package NurikWare;

import java.net.SocketException;
import java.util.Locale;

public class class10639 {
   private static String[] y;

   private class10639() {
      super();
   }

   static {
      N();
   }

   private static void N() {
      y = new String[1];
      y[0] = "connection reset";
   }

   public static boolean N(Throwable var0) {
      if (!(var0 instanceof SocketException socketexception)) {
         return false;
      } else {
         String s = socketexception.getMessage();
         return s != null && s.toLowerCase(Locale.ROOT).contains(y[0]);
      }
   }
}
