package NurikWare;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.List;

public class class09370 extends ByteToMessageDecoder {
   public Object N_0;
   public static Object y_0 = InternalLoggerFactory.getInstance(String.class);

   public class09370(class11964 var1) {
      super();
      this.u();
      this.N_0 = var1;
   }

   static {
      R();
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) {
      if (var2.isReadable()) {
         class11959 class11959 = (class11959)var1.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get();
         if (class11959 == null) {
            throw new IllegalStateException("ProtocolType unknown for inbound frame");
         } else {
            int i = N(var1);
            int j = -1;

            try {
               j = class11952.N(var2);
               class11951<?> class11951 = class11959.N((class11964)this.N_0, j, i);
               if (class11951 == null) {
                  ((InternalLogger)y_0)
                     .warn("Skipping unsupported packet id {} ({}/{}, protocol version {})", new Object[]{j, class11959.name(), (class11964)this.N_0, i});
                  var2.skipBytes(var2.readableBytes());
                  return;
               }

               class11951.y(new class11940(var2, (short)i));
               int k = var2.readableBytes();
               if (k > 0) {
                  ((InternalLogger)y_0)
                     .warn("Packet {}/{} ({}) left {} extra bytes, skipping tail", new Object[]{class11959.name(), j, class11951.getClass().getSimpleName(), k});
                  var2.skipBytes(k);
               }

               var3.add(class11951);
            } catch (Exception exception) {
               ((InternalLogger)y_0)
                  .error(
                     "Failed to decode packet id {} ({}/{}, protocol version {}), skipping frame",
                     new Object[]{j, class11959.name(), (class11964)this.N_0, i, exception}
                  );
               var2.skipBytes(var2.readableBytes());
            }
         }
      }
   }

   private void u() {
   }

   private static int N(ChannelHandlerContext var0) {
      Short oshort = (Short)var0.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_3).get();
      return oshort != null ? oshort : 16;
   }

   private static void R() {
      y_0 = null;
   }
}
