package NurikWare;

import java.util.Iterator;
import minecraft.class04189;

public class class09537<T> implements Iterator<T> {
   private int y;

   public class09537(class04189 var1) {
      super();
      this.N = var1;
      this.y = var1.size() - 1;
   }

   @Override
   public void remove() {
      this.N.remove(this.y + 1);
   }

   @Override
   public boolean hasNext() {
      return this.y >= 0;
   }

   @Override
   public T next() {
      return (T)this.N.get(this.y--);
   }
}
