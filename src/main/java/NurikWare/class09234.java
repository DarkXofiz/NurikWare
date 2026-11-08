package NurikWare;

import minecraft.class00245;
import minecraft.class00753;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class07209;
import minecraft.class07955;

public class class09234 extends class07955 {
   private static final int W = 1024;

   public class09234(class00245 var1) {
      super();
      this.N = var1;
   }

   public class04425 N(class02682 var1, int var2, int var3, int var4) {
      class07209 class07209 = this.N.U();
      if (class07209 == null) {
         return super.N(var1, var2, var3, var4);
      } else {
         double d0 = class07209.method_10262(new class00753(var2, var3, var4));
         return d0 > 1024.0 && d0 >= class07209.method_10262(var1.y()) ? class04425.field_22 : super.N(var1, var2, var3, var4);
      }
   }
}
