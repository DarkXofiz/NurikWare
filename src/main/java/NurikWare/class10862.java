package NurikWare;

import java.util.EnumSet;
import minecraft.class01328;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07953;

public class class10862 extends class07953 {
   private final class07453 N;
   private class07438 y;
   private int L;

   public void L() {
      this.i.y(this.y);
      class07438 class07438 = this.N.L_();
      if (class07438 != null) {
         this.L = class07438.method_6083();
      }

      super.L();
   }

   public class10862(class07453 var1) {
      super(var1, false);
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18408));
   }

   public boolean N() {
      if (this.N.NQ() && !this.N.NJ()) {
         class07438 class07438 = this.N.L_();
         if (class07438 == null) {
            return false;
         } else {
            this.y = class07438.method_6052();
            return class07438.method_6083() != this.L && this.N(this.y, class01328.N) && this.N.N(this.y, class07438);
         }
      } else {
         return false;
      }
   }
}
