package NurikWare;

import minecraft.class06889;

public class class11003 extends class11053 {
   public class11003(Scaffold var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public class11499 N(class11019 var1, class06889 var2, class11499 var3) {
      float f = Math.clamp(var3.y(), -45.0F, 45.0F);
      float f1 = Math.clamp(var3.R(), -45.0F, 45.0F);
      class11499 class11499 = class11505.N().N(f, f1);
      class11499 = class11499.N(class11908.y(2.0F), class11908.y(1.0F));
      return class11499.N(true);
   }
}
