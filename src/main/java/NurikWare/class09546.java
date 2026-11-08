package NurikWare;

import minecraft.class01900;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class07134;

public class class09546 implements class04417<class07134> {
   private final class06143 N;

   public class09546(class06143 var1) {
      super();
      this.N = var1;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class01900 class01900 = new class01900(this, var2, var3, var5, var7, 0.0, -0.8F, 0.0, this.N.method_18139(var15));
      class01900.field_3847 = class04995.y(var15, 500, 1000);
      class01900.field_3844 = 0.01F;
      class01900.method_74305(0.32F, 0.5F, 0.22F);
      return class01900;
   }
}
