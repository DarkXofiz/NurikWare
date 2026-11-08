package NurikWare;

import java.util.Optional;
import minecraft.class06584;

public class class11278 {
   public class11278() {
      super();
   }

   public Optional<class11882> N(class06584 var1, String var2, long var3) {
      if (!var2.matches("^[\\s\\S]{3,16}$")) {
         return Optional.empty();
      } else {
         for (class11882 class11882 : class11938.n().y().values()) {
            if (class11882.M()
               && !((float)var3 / var1.c() > (float)Long.parseLong(class11882.Z().i()))
               && var1.c() >= class11882.E()
               && !(class11929.M(var1) < class11882.N())
               && class11882.test(var1)) {
               return Optional.of(class11882);
            }
         }

         return Optional.empty();
      }
   }
}
