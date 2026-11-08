package NurikWare;

import com.google.common.io.Files;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import minecraft.class04785;

public class class10469 extends SimpleFileVisitor<Path> {
   public class10469(class04785 var1, Path var2, ZipOutputStream var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      if (var1.endsWith("session.lock")) {
         return FileVisitResult.CONTINUE;
      } else {
         String s = this.N.resolve(this.L.y.R().relativize(var1)).toString().replace('\\', '/');
         ZipEntry zipentry = new ZipEntry(s);
         this.y.putNextEntry(zipentry);
         Files.asByteSource(var1.toFile()).copyTo(this.y);
         this.y.closeEntry();
         return FileVisitResult.CONTINUE;
      }
   }
}
