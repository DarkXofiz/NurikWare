package NurikWare;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class class11512 {
   public Object E_0;

   public LinkedHashMap<String, class11536<?>> w() {
      return Maps.newLinkedHashMap((Map)this.E_0);
   }

   public <T extends class11536<?>> T L(String var1) {
      return (T)((Map)this.E_0).get(var1);
   }

   public class11512() {
      super();
      this.u();
      this.E_0 = new LinkedHashMap();
   }

   private void u() {
   }

   public class11536<?> N(class11536<?> var1) {
      if (((Map)this.E_0).containsKey(var1.P().N())) {
         throw new IllegalArgumentException(String.format("Setting with key %s already registered", var1.P()));
      } else {
         ((Map)this.E_0).put(var1.P().N(), var1);
         return var1;
      }
   }

   public abstract class12018 N_7(String var1);
}
