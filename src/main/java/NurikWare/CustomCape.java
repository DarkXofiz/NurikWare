package NurikWare;

import minecraft.class01894;
import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "CustomCape",
   y = class11072.MISC,
   N = class11106.CLIENT
)
public class CustomCape extends class11067 {
   public Object L_0;

   private void P() {
   }

   public CustomCape() {
      super();
      this.P();
   }

   @class11782
   public void N(class10985 var1) {
      this.P();
      if (var1.y() == (class04453)((class06202)super.y_0).T_4) {
         if ((class01894)this.L_0 == null) {
            this.L_0 = class11911.N("textures/capes/cape.png");
         }

         var1.N((class01894)this.L_0);
      }
   }
}
