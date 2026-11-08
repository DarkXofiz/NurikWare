package NurikWare;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07435;
import minecraft.class07442;
import minecraft.class07458;
import minecraft.class07549;

public class class10725 extends class07458 {
   private final class07549 N;

   public class10725(class07549 var1) {
      super(var1);
      this.N = var1;
   }

   public void N() {
      if (this.E == class07435.field_6378 && !this.N.f().U()) {
         class06889 class06889 = new class06889(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
         double d0 = class06889.M();
         double d1 = class06889.M / d0;
         double d2 = class06889.B / d0;
         double d3 = class06889.Z / d0;
         float f = (float)(class04995.u(class06889.Z, class06889.M) * 180.0F / (float)Math.PI) - 90.0F;
         this.N.method_36456(this.y(this.N.method_36454(), f, 90.0F));
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         float f1 = (float)(this.Z * this.N.method_45325(class05298.l));
         float f2 = class04995.B(0.125F, this.N.method_6029(), f1);
         this.N.method_6125(f2);
         double d4 = Math.sin((this.N.field_6012 + this.N.method_5628()) * 0.5) * 0.05;
         double d5 = Math.cos(this.N.method_36454() * (float) (Math.PI / 180.0));
         double d6 = Math.sin(this.N.method_36454() * (float) (Math.PI / 180.0));
         double d7 = Math.sin((this.N.field_6012 + this.N.method_5628()) * 0.75) * 0.05;
         this.N.method_18799(this.N.method_18798().y(d4 * d5, d7 * (d6 + d5) * 0.25 + f2 * d2 * 0.1, d4 * d6));
         class07442 class07442 = this.N.p();
         double d8 = this.N.method_23317() + d1 * 2.0;
         double d9 = this.N.method_23320() + d2 / d0;
         double d10 = this.N.method_23321() + d3 * 2.0;
         double d11 = class07442.i();
         double d12 = class07442.R();
         double d13 = class07442.M();
         if (!class07442.u()) {
            d11 = d8;
            d12 = d9;
            d13 = d10;
         }

         this.N.p().N(class04995.u(0.125, d11, d8), class04995.u(0.125, d12, d9), class04995.u(0.125, d13, d10), 10.0F, 40.0F);
         this.N.N(true);
      } else {
         this.N.method_6125(0.0F);
         this.N.N(false);
      }
   }
}
