package NurikWare;

import java.util.Iterator;
import java.util.NoSuchElementException;
import minecraft.class06584;
import minecraft.class06695;

public class class10644 implements Iterator<class06584> {
   private final class06695 N;
   private int y;
   private final int L;

   public class10644(class06695 var1) {
      super();
      this.N = var1;
      this.L = var1.method_5439();
   }

   @Override
   public boolean hasNext() {
      return this.y < this.L;
   }

   public class06584 next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.N.method_5438(this.y++);
      }
   }
}
