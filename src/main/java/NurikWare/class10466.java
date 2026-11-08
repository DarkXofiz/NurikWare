package NurikWare;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import minecraft.class04777;
import minecraft.class04785;
import org.jspecify.annotations.Nullable;

public class class10466 extends SimpleFileVisitor<Path> {
   public class10466(class04785 var1, Path var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.equals(this.N)) {
         class04777.N.debug("Deleting {}", var1);
         Files.delete(var1);
      }

      return FileVisitResult.CONTINUE;
   }

   public FileVisitResult postVisitDirectory(Path var1, @Nullable IOException var2) throws IOException {
      if (var2 != null) {
         throw var2;
      } else {
         if (var1.equals(this.y.y.R())) {
            this.y.N.close();
            Files.deleteIfExists(this.N);
         }

         Files.delete(var1);
         return FileVisitResult.CONTINUE;
      }
   }
}
