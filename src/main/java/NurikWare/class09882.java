package NurikWare;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import minecraft.class01905;
import minecraft.class01929;
import minecraft.class02755;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04227;
import minecraft.class06581;
import minecraft.class07310;

public class class09882 {
   private final class01905<class06581> N;
   private final class03767 y;
   private final Object2IntSortedMap<class06581> L = new Object2IntLinkedOpenHashMap();

   public class09882(class01929 var1, class03767 var2) {
      super();
      this.N = var1.y(class04227.F);
      this.y = var2;
   }

   public class09882 N(class07310 var1, int var2) {
      class06581 class06581 = var1.B();
      this.N(var2, class06581);
      return this;
   }

   private void N(int var1, class06581 var2) {
      if (var2.N(this.y)) {
         this.L.put(var2, var1);
      }
   }

   public class09882 N(class03530<class06581> var1, int var2) {
      this.N.N(var1).ifPresent(var2x -> {
         for (class03556 class03556 : var2x) {
            this.N(var2, (class06581)class03556.N());
         }
      });
      return this;
   }

   public class09882 N(class03530<class06581> var1) {
      this.L.keySet().removeIf(var1x -> var1x.i().N(var1));
      return this;
   }

   public class02755 N() {
      return new class02755(this.L);
   }
}
