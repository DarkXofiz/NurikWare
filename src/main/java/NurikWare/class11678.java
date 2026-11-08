package NurikWare;

import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class08036;

public class class11678 extends class11697 {
   public Object N_0;

   public class11678(String var1, boolean var2) {
      super(var1, var2);
      this.i();
   }

   private void i() {
   }

   private boolean N(class08036 var1) {
      return var1 != (class04453)((class06202)super.y_0).T_4
         && var1.method_5805()
         && !class11791.u().test(var1)
         && var1.method_6047().N(class06570.Gm)
         && !var1.method_24828()
         && (var1.method_18798().B < 0.0 || var1.method_23318() <= var1.field_5971);
   }

   public void N(AutoTotem var1) {
      this.i();
      this.N_0 = (class11504)class11524.N(var1, "smash-height", 3.0F, 1.0F, 10.0F, 1.0F).N(var1x -> this.U());
   }

   @Override
   public boolean N() {
      this.i();
      class00734 class00734x = ((class04453)((class06202)super.y_0).T_4).method_5829();
      class00734 class00734x = new class00734(
            class00734x.N, class00734x.i + ((class11504)this.N_0).i().floatValue(), class00734x.L, class00734x.u, class00734x.i + 8.0, class00734x.R
         )
         .L(2.0, 0.0, 2.0);
      return !((class03448)((class06202)super.y_0).T_3).N(class08036.class, class00734x, this::N).isEmpty();
   }
}
