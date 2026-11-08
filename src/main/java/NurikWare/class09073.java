package NurikWare;

public record class09073(
   int width, int height, class11181 format, class11199 minFilter, class11199 magFilter, class11175 wrapS, class11175 wrapT, boolean mipmapped, int usage
) {

   public class11175 L() {
      return this.wrapS;
   }

   public class11199 M() {
      return this.minFilter;
   }


   public int B() {
      return this.width;
   }

   public int Z() {
      return this.usage;
   }

   public class11175 i() {
      return this.wrapT;
   }

   public boolean u() {
      return this.mipmapped;
   }

   public class11181 y() {
      return this.format;
   }

   public int N() {
      return this.height;
   }

   public class11199 R() {
      return this.magFilter;
   }
}
