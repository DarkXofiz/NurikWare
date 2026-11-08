package NurikWare;

import java.util.EnumSet;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class07430;
import minecraft.class07473;

public class class10475 extends class07473 {
   private final class04882 y;

   public void L() {
      this.y.z(true);
      super.L();
   }

   public class10475(class04882 var1, class04882 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   public void i() {
      if (!this.y.method_5701() && class04882.N(this.y).y(this.N(100)) == 0) {
         this.N.method_56078(this.N.E());
      }

      if (!this.y.method_5765() && class04882.y(this.y).y(this.N(50)) == 0) {
         this.y.A().y();
      }

      super.i();
   }

   public void u() {
      this.y.z(false);
      super.u();
   }

   public boolean N() {
      class04877 class04877 = this.y.K();
      return this.y.method_5805() && this.y.T() == null && class04877 != null && class04877.R();
   }
}
