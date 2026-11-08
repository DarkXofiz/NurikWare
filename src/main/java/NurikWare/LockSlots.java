package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class08044;

@class11080(
   L = "LockSlots",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class LockSlots extends class11067 {
   public Object L_0;
   public Object L_1;

   private void T() {
   }

   public LockSlots() {
      super();
      this.T();
      this.L_0 = class11524.y(
         this,
         "slots",
         new class11535("_1", true),
         new class11535("_2", true),
         new class11535("_3", true),
         new class11535("_4", true),
         new class11535("_5", true),
         new class11535("_6", true),
         new class11535("_7", true),
         new class11535("_8", true),
         new class11535("_9", true)
      );
      this.L_1 = class11524.N(this, "from-inventory", false);
   }

   private boolean y(int var1) {
      this.T();
      return class08044.L(var1) && ((class11535)((class11523)this.L_0).L().get(var1)).U();
   }

   @class11782
   public void N(class11358 var1) {
      if (this.y(var1.L())) {
         var1.N();
      }
   }

   @class11782
   public void N(class11368 var1) {
      this.T();
      if (var1.M() == class07510.field_7795 || var1.M() == class07510.field_7790 && var1.B() == -999) {
         if (((class11507)this.L_1).i()) {
            var1.N();
         } else {
            if ((class04453)((class06202)super.y_0).T_4 != null
               && this.y(
                  N(
                     var1.L(),
                     ((class04453)((class06202)super.y_0).T_4).method_31548(),
                     ((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
                  )
               )) {
               var1.N();
            }
         }
      }
   }

   private static int N(class06937 var0, class08044 var1, class07482 var2) {
      if (var0 != null && var0.L == var1) {
         int i = var0.B();
         if (class08044.L(i)) {
            return i;
         } else if (var2 != null && var0.u >= 0 && var0.u < var2.T.size()) {
            class06937 class06937 = (class06937)var2.T.get(var0.u);
            if (class06937.L != var1) {
               return -1;
            } else {
               int j = class06937.B();
               return class08044.L(j) ? j : -1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }
}
