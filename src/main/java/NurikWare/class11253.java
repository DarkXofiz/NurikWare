package NurikWare;

import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07268;

public class class11253 extends class11230 {
   public class11253(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10990 && ((class10990)var1).u() instanceof class07268 class07268 && class07268.y() == 4) {
         class07049 class07049 = ((class03448)((class06202)super.N_0).T_3).method_8469(class07268.N());
         if (class07049 != null) {
            for (int i = 0; i < 50; i++) {
               class06889 class06889x = new class06889((Math.random() - 0.5) * 0.6, Math.random() * 0.2 + 0.1, (Math.random() - 0.5) * 0.6);
               class06889 class06889x = new class06889(
                  class07049.method_23316(class06889x.M / 4.0),
                  class07049.method_23318() + class07049.method_17682() * Math.random(),
                  class07049.method_23324(class06889x.Z / 4.0)
               );
               class11179 class11179 = new class11179(class11908.N(20, 30), this.N());
               class11179.N(class06889x);
               class11179.y(class06889x);
               class11179.y(0.998);
               class11179.N(0.7);
               this.N(class11179);
            }
         }
      }
   }
}
