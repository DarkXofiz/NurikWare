package NurikWare;

import minecraft.class00509;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07049;

public class class11246 extends class11230 {
   public class11246(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      switch (var1) {
         case class10990 class10990:
            if (((class10990)var1).u() instanceof class00509 class00509 && class00509.N() == 35) {
               class07049 class07049 = class00509.N((class03448)((class06202)super.N_0).T_3);
               if (class07049 != (class04453)((class06202)super.N_0).T_4 && class07049 != null) {
                  ((class11783)class07049).dataManager().R().N(40);
               }
            }
            break;
         case class10996 class10996:
            label44: {
               class06069 var6 = ((class04453)((class06202)super.N_0).T_4).method_59922();

               for (class07049 class07049x : ((class03448)((class06202)super.N_0).T_3).M()) {
                  class11821<Integer> class11821 = ((class11783)class07049x).dataManager().R();
                  if (class11821.N() > 0) {
                     for (int i = 0; i < 16; i++) {
                        double d0 = var6.z() * 2.0F - 1.0F;
                        double d1 = var6.z() * 2.0F - 1.0F;
                        double d2 = var6.z() * 2.0F - 1.0F;
                        if (!(class04995.E(d0) + class04995.E(d1) + class04995.E(d2) > 1.0)) {
                           class11179 class11179 = new class11179(class11908.N(60, 72), this.N(var6));
                           class11179.y(class11908.y(0.8F, 1.5F));
                           class11179.N(d0, d1 + 0.2, d2);
                           class11179.y(class07049x.method_23316(d0 / 4.0), class07049x.method_23323(0.5 + d1 / 4.0), class07049x.method_23324(d2 / 4.0));
                           class11179.y(0.6);
                           class11179.N(1.0);
                           this.N(class11179);
                        }
                     }

                     class11821.N(class11821.N() - 1);
                  }
               }
               break label44;
            }
         default:
      }
   }

   private int N(class06069 var1) {
      return var1.y(4) == 0
         ? class11300.N(0.6F + var1.z() * 0.2F, 0.6F + var1.z() * 0.3F, var1.z() * 0.2F)
         : class11300.N(0.1F + var1.z() * 0.2F, 0.4F + var1.z() * 0.3F, var1.z() * 0.2F);
   }
}
