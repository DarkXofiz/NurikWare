package NurikWare;

import minecraft.class02675;
import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "AutoRespawn",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoRespawn extends class11067 {
   public AutoRespawn() {
      super();
   }

   @class11782
   private void N(class10961 var1) {
      if (var1.N() instanceof class02675 class02675) {
         ((class06202)super.y_0).execute(() -> {
            if ((class04453)((class06202)super.y_0).T_4 != null && class02675.N() == ((class04453)((class06202)super.y_0).T_4).method_5628()) {
               ((class04453)((class06202)super.y_0).T_4).K();
            }
         });
      }
   }
}
