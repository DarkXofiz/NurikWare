package NurikWare;

public enum class11286 {
   PRESS,
   RELEASE,
   REPEAT;

   private static void L() {
   }

   private class11286() {
   }

   static {
      L();
   }

   public static class11286 N(int var0) {
      switch (var0) {
         case 0:
            return RELEASE;
         case 1:
            return PRESS;
         case 2:
            return REPEAT;
         default:
            throw new IllegalArgumentException("Invalid action: " + var0);
      }
   }

   public boolean N(class11286 var1) {
      return this == var1;
   }
}
