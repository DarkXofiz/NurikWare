package NurikWare;

import java.nio.ByteBuffer;

public record class11885(ByteBuffer pcm, int channels, int sampleBits, int sampleRate) {

   public int L() {
      return this.channels;
   }


   public ByteBuffer u() {
      return this.pcm;
   }

   public int y() {
      return this.sampleBits;
   }

   public int N() {
      return this.sampleRate;
   }
}
