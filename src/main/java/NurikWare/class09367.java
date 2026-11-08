package NurikWare;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.util.List;

public class class09367 extends MessageToMessageEncoder<ByteBuf> {
   public class09367() {
      super();
   }

   public void encode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) {
      var3.add(new BinaryWebSocketFrame(var2.retain()));
   }
}
