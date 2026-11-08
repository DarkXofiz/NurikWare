package NurikWare;

import io.netty.channel.EventLoopGroup;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11423 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   public ScheduledFuture<?> L() {
      return (ScheduledFuture<?>)this.y_5;
   }

   public AtomicBoolean M() {
      return (AtomicBoolean)this.y_0;
   }

   private void P() {
      try {
         if (((BooleanSupplier)this.y_2).getAsBoolean()) {
            ((Runnable)this.y_3).run();
         }
      } finally {
         ((AtomicBoolean)this.y_0).set(false);
         this.y_5 = null;
      }
   }

   public class11423(Supplier<EventLoopGroup> var1, BooleanSupplier var2, Runnable var3, long var4) {
      super();
      this.U();
      this.y_0 = new AtomicBoolean(false);
      this.y_1 = var1;
      this.y_2 = var2;
      this.y_3 = var3;
      this.y_4 = var4;
   }

   static {
      z();
   }

   public boolean B() {
      if (((BooleanSupplier)this.y_2).getAsBoolean() && ((AtomicBoolean)this.y_0).compareAndSet(false, true)) {
         EventLoopGroup eventloopgroup = (EventLoopGroup)((Supplier)this.y_1).get();
         if (eventloopgroup != null && !eventloopgroup.isShuttingDown() && !eventloopgroup.isShutdown()) {
            try {
               this.y_5 = eventloopgroup.schedule(this::P, (Long)this.y_4, TimeUnit.MILLISECONDS);
               return true;
            } catch (RejectedExecutionException rejectedexecutionexception) {
               ((AtomicBoolean)this.y_0).set(false);
               this.y_5 = null;
               ((Logger)N_0).warn("Reconnect rejected by event loop", rejectedexecutionexception);
               return false;
            } catch (RuntimeException runtimeexception) {
               ((AtomicBoolean)this.y_0).set(false);
               this.y_5 = null;
               throw runtimeexception;
            }
         } else {
            ((AtomicBoolean)this.y_0).set(false);
            return false;
         }
      } else {
         return false;
      }
   }

   public Supplier<EventLoopGroup> Z() {
      return (Supplier<EventLoopGroup>)this.y_1;
   }

   public void i() {
      if ((ScheduledFuture)this.y_5 != null && !((ScheduledFuture)this.y_5).isCancelled() && !((ScheduledFuture)this.y_5).isDone()) {
         ((ScheduledFuture)this.y_5).cancel(false);
         this.y_5 = null;
      }

      ((AtomicBoolean)this.y_0).set(false);
   }

   private void U() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_4 = 0L;
      }
   }

   private static void z() {
      N_0 = null;
   }

   public Runnable u() {
      return (Runnable)this.y_3;
   }

   public boolean y() {
      return ((AtomicBoolean)this.y_0).get();
   }

   public BooleanSupplier N() {
      return (BooleanSupplier)this.y_2;
   }

   public long R() {
      return (Long)this.y_4;
   }
}
