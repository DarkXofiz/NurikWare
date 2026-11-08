package NurikWare;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.net.InetSocketAddress;
import minecraft.class00392;
import minecraft.class00423;
import minecraft.class00642;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.ProxyServer;
import ru.fiw.proxyserver.Proxy.ProxyType;

public class class09379 extends ChannelInitializer<Channel> {
   public class09379(class00642 var1) {
      super();
      this.N = var1;
   }

   private void y(Channel var1, CallbackInfo var2) {
      ProtocolTranslator.injectViaPipeline(this.N, var1);
   }

   private void N(Channel var1, CallbackInfo var2) {
      Proxy proxy = ProxyServer.proxy;
      if (ProxyServer.proxyEnabled) {
         ProxyServer.lastUsedProxy = proxy;
         if (proxy.type == ProxyType.SOCKS5) {
            var1.pipeline()
               .addFirst(
                  new ChannelHandler[]{
                     new Socks5ProxyHandler(
                        new InetSocketAddress(proxy.getIp(), proxy.getPort()),
                        proxy.username.isEmpty() ? null : proxy.username,
                        proxy.password.isEmpty() ? null : proxy.password
                     )
                  }
               );
         } else {
            var1.pipeline()
               .addFirst(
                  new ChannelHandler[]{
                     new Socks4ProxyHandler(new InetSocketAddress(proxy.getIp(), proxy.getPort()), proxy.username.isEmpty() ? null : proxy.username)
                  }
               );
         }
      } else {
         ProxyServer.lastUsedProxy = new Proxy();
      }

      if (ProxyServer.proxyMenuButton != null) {
         ProxyServer.proxyMenuButton.method_25355(class00392.y("Proxy: " + ProxyServer.getLastUsedProxyIp()));
      }
   }

   protected void initChannel(Channel var1) {
      this.N(var1, null);

      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException channelexception) {
      }

      ChannelPipeline channelpipeline = var1.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
      class00642.method_48311(channelpipeline, class00423.field_11942, false, this.N.field_45955);
      this.N.method_53859(channelpipeline);
      this.y(var1, null);
   }
}
