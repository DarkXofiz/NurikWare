package NurikWare;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ReferenceCountUtil;
import minecraft.class00381;
import minecraft.class02400;

public class class09700 extends ChannelOutboundHandlerAdapter {
   public class09700() {
      super();
   }

   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
      if (var2 instanceof class00381) {
         ReferenceCountUtil.release(var2);
         throw new EncoderException("Pipeline has no outbound protocol configured, can't process packet " + var2);
      } else {
         if (var2 instanceof class02400 class02400) {
            try {
               class02400.run(var1);
            } finally {
               ReferenceCountUtil.release(var2);
            }

            var3.setSuccess();
         } else {
            var1.write(var2, var3);
         }
      }
   }
}
