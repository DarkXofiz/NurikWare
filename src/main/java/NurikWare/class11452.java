package NurikWare;

import minecraft.class01421;
import minecraft.class02058;
import minecraft.class06202;

public class class11452 extends class11442 {
   public class11452(SwingAnimations var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void N(class01421 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      var1.N(var2 * 0.56F, -0.52F, -0.72F);
      if (((SwingAnimations)super.N_0).m().i()) {
         float f = (class11938.j().y() + class06202.Nq().NK().N(true)) * 25.0F / var4;
         var1.N(class02058.N.N(f));
      } else {
         var1.N(class02058.N.N(var6 * 360.0F));
      }
   }
}
