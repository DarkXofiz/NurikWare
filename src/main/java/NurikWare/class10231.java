package NurikWare;

import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class03784;
import minecraft.class06799;

public class class10231 implements class06799 {
   public class10231() {
      super();
   }

   public void N(class10232 var1, class00667 var2) {
      var2.y(var1.N);
   }

   public class10232 y(class00667 var1) {
      return new class10232(this, var1.b());
   }

   public void N(class10232 var1, JsonObject var2) {
      var2.addProperty("registry", var1.N.N().toString());
   }

   public class10232 N(class03784 var1) {
      return new class10232(this, var1.L);
   }
}
