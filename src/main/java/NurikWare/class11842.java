package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.ssl.SslHandler;
import io.netty.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11842 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public class11842() {
      super();
   }

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = null;
   }

   public boolean N(ChannelPipeline var1, Channel var2, class11436 var3) {
      try {
         SSLEngine sslengine = class11881.N().newEngine(var2.alloc(), var3.M(), var3.y());
         SSLParameters sslparameters = sslengine.getSSLParameters();
         sslparameters.setEndpointIdentificationAlgorithm("HTTPS");
         sslengine.setSSLParameters(sslparameters);
         sslengine.setUseClientMode(true);
         SslHandler sslhandler = new SslHandler(sslengine);
         var1.addFirst("ssl", sslhandler);
         sslhandler.handshakeFuture().addListener(var0 -> {
            if (!var0.isSuccess()) {
               ((Logger)N_0).error("SSL handshake FAILED", var0.cause());
            }
         });
         return true;
      } catch (Exception exception) {
         ((Logger)N_0).error("Failed to initialize SSL context", exception);
         return false;
      }
   }

   private static void N() {
   }
}
