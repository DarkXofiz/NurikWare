package NurikWare;

import minecraft.class00402;
import minecraft.class00500;
import minecraft.class04782;
import minecraft.class06759;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07109;
import minecraft.class07211;
import minecraft.class07327;
import minecraft.class07701;
import minecraft.class07703;

public class class09362 extends class07327 {
   public class09362(class00402 var1) {
      super();
      this.N = var1;
   }

   public boolean N() {
      return !this.N.k();
   }

   public class07701 N(class04782 var1, class07703 var2) {
      class07211 class07211 = (class07211)this.N.w().L(class06759.y);
      return new class07701(
         var2, class06889.y(this.N.U), new class07109(0.0F, class07211.U()), var1, class06984.L, this.i().getString(), this.i(), var1.method_8503(), null
      );
   }

   public void N(class04782 var1) {
      class00500 class00500 = var1.method_8320(this.N.U);
      var1.method_8413(this.N.U, class00500, class00500, 3);
   }

   public void N(String var1) {
      super.N(var1);
      this.N.method_5431();
   }
}
