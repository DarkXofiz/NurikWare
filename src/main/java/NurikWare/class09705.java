package NurikWare;

import java.util.function.Function;
import minecraft.class02362;

public class class09705<O, V> implements class02362<O, V> {
   public class09705(class02362 var1, Function var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public V decode(O var1) {
      Object object = this.N.apply(var1);
      return (V)this.y.decode(object);
   }

   public void encode(O var1, V var2) {
      Object object = this.N.apply(var1);
      this.y.encode(object, var2);
   }
}
