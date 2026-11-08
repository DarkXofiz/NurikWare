package NurikWare;

import minecraft.class06584;

public record class11543(int startTick, class06584 itemStack) {

   class11543(int startTick, class06584 itemStack) {
      super();
      this.startTick = startTick;
      this.itemStack = itemStack;
   }

   public int y() {
      return this.startTick;
   }

   public class06584 N() {
      return this.itemStack;
   }
}
