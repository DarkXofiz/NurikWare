package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class class11950 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;

   private void L() {
      ((AtomicInteger)this.N_1).updateAndGet(var0 -> Math.max(0, var0 - 1));
   }

   public class11950(class11985 var1) {
      super();
      this.u();
      this.N_0 = new class11973();
      this.N_1 = new AtomicInteger();
      this.N_2 = new AtomicBoolean(false);
      this.N_3 = var1;
   }

   private void u() {
   }

   public int y() {
      return ((AtomicInteger)this.N_1).get();
   }

   private void y(class11959 var1) {
      ((class11973)this.N_0).N(var1, var1x -> {
         this.L();

         try {
            ((class11985)this.N_3).u().accept(var1x.N(), var1x.L());
         } catch (Exception exception) {
            ((class11985)this.N_3).y().accept(exception);
         }
      });
   }

   private static class11959 N(Channel var0) {
      return !var0.hasAttr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2)
         ? null
         : (class11959)var0.attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get();
   }

   public void N(class11959 var1) {
      if (!((AtomicBoolean)this.N_2).get()) {
         this.y(var1);
      }
   }

   public void N() {
      ((AtomicBoolean)this.N_2).set(true);
      ((class11973)this.N_0).y();
      ((AtomicInteger)this.N_1).set(0);
   }

   public void N(class11951<?> var1, class11959 var2, ChannelFutureListener var3) {
      if (!((AtomicBoolean)this.N_2).get()) {
         Channel channel = ((class11985)this.N_3).i().get();
         if (channel != null && channel.isActive()) {
            if (N(channel) == var2) {
               ((class11985)this.N_3).u().accept(var1, var3);
            } else {
               class11989 class11989 = new class11989(var1, var2, var3);
               if (((AtomicInteger)this.N_1).incrementAndGet() > ((class11985)this.N_3).N()) {
                  this.L();
                  ((class11985)this.N_3).L().accept(class11989);
               } else {
                  ((class11973)this.N_0).N(class11989);
                  if (((AtomicBoolean)this.N_2).get()) {
                     ((class11973)this.N_0).y();
                     ((AtomicInteger)this.N_1).set(0);
                  } else {
                     class11959 class11959 = N(channel);
                     if (class11959 != null) {
                        this.y(class11959);
                     }
                  }
               }
            }
         }
      }
   }
}
