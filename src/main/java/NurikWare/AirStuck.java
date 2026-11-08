package NurikWare;

import minecraft.class00381;
import minecraft.class02574;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07352;
import minecraft.class08687;

@class11080(
   L = "AirStuck",
   y = class11072.MOVEMENT,
   N = class11106.TOOLS
)
public class AirStuck extends class11067 {
   public Object L_0;
   public boolean L_init;

   private class08687 P() {
      class05630 class05630 = (class05630)((class06202)super.y_0).i_7;
      return new class08687(class05630.n.R(), class05630.G.R(), class05630.t.R(), class05630.l.R(), class05630.d.R(), class05630.w.R(), class05630.k.R());
   }

   private void T() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
      }
   }

   public AirStuck() {
      super();
      this.T();
   }

   @Override
   public boolean Z() {
      this.T();
      this.L_0 = 0;
      return true;
   }

   @Override
   public boolean i() {
      this.N(this.P());
      return true;
   }

   private boolean m() {
      this.T();
      return (Integer)this.L_0 >= 1;
   }

   @class11782
   public void N(class11355 var1) {
      this.T();
      if (this.m()) {
         var1.N();
      }

      this.L_0 = (Integer)this.L_0 + 1;
   }

   @class11782
   public void N(class11385 var1) {
      class11902.N(var1);
   }

   @class11782
   public void N(class10965 var1) {
      class00381<?> class00381 = var1.L();
      boolean flag = class00381 instanceof class07352 || class00381 instanceof class02574;
      if (this.m() && flag) {
         var1.N();
      }
   }

   private void N(class08687 var1) {
      if ((class04453)((class06202)super.y_0).T_4 != null && !var1.equals((class08687)((class04453)((class06202)super.y_0).T_4).L_2)) {
         class11910.N(new class07352(var1));
         ((class04453)((class06202)super.y_0).T_4).L_2 = var1;
      }
   }

   @class11782
   public void N(class11379 var1) {
      if (this.m()) {
         var1.N();
      }
   }
}
