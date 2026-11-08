package NurikWare;

import com.google.gson.JsonObject;
import minecraft.class00202;
import minecraft.class00667;
import minecraft.class06799;

public class class09232 implements class06799 {
   public class09232() {
      super();
   }

   public void N(class09231 var1, class00667 var2) {
      var2.y(var1.N);
   }

   public class09231 y(class00667 var1) {
      return new class09231(this, var1.b());
   }

   public void N(class09231 var1, JsonObject var2) {
      var2.addProperty("registry", var1.N.N().toString());
   }

   public class09231 N(class00202 var1) {
      return new class09231(this, var1.y);
   }
}
