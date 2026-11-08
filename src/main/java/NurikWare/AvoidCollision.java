package NurikWare;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "AvoidCollision",
   y = class11072.PLAYER,
   u = class11101.DEVELOPMENT,
   N = class11106.BASE
)
public class AvoidCollision extends class11067 {
   public AvoidCollision() {
      super();
   }

   @class11782
   public void N(class11385 var1) {
      float f = 0.3F;

      for (short short1 = -180; short1 <= 180; short1 += 90) {
         double d0 = -Math.sin(Math.toRadians(short1)) * f;
         double d1 = Math.cos(Math.toRadians(short1)) * f;
         if (((class03448)((class06202)super.y_0).T_3)
            .method_8600((class04453)((class06202)super.y_0).T_4, ((class04453)((class06202)super.y_0).T_4).method_5829().u(d0, 0.0, d1))
            .iterator()
            .hasNext()) {
            var1.B(true);
            class11902.N(var1, short1 + 180);
            break;
         }
      }
   }
}
