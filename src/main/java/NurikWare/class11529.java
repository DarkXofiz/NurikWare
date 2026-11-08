package NurikWare;

import java.io.IOException;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;

public class class11529 {
   private class11529() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static void N(class11488 var0, byte[] var1) throws IOException {
      MessageUnpacker messageunpacker = MessagePack.newDefaultUnpacker(class11509.N(var1));

      try {
         var0.N(messageunpacker);
      } catch (Throwable throwable1) {
         if (messageunpacker != null) {
            try {
               messageunpacker.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (messageunpacker != null) {
         messageunpacker.close();
      }
   }

   public static byte[] N(class11488 var0) throws IOException {
      MessageBufferPacker messagebufferpacker = MessagePack.newDefaultBufferPacker();

      byte[] abyte;
      try {
         var0.y(messagebufferpacker);
         abyte = class11509.y(messagebufferpacker.toByteArray());
      } catch (Throwable throwable1) {
         if (messagebufferpacker != null) {
            try {
               messagebufferpacker.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (messagebufferpacker != null) {
         messagebufferpacker.close();
      }

      return abyte;
   }
}
