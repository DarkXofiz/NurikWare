package NurikWare;

import minecraft.class04453;
import minecraft.class04462;
import minecraft.class04474;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08687;

public class class10892 extends class11807<Flight> implements class11801<Flight> {
   public Object y_0;

   public class10892(Flight var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.R();
   }

   static {
      N();
   }

   @Override
   public void y(Object var1) {
      this.R();
      if (var1 instanceof class11370 class11370) {
         class08687 class08687 = ((class04474)((class04453)((class06202)super.N_0).T_4).L_1).field_54155;
         float f = class04462.N(class08687.N(), class08687.y());
         float f1 = class04462.N(class08687.L(), class08687.u());
         class06889 class06889 = class06889.L;
         if (f != 0.0F || f1 != 0.0F) {
            double d0 = Math.toRadians(class11902.N(((class04453)((class06202)super.N_0).T_4).method_36454(), f, f1));
            class06889 = class06889.y(-Math.sin(d0) * ((class11504)this.y_0).i().floatValue(), 0.0, Math.cos(d0) * ((class11504)this.y_0).i().floatValue());
         }

         float f2 = class04462.N(class08687.i(), class08687.R());
         class06889 = class06889.y(0.0, f2 * ((class11504)this.y_0).i() / 2.0F, 0.0);
         class11370.N(class06889);
      }
   }

   private static void N() {
   }

   public void N(Flight var1) {
      this.R();
      this.y_0 = (class11504)class11524.N(var1, "speed", 1.0F, 0.1F, 10.0F, 0.1F).N(var1x -> this.U());
   }

   private void R() {
   }
}
