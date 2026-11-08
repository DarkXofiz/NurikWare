package NurikWare;

import minecraft.class00549;
import minecraft.class02796;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06265;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class08771;
import org.jspecify.annotations.Nullable;

public class class09959 implements class08771 {
   @Nullable
   private class06265 L;
   private int u;
   private int i;

   public class09959(class02796 var1, int var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public int N() {
      return this.N;
   }

   @Nullable
   public class00549 N(int var1, int var2) {
      return this.L == null ? null : this.L.L(class07321.u(var1 + this.u - this.N, var2 + this.i - this.N));
   }

   public void N(class05946<class07299> var1, class07321 var2) {
      class04782 class04782 = this.y.N(var1);
      this.L = class04782 != null ? class04782.method_14178().L : null;
      this.u = var2.B;
      this.i = var2.Z;
   }
}
