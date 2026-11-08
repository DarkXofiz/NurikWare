package NurikWare;

final class class10027 {
   private class10027() {
      super();
   }

   static String N(String var0) {
      return var0 != null && !var0.isEmpty() ? var0.replace("\r\n", " ").replace('\r', ' ').replace('\n', ' ') : "";
   }

   static String N(String var0, int var1, int var2, String var3) {
      String s = var0 == null ? "" : var0;
      int i = class10067.N(s, var1, var2);
      int j = class10067.y(s, var1, var2);
      String s1 = var3 == null ? "" : var3;
      return s.substring(0, i) + s1 + s.substring(j);
   }
}
