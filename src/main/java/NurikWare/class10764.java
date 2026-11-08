package NurikWare;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07435;
import minecraft.class07438;
import minecraft.class07458;
import minecraft.class07541;

public class class10764 extends class07458 {
   private final class07541 N;

   public class10764(class07541 var1) {
      super(var1);
      this.N = var1;
   }

   public void N() {
      class07438 class07438 = this.N.T();
      if (this.N.v() && this.N.method_5799()) {
         if (class07438 != null && class07438.method_23318() > this.N.method_23318() || this.N.y) {
            this.N.method_18799(this.N.method_18798().y(0.0, 0.002, 0.0));
         }

         if (this.E != class07435.field_6378 || this.N.f().U()) {
            this.N.method_6125(0.0F);
            return;
         }

         double d0 = this.R - this.N.method_23317();
         double d1 = this.M - this.N.method_23318();
         double d2 = this.B - this.N.method_23321();
         double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
         d1 /= d3;
         float f = (float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F;
         this.N.method_36456(this.y(this.N.method_36454(), f, 90.0F));
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         float f1 = (float)(this.Z * this.N.method_45325(class05298.l));
         float f2 = class04995.B(0.125F, this.N.method_6029(), f1);
         this.N.method_6125(f2);
         this.N.method_18799(this.N.method_18798().y(f2 * d0 * 0.005, f2 * d1 * 0.1, f2 * d2 * 0.005));
      } else {
         if (!this.N.method_24828()) {
            this.N.method_18799(this.N.method_18798().y(0.0, -0.008, 0.0));
         }

         super.N();
      }
   }
}
