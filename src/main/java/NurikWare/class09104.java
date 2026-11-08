package NurikWare;

public class class09104 {
   private static String[] u;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;

   private static void L() {
      N_0 = 1;
      N_1 = 2;
      N_2 = 4;
      N_3 = 8;
      N_4 = 16;
   }

   private class09104() {
      super();
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      y();
      L();
   }

   private static void y() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }

   public static boolean N(int var0, int var1) {
      return (var0 & var1) == var1;
   }
}
