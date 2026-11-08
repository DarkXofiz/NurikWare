package NurikWare;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07155;
import minecraft.class07458;

public class class10722 extends class07458 {
   private float W;

   public class10722(class07155 var1, class07079 var2) {
      super(var2);
      this.N = var1;
      this.W = 0.1F;
   }

   public void N() {
      if (this.N.field_5976) {
         this.N.method_36456(this.N.method_36454() + 180.0F);
         this.W = 0.1F;
      }

      double d0 = this.N.L.M - this.N.method_23317();
      double d1 = this.N.L.B - this.N.method_23318();
      double d2 = this.N.L.Z - this.N.method_23321();
      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      if (Math.abs(d3) > 1.0E-5F) {
         double d4 = 1.0 - Math.abs(d1 * 0.7F) / d3;
         d0 *= d4;
         d2 *= d4;
         d3 = Math.sqrt(d0 * d0 + d2 * d2);
         double d5 = Math.sqrt(d0 * d0 + d2 * d2 + d1 * d1);
         float f = this.N.method_36454();
         float f1 = (float)class04995.u(d2, d0);
         float f2 = class04995.R(this.N.method_36454() + 90.0F);
         float f3 = class04995.R(f1 * (180.0F / (float)Math.PI));
         this.N.method_36456(class04995.i(f2, f3, 4.0F) - 90.0F);
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         if (class04995.i(f, this.N.method_36454()) < 3.0F) {
            this.W = class04995.u(this.W, 1.8F, 0.005F * (1.8F / this.W));
         } else {
            this.W = class04995.u(this.W, 0.2F, 0.025F);
         }

         float f4 = (float)(-(class04995.u(-d1, d3) * 180.0F / (float)Math.PI));
         this.N.method_36457(f4);
         float f5 = this.N.method_36454() + 90.0F;
         double d6 = this.W * class04995.P(f5 * (float) (Math.PI / 180.0)) * Math.abs(d0 / d5);
         double d7 = this.W * class04995.m(f5 * (float) (Math.PI / 180.0)) * Math.abs(d2 / d5);
         double d8 = this.W * class04995.m(f4 * (float) (Math.PI / 180.0)) * Math.abs(d1 / d5);
         class06889 class06889 = this.N.method_18798();
         this.N.method_18799(class06889.i(new class06889(d6, d8, d7).u(class06889).L(0.2)));
      }
   }
}
