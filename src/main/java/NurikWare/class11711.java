package NurikWare;

import minecraft.class00676;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07078;

public class class11711 extends class11697 {
   public Object N_0;

   private void L() {
   }

   public class11711(String var1, boolean var2) {
      super(var1, var2);
      this.L();
   }

   @Override
   public boolean N() {
      this.L();
      return !((class03448)((class06202)super.y_0).T_3)
         .method_18023(class07078.S, ((class04453)((class06202)super.y_0).T_4).method_5829().M(((class11504)this.N_0).i().floatValue()), var0 -> true)
         .isEmpty();
   }

   public void N(AutoTotem var1) {
      this.L();
      this.N_0 = (class11504)class11524.N(var1, "distance-to-crystal", 5.0F, 3.0F, 60.0F, 1.0F).N(var1x -> this.U());
   }
}
