package NurikWare;

import minecraft.class04453;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06541;

public class class11554 extends class11142 {
   public Object y_0;

   public class11554(ClickAction var1) {
      super(var1, "interaction-hotkey");
      this.N();
      this.y_0 = (class11504)class11524.N(var1, "click-distance-limit", 3.0F, 2.0F, 32.0F, 1.0F).N(var1x -> !((class11527)super.N_1).i().y());
   }

   @Override
   public void y(class11389 var1) {
      this.N();
      if (class11892.N(
         (class04453)((class06202)super.N_0).T_4, class11505.L(), (double)((class11504)this.y_0).i().floatValue(), false, class11791.B().and(class11791.N())
      ) instanceof class06145 class06145) {
         Object object = class06145.L().method_5820();
         class09327 class09327 = class11938.t();
         String s;
         if (class09327.N((String)object, System.currentTimeMillis())) {
            s = "friend.added";
         } else {
            s = "friend.removed";
            class09327.y((String)object);
         }

         class11303.y(class11921.N(s, class06541.field_1068 + object + class06541.field_1080).N(class06541.field_1080));
      }
   }

   private void N() {
   }
}
