package NurikWare;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class class11340<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> N;
   private final PeekingIterator<T> y;
   private final Comparator<T> L;

   public class11340(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      super();
      this.N = Iterators.peekingIterator(var1);
      this.y = Iterators.peekingIterator(var2);
      this.L = var3;
   }

   protected T computeNext() {
      while (this.N.hasNext() && this.y.hasNext()) {
         int i = this.L.compare((T)this.N.peek(), (T)this.y.peek());
         if (i == 0) {
            this.y.next();
            return (T)this.N.next();
         }

         if (i < 0) {
            this.N.next();
         } else {
            this.y.next();
         }
      }

      return (T)this.endOfData();
   }
}
