package NurikWare;

import minecraft.class04453;
import minecraft.class06202;

public class class11683 extends class11787 {
   public Object y_0;

   public class11683(String var1, boolean var2) {
      super(var1, var2);
      this.N();
      this.y_0 = new String[]{"/bal", "/baltop", "/rg"};
   }

   @Override
   public void y(Object var1) {
      this.N();
      if (var1 instanceof class10992) {
         int i = ((class04453)((class06202)super.N_0).T_4).method_59922().y(((String[])this.y_0).length);
         class11910.N(((String[])this.y_0)[i]);
      }
   }

   private void N() {
   }
}
