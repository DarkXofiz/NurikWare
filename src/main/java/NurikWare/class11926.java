package NurikWare;

import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import minecraft.class06322;

public class class11926 implements class11463 {
   public class11926() {
      super();
   }

   @Override
   public class11885 N(InputStream var1) throws Exception {
      class06322 class06322 = new class06322(var1);

      class11885 class11885;
      try {
         ByteBuffer bytebuffer = class06322.y();
         AudioFormat audioformat = class06322.N();
         class11885 = new class11885(bytebuffer, audioformat.getChannels(), audioformat.getSampleSizeInBits(), (int)audioformat.getSampleRate());
      } catch (Throwable throwable1) {
         try {
            class06322.close();
         } catch (Throwable throwable) {
            throwable1.addSuppressed(throwable);
         }

         throw throwable1;
      }

      class06322.close();
      return class11885;
   }
}
