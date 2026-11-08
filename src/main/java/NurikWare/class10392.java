package NurikWare;

import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class04434;
import minecraft.class06799;

public class class10392 implements class06799 {
   public class10392() {
      super();
   }

   public void N(class10395 var1, class00667 var2) {
      var2.y(var1.N);
   }

   public class10395 y(class00667 var1) {
      return new class10395(this, var1.b());
   }

   public void N(class10395 var1, JsonObject var2) {
      var2.addProperty("registry", var1.N.N().toString());
   }

   public class10395 N(class04434 var1) {
      return new class10395(this, var1.N);
   }
}
