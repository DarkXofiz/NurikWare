package NurikWare;

import minecraft.class03556;
import minecraft.class06510;

public record class10583<T>(class03556<T> from, class06510 ingredient, class03556<T> to) {

   public class03556<T> L() {
      return this.to;
   }

   public class10583(class03556<T> from, class06510 ingredient, class03556<T> to) {
      super();
      this.from = from;
      this.ingredient = ingredient;
      this.to = to;
   }

   public class06510 y() {
      return this.ingredient;
   }

   public class03556<T> N() {
      return this.from;
   }
}
