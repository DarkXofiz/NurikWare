package NurikWare;

import minecraft.class06584;

public record class11297(class06584 itemStack, int index) {

   public class11297(class06584 itemStack, int index) {
      super();
      this.itemStack = itemStack;
      this.index = index;
   }

   public int y() {
      return this.index;
   }

   public class06584 N() {
      return this.itemStack;
   }
}
