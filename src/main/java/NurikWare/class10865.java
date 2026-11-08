package NurikWare;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07435;
import minecraft.class07458;
import minecraft.class08042;

public class class10865 extends class07458 {
   public class10865(class08042 var1, class08042 var2) {
      super(var2);
      this.N = var1;
   }

   public void N() {
      if (this.E == class07435.field_6378) {
         class06889 class06889x = new class06889(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
         double d0 = class06889x.M();
         if (d0 < this.N.method_5829().N()) {
            this.E = class07435.field_6377;
            this.N.method_18799(this.N.method_18798().L(0.5));
         } else {
            this.N.method_18799(this.N.method_18798().i(class06889x.L(this.Z * 0.05 / d0)));
            if (this.N.T() == null) {
               class06889 class06889x = this.N.method_18798();
               this.N.method_36456(-((float)class04995.u(class06889x.M, class06889x.Z)) * (180.0F / (float)Math.PI));
               this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
            } else {
               double d2 = this.N.T().method_23317() - this.N.method_23317();
               double d1 = this.N.T().method_23321() - this.N.method_23321();
               this.N.method_36456(-((float)class04995.u(d2, d1)) * (180.0F / (float)Math.PI));
               this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
            }
         }
      }
   }
}
