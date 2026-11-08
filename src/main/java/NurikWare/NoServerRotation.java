package NurikWare;

import minecraft.class00261;
import minecraft.class00381;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06663;
import minecraft.class06671;

@class11080(
   L = "NoServerRotation",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class NoServerRotation extends class11067 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   private void T() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
      }
   }

   public NoServerRotation() {
      super();
      this.T();
   }

   @class11782
   public void N(class10990 var1) {
      this.T();
      class04453 class04453 = (class04453)((class06202)super.y_0).T_4;
      if (class04453 != null && this.N(var1.u())) {
         this.L_0 = class04453.method_36454();
         this.L_1 = class04453.method_36455();
      }
   }

   @class11782
   public void N(class10961 var1) {
      if (this.N(var1.N())) {
         ((class06202)super.y_0).execute(() -> {
            this.T();
            if ((class04453)((class06202)super.y_0).T_4 != null) {
               ((class04453)((class06202)super.y_0).T_4).R_1 = ((class04453)((class06202)super.y_0).T_4).method_36454();
               ((class04453)((class06202)super.y_0).T_4).R_2 = ((class04453)((class06202)super.y_0).T_4).method_36455();
               ((class04453)((class06202)super.y_0).T_4).method_36456(class04995.R((Float)this.L_0));
               ((class04453)((class06202)super.y_0).T_4).method_36457((Float)this.L_1);
               ((class04453)((class06202)super.y_0).T_4).method_63614();
            }
         });
      }
   }

   private boolean N(class00381<?> var1) {
      return var1 instanceof class06663 || var1 instanceof class00261 || var1 instanceof class06671;
   }
}
