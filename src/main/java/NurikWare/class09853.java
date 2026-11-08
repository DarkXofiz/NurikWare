package NurikWare;

final class class09853 {
   private class09853() {
      super();
   }

   static String N(String var0, String var1) {
      if (var0 != null && !var0.isBlank()) {
         return var0.trim();
      } else {
         throw new IllegalArgumentException(var1 + " must not be blank");
      }
   }
}
