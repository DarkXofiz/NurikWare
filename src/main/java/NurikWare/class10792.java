package NurikWare;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.nio.charset.StandardCharsets;

public class class10792 {
   private class10792() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static String N(ByteBuf var0, int var1) {
      int i = ByteBufUtil.utf8MaxBytes(var1);
      int j = class11952.N(var0);
      if (j > i) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + j + " > " + i + ")");
      } else if (j < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         int k = var0.readableBytes();
         if (j > k) {
            throw new DecoderException("Not enough bytes in buffer, expected " + j + ", but got " + k);
         } else {
            String s = var0.toString(var0.readerIndex(), j, StandardCharsets.UTF_8);
            var0.skipBytes(j);
            if (s.length() > var1) {
               throw new DecoderException("The received string length is longer than maximum allowed (" + s.length() + " > " + var1 + ")");
            } else {
               return s;
            }
         }
      }
   }

   public static void N(ByteBuf var0, CharSequence var1, int var2) {
      int i = var1.length();
      if (i > var2) {
         throw new EncoderException("String too big (was " + i + " characters, max " + var2 + ")");
      } else {
         int j = ByteBufUtil.utf8MaxBytes(var1);
         ByteBuf bytebuf = var0.alloc().buffer(j);

         try {
            int k = ByteBufUtil.writeUtf8(bytebuf, var1);
            int l = ByteBufUtil.utf8MaxBytes(var2);
            if (k > l) {
               throw new EncoderException("String too big (was " + k + " bytes encoded, max " + l + ")");
            }

            class11952.N(var0, k);
            var0.writeBytes(bytebuf);
         } finally {
            bytebuf.release();
         }
      }
   }
}
