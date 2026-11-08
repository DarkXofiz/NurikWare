package NurikWare;

import minecraft.class03443;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11071 extends class11079 {
   public class11071(AttackAura var1, String var2) {
      super(var1, var2);
   }

   public float i() {
      return 1.0F;
   }

   @Override
   public class11499 N(class07438 var1, boolean var2, double var3) {
      if (((class11799)((class03443)((class06202)super.y_0).T_2)).N() == 1) {
         return class11505.N();
      } else {
         class11499 class11499 = class11505.N(class11505.N(), this.N(var1, var3));
         float f = this.N(class11499.y(), 45.0F) + (var2 ? 0.0F : class11908.y(this.R()));
         float f1 = this.N(class11499.R(), 5.0F) + (var2 ? 0.0F : class11908.y(this.i()));
         return class11505.N().N(f, f1).N(true).u(true);
      }
   }

   private float N(float var1, float var2) {
      return (float)(var2 * Math.tanh(var1 / var2));
   }

   @Override
   public class06889 N(class07438 var1, double var2) {
      return class11895.N(var1, class11505.N(), var2);
   }

   public float R() {
      return 5.0F;
   }
}
