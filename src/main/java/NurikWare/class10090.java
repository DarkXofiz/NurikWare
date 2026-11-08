package NurikWare;

import minecraft.class00500;
import minecraft.class01820;
import minecraft.class03019;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class08050;

public class class10090 implements class01820 {
   public class10090(class03019 var1, class08050 var2, class07218 var3, class07321 var4) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public String toString() {
      return "ChunkBlockColumn " + this.L;
   }

   public class00500 N(int var1) {
      return this.N.method_8320(this.y.method_10099(var1));
   }

   public void N(int var1, class00500 var2) {
      if (this.N.w().L(var1)) {
         this.N.N(this.y.method_10099(var1), var2);
         if (!var2.Y().W()) {
            this.N.u(this.y);
         }
      }
   }
}
