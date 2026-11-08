package NurikWare;

import minecraft.class00500;
import minecraft.class07209;

public record class11556(class07209 pos, class00500 blockState) {

   public class11556(class07209 pos, class00500 blockState) {
      super();
      this.pos = pos;
      this.blockState = blockState;
   }

   public class00500 y() {
      return this.blockState;
   }

   public class07209 N() {
      return this.pos;
   }
}
