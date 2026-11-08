package NurikWare;

import minecraft.class01869;
import minecraft.class01874;
import minecraft.class05096;
import org.jspecify.annotations.Nullable;

public class class09538 extends class01869 {
   public class09538(class01874 var1) {
      super(var1);
   }

   public void N(String var1, @Nullable class05096 var2) {
      class01874.N.warn("Commands are not supported in configuration phase, trying to run '{}'", var1);
   }
}
