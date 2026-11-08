package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public record class09254(List<class11789> shares) implements class09282 {


   public static class09254 y(class11940 var0) {
      int i = var0.R();
      ArrayList arraylist = new ArrayList(i);

      for (int j = 0; j < i; j++) {
         arraylist.add(class11789.N(var0));
      }

      return new class09254(arraylist);
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.shares.size());
      Iterator<class11789> iterator = this.shares.iterator();

      while (iterator.hasNext()) {
         iterator.next().y(var1);
      }
   }

   public List<class11789> N() {
      return this.shares;
   }
}
