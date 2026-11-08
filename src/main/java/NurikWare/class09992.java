package NurikWare;

public final class class09992 {
   private final String N;

   private class09992(String var1) {
      super();
      this.N = y(var1);
   }

   @Override
   public String toString() {
      return this.N.isEmpty() ? "StyleSlot@" + Integer.toHexString(System.identityHashCode(this)) : "StyleSlot[" + this.N + "]";
   }

   private static String y(String var0) {
      return var0 != null && !var0.isBlank() ? var0.trim() : "";
   }

   public String y() {
      return this.N;
   }

   public static class09992 N(String var0) {
      return new class09992(var0);
   }

   public static class09992 N() {
      return new class09992(null);
   }
}
