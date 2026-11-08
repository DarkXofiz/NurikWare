package NurikWare;

import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import org.lwjgl.BufferUtils;

public class class11485 implements class11463 {
   public class11485() {
      super();
   }

   @Override
   public class11885 N(InputStream var1) throws Exception {
      class11885 class11885;
      try (AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(var1)) {
         AudioFormat audioformat = audioinputstream.getFormat();
         AudioFormat audioformat1 = new AudioFormat(
            Encoding.PCM_SIGNED, audioformat.getSampleRate(), 16, audioformat.getChannels(), audioformat.getChannels() * 2, audioformat.getSampleRate(), false
         );

         try (AudioInputStream audioinputstream1 = AudioSystem.getAudioInputStream(audioformat1, audioinputstream)) {
            byte[] abyte = audioinputstream1.readAllBytes();
            ByteBuffer bytebuffer = BufferUtils.createByteBuffer(abyte.length);
            bytebuffer.put(abyte).flip();
            class11885 = new class11885(bytebuffer, audioformat1.getChannels(), 16, (int)audioformat1.getSampleRate());
         }
      }

      return class11885;
   }
}
