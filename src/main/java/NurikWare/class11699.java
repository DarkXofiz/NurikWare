package NurikWare;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07078;

public class class11699 extends class11697 {
   public Object N_0;

   public class11699(String var1, boolean var2) {
      super(var1, var2);
      this.u();
   }

   private void u() {
   }

   @Override
   public boolean N() {
      this.u();
      return !((class03448)((class06202)super.y_0).T_3)
         .method_8333(
            (class04453)((class06202)super.y_0).T_4,
            ((class04453)((class06202)super.y_0).T_4).method_5829().M(((class11504)this.N_0).i().floatValue()),
            var0 -> var0.method_5864() == class07078.yI || var0.method_5864() == class07078.yg
         )
         .isEmpty();
   }

   public void N(AutoTotem var1) {
      this.u();
      this.N_0 = (class11504)class11524.N(var1, "distance-to-tnt", 5.0F, 3.0F, 60.0F, 1.0F).N(var1x -> this.U());
   }
}
