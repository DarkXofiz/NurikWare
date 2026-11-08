package NurikWare;

import minecraft.class00392;
import minecraft.class02675;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;

@class11080(
   L = "DeathCoords",
   y = class11072.MISC,
   N = class11106.BASE
)
public class DeathCoords extends class11067 {
   public Object L_0;

   public DeathCoords() {
      super();
      this.b();
      this.L_0 = class11524.N(this, "save-waypoint", false);
   }

   private void b() {
   }

   @class11782
   public void N(class10990 var1) {
      this.b();
      if (var1.u() instanceof class02675 class02675) {
         if (((class03448)((class06202)super.y_0).T_3).method_8469(class02675.N()) == (class04453)((class06202)super.y_0).T_4) {
            class06889 class06889 = ((class04453)((class06202)super.y_0).T_4).method_73189();
            int i = (int)class06889.N();
            int j = (int)class06889.y();
            int k = (int)class06889.L();
            class05216 class05216 = class11921.N("death-message", i, j, k).N(class06541.field_1080);
            class11303.N(new class11288(this), (class00392)class05216);
            if (((class11507)this.L_0).i()) {
               class11938.E().N(class12020.N("death-waypoint"), new class06889(i, j, k), class11910.L());
            }
         }
      }
   }
}
