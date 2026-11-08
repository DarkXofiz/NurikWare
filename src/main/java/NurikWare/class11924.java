package NurikWare;

import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class class11924 {
   private static String[] L;
   public static Object N_0 = new ArrayList();

   private static void M() {
      N(class11909.staticFields_0d98e95695d6732fd9192964e161ca232_0, Pair.of(1001, 1001));
   }

   private class11924() {
      super();
      throw new UnsupportedOperationException(L[0]);
   }

   static {
      u();
      i();
      M();
      R();
   }

   private static void i() {
   }

   private static void u() {
      L = new String[1];
      L[0] = "This is a utility class and cannot be instantiated";
   }

   public static Iterable<class11906> y() {
      return (List)N_0;
   }

   @SafeVarargs
   private static void N(class11909 var0, Pair<Integer, Integer>... var1) {
      for (Pair pair : var1) {
         for (int i = (Integer)pair.getFirst(); i <= pair.getSecond(); i++) {
            ((List)N_0).add(new class11906(var0, pair, i));
         }
      }
   }

   public static Stream<class11906> N() {
      return ((List)N_0).stream();
   }

   private static void R() {
      N(
         class11909.staticFields_0d98e95695d6732fd9192964e161ca232_1,
         Pair.of(101, 115),
         Pair.of(201, 236),
         Pair.of(301, 325),
         Pair.of(501, 516),
         Pair.of(901, 904)
      );
   }
}
