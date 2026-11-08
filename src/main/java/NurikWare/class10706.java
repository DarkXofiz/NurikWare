package NurikWare;

import java.util.Iterator;
import java.util.NoSuchElementException;
import minecraft.class07023;
import minecraft.class07709;

public class class10706 implements Iterator<class07709> {
   private int y;

   public class10706(class07023 var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean hasNext() {
      return this.y < this.N.size();
   }

   public class07709 next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.N.get(this.y++);
      }
   }
}
