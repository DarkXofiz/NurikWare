package NurikWare;

import java.util.stream.LongStream;

public class class11140 {
   private static double[] y;
   private static String[] i;

   private class11140() {
      super();
      throw new UnsupportedOperationException(i[0]);
   }

   static {
      N();
      i();
   }

   private static void i() {
      i = new String[1];
      i[0] = "This is a utility class and cannot be instantiated";
   }

   private static void N() {
      y = new double[2];
      y[0] = Double.longBitsToDouble(4611686018427387904L);
      y[1] = Double.longBitsToDouble(4652007308841189376L);
   }

   public static long N(LongStream var0, double var1) {
      long[] along = var0.distinct().sorted().toArray();
      if (along.length == 0) {
         return 0L;
      } else {
         int ix = along.length / 2;
         double d0 = along.length % 2 == 1 ? along[ix] : (along[ix - 1] + along[ix]) / y[0];
         return Math.round((d0 - d0 * var1) / y[1]) * 1000L;
      }
   }
}
