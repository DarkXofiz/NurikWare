package NurikWare;

import java.io.IOException;
import java.nio.file.Path;

public class class10507 extends IOException {
   private class10507(Path var1, String var2) {
      super(var1.toAbsolutePath() + ": " + var2);
   }

   public static class10507 N(Path var0) {
      return new class10507(var0, "already locked (possibly by other Minecraft instance?)");
   }
}
