package NurikWare;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.jspecify.annotations.Nullable;
import org.lwjgl.stb.STBIWriteCallback;

public class class10939 extends STBIWriteCallback {
   private final WritableByteChannel N;
   @Nullable
   private IOException y;

   public void invoke(long var1, long var3, int var5) {
      ByteBuffer bytebuffer = getData(var3, var5);

      try {
         this.N.write(bytebuffer);
      } catch (IOException ioexception) {
         this.y = ioexception;
      }
   }

   public class10939(WritableByteChannel var1) {
      super();
      this.N = var1;
   }

   public void N() throws IOException {
      if (this.y != null) {
         throw this.y;
      }
   }
}
