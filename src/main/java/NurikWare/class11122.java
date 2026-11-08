package NurikWare;

import minecraft.class07438;

public class class11122 extends class09164 {
   public class11122(AttackAura var1, String var2, boolean var3) {
      super(var1, true, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class11385 class11385 && ((AttackAura)super.y_0).s()) {
         this.N(class11385);
      }
   }

   public boolean N(class07438 var1) {
      return true;
   }

   public void N(class11385 var1) {
      class07438 class07438 = ((AttackAura)super.y_0).v();
      if (this.N(class07438)) {
         class11499 class11499 = class11505.N(class07438.method_66233().method_66265());
         class11902.y(var1);
         var1.B(true);
         class11902.N(var1, class11499.y());
      }
   }
}
