package NurikWare;

import minecraft.class04453;
import minecraft.class06202;

public class class11681 extends class11697 {
   public Object N_0;

   private void M() {
   }

   public class11681(String var1, boolean var2) {
      super(var1, var2);
      this.M();
   }

   public void N(AutoTotem var1) {
      this.M();
      this.N_0 = (class11504)class11524.N(var1, "fall-distance", 10.0F, 10.0F, 60.0F, 5.0F).N(var1x -> this.U());
   }

   @Override
   public boolean N() {
      this.M();
      return !((class04453)((class06202)super.y_0).T_4).method_6128()
         && ((class04453)((class06202)super.y_0).T_4).field_6017 >= ((class11504)this.N_0).i().floatValue();
   }
}
