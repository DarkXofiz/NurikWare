package NurikWare;

import minecraft.class00392;
import minecraft.class00649;
import minecraft.class03059;
import minecraft.class03926;
import minecraft.class04770;

public record class10103(class03926 message) implements class03059 {
   public class10103(class03926 message) {
      super();
      this.message = message;
   }

   public class03926 y() {
      return this.message;
   }

   public void N(class04770 var1, boolean var2, class00649 var3) {
      class03926 class03926 = this.message.N(var2);
      if (!class03926.z()) {
         var1.field_13987.method_45170(class03926, var3);
      }
   }

   public class00392 N() {
      return this.message.u();
   }
}
