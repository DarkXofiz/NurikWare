package NurikWare;

import minecraft.class01929;
import minecraft.class03519;
import minecraft.class04105;
import minecraft.class07709;
import minecraft.class07713;

public class class11917 {
   public static Object N_0;
   public static Object N_1;

   private class11917() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      i();
   }

   private static void i() {
      N_0 = null;
      N_1 = null;
   }

   public static class03519<class07709> y() {
      if ((class03519)N_1 == null) {
         N_1 = N().N(class07713.N);
      }

      return (class03519<class07709>)N_1;
   }

   public static class01929 N() {
      if ((class01929)N_0 == null) {
         N_0 = class04105.N();
      }

      return (class01929)N_0;
   }
}
