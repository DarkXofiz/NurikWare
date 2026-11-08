package NurikWare;

import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;

@class11080(
   L = "AutoEat",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoEat extends class11067 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   private boolean T() {
      this.j();
      return ((class04453)((class06202)super.y_0).T_4).method_7344().N() < ((class11504)this.L_0).i();
   }

   public AutoEat() {
      super();
      this.j();
      this.L_0 = class11524.N(this, "value", 18.0F, 0.0F, 20.0F, 1.0F);
   }

   private boolean m() {
      if (class11938.m().u()) {
         return false;
      } else if (((class03443)((class06202)super.y_0).T_2).E() || ((class04453)((class06202)super.y_0).T_4).n()) {
         return false;
      } else {
         return !((class04453)((class06202)super.y_0).T_4).method_6115() && (Integer)((class06202)super.y_0).M_4 == 0 ? this.T() : false;
      }
   }

   private void j() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = false;
      }
   }

   private boolean N(class06584 var1) {
      return var1 != null && !var1.R() ? class11929.U(var1) : false;
   }

   @class11782
   public void N(class10950 var1) {
      this.j();
      if ((class04453)((class06202)super.y_0).T_4 != null) {
         this.L_1 = (Boolean)this.L_1 && this.T() && this.N(((class04453)((class06202)super.y_0).T_4).method_6030());
         if ((Boolean)this.L_1) {
            var1.N();
         }
      }
   }

   @class11782
   public void N(class11380 var1) {
      this.j();
      if ((class04453)((class06202)super.y_0).T_4 != null) {
         if (this.m()) {
            for (class07050 class07050 : class07050.values()) {
               class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_5998(class07050);
               if (!class06584.N(((class03448)((class06202)super.y_0).T_3).method_45162())) {
                  return;
               }

               if (this.N(class06584)) {
                  class11907.N(class07050);
                  ((class06202)super.y_0).M_4 = 4;
                  this.L_1 = true;
                  break;
               }
            }
         }
      }
   }
}
