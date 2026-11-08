package NurikWare;

import minecraft.class06202;

public class class11710 extends class11798<AutoLeave> implements class11708 {
   public Object y_0;

   public String L() {
      this.u();
      return (String)this.y_0;
   }

   public class11710(AutoLeave var1, String var2, String var3, boolean var4) {
      super(var1, var3, var4);
      this.u();
      this.y_0 = var2;
   }

   private void u() {
   }

   @Override
   public void N() {
      String s = this.L();
      if (!s.isBlank()) {
         ((class06202)super.N_0).NE().u(s);
      }
   }
}
