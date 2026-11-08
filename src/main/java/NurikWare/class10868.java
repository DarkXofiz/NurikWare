package NurikWare;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import java.util.List;

public class class10868 extends MessageToMessageDecoder<WebSocketFrame> {
   public class10868() {
      super();
   }

   public void decode(ChannelHandlerContext var1, WebSocketFrame var2, List<Object> var3) {
      if (var2 instanceof BinaryWebSocketFrame binarywebsocketframe) {
         var3.add(binarywebsocketframe.content().retain());
      } else {
         throw new CorruptedFrameException("Only binary websocket frames are supported");
      }
   }
}
