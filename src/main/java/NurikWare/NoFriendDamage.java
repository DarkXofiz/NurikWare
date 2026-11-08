package NurikWare;

import minecraft.class00502;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07049;

@class11080(
   L = "NoFriendDamage",
   y = class11072.COMBAT,
   N = class11106.OTHER
)
public class NoFriendDamage extends class11067 {
   public Object L_0;

   private void T() {
   }

   public NoFriendDamage() {
      super();
      this.T();
      this.L_0 = class11524.N(this, "teams", false);
   }

   @class11782
   public void N(class11357 var1) {
      if (class11791.u().test(var1.L())) {
         var1.N();
      }
   }

   public boolean N(class07049 var1) {
      this.T();
      if (this.U() && ((class11507)this.L_0).i() && (class04453)((class06202)super.y_0).T_4 != null && var1 != (class04453)((class06202)super.y_0).T_4) {
         class00502 class00502 = ((class04453)((class06202)super.y_0).T_4).method_5781();
         return class00502 != null && class00502.N(var1.method_5781());
      } else {
         return false;
      }
   }
}
