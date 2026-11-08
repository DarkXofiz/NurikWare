package NurikWare;

import minecraft.class04039;
import minecraft.class07830;
import minecraft.class08050;

public class class10295 extends class10097 {
   public class10295(class04039 var1) {
      super(var1);
   }

   protected boolean N() {
      int i = this.L.z & 15;
      int j = this.L.U & 15;
      int k = Math.max(j - 1, 0);
      int l = Math.min(j + 1, 15);
      class08050 class08050 = this.L.M;
      int i1 = class08050.N(class07830.field_13194, i, k);
      if (class08050.N(class07830.field_13194, i, l) >= i1 + 4) {
         return true;
      } else {
         int j1 = Math.max(i - 1, 0);
         int k1 = Math.min(i + 1, 15);
         int l1 = class08050.N(class07830.field_13194, j1, j);
         int i2 = class08050.N(class07830.field_13194, k1, j);
         return l1 >= i2 + 4;
      }
   }
}
