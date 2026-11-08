package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent;
import io.netty.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11410 extends SimpleChannelInboundHandler<class11951<class09297>> {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   public boolean L(Channel var1) {
      return var1 != null && var1.isActive();
   }

   private void L(class11951<?> var1, ChannelFutureListener var2) {
      Channel channel = (Channel)this.y_2;
      if (this.L(channel)) {
         if (channel.eventLoop().inEventLoop()) {
            this.y(var1, var2);
         } else {
            channel.eventLoop().execute(() -> this.y(var1, var2));
         }
      }
   }

   public void L() {
      Channel channel = (Channel)this.y_2;
      if (channel != null) {
         channel.config().setAutoRead(false);
      }
   }

   public class11410(class11405 var1) {
      super();
      this.U();
      this.y_0 = new AtomicBoolean(false);
      this.y_5 = new class11950(
         new class11985(() -> (Channel)this.y_2, this::L, 32, this::N, var0 -> ((Logger)N_0).error("Error while draining pending packet", var0))
      );
      this.y_1 = var1;
   }

   static {
      Z();
   }

   private static void Z() {
      N_0 = null;
      N_1 = 32;
   }

   private void m() {
      if ((ScheduledFuture)this.y_4 != null && !((ScheduledFuture)this.y_4).isCancelled()) {
         ((ScheduledFuture)this.y_4).cancel(false);
         this.y_4 = null;
      }
   }

   private void U() {
   }

   public void u() {
      Channel channel = (Channel)this.y_2;
      if (this.L(channel)) {
         this.L();
         channel.close();
      }
   }

   private void y(class11951<?> var1, ChannelFutureListener var2) {
      Channel channel = (Channel)this.y_2;
      if (this.L(channel)) {
         if (var2 != null) {
            channel.writeAndFlush(var1).addListener(var2);
         } else {
            channel.writeAndFlush(var1);
         }
      }
   }

   public boolean y() {
      Channel channel = (Channel)this.y_2;
      return channel != null
         && channel.hasAttr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2)
         && channel.attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get() == class11959.PLAY;
   }

   public void y(Channel var1) {
      this.y_2 = var1;
      this.y_3 = new class11454((class11405)this.y_1, this);
   }

   private void E() {
      class09297 class09297 = (class09297)this.y_3;
      if (class09297 instanceof class09285) {
         ((class09285)class09297).y();
      }
   }

   public void channelRead0(ChannelHandlerContext var1, class11951<class09297> var2) {
      class09297 class09297 = (class09297)this.y_3;
      if (this.L(var1.channel()) && class09297 != null && class09297.N()) {
         try {
            var2.N(class09297);
         } catch (Exception exception) {
            ((Logger)N_0).error("Error while receiving packet: {}", var2, exception);
         }
      }
   }

   public void N(class11951<?> var1) {
      this.N(var1, null);
   }

   public void N(class11959 var1) {
      Channel channel = (Channel)this.y_2;
      if (channel != null) {
         channel.attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).set(var1);
         channel.config().setAutoRead(true);
         ((class11950)this.y_5).N(var1);
      }
   }

   public <T extends class09297> void N(T var1) {
      this.y_3 = var1;
   }

   public void N(Channel var1) {
      if (((AtomicBoolean)this.y_0).compareAndSet(false, true)) {
         this.y_2 = var1;
         var1.eventLoop()
            .execute(
               () -> {
                  if (this.L(var1)) {
                     this.N(class11959.AUTH);
                     this.y_4 = var1.eventLoop().scheduleWithFixedDelay(this::E, 0L, 1L, TimeUnit.SECONDS);
                     class11954 class11954 = new class11954(
                        (short)16,
                        (byte)2,
                        class11938.P().N().N(),
                        ((class11472)class11938.L_2).Z(),
                        ((class11472)class11938.L_2).M(),
                        ((class11472)class11938.L_2).i().y(),
                        ((class11472)class11938.L_2).y(),
                        ((class11472)class11938.L_2).B()
                     );
                     var1.writeAndFlush(class11954).addListener(var0 -> {
                        if (!var0.isSuccess()) {
                           ((Logger)N_0).error("Auth packet write failed", var0.cause());
                        }
                     });
                  }
               }
            );
      }
   }

   public void N(class11951<?> var1, class11959 var2, ChannelFutureListener var3) {
      ((class11950)this.y_5).N(var1, var2, var3);
   }

   private void N(class11989 var1) {
      ((Logger)N_0).warn("Pending packets queue overflow ({}), dropping {} and closing connection", 32, var1.N().getClass().getSimpleName());
      this.u();
   }

   public boolean N() {
      return this.L((Channel)this.y_2);
   }

   public void N(class11951<?> var1, ChannelFutureListener var2) {
      ((class11950)this.y_5).N(var1, class11959.N(var1), var2);
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      if (class10639.N(var2)) {
         ((Logger)N_0).debug("Connection reset: {}", var2.getMessage());
         var1.close();
      } else {
         ((Logger)N_0).error("Exception in pipeline (channel open={}): {}", this.L(var1.channel()), var2.getMessage(), var2);
         if (this.L(var1.channel())) {
            this.u();
         }
      }
   }

   public void userEventTriggered(ChannelHandlerContext var1, Object var2) throws Exception {
      if (var2 == ClientHandshakeStateEvent.HANDSHAKE_COMPLETE) {
         this.N(var1.channel());
      } else {
         super.userEventTriggered(var1, var2);
      }
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.m();
      ((class11950)this.y_5).N();
      class09297 class09297 = (class09297)this.y_3;
      if (class09297 != null) {
         class09297.N(var1.channel());
         this.y_3 = null;
      }

      super.channelInactive(var1);
   }
}
