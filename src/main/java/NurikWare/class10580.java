package NurikWare;

import minecraft.class00392;
import minecraft.class06794;
import minecraft.class07689;

public record class10580(int start, int end, class06794 selector) {

   public class06794 L() {
      return this.selector;
   }

   public class10580(int start, int end, class06794 selector) {
      super();
      this.start = start;
      this.end = end;
      this.selector = selector;
   }

   public int y() {
      return this.start;
   }

   public int N() {
      return this.end;
   }

   public class00392 N(class07689 var1) {
      return class00392.y(var1.toString());
   }
}
