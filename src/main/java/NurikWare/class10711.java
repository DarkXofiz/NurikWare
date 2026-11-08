package NurikWare;

import minecraft.class04489;
import minecraft.class07049;

public record class10711(class07049 entity) implements class04489 {
   public class10711(class07049 entity) {
      super();
      this.entity = entity;
   }

   public String get() {
      return this.entity.toString();
   }

   public class07049 N() {
      return this.entity;
   }
}
