package NurikWare;

public record class11343(boolean passed, String failedCheck) {
   private static byte[] i;
   public static Object[] y;

   private static void L() {
      i = new byte[1];
      i[0] = 2;
   }

   private class11343(boolean passed, String failedCheck) {
      super();
      this.passed = passed;
      this.failedCheck = failedCheck;
   }

   static {
      L();
      i();
      y[0] = new class11343(true, null);
      y[1] = new class11343(false, null);
   }

   private static void i() {
      y = new Object[i[0]];
   }

   public boolean y() {
      return this.passed;
   }

   public static class11343 N(String var0) {
      return new class11343(false, var0);
   }

   public String N() {
      return this.failedCheck;
   }
}
