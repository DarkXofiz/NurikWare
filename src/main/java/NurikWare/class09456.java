package NurikWare;

import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class01283;

public class class09456 implements class01283 {
   public class09456(UnaryOperator var1, boolean var2) {
      super();
      this.M = var1;
      this.B = var2;
   }

   public class00392 method_45282(class00392 var1) {
      return this.M.apply(var1);
   }

   public boolean method_45279() {
      return this.B;
   }
}
