package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07047;

public class class11713 extends class11697 {
   public Object N_0;

   public class11713(String var1, boolean var2) {
      super(var1, var2);
      this.i();
   }

   private void i() {
   }

   @Override
   public boolean N() {
      this.i();
      if (!class11281.y(class06570.sT)) {
         return false;
      } else {
         float f = ((class04453)((class06202)super.y_0).T_4).method_6032();
         if (((class04453)((class06202)super.y_0).T_4).method_6059(class07047.t)) {
            f += ((class04453)((class06202)super.y_0).T_4).method_6067();
         }

         return f < ((class11504)this.N_0).i();
      }
   }

   public void N(AutoTotem var1) {
      this.i();
      this.N_0 = (class11504)class11524.N(var1, "elytra-health", 3.0F, 1.0F, 20.0F, 0.5F).N(var1x -> this.U());
   }
}
