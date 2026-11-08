package NurikWare;

import minecraft.class00667;
import minecraft.class04469;

public record class10407(String name, class04469 signature) {

   public class10407(String name, class04469 signature) {
      super();
      this.name = name;
      this.signature = signature;
   }

   public class10407(class00667 var1) {
      this(var1.u(16), class04469.N(var1));
   }

   public String y() {
      return this.name;
   }

   public class04469 N() {
      return this.signature;
   }

   public void N(class00667 var1) {
      var1.N(this.name, 16);
      class04469.N(var1, this.signature);
   }
}
