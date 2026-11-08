package NurikWare;

import minecraft.class03443;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11084 extends class11079 {
   public class11084(AttackAura var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   private float N(float var1, float var2) {
      return (float)(var2 * Math.tanh(var1 / var2));
   }

   @Override
   public class06889 N(class07438 var1, double var2) {
      return class11895.N(var1, class11505.N(), var2);
   }

   @Override
   public class11499 N(class07438 var1, boolean var2, double var3) {
      if (((class11799)((class03443)((class06202)super.y_0).T_2)).N() == 1) {
         return class11505.N();
      } else {
         class11499 class11499 = class11505.N(class11505.N(), this.N(var1, var3));
         int i = ((class04453)((class06202)super.y_0).T_4).field_6012;
         float f = var2
            ? class11499.y() + class11908.y(2.0F)
            : this.N(class11499.y(), class11908.y(40.0F, 60.0F)) + (class04995.m(i) * 10.0F + class11908.y(2.5F));
         float f1 = this.N(class11499.R(), 8.0F) + (class04995.P(i) * 4.0F + class11908.y(1.0F));
         return class11505.N().N(f, f1).u(true);
      }
   }
}
