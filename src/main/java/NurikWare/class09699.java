package NurikWare;

import minecraft.class02362;

public class class09699<B, V> implements class02362<B, V> {
   public class09699(Object var1) {
      super();
      this.N = var1;
   }

   public V decode(B var1) {
      return (V)this.N;
   }

   public void encode(B var1, V var2) {
      if (!var2.equals(this.N)) {
         throw new IllegalStateException("Can't encode '" + var2 + "', expected '" + this.N + "'");
      }
   }
}
