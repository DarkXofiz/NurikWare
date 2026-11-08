package NurikWare;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11657 extends SimpleChannelInboundHandler<TextWebSocketFrame> {
   private static String[] R;
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;

   private static void L() {
   }

   public class11657(class11331 var1) {
      super();
      this.y();
      this.y_0 = var1;
   }

   static {
      L();
      i();
      u();
   }

   private static void i() {
      R = new String[2];
      R[0] = "auto-buy-s2c-connected";
      R[1] = "auto-buy-s2c-disconnected";
   }

   private static void u() {
   }

   private void y() {
   }

   public void channelRead0(ChannelHandlerContext var1, TextWebSocketFrame var2) {
      String s = var2.text();
      class06202.Nq().execute(() -> class11938.L().L(new class11363(s)));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      ((class11331)this.y_0).N().set(false);
      ((Logger)N_0).error(var2, var2);
      var1.close();
   }

   public void channelActive(ChannelHandlerContext var1) {
      ((class11331)this.y_0).N().set(true);
      class11303.y(class11921.N(R[0], var1.channel().remoteAddress()));
   }

   public void channelInactive(ChannelHandlerContext var1) {
      ((class11331)this.y_0).N().set(false);
      class11303.y(class11921.N(R[1], var1.channel().remoteAddress()));
   }
}
