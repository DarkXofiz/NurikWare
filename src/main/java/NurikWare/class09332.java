package NurikWare;

import java.util.Objects;

public record class09332(String name, long creationDate) {

   public class09332(String name, long creationDate) {
      super();
      this.name = name;
      this.creationDate = creationDate;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class09332 class09332 ? Objects.equals(this.name, class09332.name) : false;
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.name);
   }

   public String y() {
      return this.name;
   }

   public long N() {
      return this.creationDate;
   }
}
