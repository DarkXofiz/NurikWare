package NurikWare;

import java.util.function.Function;
import minecraft.class02362;

public class class10079<B, C> implements class02362<B, C> {
   public class10079(class02362 var1, Function var2, Function var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public C decode(B var1) {
      Object object = this.N.decode(var1);
      return (C)this.y.apply(object);
   }

   public void encode(B var1, C var2) {
      this.N.encode(var1, this.L.apply(var2));
   }
}
