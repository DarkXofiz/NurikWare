package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.ssl.SslContext;
import minecraft.class07393;
import minecraft.class07394;
import minecraft.class07424;
import minecraft.class07911;
import minecraft.class07932;
import minecraft.class07934;

public class class10859 extends ChannelInitializer<Channel> {
   public class10859(class07911 var1, SslContext var2, class07393 var3, class07932 var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException channelexception) {
      }

      ChannelPipeline channelpipeline = var1.pipeline();
      if (this.N != null) {
         channelpipeline.addLast(new ChannelHandler[]{this.N.newHandler(var1.alloc())});
      }

      channelpipeline.addLast(new ChannelHandler[]{new HttpServerCodec()})
         .addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)})
         .addLast(new ChannelHandler[]{this.u.N})
         .addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler("/")})
         .addLast(new ChannelHandler[]{new class07424()})
         .addLast(new ChannelHandler[]{new class07394()})
         .addLast(new ChannelHandler[]{new class07934(var1, this.u, this.y, this.L)});
   }
}
