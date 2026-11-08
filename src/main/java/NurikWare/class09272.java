package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public non-sealed record class09272(List<class11827> presets) implements class09279 {

   public class09272(List<class11827> presets) {
      super();
      this.presets = presets;
   }

   @Override
   public void y(class11940 var1) {
      var1.y(this.presets.size());
      Iterator<class11827> iterator = this.presets.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1);
      }
   }

   public static class09272 N(class11940 var0) {
      int i = var0.R();
      ArrayList arraylist = new ArrayList(i);

      for (int j = 0; j < i; j++) {
         arraylist.add(class11827.y(var0));
      }

      return new class09272(arraylist);
   }

   public List<class11827> N() {
      return this.presets;
   }
}
