package NurikWare;

import com.google.common.collect.Queues;
import java.util.Queue;

public class class11923 {
   public static Object N_0 = Queues.newConcurrentLinkedQueue();

   private static void L() {
      N_0 = null;
   }

   private class11923() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   public static void N() {
      Runnable runnable;
      while ((runnable = (Runnable)((Queue)N_0).poll()) != null) {
         runnable.run();
      }
   }

   public static void N(Runnable var0) {
      ((Queue)N_0).add(var0);
   }
}
