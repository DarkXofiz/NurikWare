package NurikWare;

import minecraft.class06889;
import minecraft.class07438;

public class class11091 extends class11079 {
   public Object N_0;
   public boolean N_init;

   public class11091(AttackAura var1, String var2) {
      super(var1, var2);
      this.W();
   }

   @Override
   public class06889 N(class07438 var1, double var2) {
      return class11895.N(var1, class11505.N(), true, ((AttackAura)super.y_1).m());
   }

   @Override
   public class11499 N(class07438 var1, boolean var2, double var3) {
      this.W();
      if ((Integer)this.N_0 > 0) {
         this.N_0 = (Integer)this.N_0 - 1;
      }

      if (var2) {
         this.N_0 = 2;
      }

      if ((Integer)this.N_0 == 0) {
         return class11505.L();
      } else {
         class11499 class11499x = class11505.N();
         class06889 class06889 = this.N(var1, var3);
         class11499 class11499x = class11505.N(class11499x, class06889);
         float f = class11499x.y();
         float f1 = class11499x.R();
         float f2 = (float)Math.hypot(Math.abs(f), Math.abs(f1));
         float f3 = Math.abs(f / f2) * 360.0F;
         float f4 = Math.abs(f1 / f2) * 360.0F;
         return new class11499(
               class11499x.y() + Math.min(Math.max(f, -f3), f3) + class11908.y(0.6F), class11499x.R() + Math.min(Math.max(f1, -f4), f4) + class11908.y(0.3F)
            )
            .u(true)
            .N(true);
      }
   }

   private void W() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }
}
