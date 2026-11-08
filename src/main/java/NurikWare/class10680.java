package NurikWare;

import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import minecraft.class06826;
import minecraft.class06839;

public class class10680 {
   final Reference2ObjectMap<class06839<?>, Object> N = new Reference2ObjectOpenHashMap();

   public class10680() {
      super();
   }

   public <T> class10680 N(class06839<T> var1, T var2) {
      this.N.put(var1, var2);
      return this;
   }

   public class06826 N() {
      return new class06826(this.N);
   }
}
