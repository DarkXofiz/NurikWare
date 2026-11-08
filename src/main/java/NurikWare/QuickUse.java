package NurikWare;

import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07050;

@class11080(
   L = "QuickUse",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class QuickUse extends class11067 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   private boolean P() {
      return ((class03443)((class06202)super.y_0).T_2).E() || ((class04453)((class06202)super.y_0).T_4).n()
         ? false
         : !((class04453)((class06202)super.y_0).T_4).method_6115() && (Integer)((class06202)super.y_0).M_4 == 0;
   }

   public QuickUse() {
      super();
      this.m();
      this.L_0 = new class11048[]{
         new class11048(class11328.N(class06570.lo), "shield", this),
         new class11048(class11328.N(class06570.jT), "milk", this),
         new class11048(class11328.N(class06570.lt), "chorus", this),
         new class11048(class11328.N(class06570.bV), "golden-apple", this),
         new class11048(class11328.N(class06570.be), "enchanted-golden-apple", this),
         new class11048(class11328.N(class06570.GB), "bottle-of-exp", this),
         new class11036(var0 -> class11929.N(var0, class07047.M), "instant-damage", this),
         new class11048(var0 -> var0.N(class06570.ns) && class11929.N(var0, class07047.R), "instant-health", this),
         new class11048(class11328.N(class06570.db), "trident", this)
      };
   }

   private void m() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = false;
      }
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.m();
      class11048[] aclass11048 = (class11048[])this.L_0;
      int i = aclass11048.length;

      for (int j = 0; j < i; j++) {
         aclass11048[j].N(var1);
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.m();
      if ((Boolean)this.L_1 && this.P()) {
         ((class06202)super.y_0).M_4 = 4;
         class11907.N(class07050.field_5808);
      }

      class11048[] aclass11048 = (class11048[])this.L_0;
      int i = aclass11048.length;

      for (int j = 0; j < i; j++) {
         aclass11048[j].L();
      }
   }

   @class11782
   public void N(class10950 var1) {
      this.m();
      if ((Boolean)this.L_1) {
         var1.N();
      }
   }
}
