package NurikWare;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import minecraft.class04173;

public class class10322 extends SimpleFileVisitor<Path> {
   private void L(Path var1, BasicFileAttributes var2) throws IOException {
      if (var2.isSymbolicLink()) {
         this.y.N(var1, this.N);
      }
   }

   public class10322(class04173 var1, List var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      this.L(var1, var2);
      return super.visitFile(var1, var2);
   }

   public FileVisitResult preVisitDirectory(Path var1, BasicFileAttributes var2) throws IOException {
      this.L(var1, var2);
      return super.preVisitDirectory(var1, var2);
   }
}
