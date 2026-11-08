package NurikWare;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class class11309 {
   private static String[] N;

   private class11309() {
      super();
      throw new UnsupportedOperationException(N[0]);
   }

   static {
      y();
   }

   private static void y() {
      N = new String[1];
      N[0] = "This is a utility class and cannot be instantiated";
   }

   public static UUID N() {
      long i = System.currentTimeMillis() & 281474976710655L;
      long j = ThreadLocalRandom.current().nextLong() & 4095L;
      long k = i << 16 | 28672L | j;
      long l = ThreadLocalRandom.current().nextLong() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(k, l);
   }
}
