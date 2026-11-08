package NurikWare;

import minecraft.class01421;
import minecraft.class02058;
import minecraft.class04995;

public class class11440 extends class11442 {
   public class11440(SwingAnimations var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void N(class01421 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      float f = class04995.m(var6 * var6 * (float) Math.PI);
      float f1 = class04995.m(class04995.N(var6) * (float) Math.PI);
      var1.N(var2 * 0.56F, -0.52F, -0.72F);
      var1.N(class02058.u.N(var2 * (45.0F + f * -20.0F)));
      var1.N(class02058.R.N(var2 * f1 * -20.0F));
      var1.N(class02058.y.N(f1 * -var5));
      var1.N(class02058.u.N(var2 * -45.0F));
   }
}
