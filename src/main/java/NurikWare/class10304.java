package NurikWare;

import java.util.HashMap;
import java.util.Map;
import minecraft.class01894;
import minecraft.class03008;
import minecraft.class03556;
import minecraft.class03876;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03906;
import minecraft.class04084;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class05946;
import minecraft.class06066;
import minecraft.class06069;
import minecraft.class06075;

public class class10304 implements class03881 {
   private final Map<class03877, class03877> u;

   public class10304(class04084 var1, long var2, boolean var4) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var4;
      this.u = new HashMap<>();
   }

   public class03877 apply(class03877 var1) {
      return this.u.computeIfAbsent(var1, this::N);
   }

   private class06069 N(long var1) {
      return new class06075(this.N + var1);
   }

   private class03877 N(class03877 var1) {
      if (var1 instanceof class06066 class06066) {
         class06069 class06069 = this.y ? this.N(0L) : this.L.N.N(class01894.y("terrain"));
         return class06066.N(class06069);
      } else {
         return (class03877)(var1 instanceof class03906 ? new class03906(this.N) : var1);
      }
   }

   public class03876 N(class03876 var1) {
      class03556<class05056> class03556 = var1.y();
      if (this.y) {
         if (class03556.N(class03008.N)) {
            class05041 class05041 = class05041.N(this.N(0L), new class05056(-7, 1.0, new double[]{1.0}));
            return new class03876(class03556, class05041);
         }

         if (class03556.N(class03008.y)) {
            class05041 class05041x = class05041.N(this.N(1L), new class05056(-7, 1.0, new double[]{1.0}));
            return new class03876(class03556, class05041x);
         }

         if (class03556.N(class03008.z)) {
            class05041 class05041xx = class05041.y(this.L.N.N(class03008.z.N()), new class05056(0, 0.0, new double[0]));
            return new class03876(class03556, class05041xx);
         }
      }

      class05041 class05041xxx = this.L.N((class05946)class03556.i().orElseThrow());
      return new class03876(class03556, class05041xxx);
   }
}
