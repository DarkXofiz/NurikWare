package NurikWare;

public class class11602 {
   private static String[] N;

   private class11602() {
      super();
   }

   static {
      y();
   }

   private static void y() {
      N = new String[3];
      N[0] = "-";
      N[1] = ".";
      N[2] = "-.";
   }

   public static String N(float var0) {
      return Math.floor(var0) == var0 ? String.valueOf((int)var0) : String.valueOf(var0);
   }

   public static String N(float var0, String var1) {
      return N(var0) + var1;
   }

   public static boolean N(String var0) {
      return var0.isEmpty() || var0.equals(N[0]) || var0.equals(N[1]) || var0.equals(N[2]);
   }

   public static String N(String var0, String var1) {
      String s = var0.trim();
      return !var1.isBlank() && s.endsWith(var1) ? s.substring(0, s.length() - var1.length()).trim() : s;
   }
}
