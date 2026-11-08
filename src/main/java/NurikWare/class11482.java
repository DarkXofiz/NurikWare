package NurikWare;

import java.util.function.Predicate;
import minecraft.class06202;

public class class11482 extends class11462 {
   public Object N_0;
   public Object N_1;

   @Override
   public boolean L() {
      this.N();
      return (Boolean)this.N_1;
   }

   public class11482(Runnable var1, Predicate<class06202> var2) {
      super(999, var1);
      this.N();
      this.N_0 = var2;
   }

   @Override
   public boolean u() {
      this.N();
      class06202 class06202 = class06202.Nq();
      if (!(Boolean)this.N_1 && ((Predicate)this.N_0).test(class06202)) {
         ((Runnable)super.y_1).run();
         this.N_1 = true;
         return true;
      } else {
         return false;
      }
   }

   private void N() {
      this.N_1 = false;
   }
}
