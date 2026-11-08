package NurikWare;

import java.util.function.Function;
import minecraft.class02362;

public class class09704<B, O> implements class02362<B, O> {
   public class09704(class02362 var1, Function var2, Function var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public O decode(B var1) {
      return (O)this.N.apply(this.L.decode(var1));
   }

   public void encode(B var1, O var2) {
      this.L.encode(var1, this.y.apply(var2));
   }
}
