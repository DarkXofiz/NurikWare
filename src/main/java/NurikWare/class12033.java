package NurikWare;

public class class12033 {
   private class12033() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   private static String u(String var0) {
      return var0.toLowerCase();
   }

   public static class12018 y(String var0) {
      return new class12018("entry." + var0);
   }

   public static String N(String var0) {
      return "module.%s.description".formatted(u(var0));
   }
}
