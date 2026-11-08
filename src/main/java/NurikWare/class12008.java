package NurikWare;

import minecraft.class06202;

public record class12008(Runnable runnable) implements class12040 {

   public class12008(Runnable runnable) {
      super();
      this.runnable = runnable;
   }

   @Override
   public void accept(class06202 var1) {
      this.runnable.run();
   }

   public Runnable N() {
      return this.runnable;
   }
}
