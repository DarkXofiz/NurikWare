package NurikWare;

import java.util.Optional;
import java.util.function.BiFunction;
import minecraft.class05880;
import minecraft.class07209;
import minecraft.class07299;

public class class10543 implements class05880 {
   public class10543(class07299 var1, class07209 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public <T> Optional<T> N(BiFunction<class07299, class07209, T> var1) {
      return Optional.of((T)var1.apply(this.y, this.L));
   }
}
