package NurikWare;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class class10035 extends LinkedHashMap<Integer, class10026> {
   class10035(class10060 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.N = var1;
   }

   @Override
   protected boolean removeEldestEntry(Entry<Integer, class10026> var1) {
      return this.size() > 8;
   }
}
