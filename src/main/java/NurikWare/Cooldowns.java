package NurikWare;

import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06556;
import minecraft.class06584;

@class11080(
   L = "Cooldowns",
   y = class11072.VISUAL,
   N = class11106.INTERFACE
)
public class Cooldowns extends class11067 {
   public Object L_0;
   public Object L_1;

   private void P() {
   }

   public Cooldowns() {
      super();
      this.P();
      this.L_0 = class11524.N(this, "render-on-items", true);
      this.L_1 = class11524.N(this, "inventory-only", false);
   }

   @Override
   public boolean Z() {
      class11938.i().N();
      return super.Z();
   }

   @Override
   public boolean i() {
      class11938.i().N();
      return super.i();
   }

   public boolean m() {
      this.P();
      return ((class11507)this.L_1).i();
   }

   @class11782
   public void N(class10946 var1) {
      this.P();
      if (((class11507)this.L_0).i()) {
         class04453 class04453 = (class04453)((class06202)super.y_0).T_4;
         if (class04453 != null) {
            class06584 class06584 = var1.u();
            class06556 class06556 = class04453.method_7357();
            class01894 class01894 = class06556.y(class06584);
            if (class01894 != null) {
               class10621 class10621 = (class10621)class06556.N.get(class01894);
               if (class10621 != null) {
                  float f = ((class06202)super.y_0).NK().N(true);
                  float f1 = class10621.y() - (class06556.y + f);
                  if (!(f1 <= 0.0F)) {
                     float f2 = f1 / 20.0F;
                     String s;
                     if (f2 > 99.0F) {
                        s = "99+";
                     } else {
                        s = String.valueOf(Math.round(f2));
                     }

                     float f3 = class06556.N(class06584, f);
                     int i = class04995.M((1.0F - f3) * 100.0F / 100.0F * 0.33333334F, 1.0F, 1.0F) | 0xFF000000;
                     class01054 class01054 = var1.N();
                     int j = var1.L();
                     int k = var1.y() + 8 - 4 - 3;
                     class01054.y((class01590)((class06202)super.y_0).i_3, s, j, k, i);
                  }
               }
            }
         }
      }
   }
}
