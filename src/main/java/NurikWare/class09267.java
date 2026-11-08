package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public non-sealed record class09267(List<class10732> entries) implements class09260 {

   public class09267(List<class10732> entries) {
      super();
      this.entries = entries;
   }

   public static class09267 y(class11940 var0) {
      int i = var0.R();
      ArrayList arraylist = new ArrayList(i);

      for (int j = 0; j < i; j++) {
         arraylist.add(class10732.y(var0));
      }

      return new class09267(arraylist);
   }

   public List<class10732> N() {
      return this.entries;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.entries.size());
      Iterator<class10732> iterator = this.entries.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1);
      }
   }
}
