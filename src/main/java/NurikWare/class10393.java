package NurikWare;

import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class04403;
import minecraft.class06799;

public class class10393 implements class06799 {
   public class10393() {
      super();
   }

   public void N(class10394 var1, class00667 var2) {
      var2.y(var1.N);
   }

   public class10394 y(class00667 var1) {
      return new class10394(this, var1.b());
   }

   public void N(class10394 var1, JsonObject var2) {
      var2.addProperty("registry", var1.N.N().toString());
   }

   public class10394 N(class04403 var1) {
      return new class10394(this, var1.N);
   }
}
