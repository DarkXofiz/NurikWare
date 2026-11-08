package NurikWare;

import java.util.function.Predicate;
import minecraft.class04891;

public class class11406 extends class11535 implements Predicate<class09326> {
   public Object N_0;

   private void L() {
   }

   public class11406(String var1, boolean var2, class04891... var3) {
      super(var1, var2);
      this.L();
      this.N_0 = var3;
   }

   public boolean test(class09326 var1) {
      this.L();

      for (class04891 class04891 : (class04891[])this.N_0) {
         if (var1.Z() == class04891) {
            return true;
         }
      }

      return false;
   }
}
