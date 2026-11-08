package NurikWare;

import java.util.function.Predicate;
import minecraft.class07049;

public class class11015 extends class11807<NoInteract> {
   public Object y_0;

   public class11015(NoInteract var1, String var2, boolean var3, Predicate<class07049> var4) {
      super(var1, var2, var3);
      this.u();
      this.y_0 = var4;
   }

   private void u() {
   }

   @Override
   public void y(Object var1) {
      this.u();
      if (var1 instanceof class11357 class11357 && ((Predicate)this.y_0).test(class11357.L())) {
         class11357.N();
      }
   }
}
