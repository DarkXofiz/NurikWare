package NurikWare;

import minecraft.class00750;
import minecraft.class01807;
import minecraft.class06617;

public class class09534<T> extends class01807<T> {
   public class09534(class00750 var1, int var2) {
      super(var1, var2);
   }

   public class06617 N(int var1) {
      return (class06617)(switch (var1) {
         case 0 -> class01807.L;
         case 1 -> class01807.u;
         case 2 -> class01807.i;
         case 3 -> this.N(class01807.R);
         default -> new class10638(this.E, var1);
      });
   }

   private class06617 N(class06617 var1) {
      return class01807.j;
   }
}
