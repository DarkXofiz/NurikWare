package NurikWare;

import minecraft.class04489;
import minecraft.class05946;

public record class10412(class05946<?> id) implements class04489 {
   public class10412(class05946<?> id) {
      super();
      this.id = id;
   }

   public String get() {
      return "->{" + this.id.N() + "@" + this.id.y() + "}";
   }

   public class05946<?> N() {
      return this.id;
   }
}
