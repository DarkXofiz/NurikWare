package NurikWare;

import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class03789;
import minecraft.class06799;

public class class10240 implements class06799 {
   public class10240() {
      super();
   }

   public void N(class10233 var1, class00667 var2) {
      var2.y(var1.N);
   }

   public class10233 y(class00667 var1) {
      return new class10233(this, var1.b());
   }

   public void N(class10233 var1, JsonObject var2) {
      var2.addProperty("registry", var1.N.N().toString());
   }

   public class10233 N(class03789 var1) {
      return new class10233(this, var1.N);
   }
}
