package NurikWare;

import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07488;
import minecraft.class07517;

public class class11251 extends class11230 {
   public class11251(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10996) {
         for (class07049 class07049 : ((class03448)((class06202)super.N_0).T_3).M()) {
            if ((class07049 instanceof class07517 || class07049 instanceof class07488) && this.N(class07049)) {
               for (int i = 0; i < 5; i++) {
                  class06889 class06889 = new class06889((Math.random() - 0.5) * 0.3, (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.3);
                  class11179 class11179 = new class11179(class11908.N(20, 40), this.N());
                  class11179.N(true);
                  class11179.N(class07049.method_73189());
                  class11179.y(class06889);
                  class11179.y(0.95);
                  class11179.N(0.02);
                  this.N(class11179);
               }
            }
         }
      }
   }

   private boolean N(class07049 var1) {
      return var1.field_6012 <= 0
         ? false
         : var1.field_6038 != var1.method_23317() || var1.field_5971 != var1.method_23318() || var1.field_5989 != var1.method_23321();
   }
}
