package NurikWare;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class class11775 extends LinkedHashMap<class11768, List<class11728>> {
   public Object N_0;

   public class11775(class11749 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.N();
      this.N_0 = var1;
   }

   private void N() {
   }

   @Override
   public boolean removeEldestEntry(Entry<class11768, List<class11728>> var1) {
      return this.size() > 512;
   }
}
