package NurikWare;

import java.util.ArrayList;
import java.util.List;

public class class11578 {
   private static String[] L;
   public static Object N_0 = new ArrayList();
   public static Object N_1 = N(new class11588(L[1], 400));
   public static Object N_2 = N(new class11580(L[2], 1200));
   public static Object N_3 = N(new class11589(L[3], 400));

   private static void L() {
      L = new String[4];
      L[0] = "This is a utility class and cannot be instantiated";
      L[1] = "Пласт";
      L[2] = "Пласт";
      L[3] = "Пласт";
   }

   private class11578() {
      super();
      throw new UnsupportedOperationException(L[0]);
   }

   static {
      L();
      u();
   }

   private static void u() {
   }

   private static <T extends class11547> T N(T var0) {
      ((List)N_0).add(var0);
      return (T)var0;
   }
}
