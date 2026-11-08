package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;

@class11080(
   L = "FastExp",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class FastExp extends class11067 {
   public Object L_0;
   public Object L_1;

   private void T() {
   }

   public FastExp() {
      super();
      this.T();
      this.L_0 = class11524.N(this, "only-without-pvp", true);
      this.L_1 = class11524.N(this, "delay", 1.0F, 0.0F, 3.0F, 1.0F);
   }

   @class11782
   public void N(class11375 var1) {
      this.T();
      if (!((class11507)this.L_0).i() || !class11907.u()) {
         if (((class04453)((class06202)super.y_0).T_4).method_5998(var1.i()).B() == class06570.GB) {
            ((class06202)super.y_0).M_4 = ((class11504)this.L_1).i().intValue();
         }
      }
   }
}
