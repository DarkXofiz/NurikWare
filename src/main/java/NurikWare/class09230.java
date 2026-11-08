package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import java.net.URI;

public class class09230 extends ChannelInitializer<Channel> {
   public Object N_0;
   public Object N_1;

   public class09230(class11331 var1, URI var2) {
      super();
      this.u();
      this.N_1 = var1;
      this.N_0 = var2;
   }

   private void u() {
   }

   public void initChannel(Channel var1) {
      ChannelPipeline channelpipeline = var1.pipeline();
      channelpipeline.addLast(new ChannelHandler[]{new HttpClientCodec()});
      channelpipeline.addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)});
      channelpipeline.addLast(new ChannelHandler[]{new WebSocketClientProtocolHandler((URI)this.N_0, WebSocketVersion.V13, null, false, null, 65536)});
      channelpipeline.addLast(new ChannelHandler[]{new class11657((class11331)this.N_1)});
   }
}
