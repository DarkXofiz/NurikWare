package NurikWare;

import java.util.Objects;

public record class11997(String name, String text, int key) {

   public String L() {
      return this.name;
   }


   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class11997 class11997 ? Objects.equals(this.name, class11997.name) : false;
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.name);
   }

   public String y() {
      return this.text;
   }

   public int N() {
      return this.key;
   }
}
