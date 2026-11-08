package NurikWare;

import minecraft.class03011;
import minecraft.class04039;
import minecraft.class05041;

public class class10101 extends class10097 {
   public class10101(class03011 var1, class04039 var2, class05041 var3) {
      super(var2);
      this.i = var1;
      this.N = var2;
      this.y = var3;
   }

   protected boolean N() {
      double d0 = this.y.N(this.L.z, 0.0, this.L.U);
      return d0 >= this.i.L() && d0 <= this.i.u();
   }
}
