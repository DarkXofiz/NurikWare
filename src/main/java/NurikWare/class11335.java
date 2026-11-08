package NurikWare;

import minecraft.class00014;
import minecraft.class00028;
import minecraft.class00042;
import minecraft.class04770;
import minecraft.class07321;
import minecraft.class07438;

public class class11335 implements class09050 {
   private final class07438 N;
   private final class00028 y;
   private final class04770 L;
   private class07321 u;

   public void L() {
      this.L.field_13987.method_14364(class00014.N(this.N.method_5667(), this.y, this.u));
   }

   public class11335(class07438 var1, class00028 var2, class04770 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var1.method_31476();
   }

   public void i() {
      class07321 class07321 = this.N.method_31476();
      if (class07321.N(this.u) > 0) {
         this.L.field_13987.method_14364(class00014.y(this.N.method_5667(), this.y, class07321));
         this.u = class07321;
      }
   }

   public void u() {
      this.L.field_13987.method_14364(class00014.N(this.N.method_5667()));
   }

   @Override
   public boolean y() {
      return !class09050.super.y() && !class00042.N(this.N, this.L) ? class00042.N(this.u, this.L) : true;
   }

   @Override
   public int N() {
      return this.u.N(this.N.method_31476());
   }
}
