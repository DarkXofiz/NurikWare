package NurikWare;

import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class07134;
import minecraft.class08395;

public class class11164 implements class04417<class07134> {
   private final class06143 N;

   public class11164(class06143 var1) {
      super();
      this.N = var1;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class08395 class08395 = new class08395(var2, var3, var5, var7, 0.5 - var15.U(), var15.Z() ? var11 : -var11, 0.5 - var15.U(), this.N.method_18139(var15));
      class08395.method_3077(var15.N(200, 300));
      class08395.method_3087(1.5F);
      class08395.method_74308(0.0F);
      return class08395;
   }
}
