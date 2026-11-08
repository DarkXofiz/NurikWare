package NurikWare;

import minecraft.class00380;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00509;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class08036;

public class class11559 extends class11590 {
   public class11559(UseTracker var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      N();
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10990 class10990) {
         if (class10990.u() instanceof class00509 class00509 && class00509.N() == 35) {
            class07049 class07049 = class00509.N((class03448)((class06202)super.N_0).T_3);
            if (class07049 != (class04453)((class06202)super.N_0).T_4 && class07049 instanceof class08036 class08036) {
               for (class07050 class07050 : class07050.values()) {
                  class06584 class06584 = class08036.method_5998(class07050);
                  if (class06584.B() == class06570.la) {
                     class11923.N(() -> this.y(class08036, class06584));
                     break;
                  }
               }
            }
         }
      }
   }

   private void y(class08036 var1, class06584 var2) {
      class00380 class00380 = new class00380(var2);
      class05216 class05216x = var1.method_5476().L();
      class05216 class05216x = class05216x.i(
            class06541.field_1080 + (class06541.N(class05216x.getString()).endsWith(" ") ? "" : " ") + class12020.N("totem-popped") + " "
         )
         .i(var2.I() ? class06541.field_1060 + "✔" : class06541.field_1061 + "❌")
         .y(class00405.N.N(class00380));
      class11303.N(new class11288((UseTracker)super.u_0), (class00392)class05216x);
   }

   private static void N() {
   }
}
