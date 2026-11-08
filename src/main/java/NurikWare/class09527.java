package NurikWare;

import minecraft.class00750;
import minecraft.class01807;
import minecraft.class06617;

public class class09527<T> extends class01807<T> {
   private class06617 L(class06617 var1) {
      return class01807.G;
   }

   public class09527(class00750 var1, int var2) {
      super(var1, var2);
   }

   private class06617 u(class06617 var1) {
      return class01807.l;
   }

   private class06617 y(class06617 var1) {
      return class01807.t;
   }

   private class06617 N(class06617 var1) {
      return class01807.n;
   }

   public class06617 N(int var1) {
      return (class06617)(switch (var1) {
         case 0 -> class01807.L;
         case 1, 2, 3, 4 -> this.N(class01807.M, var1);
         case 5 -> this.N(class01807.B);
         case 6 -> this.y(class01807.Z);
         case 7 -> this.L(class01807.z);
         case 8 -> this.u(class01807.U);
         default -> new class10638(this.E, var1);
      });
   }

   private class06617 N(class06617 var1, int var2) {
      return var2 != 3 && var2 != 4 ? var1 : class01807.v;
   }
}
