package NurikWare;

import minecraft.class07438;

public record class11263(class07438 living, int confirmTick) {

   class11263(class07438 living, int confirmTick) {
      super();
      this.living = living;
      this.confirmTick = confirmTick;
   }

   public class07438 y() {
      return this.living;
   }

   public int N() {
      return this.confirmTick;
   }
}
