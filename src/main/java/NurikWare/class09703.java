package NurikWare;

import minecraft.class02362;
import minecraft.class02874;
import minecraft.class02895;

public class class09703<B, V> implements class02362<B, V> {
   public class09703(class02895 var1, class02874 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public V decode(B var1) {
      return (V)this.N.decode(var1);
   }

   public void encode(B var1, V var2) {
      this.y.encode(var1, var2);
   }
}
