package NurikWare;

import java.nio.file.Path;

public class class10683 extends RuntimeException {
   public class10683(Path var1, Throwable var2) {
      super(var1.toAbsolutePath().toString(), var2);
   }
}
