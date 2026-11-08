package NurikWare;

import java.util.Objects;

final class class09800 {
   private class09800() {
      super();
   }

   private static String y(class10021 var0) {
      return var0 == null ? null : N(var0.N());
   }

   private static String y(class09798 var0) {
      return var0 == null ? null : N(var0.N());
   }

   private static boolean y(String var0) {
      return var0 != null && !var0.isBlank();
   }

   static boolean N(class10021 var0, class09798 var1) {
      return var0 != null && var1 != null && var0.y() == var1.y() ? Objects.equals(y(var0), y(var1)) : false;
   }

   private static String N(String var0) {
      return y(var0) ? var0 : null;
   }

   static String N(class10021 var0) {
      return var0 == null ? null : y(var0);
   }

   static String N(class09798 var0) {
      return var0 == null ? null : y(var0);
   }
}
