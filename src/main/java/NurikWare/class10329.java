package NurikWare;

import java.util.function.Consumer;
import minecraft.class03556;
import minecraft.class04289;
import minecraft.class05908;
import minecraft.class06584;

public class class10329 extends class10208 {
   public class10329(class04289 var1, class03556 var2) {
      super(var1);
      this.N = var2;
   }

   public void N(Consumer<class06584> var1, class05908 var2) {
      var1.accept(new class06584(this.N));
   }
}
