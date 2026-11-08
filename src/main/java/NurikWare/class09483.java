package NurikWare;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import minecraft.class00423;
import minecraft.class00642;
import minecraft.class01601;
import minecraft.class01604;
import minecraft.class01618;
import minecraft.class07529;

public class class09483 extends ChannelInitializer<Channel> {
   public class09483(class01618 var1) {
      super();
      this.N = var1;
   }

   protected void initChannel(Channel var1) {
      class00642 class00642 = new class00642(class00423.field_11941);
      class00642.method_52912(new class01604(this.N.N, class00642));
      this.N.L.add(class00642);
      ChannelPipeline channelpipeline = var1.pipeline();
      class00642.method_52911(channelpipeline, class00423.field_11941);
      if (class07529.NK > 0) {
         channelpipeline.addLast("latency", new class01601(class07529.NK, class07529.NV));
      }

      class00642.method_53859(channelpipeline);
   }
}
