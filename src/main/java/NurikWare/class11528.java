package NurikWare;

import java.util.Map;
import java.util.WeakHashMap;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06938;
import minecraft.class08036;

public class class11528 {
   private static String[] M;
   private static double[] z;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2 = class06202.Nq();
   public static Object N_3 = new WeakHashMap();

   private static boolean L(class08036 var0) {
      class06584 class06584 = var0.method_6047();
      return class06584.N(var0) != 0 && !class06584.N(class06570.lo);
   }

   private class11528() {
      super();
      throw new UnsupportedOperationException(M[0]);
   }

   static {
      i();
      Z();
      R();
   }

   private static void Z() {
      M = new String[1];
      M[0] = "This is a utility class and cannot be instantiated";
   }

   private static void i() {
      z = new double[2];
      z[0] = Double.longBitsToDouble(0L);
      z[1] = Double.longBitsToDouble(0L);
   }

   private static boolean y(class08036 var0) {
      return (var0.method_6047().N(class06570.lo) || var0.method_6079().N(class06570.lo)) && !L(var0);
   }

   public static boolean N(class08036 var0, class06889 var1, boolean var2) {
      if (var2 ? !var0.method_6039() : !var0.method_6115() || !var0.method_6030().N(class06570.lo)) {
         return false;
      } else if (var1 == null) {
         return true;
      } else {
         class06889 class06889x = var0.method_5828(1.0F);
         class06889 class06889x = var1.N(var0.method_73189()).u();
         return new class06889(class06889x.M, z[0], class06889x.Z).y(class06889x) < z[1];
      }
   }

   public static void N() {
      if ((class03448)((class06202)N_2).T_3 != null) {
         for (class08036 class08036 : ((class03448)((class06202)N_2).T_3).method_18456()) {
            if (class08036 != (class04453)((class06202)N_2).T_4) {
               int i = ((Map)N_3).getOrDefault(class08036, 72000);
               if (class08036.method_6115() && y(class08036)) {
                  class08036.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = class08036.method_5998(class08036.method_6058());
                  class08036.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = i;
                  i--;
               } else {
                  i = 72000;
               }

               ((Map)N_3).put(class08036, i);
            }
         }
      }
   }

   public static boolean N(class08036 var0) {
      return var0.method_59958().B() instanceof class06938;
   }

   public static boolean N(class08036 var0, boolean var1) {
      return N(var0, null, var1);
   }

   private static void R() {
      N_0 = false;
      N_1 = 72000;
   }
}
