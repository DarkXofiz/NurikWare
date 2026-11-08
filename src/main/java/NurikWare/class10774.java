package NurikWare;

import minecraft.class01231;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07435;
import minecraft.class07458;
import minecraft.class07629;

public class class10774 extends class07458 {
   private final class07629 N;

   public class10774(class07629 var1) {
      super(var1);
      this.N = var1;
   }

   public void N() {
      if (this.N.method_5777(class01231.N)) {
         this.N.method_18799(this.N.method_18798().y(0.0, 0.005, 0.0));
      }

      if (this.E == class07435.field_6378 && !this.N.f().U()) {
         float f = (float)(this.Z * this.N.method_45325(class05298.l));
         this.N.method_6125(class04995.B(0.125F, this.N.method_6029(), f));
         double d0 = this.R - this.N.method_23317();
         double d1 = this.M - this.N.method_23318();
         double d2 = this.B - this.N.method_23321();
         if (d1 != 0.0) {
            double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
            this.N.method_18799(this.N.method_18798().y(0.0, this.N.method_6029() * (d1 / d3) * 0.1, 0.0));
         }

         if (d0 != 0.0 || d2 != 0.0) {
            float f1 = (float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F;
            this.N.method_36456(this.y(this.N.method_36454(), f1, 90.0F));
            this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         }
      } else {
         this.N.method_6125(0.0F);
      }
   }
}
