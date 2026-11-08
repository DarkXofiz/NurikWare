package NurikWare;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.IOException;

public class class10737 extends MessageToByteEncoder<class11951<?>> {
   public static Object N_0 = InternalLoggerFactory.getInstance(String.class);
   public Object y_0;

   private void L() {
   }

   public class10737(class11964 var1) {
      super();
      this.L();
      this.y_0 = var1;
   }

   static {
      y();
   }

   private static void y() {
      N_0 = null;
   }

   private static int N(ChannelHandlerContext var0) {
      Short oshort = (Short)var0.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_3).get();
      return oshort != null ? oshort : 16;
   }

   public void encode(ChannelHandlerContext var1, class11951<?> var2, ByteBuf var3) throws Exception {
      class11959 class11959 = (class11959)var1.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get();
      if (class11959 == null) {
         throw new IllegalStateException("ProtocolType unknown: " + var2);
      } else {
         Integer integer = class11959.N((class11964)this.y_0, var2);
         if (integer == null) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            int i = N(var1);
            if (!class11959.N((class11964)this.y_0, var2, i)) {
               ((InternalLogger)N_0).debug("Dropping {} for peer protocol version {}", var2.getClass().getSimpleName(), i);
            } else {
               class11952.N(var3, integer);
               var2.N(new class11940(var3, (short)i));
            }
         }
      }
   }
}
