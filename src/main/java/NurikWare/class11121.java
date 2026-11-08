package NurikWare;

import minecraft.class00500;
import minecraft.class00624;
import minecraft.class00650;
import minecraft.class00730;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class01312;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06999;
import minecraft.class07007;
import minecraft.class07209;
import minecraft.class07746;
import minecraft.class08434;

public class class11121 extends class11110 {
   public Object y_0;
   public boolean y_init;

   private void L() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }

   public class11121(AttackAura var1, String var2, boolean var3) {
      super(var1, var2, var3, false);
      this.L();
   }

   @Override
   public void y(Object var1) {
      this.L();
      if (var1 instanceof class10992) {
         this.y_0 = true;
      } else if (var1 instanceof class11355) {
         this.y_0 = false;
      } else if (var1 instanceof class09331 class09331 && (Boolean)this.y_0 && this.N(class09331.u(), class09331.L())) {
         class09331.N();
      }
   }

   private boolean N(class00500 var1, class07209 var2) {
      class07209 class07209 = class07209.method_49638(((class04453)((class06202)super.N_0).T_4).method_33571());
      if (!class07209.equals(var2)
         && (!((class04453)((class06202)super.N_0).T_4).method_41328(class01312.field_18079) || !class07209.method_10084().equals(var2))) {
         class00891 class00891 = var1.i();
         return class00891 instanceof class07746
            || class00891 instanceof class07007
            || class00891 instanceof class06999
            || class00891 instanceof class00730
            || class00891 instanceof class00860
            || class00891 instanceof class08434
            || class00891 instanceof class00650
            || class00891 instanceof class00624;
      } else {
         return true;
      }
   }
}
