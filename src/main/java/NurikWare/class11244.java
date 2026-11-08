package NurikWare;

import minecraft.class03386;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06889;

public class class11244 extends class11230 {
   public class11244(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10996) {
         if (((class04453)((class06202)super.N_0).T_4).field_6012 % 4 == 0) {
            class05363 class05363 = ((class03386)((class06202)super.N_0).i_5).s();
            float f = class05363.R();

            for (int i = 0; i < 20; i++) {
               float f1 = class11908.N(f + class11908.y(-90.0F, 90.0F));
               double d0 = -Math.sin(f1);
               double d1 = Math.cos(f1);
               double d2 = d0 * class11908.y(3.0F, 30.0F);
               double d3 = class11908.y(-2.0F, 15.0F) - 2.0F;
               double d4 = d1 * class11908.y(3.0F, 30.0F);
               class06889 class06889x = class05363.y().y(d2, d3, d4);
               class06889 class06889x = new class06889((Math.random() * 0.5 - 0.25) * 0.9, Math.random() * 0.25 * 0.01, (Math.random() * 0.5 - 0.25) * 0.9);
               class11179 class11179 = new class11179(class11908.N(40, 70), this.N());
               class11179.N(true);
               class11179.N(class06889x);
               class11179.y(class06889x);
               class11179.y(0.995);
               class11179.N(0.01F);
               this.N(class11179);
            }
         }
      }
   }
}
