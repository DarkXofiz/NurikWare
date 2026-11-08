package NurikWare;

import java.util.Objects;

public record class11043(class10401 entity, int removedTick) {


   @Override
   public boolean equals(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         class11043 class11043 = (class11043)var1;
         return Objects.equals(this.entity.method_5820(), class11043.entity.method_5820());
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.entity.method_5820());
   }

   public int y() {
      return this.removedTick;
   }

   public class10401 N() {
      return this.entity;
   }
}
