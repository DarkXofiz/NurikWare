package NurikWare;

import io.netty.channel.Channel;
import io.netty.util.concurrent.Future;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11841 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public static Object y_0 = LogManager.getLogger(String.class);

   private void L() {
   }

   public class11841(class11880 var1, class11423 var2, class11876 var3, AtomicBoolean var4) {
      super();
      this.L();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var4;
   }

   static {
      B();
   }

   private static void B() {
      y_0 = null;
   }

   public CompletableFuture<Void> y() {
      ((AtomicBoolean)this.N_3).set(false);
      ((class11423)this.N_1).i();
      Channel channel = ((class11880)this.N_0).N();
      ((class11880)this.N_0).y();
      CompletableFuture completablefuture = new CompletableFuture();
      if (channel == null) {
         this.N(completablefuture);
         return completablefuture;
      } else {
         (channel.isOpen() ? channel.close() : channel.newSucceededFuture()).addListener(var2x -> this.N(completablefuture));
         return completablefuture;
      }
   }

   private void N(CompletableFuture<Void> var1) {
      ((class11876)this.N_2).N().whenComplete((var1x, var2) -> {
         if (var2 == null) {
            var1.complete(null);
         } else {
            var1.completeExceptionally(var2);
         }
      });
   }

   public void N() {
      try {
         this.y().join();
      } catch (CompletionException completionexception) {
         ((Logger)y_0).error("Error during shutdown", completionexception.getCause());
      }
   }
}
