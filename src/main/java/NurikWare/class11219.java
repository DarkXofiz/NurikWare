package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11219 extends SimpleChannelInboundHandler<TextWebSocketFrame> {
   private static String[] u;
   public Object N_0;
   public static Object y_0 = LogManager.getLogger(String.class);

   private static void L() {
      u = new String[2];
      u[0] = "auto-buy-c2s-connected";
      u[1] = "auto-buy-c2s-disconnected";
   }

   public class11219(ChannelGroup var1) {
      super();
      this.N();
      this.N_0 = var1;
   }

   static {
      L();
      u();
   }

   private static void u() {
   }

   public void channelRead0(ChannelHandlerContext var1, TextWebSocketFrame var2) {
      String s = var2.text();
      class06202.Nq().execute(() -> class11938.L().L(new class11402(s)));
   }

   private void N() {
   }

   public void handlerRemoved(ChannelHandlerContext var1) {
      Channel channel = var1.channel();
      ((ChannelGroup)this.N_0).remove(channel);
      class11303.y(class11921.N(u[1], channel.remoteAddress()));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      ((Logger)y_0).error(var2, var2);
      var1.close();
   }

   public void handlerAdded(ChannelHandlerContext var1) {
      Channel channel = var1.channel();
      ((ChannelGroup)this.N_0).add(channel);
      class11303.y(class11921.N(u[0], channel.remoteAddress()));
   }
}
