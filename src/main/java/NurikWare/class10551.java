package NurikWare;

import java.util.Optional;
import minecraft.class00405;
import minecraft.class05935;
import minecraft.class05936;
import minecraft.class05977;

public class class10551 implements class05936 {
   public class10551(String var1) {
      super();
      this.N = var1;
   }

   public <T> Optional<T> N_8(class05977<T> var1) {
      return var1.accept(this.N);
   }

   public <T> Optional<T> N(class05935<T> var1, class00405 var2) {
      return var1.accept(var2, this.N);
   }
}
