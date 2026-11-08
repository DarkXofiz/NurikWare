package NurikWare;

import minecraft.class00014;
import minecraft.class00028;
import minecraft.class00042;
import minecraft.class04770;
import minecraft.class07209;
import minecraft.class07438;

public class class11342 implements class09046 {
   private final class07438 N;
   private final class00028 y;
   private final class04770 L;
   private class07209 u;

   public void L() {
      this.L.field_13987.method_14364(class00014.N(this.N.method_5667(), this.y, this.u));
   }

   public class11342(class07438 var1, class00028 var2, class04770 var3) {
      super();
      this.N = var1;
      this.L = var3;
      this.y = var2;
      this.u = var1.method_24515();
   }

   public void i() {
      class07209 class07209 = this.N.method_24515();
      if (class07209.method_19455(this.u) > 0) {
         this.L.field_13987.method_14364(class00014.y(this.N.method_5667(), this.y, class07209));
         this.u = class07209;
      }
   }

   public void u() {
      this.L.field_13987.method_14364(class00014.N(this.N.method_5667()));
   }

   @Override
   public boolean y() {
      return class09046.super.y() || class00042.N(this.N, this.L);
   }

   @Override
   public int N() {
      return this.u.method_19455(this.N.method_24515());
   }
}
