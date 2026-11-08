package NurikWare;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08036;

public class class11719 extends class11807<AutoLeave> implements class11801<AutoLeave> {
   public Object y_0;

   private void L() {
   }

   public class11719(AutoLeave var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.L();
   }

   static {
      N();
   }

   @Override
   public void y(Object var1) {
      this.L();
      if (var1 instanceof class10957
         && !((class03448)((class06202)super.N_0).T_3)
            .N(class08036.class, ((class04453)((class06202)super.N_0).T_4).method_5829().M(((class11504)this.y_0).i().floatValue()), this::N)
            .isEmpty()) {
         ((AutoLeave)super.N_1).m();
      }
   }

   private boolean N(class08036 var1) {
      return var1 == (class04453)((class06202)super.N_0).T_4 ? false : var1.method_5805() && !class11791.u().test(var1) && !class11791.Z().test(var1);
   }

   private static void N() {
   }

   public void N(AutoLeave var1) {
      this.L();
      this.y_0 = (class11504)class11524.N(var1, "distance", 40.0F, 1.0F, 100.0F, 1.0F).N(var1x -> this.U());
   }
}
