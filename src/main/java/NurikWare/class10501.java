package NurikWare;

import java.util.Optional;
import minecraft.class00405;
import minecraft.class05199;
import minecraft.class05209;
import minecraft.class05228;
import minecraft.class05232;
import minecraft.class05935;
import minecraft.class05936;

public class class10501 implements class05935<class05936> {
   private final class05199 y;

   public class10501(class05228 var1, class05209 var2) {
      super();
      this.N = var2;
      this.y = new class05199();
   }

   public Optional<class05936> accept(class00405 var1, String var2) {
      this.N.y();
      if (!class05232.L(var2, var1, this.N)) {
         String s = var2.substring(0, this.N.N());
         if (!s.isEmpty()) {
            this.y.N(class05936.N(s, var1));
         }

         return Optional.of(this.y.y());
      } else {
         if (!var2.isEmpty()) {
            this.y.N(class05936.N(var2, var1));
         }

         return Optional.empty();
      }
   }
}
