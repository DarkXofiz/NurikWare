package NurikWare;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.ApplicationProtocolConfig.Protocol;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior;

public class class11881 {
   private class11881() {
      super();
   }

   public static SslContext N() throws Exception {
      return SslContextBuilder.forClient()
         .protocols(new String[]{"TLSv1.3", "TLSv1.2"})
         .trustManager(class11855.N())
         .applicationProtocolConfig(
            new ApplicationProtocolConfig(Protocol.ALPN, SelectorFailureBehavior.NO_ADVERTISE, SelectedListenerFailureBehavior.ACCEPT, new String[]{"http/1.1"})
         )
         .build();
   }
}
