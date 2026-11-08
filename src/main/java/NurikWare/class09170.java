package NurikWare;

import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06889;

public class class09170 {
   private static double[] y;

   private static void L() {
      y = new double[5];
      y[0] = Double.longBitsToDouble(4585204852618449388L);
      y[1] = Double.longBitsToDouble(4603579539098121011L);
      y[2] = Double.longBitsToDouble(4596373779694328218L);
      y[3] = Double.longBitsToDouble(4620693217682128896L);
      y[4] = Double.longBitsToDouble(4594572339843380019L);
   }

   private class09170() {
      super();
   }

   static {
      L();
   }

   public static float N(float var0, float var1) {
      return class04995.R(var1 - var0);
   }

   public static class11499 N(class06889 var0) {
      return class11505.N(var0);
   }

   public static double N() {
      if ((class06202)class11087.N_0 != null && (class05630)((class06202)class11087.N_0).i_7 != null) {
         double d0 = (Double)((class05630)((class06202)class11087.N_0).i_7).u().method_41753() * y[1] + y[2];
         return d0 * d0 * d0 * y[3] * y[4];
      } else {
         return y[0];
      }
   }
}
