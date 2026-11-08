package NurikWare;

import java.util.function.Supplier;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06652;

public class class11146 extends class11787 implements class11801<NoVelocity> {
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class11146(String var1, boolean var2) {
      super(var1, var2);
      this.N();
   }

   @Override
   public void y(Object var1) {
      this.N();
      switch (var1) {
         case class11385 class11385:
            if ((Boolean)this.y_0) {
               class11385.M(true);
               class11385.B(true);
               class11385.i(true);
            }

            this.y_0 = false;
            break;
         case class11387 class11387:
            class06652 class06652 = ((class11387)var1).N();
            if ((class04453)((class06202)super.N_0).T_4 != null
               && ((class04453)((class06202)super.N_0).T_4).method_5624()
               && class06652.y().B >= 0.0
               && class06652.N() == ((class04453)((class06202)super.N_0).T_4).method_5628()
               && Math.random() * 100.0 <= ((class11504)this.y_1).i().floatValue()) {
               this.y_0 = true;
            }
            break;
         default:
      }
   }

   private void N() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }

   public void N(NoVelocity var1) {
      this.N();
      this.y_1 = (class11504)class11524.N(var1, "chance", 100.0F, 1.0F, 100.0F, 1.0F).N((Supplier<String>)class11502.N_0).N(var1x -> this.U());
   }
}
