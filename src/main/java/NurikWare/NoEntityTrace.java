package NurikWare;

import minecraft.class03443;
import minecraft.class06202;

@class11080(
   L = "NoEntityTrace",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class NoEntityTrace extends class11067 {
   public Object L_0;

   private void P() {
   }

   public NoEntityTrace() {
      super();
      this.P();
      this.L_0 = class11524.N(this, "only-while-breaking", false);
   }

   @class11782
   public void N(class11357 var1) {
      this.P();
      if (!((class11507)this.L_0).i() || ((class03443)((class06202)super.y_0).T_2).E()) {
         var1.N();
      }
   }
}
