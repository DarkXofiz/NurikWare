package NurikWare;

import minecraft.class01818;
import minecraft.class03005;
import minecraft.class04039;
import minecraft.class04995;

public class class10096 extends class10099 {
   public class10096(class03005 var1, class04039 var2, int var3, int var4, class01818 var5) {
      super(var2);
      this.N = var2;
      this.y = var3;
      this.i = var4;
      this.R = var5;
   }

   protected boolean N() {
      int ix = this.L.s;
      if (ix <= this.y) {
         return true;
      } else if (ix >= this.i) {
         return false;
      } else {
         double d0 = class04995.y(ix, this.y, this.i, 1.0, 0.0);
         return this.R.N(this.L.z, ix, this.L.U).z() < d0;
      }
   }
}
