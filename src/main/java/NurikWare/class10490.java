package NurikWare;

import java.io.IOException;
import java.io.InputStream;
import minecraft.class05113;
import org.apache.commons.io.input.CountingInputStream;

public class class10490 extends CountingInputStream {
   private final class05113 N;

   public class10490(InputStream var1, class05113 var2) {
      super(var1);
      this.N = var2;
   }

   protected void afterRead(int var1) throws IOException {
      super.afterRead(var1);
      this.N.y(this.getByteCount());
   }
}
