package NurikWare;

import minecraft.class02566;
import minecraft.class03692;

public record class10229(int previous, int current) implements class03692 {
   public class10229(int previous, int current) {
      super();
      this.previous = previous;
      this.current = current;
   }

   public int y() {
      return this.current;
   }

   public int N() {
      return this.previous;
   }

   public int method_48889(float var1) {
      return class02566.N(var1, this.previous, this.current);
   }
}
