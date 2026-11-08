package NurikWare;

import minecraft.class01421;
import minecraft.class02058;

public class class11444 extends class11442 {
   public class11444(SwingAnimations var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void N(class01421 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      var1.N(var2 * 0.1F, 0.0F, -0.2F);
      var1.N(var2 * 0.5F, -0.4F, -0.82F);
      var1.N(class02058.u.N(var2 * 90));
      var1.N(class02058.R.N(var2 * -60));
      var1.N(var2 == -1 ? class02058.N.N(var2 * (-80.0F - var5 * var3)) : class02058.y.N(var2 * (-80.0F - var5 * var3)));
   }
}
