package NurikWare;

import java.util.Arrays;
import java.util.regex.Pattern;

public class class11524 {
   private class11524() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @SafeVarargs
   public static <T extends class11535> class11523<T> y(class11512 var0, String var1, T... var2) {
      class11523 class11523 = new class11523<>(var0.N_7(var1), Arrays.asList(var2));
      return (class11523<T>)var0.N(class11523);
   }

   public static class11515 N(class11512 var0, String var1, int var2) {
      class11515 class11515 = new class11515(var0.N_7(var1), var2);
      return (class11515)var0.N(class11515);
   }

   public static class11533 N(class11512 var0, String var1, String var2, Pattern var3) {
      class12018 class12018 = var0.N_7(var1);
      class11533 class11533 = new class11533(class12018, var2, class12018.N("place-holder").N(), var3);
      return (class11533)var0.N(class11533);
   }

   public static class11525 N(class11512 var0, String var1, class11494 var2, class11494 var3, float var4) {
      class11525 class11525 = new class11525(var0.N_7(var1), var2, var3, var4);
      return (class11525)var0.N(class11525);
   }

   public static class11504 N(class11512 var0, String var1, float var2, float var3, float var4, float var5) {
      class11504 class11504 = new class11504(var0.N_7(var1), var2, var3, var4, var5);
      return (class11504)var0.N(class11504);
   }

   public static class11527 N(class11512 var0, String var1, class12002 var2) {
      class11527 class11527 = new class11527(var0.N_7(var1), var2);
      return (class11527)var0.N(class11527);
   }

   @SafeVarargs
   public static <T extends class11535> class11517<T> N(class11512 var0, String var1, T... var2) {
      class11517 class11517 = new class11517<>(var0.N_7(var1), Arrays.asList(var2));
      return (class11517<T>)var0.N(class11517);
   }

   public static class11532 N(class11512 var0, String var1, Runnable var2) {
      class11532 class11532 = new class11532(var0.N_7(var1), var2);
      return (class11532)var0.N(class11532);
   }

   public static class11507 N(class11512 var0, String var1, boolean var2) {
      class11507 class11507 = new class11507(var0.N_7(var1), var2);
      return (class11507)var0.N(class11507);
   }
}
