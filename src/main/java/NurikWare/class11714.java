package NurikWare;

import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class06202;

public class class11714 extends class11807<NoInteract> {
   public Object y_0;

   public class11714(NoInteract var1, String var2, boolean var3, class00891... var4) {
      super(var1, var2, var3);
      this.u();
      this.y_0 = (Predicate<class00891>)var1x -> {
         for (class00891 class00891 : var4) {
            if (var1x == class00891) {
               return true;
            }
         }

         return false;
      };
   }

   public class11714(NoInteract var1, String var2, boolean var3, Predicate<class00891> var4) {
      super(var1, var2, var3);
      this.u();
      this.y_0 = var4;
   }

   static {
      N();
   }

   private void u() {
   }

   @Override
   public void y(Object var1) {
      this.u();
      if (var1 instanceof class11393 class11393) {
         class00500 class00500 = ((class03448)((class06202)super.N_0).T_3).method_8320(class11393.L().u());
         if (((Predicate)this.y_0).test(class00500.i())) {
            class11393.N();
         }
      }
   }

   private static void N() {
   }
}
