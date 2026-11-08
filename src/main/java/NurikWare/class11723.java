package NurikWare;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class class11723 {
   private static String[] y;
   private static byte[] L;
   public static Object[] N;

   public static void L(UUID var0) {
      ((Map)N[1]).remove(var0);
   }

   private class11723() {
      super();
      throw new UnsupportedOperationException(y[1]);
   }

   static {
      u();
      y();
      N();
      N[0] = new class11487(class09177.staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_0, null);
      N[1] = new ConcurrentHashMap();
   }

   private static void u() {
      L = new byte[1];
      L[0] = 2;
   }

   public static class11487 y(UUID var0) {
      return (class11487)((Map)N[1]).getOrDefault(var0, (class11487)N[0]);
   }

   private static void y() {
      y = new String[2];
      y[0] = "account.modal.microsoft.processing";
      y[1] = "This is a utility class and cannot be instantiated";
   }

   public static void N(UUID var0, String var1) {
      ((Map)N[1]).put(var0, new class11487(class09177.staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_2, var1));
   }

   private static void N() {
      N = new Object[L[0]];
   }

   public static void N(UUID var0) {
      ((Map)N[1]).put(var0, new class11487(class09177.staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_1, y[0]));
   }
}
