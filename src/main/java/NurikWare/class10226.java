package NurikWare;

import minecraft.class03692;
import minecraft.class04995;

public record class10226(int previous, int current) implements class03692 {

   public int y() {
      return this.current;
   }

   public int N() {
      return this.previous;
   }

   public int method_48889(float var1) {
      return class04995.N(var1, this.previous, this.current);
   }
}
