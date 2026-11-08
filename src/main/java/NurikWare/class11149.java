package NurikWare;

import minecraft.class07209;

public record class11149(class07209 blockPos, int color) {

   class11149(class07209 blockPos, int color) {
      super();
      this.blockPos = blockPos;
      this.color = color;
   }

   public int y() {
      return this.color;
   }

   public class07209 N() {
      return this.blockPos;
   }
}
