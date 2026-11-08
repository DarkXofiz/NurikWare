package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import minecraft.class00423;
import minecraft.class00642;

public class class09381 extends ChannelInitializer<Channel> {
   public class09381(class00642 var1) {
      super();
      this.N = var1;
   }

   protected void initChannel(Channel var1) {
      ChannelPipeline channelpipeline = var1.pipeline();
      class00642.method_52911(channelpipeline, class00423.field_11942);
      this.N.method_53859(channelpipeline);
   }
}
