package NurikWare;

import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;

public class class11552 extends class11142 {
   public Object y_0;
   public boolean y_init;

   public class11552(ClickAction var1) {
      super(var1, "point-key");
      this.N();
   }

   @Override
   public void y(class11389 var1) {
      this.N();
      if (System.currentTimeMillis() - (Long)this.y_0 >= 750L) {
         if (!class11938.z().R()) {
            class11303.y(class11921.N("socket.not-connected").N(class06541.field_1061));
         } else {
            class05363 class05363 = ((class03386)((class06202)super.N_0).i_5).s();
            class06889 class06889xxx = ((class04453)((class06202)super.N_0).T_4).method_5631(class05363.i(), class05363.R()).L(256.0);
            class06889 class06889x = class05363.y();
            class07089 class07089 = class11892.N(
               (class04453)((class06202)super.N_0).T_4, class06889x, class06889xxx, 256.0, true, class11791.B().and(class11791.N())
            );
            if (class07089 != null && class07089.N() == class07113.field_1331) {
               class07049 class07049 = ((class06145)class07089).L();
               class11938.z().N(new class11987(class07049.method_23317(), class07049.method_23318(), class07049.method_23321(), class07049.method_5628()));
               this.y_0 = System.currentTimeMillis();
            } else {
               class06889 class06889xx = class06889x.i(class06889xxx);
               class06183 class06183 = ((class03448)((class06202)super.N_0).T_3)
                  .N(new class05862(class06889x, class06889xx, class05849.field_17559, class05835.field_1348, (class04453)((class06202)super.N_0).T_4));
               if (class06183.N() != class07113.field_1333) {
                  class06889 class06889xxx = class06183.y();
                  class11938.z().N(new class11987(class06889xxx.N(), class06889xxx.y(), class06889xxx.L(), -1));
                  this.y_0 = System.currentTimeMillis();
               }
            }
         }
      }
   }

   private void N() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0L;
      }
   }
}
