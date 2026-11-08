package NurikWare;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.concurrent.Future;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntFunction;

public class class11876 {
   public static Object N_0;
   public static Object N_1;
   public Object y_0;
   public Object y_1;

   public AtomicReference<EventLoopGroup> L() {
      return (AtomicReference<EventLoopGroup>)this.y_1;
   }

   public class11876(IntFunction<EventLoopGroup> var1) {
      super();
      this.W();
      this.y_1 = new AtomicReference();
      this.y_0 = var1;
   }

   public class11876() {
      this(var0 -> new NioEventLoopGroup(var0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build()));
   }

   static {
      z();
   }

   public EventLoopGroup i() {
      return (EventLoopGroup)((AtomicReference)this.y_1).get();
   }

   private static void z() {
      N_0 = 150L;
      N_1 = 2000L;
   }

   public EventLoopGroup u() {
      EventLoopGroup eventloopgroup = (EventLoopGroup)((IntFunction)this.y_0).apply(0);
      if (!((AtomicReference)this.y_1).compareAndSet(null, eventloopgroup)) {
         eventloopgroup.shutdownGracefully(0L, 0L, TimeUnit.MILLISECONDS);
         throw new IllegalStateException("EventLoopGroup already started");
      } else {
         return eventloopgroup;
      }
   }

   public boolean y() {
      EventLoopGroup eventloopgroup = (EventLoopGroup)((AtomicReference)this.y_1).get();
      return eventloopgroup != null && !eventloopgroup.isShuttingDown() && !eventloopgroup.isShutdown();
   }

   public CompletableFuture<Void> N() {
      return this.N(150L, 2000L);
   }

   public CompletableFuture<Void> N(long var1, long var3) {
      EventLoopGroup eventloopgroup = (EventLoopGroup)((AtomicReference)this.y_1).getAndSet(null);
      CompletableFuture completablefuture = new CompletableFuture();
      if (eventloopgroup != null && !eventloopgroup.isShuttingDown() && !eventloopgroup.isShutdown()) {
         eventloopgroup.shutdownGracefully(var1, var3, TimeUnit.MILLISECONDS).addListener(var1x -> {
            if (var1x.isSuccess()) {
               completablefuture.complete(null);
            } else {
               completablefuture.completeExceptionally(var1x.cause());
            }
         });
         return completablefuture;
      } else {
         completablefuture.complete(null);
         return completablefuture;
      }
   }

   private void W() {
   }

   public IntFunction<EventLoopGroup> R() {
      return (IntFunction<EventLoopGroup>)this.y_0;
   }
}
