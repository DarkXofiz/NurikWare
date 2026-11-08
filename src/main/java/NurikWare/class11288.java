package NurikWare;

import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class06541;

public record class11288(class11067 module) implements class11287 {
   private static String[] y;

   private static void L() {
      y = new String[1];
      y[0] = " ⇨ ";
   }

   public class11288(class11067 module) {
      super();
      this.module = module;
   }

   static {
      L();
   }

   public class11067 y() {
      return this.module;
   }

   @Override
   public class05216 N() {
      class05216 class05216 = class00392.y(y[0]).y(class00405.N.N(class05194.N(class06541.field_1080)));
      return class00392.y(this.module.N()).y(class05216);
   }
}
