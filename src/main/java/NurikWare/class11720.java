package NurikWare;

import minecraft.class03443;
import minecraft.class03448;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class07089;

public class class11720 extends class11704 implements class11801<NoDelay> {
   public Object y_0;

   public class11720(NoDelay var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.u();
   }

   static {
      N();
   }

   private void u() {
   }

   @Override
   public void y(Object var1) {
      this.u();
      if (var1 instanceof class11380 && (class03448)((class06202)super.N_0).T_3 != null) {
         ((class03443)((class06202)super.N_0).T_2).y = 0;
         if (((class03443)((class06202)super.N_0).T_2).L
            && (class07089)((class06202)super.N_0).M_3 instanceof class06183
            && ((class03443)((class06202)super.N_0).T_2).N > 1.1F - ((class11504)this.y_0).i()) {
            ((class03443)((class06202)super.N_0).T_2).N = 1.0F;
         }
      }
   }

   public void N(NoDelay var1) {
      this.u();
      this.y_0 = (class11504)class11524.N(var1, "break-delay", 0.5F, 0.1F, 1.0F, 0.1F).N(var1x -> this.U());
   }

   private static void N() {
   }
}
