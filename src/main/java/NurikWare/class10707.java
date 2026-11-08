package NurikWare;

import java.util.Map;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05197;
import minecraft.class05232;
import minecraft.class05936;
import minecraft.class07018;

public class class10707 extends class07018 {
   public class10707(Map var1) {
      super();
      this.N = var1;
   }

   public class01028 N(class05936 var1) {
      return var1x -> var1.N((var1xx, var2) -> class05232.L(var2, var1xx, var1x) ? Optional.empty() : class05936.L, class00405.N).isPresent();
   }

   public boolean N() {
      return false;
   }

   public boolean N(String var1) {
      return this.N.containsKey(var1);
   }

   public String N(String var1, String var2) {
      return this.N.getOrDefault(var1, var2);
   }
}
