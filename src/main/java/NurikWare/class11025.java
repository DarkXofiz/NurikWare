package NurikWare;

import minecraft.class00891;

public record class11025(class00891 block, int color) {

   public class11025(class00891 block, int color) {
      super();
      this.block = block;
      this.color = color;
   }

   public int y() {
      return this.color;
   }

   public class00891 N() {
      return this.block;
   }
}
