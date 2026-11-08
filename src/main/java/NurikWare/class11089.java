package NurikWare;

import java.util.regex.Pattern;

public class class11089 {
   public static Object N_0 = Pattern.compile("(?<=[A-Z])(?=[A-Z][a-z])|(?<=[a-z])(?=[A-Z])");

   private class11089() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      N();
   }

   private static void N() {
      N_0 = null;
   }

   public static String N(String var0) {
      return ((Pattern)N_0).matcher(var0).replaceAll(" ");
   }
}
