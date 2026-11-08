package NurikWare;

import java.io.File;
import java.nio.file.Path;
import minecraft.class00198;
import org.jspecify.annotations.Nullable;

public class class09428 {
   public final File N;
   public final File y;
   public final File L;
   @Nullable
   public final String u;

   public class09428(File var1, File var2, File var3, @Nullable String var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public Path N() {
      return this.u == null ? this.L.toPath() : class00198.N(this.L.toPath(), this.u);
   }
}
