package NurikWare;

import java.util.List;
import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "NoDelay",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class NoDelay extends class11067 {
   public Object L_0;
   public Object L_1;

   public NoDelay() {
      super();
      this.b();
      this.L_0 = new class11720(this, "block-breaking", false);
      this.L_1 = class11524.y(
         this,
         "delays",
         new class11689(this, "right-click", false, var1 -> {
            if (var1 instanceof class11380 && (class04453)((class06202)super.y_0).T_4 != null) {
               ((class06202)super.y_0).M_4 = 0;
            }
         }),
         new class11689(
            this,
            "jump-delay",
            true,
            var1 -> {
               if (var1 instanceof class11385 class11385
                  && (class04453)((class06202)super.y_0).T_4 != null
                  && class11385.L()
                  && ((class04453)((class06202)super.y_0).T_4).fields_17fa3311b0e9d3e9b883d09222919bf5a_1 == 0
                  && class11899.N(class11385.z(), 0).N() > 1) {
                  class11385.i(false);
               }
            }
         ),
         (class11720)this.L_0
      );
      ((class11523)this.L_1).L().forEach(var1 -> {
         if (var1 instanceof class11801) {
            ((class11801)var1).N(this);
         }
      });
   }

   private void b() {
   }

   @class11782
   public void N(class11380 var1) {
      this.b();
      ((List)((class11523)this.L_1).i()).forEach(var1x -> var1x.y(var1));
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class11385 var1) {
      this.b();
      ((List)((class11523)this.L_1).i()).forEach(var1x -> var1x.y(var1));
   }
}
