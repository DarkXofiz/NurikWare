package NurikWare;

import java.io.IOException;
import java.io.OutputStream;
import minecraft.class04741;
import org.apache.commons.io.output.CountingOutputStream;

public class class10489 extends CountingOutputStream {
   private final class04741 N;

   public class10489(OutputStream var1, class04741 var2) {
      super(var1);
      this.N = var2;
   }

   protected void afterWrite(int var1) throws IOException {
      super.afterWrite(var1);
      this.N.N = this.getByteCount();
   }
}
