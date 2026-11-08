package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketFrameAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11831 extends ChannelInitializer<Channel> {
   public static Object N_0;
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   private void M() {
   }

   public class11831(class11436 var1, class11842 var2, Supplier<class11410> var3, Consumer<class11410> var4, Runnable var5) {
      super();
      this.M();
      this.y_0 = var1;
      this.y_1 = var2;
      this.y_2 = var3;
      this.y_3 = var4;
      this.y_4 = var5;
   }

   static {
      N();
   }

   private static void N() {
      N_0 = 4194304;
      N_1 = 65536;
   }

   public void initChannel(Channel var1) {
      class11410 class11410 = (class11410)((Supplier)this.y_2).get();
      ((Consumer)this.y_3).accept(class11410);
      ChannelPipeline channelpipeline = var1.pipeline();
      if (((class11436)this.y_0).i() && !((class11842)this.y_1).N(channelpipeline, var1, (class11436)this.y_0)) {
         ((Runnable)this.y_4).run();
      } else {
         channelpipeline.addLast("http_codec", new HttpClientCodec())
            .addLast("http_aggregator", new HttpObjectAggregator(65536))
            .addLast(
               "ws_protocol",
               new WebSocketClientProtocolHandler(((class11436)this.y_0).L(), WebSocketVersion.V13, null, false, new DefaultHttpHeaders(), 4194304)
            )
            .addLast("ws_frame_aggregator", new WebSocketFrameAggregator(4194304))
            .addLast("ws_frame_to_buf", new class10868())
            .addLast("decoder", new class09370(class11964.SERVER_TO_CLIENT))
            .addLast("ws_buf_to_frame", new class09367())
            .addLast("encoder", new class10737(class11964.CLIENT_TO_SERVER))
            .addLast("packet_handler", class11410);
         class11410.y(var1);
      }
   }
}
