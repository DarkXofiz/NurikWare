package NurikWare;

import minecraft.class00869;
import minecraft.class05573;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07872;

public class class10849 extends class05573 {
   public class10849(class07872 var1, class07299 var2) {
      super(var1, var2);
   }

   public boolean N(class07209 var1) {
      class07079 class07079 = this.y;
      return class07079 instanceof class07872 && ((class07872)class07079).u != null
         ? this.L.method_8320(var1).N(class00869.K)
         : !this.L.method_8320(var1.method_10074()).P();
   }
}
