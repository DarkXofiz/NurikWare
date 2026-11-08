package NurikWare;

import minecraft.class06202;

public record class12016(int delay) implements class12040 {

   public class12016(int delay) {
      super();
      this.delay = class11938.j().y() + delay;
   }

   @Override
   public void accept(class06202 var1) {
   }

   public int N() {
      return this.delay;
   }

   @Override
   public boolean test(class06202 var1) {
      return class11938.j().y() > this.delay;
   }
}
