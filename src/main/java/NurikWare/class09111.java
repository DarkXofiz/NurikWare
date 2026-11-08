package NurikWare;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class class09111<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> N;
   private final PeekingIterator<T> y;
   private final Comparator<T> L;

   public class09111(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      super();
      this.N = Iterators.peekingIterator(var1);
      this.y = Iterators.peekingIterator(var2);
      this.L = var3;
   }

   protected T computeNext() {
      boolean flag = !this.N.hasNext();
      boolean flag1 = !this.y.hasNext();
      if (flag && flag1) {
         return (T)this.endOfData();
      } else if (flag) {
         return (T)this.y.next();
      } else if (flag1) {
         return (T)this.N.next();
      } else {
         int i = this.L.compare((T)this.N.peek(), (T)this.y.peek());
         if (i == 0) {
            this.y.next();
         }

         return (T)(i <= 0 ? this.N.next() : this.y.next());
      }
   }
}
