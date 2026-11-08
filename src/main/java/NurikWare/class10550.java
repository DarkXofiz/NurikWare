package NurikWare;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class05935;
import minecraft.class05936;
import minecraft.class05977;

public class class10550 implements class05936 {
   public class10550(List var1) {
      super();
      this.N = var1;
   }

   public <T> Optional<T> N_8(class05977<T> var1) {
      Iterator iterator = this.N.iterator();

      while (iterator.hasNext()) {
         Optional optional = ((class05936)iterator.next()).N_8(var1);
         if (optional.isPresent()) {
            return optional;
         }
      }

      return Optional.empty();
   }

   public <T> Optional<T> N(class05935<T> var1, class00405 var2) {
      Iterator iterator = this.N.iterator();

      while (iterator.hasNext()) {
         Optional optional = ((class05936)iterator.next()).N(var1, var2);
         if (optional.isPresent()) {
            return optional;
         }
      }

      return Optional.empty();
   }
}
