package NurikWare;

import java.util.function.Supplier;
import minecraft.class03448;
import minecraft.class04190;
import minecraft.class06202;

@class11080(
   L = "AutoReconnect",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoReconnect extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;

   public AutoReconnect() {
      super();
      this.v();
      this.L_0 = class11524.N(this, "delay", 10.0F, 10.0F, 300.0F, 1.0F).N((Supplier<String>)class11502.N_2);
      this.L_1 = class11524.N(this, "auto-enable-auto-leave", true);
   }

   private void s() {
      this.v();
      if (((class11507)this.L_1).i()) {
         class11938.u().v().N(true);
      }
   }

   private void v() {
   }

   @Override
   public void y() {
      this.v();
      this.L_2 = null;
      super.y();
   }

   @class11782
   public void N(class10990 var1) {
      this.v();
      if (var1.u() instanceof class04190) {
         if ((class10917)this.L_2 != null) {
            this.L_2 = null;
            this.s();
         } else if ((class03448)((class06202)super.y_0).T_3 != null) {
            int i = class11910.M();
            if (i != -1) {
               this.L_2 = new class10917("/an" + i, class11938.j().y());
            }
         }
      }
   }

   @class11782
   public void N(class11380 var1) {
      this.v();
      if ((class10917)this.L_2 != null) {
         int i = class11938.j().y();
         if (i > ((class10917)this.L_2).y() + ((class11504)this.L_0).i() * 20.0F) {
            class11910.N(((class10917)this.L_2).N());
            this.L_2 = new class10917(((class10917)this.L_2).N(), i);
         }
      }
   }
}
