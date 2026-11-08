package NurikWare;

import minecraft.class02362;
import minecraft.class02880;
import minecraft.class02895;

public class class09706<B, V> implements class02362<B, V> {
   public class09706(class02895 var1, class02880 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public V decode(B var1) {
      return (V)this.N.decode(var1);
   }

   public void encode(B var1, V var2) {
      this.y.encode(var2, var1);
   }
}
