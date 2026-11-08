package NurikWare;

import com.google.common.cache.CacheLoader;
import minecraft.class05487;
import minecraft.class06646;
import minecraft.class07209;

public class class10641 extends CacheLoader<class07209, class06646> {
   private final class05487 N;
   private final boolean y;

   public class10641(class05487 var1, boolean var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class06646 load(class07209 var1) {
      return new class06646(this.N, var1, this.y);
   }
}
