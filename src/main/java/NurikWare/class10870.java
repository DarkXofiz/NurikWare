package NurikWare;

import minecraft.class04489;
import minecraft.class07321;

public record class10870(class07321 pos) implements class04489 {
   public class10870(class07321 pos) {
      super();
      this.pos = pos;
   }

   public String get() {
      return "chunk@" + this.pos;
   }

   public class07321 N() {
      return this.pos;
   }
}
