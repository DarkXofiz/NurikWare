package NurikWare;

import java.util.function.BiFunction;
import java.util.function.Function;
import minecraft.class02362;

public class class10070<B, C> implements class02362<B, C> {
   public class10070(class02362 var1, class02362 var2, BiFunction var3, Function var4, Function var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   public C decode(B var1) {
      Object object = this.N.decode(var1);
      Object object1 = this.y.decode(var1);
      return (C)this.L.apply(object, object1);
   }

   public void encode(B var1, C var2) {
      this.N.encode(var1, this.u.apply(var2));
      this.y.encode(var1, this.i.apply(var2));
   }
}
