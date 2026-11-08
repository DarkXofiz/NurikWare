package NurikWare;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class class11667 {
   public Object N_0;

   public class11667() {
      super();
      this.u();
      this.N_0 = new LinkedHashMap();
   }

   private void u() {
   }

   public Collection<class09173> N() {
      return ((Map)this.N_0).values();
   }

   public Optional<class09173> N(String var1) {
      return Optional.ofNullable((class09173)((Map)this.N_0).get(var1));
   }

   public void N(class09173 var1) {
      if (var1.L() != null) {
         ((Map)this.N_0).put(var1.L(), var1);
      }
   }
}
