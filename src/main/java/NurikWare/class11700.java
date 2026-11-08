package NurikWare;

import minecraft.class04453;
import minecraft.class06202;

public class class11700 extends class11807<AutoLeave> implements class11801<AutoLeave> {
   public Object y_0;

   private void L() {
   }

   public class11700(AutoLeave var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.L();
   }

   static {
      N();
   }

   @Override
   public void y(Object var1) {
      this.L();
      if (var1 instanceof class10957 && ((class04453)((class06202)super.N_0).T_4).method_6032() < ((class11504)this.y_0).i()) {
         ((AutoLeave)super.N_1).m();
      }
   }

   public void N(AutoLeave var1) {
      this.L();
      this.y_0 = (class11504)class11524.N(var1, "health", 15.0F, 1.0F, 20.0F, 0.5F).N(var1x -> this.U());
   }

   private static void N() {
   }
}
