package NurikWare;

import com.google.common.collect.AbstractIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import minecraft.class03556;
import minecraft.class05370;
import minecraft.class05377;

public class class10510 extends AbstractIterator<class05377> {
   private Iterator<class05377> L;

   public class10510(class05370 var1, Iterator var2, Predicate var3) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = Collections.emptyIterator();
   }

   protected class05377 computeNext() {
      while (!this.L.hasNext()) {
         if (!this.N.hasNext()) {
            return (class05377)this.endOfData();
         }

         Entry entry = (Entry)this.N.next();
         if (this.y.test((class03556)entry.getKey())) {
            this.L = ((Set)entry.getValue()).iterator();
         }
      }

      return this.L.next();
   }
}
