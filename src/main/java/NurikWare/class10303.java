package NurikWare;

import java.util.HashMap;
import java.util.Map;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03885;
import minecraft.class03897;
import minecraft.class04084;

public class class10303 implements class03881 {
   private final Map<class03877, class03877> N = new HashMap<>();

   public class10303(class04084 var1) {
      super();
   }

   public class03877 apply(class03877 var1) {
      return this.N.computeIfAbsent(var1, this::N);
   }

   private class03877 N(class03877 var1) {
      if (var1 instanceof class03885 class03885) {
         return (class03877)class03885.u().N();
      } else {
         return var1 instanceof class03897 class03897 ? class03897.u() : var1;
      }
   }
}
