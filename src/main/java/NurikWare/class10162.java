package NurikWare;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import minecraft.class07428;

public class class10162 {
   private final Object2IntMap<class07428> N = new Object2IntOpenHashMap(class07428.values().length);

   public class10162() {
      super();
   }

   public boolean y(class07428 var1) {
      return this.N.getOrDefault(var1, 0) < var1.y();
   }

   public void N(class07428 var1) {
      this.N.computeInt(var1, (var0, var1x) -> var1x == null ? 1 : var1x + 1);
   }
}
