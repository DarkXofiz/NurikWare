package NurikWare;

import java.util.List;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class07050;

@class11080(
   L = "ItemRelease",
   y = class11072.COMBAT,
   N = class11106.BASE
)
public class ItemRelease extends class11067 {
   public Object L_0;
   public Object L_1;

   private void T() {
   }

   public ItemRelease() {
      super();
      this.T();
      this.L_0 = class11524.y(this, "items", new class11147(this, "trident", true), new class11113(this, "crossbow", true));
      this.L_1 = class11524.N(this, "hit-only", false);
   }

   private void b() {
      for (class04477 class04477 : ((class03448)((class06202)super.y_0).T_3).method_18456()) {
         if (class04477 instanceof class10401) {
            class11907.N((class10401)class04477);
         }
      }
   }

   private void s() {
      for (class04477 class04477 : ((class03448)((class06202)super.y_0).T_3).method_18456()) {
         if (class04477 instanceof class10401) {
            class11907.y((class10401)class04477);
         }
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.T();

      for (class11131 class11131 : (List)((class11523)this.L_0).i()) {
         for (class07050 class07050 : class07050.values()) {
            if (class11131.test((class06202)super.y_0, class07050) && this.N(class11131, class07050)) {
               class11131.y((class06202)super.y_0, class07050);
            }
         }
      }
   }

   private boolean N(class11131 var1, class07050 var2) {
      this.T();
      if (!((class11507)this.L_1).i()) {
         return true;
      } else {
         this.b();
         boolean flag = var1.N((class06202)super.y_0, var2, this::N);
         this.s();
         return flag;
      }
   }

   private boolean N(class11223 var1) {
      return var1.y() instanceof class06145 class06145 && !class11791.u().test(class06145.L());
   }
}
