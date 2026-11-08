package NurikWare;

import java.util.function.Function;
import minecraft.class02362;

public class class10072<B, U> implements class02362<B, U> {
   public class10072(class02362 var1, Function var2, Function var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public U decode(B var1) {
      Object object = this.L.decode(var1);
      return (U)((class02362)this.N.apply(object)).decode(var1);
   }

   public void encode(B var1, U var2) {
      Object object = this.y.apply(var2);
      class02362 class02362 = (class02362)this.N.apply(object);
      this.L.encode(var1, object);
      class02362.encode(var1, var2);
   }
}
