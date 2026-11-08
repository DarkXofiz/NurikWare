package NurikWare;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import minecraft.class01590;
import minecraft.class03054;
import minecraft.class06419;
import minecraft.class06451;
import minecraft.class06465;

public class class10578 implements class10579 {
   boolean N;

   public class10578(class06451 var1, int var2, int var3, int var4, class06465 var5, float var6, int var7) {
      super();
      this.B = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
   }

   @Override
   public void accept(class06419 var1, int var2, float var3) {
      int ix = this.y - var2 * this.L;
      int j = ix - this.L;
      int k = ix - this.u;
      boolean flag = this.i.N(k, var3 * this.R, var1.y());
      this.N |= flag;
      boolean flag1;
      if (var1.u()) {
         flag1 = this.N;
         this.N = false;
      } else {
         flag1 = false;
      }

      class03054 class03054 = this.N(var1.L());
      if (class03054 != null) {
         this.i.N(-4, j, -2, ix, var3 * this.R, class03054);
         if (class03054.R() != null) {
            int l = var1.N((class01590)this.B.L.i_3);
            int i1 = k + this.M;
            this.i.N(l, i1, flag1, class03054, class03054.R());
         }
      }
   }

   private class03054 N(class03054 var1) {
      return VisualSettings.INSTANCE.hideSignatureIndicator.isEnabled() ? null : var1;
   }
}
