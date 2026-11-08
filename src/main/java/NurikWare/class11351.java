package NurikWare;

import java.util.Locale;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;

public class class11351 {
   private static String[] L;
   public static Object N_0 = LogManager.getLogger(String.class);

   private class11351() {
      super();
      throw new UnsupportedOperationException(L[0]);
   }

   static {
      i();
      u();
   }

   private static void i() {
      L = new String[1];
      L[0] = "This is a utility class and cannot be instantiated";
   }

   private static void u() {
   }

   public static String N() {
      String s = RandomStringUtils.insecure().nextAlphabetic(10, 15).toLowerCase(Locale.ENGLISH);
      StringBuilder stringbuilder = new StringBuilder();
      char[] achar = s.toCharArray();

      for (int i = 0; i < achar.length; i++) {
         char c0 = achar[i];
         if (i == 0) {
            stringbuilder.append(Character.toUpperCase(c0));
         } else {
            stringbuilder.append(c0);
         }
      }

      return stringbuilder.toString();
   }

   public static void N(String var0) {
      class11938.s().L(new class09250(class11991.N(var0), false, System.currentTimeMillis()));
   }
}
