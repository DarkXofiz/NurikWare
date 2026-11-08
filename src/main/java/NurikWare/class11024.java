package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08687;

public class class11024 extends class11807<Scaffold> {
   public class11024(Scaffold var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class11385 class11385) {
         if (((class04453)((class06202)super.N_0).T_4).method_24828() && this.N()) {
            class11385.y(true);
         }
      }
   }

   private boolean N() {
      class08687[] aclass08687 = new class08687[]{
         new class08687(true, false, false, false, false, false, false), new class08687(false, true, false, false, false, false, false)
      };
      int i = aclass08687.length;

      for (int j = 0; j < i; j++) {
         if (!class11899.N(aclass08687[j], 3).u().i().method_24828()) {
            return true;
         }
      }

      return false;
   }
}
