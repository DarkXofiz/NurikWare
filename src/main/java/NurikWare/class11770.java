package NurikWare;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class class11770 implements class11758 {
   class11770() {
      super();
   }

   @Override
   public byte[] N(String var1) throws IOException {
      byte[] abyte;
      try (InputStream inputstream = class11911.L(var1).method_14482()) {
         abyte = IOUtils.toByteArray(inputstream);
      }

      return abyte;
   }
}
