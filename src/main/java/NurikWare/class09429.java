package NurikWare;

import minecraft.class04995;
import minecraft.class07701;

public final class class09429 {
   private final float N;
   private final boolean y;

   public class09429(float var1, boolean var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public float N(class07701 var1) {
      return class04995.R(this.y ? this.N + var1.E().U : this.N);
   }
}
