package NurikWare;

import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class05678;
import org.jspecify.annotations.Nullable;

public final class class10532 implements class05678<class10533> {
   private final Queue<Runnable>[] N;
   private final AtomicInteger y = new AtomicInteger();

   public int L() {
      return this.y.get();
   }

   public class10532(int var1) {
      super();
      this.N = new Queue[var1];

      for (int i = 0; i < var1; i++) {
         this.N[i] = Queues.newConcurrentLinkedQueue();
      }
   }

   public boolean y() {
      return this.y.get() == 0;
   }

   public boolean N(class10533 var1) {
      int i = var1.N();
      if (i < this.N.length && i >= 0) {
         this.N[i].add(var1);
         this.y.incrementAndGet();
         return true;
      } else {
         throw new IndexOutOfBoundsException(String.format(Locale.ROOT, "Priority %d not supported. Expected range [0-%d]", i, this.N.length - 1));
      }
   }

   @Nullable
   public Runnable N() {
      Queue<Runnable>[] queue = this.N;
      int i = queue.length;

      for (int j = 0; j < i; j++) {
         Runnable runnable = queue[j].poll();
         if (runnable != null) {
            this.y.decrementAndGet();
            return runnable;
         }
      }

      return null;
   }
}
