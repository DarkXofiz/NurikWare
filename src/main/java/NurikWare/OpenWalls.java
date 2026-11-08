package NurikWare;

import minecraft.class00500;
import minecraft.class00748;
import minecraft.class00891;
import minecraft.class04453;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05982;
import minecraft.class06109;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07113;
import minecraft.class07209;

@class11080(
   L = "OpenWalls",
   y = class11072.MISC,
   N = class11106.BASE
)
public class OpenWalls extends class11067 {
   public OpenWalls() {
      super();
   }

   private boolean N(class00500 var1, class07209 var2) {
      class00891 class00891 = var1.i();
      return class00891 instanceof class05982 || class00891 instanceof class06109 || class00891 instanceof class00748;
   }

   @class11782
   public void N(class10980 var1) {
      class06889 class06889x = ((class04453)((class06202)super.y_0).T_4).method_33571();
      class11499 class11499 = class11505.L();
      class06889 class06889x = ((class04453)((class06202)super.y_0).T_4)
         .method_5631(class11499.R(), class11499.y())
         .L(((class04453)((class06202)super.y_0).T_4).method_55754())
         .i(class06889x);
      class06183 class06183 = class11892.N(
         new class05862(class06889x, class06889x, class05849.field_17558, class05835.field_1348, (class04453)((class06202)super.y_0).T_4), this::N
      );
      if (class06183.N() != class07113.field_1333) {
         if (class11907.N(var1.L(), class06183)) {
            var1.N();
         }
      }
   }
}
