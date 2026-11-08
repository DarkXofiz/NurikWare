package NurikWare;

import minecraft.class07473;
import minecraft.class07637;

public class class10776 extends class07473 {
   private final class07637 N;
   private int y;

   public void L() {
      this.N.M(true);
      this.y = 0;
   }

   public class10776(class07637 var1) {
      super();
      this.N = var1;
   }

   public void u() {
      this.N.M(false);
      this.y = this.N.field_6012 + 200;
   }

   public boolean y() {
      return !this.N.method_5799() && (this.N.Q() || class07637.z(this.N).y(y(600)) != 1) ? class07637.U(this.N).y(y(2000)) != 1 : false;
   }

   public boolean N() {
      return this.y < this.N.field_6012 && this.N.Q() && this.N.No() && class07637.Z(this.N).y(y(400)) == 1;
   }
}
