package NurikWare;

import minecraft.class03328;
import minecraft.class03599;
import minecraft.class04995;

public abstract class class10208 implements class03599 {
   protected class10208(class03328 var1) {
      super();
      this.y = var1;
   }

   public int N(float var1) {
      return Math.max(class04995.y(this.y.B + this.y.Z * var1), 0);
   }
}
