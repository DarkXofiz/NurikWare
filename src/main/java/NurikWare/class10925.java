package NurikWare;

import minecraft.class04453;
import minecraft.class04462;
import minecraft.class06202;
import minecraft.class06889;

public class class10925 extends class11807<Flight> implements class11801<Flight> {
   public Object y_0;

   public class10925(Flight var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.R();
   }

   static {
      N();
   }

   @Override
   public void y(Object var1) {
      this.R();
      if (var1 instanceof class11385 class11385) {
         float f = class04462.N(class11385.i(), class11385.M());
         float f1 = class04462.N(class11385.u(), class11385.Z());
         if (f != 0.0F || f1 != 0.0F) {
            double d0 = Math.toRadians(class11902.N(((class04453)((class06202)super.N_0).T_4).method_36454(), f, f1));
            ((class04453)((class06202)super.N_0).T_4)
               .method_60491(
                  new class06889(-Math.sin(d0) * ((class11504)this.y_0).i().floatValue(), 0.0, Math.cos(d0) * ((class11504)this.y_0).i().floatValue())
               );
         }

         float f2 = class04462.N(class11385.L(), class11385.R());
         if (f2 != 0.0F) {
            ((class04453)((class06202)super.N_0).T_4).method_60491(new class06889(0.0, f2 * ((class11504)this.y_0).i() / 2.0F, 0.0));
         }
      }
   }

   public void N(Flight var1) {
      this.R();
      this.y_0 = (class11504)class11524.N(var1, "boost", 1.0F, 0.1F, 5.0F, 0.1F).N(var1x -> this.U());
   }

   private static void N() {
   }

   private void R() {
   }
}
