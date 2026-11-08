package NurikWare;

import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class04803;
import minecraft.class06584;

public class class10472 implements class04803 {
   public class10472(Supplier var1, Consumer var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class06584 N() {
      return (class06584)this.N.get();
   }

   public boolean N(class06584 var1) {
      this.y.accept(var1);
      return true;
   }
}
