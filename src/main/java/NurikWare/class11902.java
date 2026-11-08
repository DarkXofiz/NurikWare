package NurikWare;

import minecraft.class01311;
import minecraft.class01337;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04462;
import minecraft.class04654;
import minecraft.class04655;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08687;

public class class11902 {
   private static String[] u;
   private static double[] E;
   public static Object N_0 = class06202.Nq();

   private static void M() {
   }

   private class11902() {
      super();
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      i();
      R();
      M();
   }

   private static void i() {
      E = new double[1];
      E[0] = Double.longBitsToDouble(9218868437227405311L);
   }

   public static void y(class11385 var0) {
      var0.B(false);
      var0.u(false);
      var0.L(false);
      var0.R(false);
   }

   public static boolean y() {
      class05096 class05096 = (class05096)((class06202)N_0).v_3;
      return !(class05096 instanceof class01311) && !(class05096 instanceof class01337) && !class09222.y()
         ? class05096 != null
            && class05096.method_25396()
               .stream()
               .filter(var0x -> var0x instanceof class04927)
               .map(var0x -> (class04927)var0x)
               .anyMatch(class06478::method_25370)
         : true;
   }

   private static boolean N(float var0, float var1) {
      return var0 != 0.0F || var1 != 0.0F;
   }

   public static float[] N(float var0) {
      class04453 class04453 = (class04453)((class06202)N_0).T_4;
      float f = class04453.fields_7212a028292fd3c078969e3ee4c71d9e8_2;
      float f1 = class04453.fields_7212a028292fd3c078969e3ee4c71d9e8_0;
      float f2 = class04453.method_36454();
      if (f == 0.0F && f1 == 0.0F) {
         return new float[]{0.0F, 0.0F};
      } else {
         if (f != 0.0F) {
            if (f1 > 0.0F) {
               f2 += f > 0.0F ? -45.0F : 45.0F;
            } else if (f1 < 0.0F) {
               f2 += f > 0.0F ? 45.0F : -45.0F;
            }

            f1 = 0.0F;
            f = f > 0.0F ? 1.0F : -1.0F;
         }

         double d0 = Math.toRadians(f2 + 90.0F);
         double d1 = Math.sin(d0);
         double d2 = Math.cos(d0);
         float f3 = (float)(f * var0 * d2 + f1 * var0 * d1);
         float f4 = (float)(f * var0 * d1 - f1 * var0 * d2);
         return new float[]{f3, f4};
      }
   }

   public static boolean N(int var0) {
      return var0 == -1 ? false : class04655.N(((class06202)N_0).Nt(), var0);
   }

   public static float N(float var0, float var1, float var2) {
      return N(var1, var2) ? var0 + class04995.R(class11908.y(class04995.u(-var2, var1))) : var0;
   }

   public static boolean N(class08687 var0, boolean var1) {
      return var0.N() || var0.y() || var0.L() || var0.u() || var0.i() || var1 && var0.M() || var0.R();
   }

   public static float N() {
      return (float)class04995.R(
            ((class04453)((class06202)N_0).T_4).method_23317() - ((class04453)((class06202)N_0).T_4).field_6014,
            ((class04453)((class06202)N_0).T_4).method_23321() - ((class04453)((class06202)N_0).T_4).field_5969
         )
         * 20.0F
         * (Math.min(((class03448)((class06202)N_0).T_3).method_54719().R(), 20.0F) / 20.0F);
   }

   public static boolean N(class08687 var0) {
      return N(var0, true);
   }

   public static void N(class11385 var0) {
      y(var0);
      var0.M(false);
      var0.i(false);
      var0.y(false);
   }

   public static void N(class11385 var0, float var1) {
      if (!class11919.N()) {
         float f = class04462.N(var0.i(), var0.M());
         float f1 = class04462.N(var0.u(), var0.Z());
         if (N(f, f1)) {
            float f2 = class04995.R(((class04453)((class06202)N_0).T_4).method_36454());
            double d0 = N(var1, f, f1);
            float f3 = 0.0F;
            float f4 = 0.0F;
            double d1 = E[0];

            for (int i = -1; i <= 1; i++) {
               for (int j = -1; j <= 1; j++) {
                  if (j != 0 || i != 0) {
                     double d2 = N(f2, i, j);
                     double d3 = Math.abs(class04995.i(d0 - d2));
                     if (d3 < d1) {
                        d1 = d3;
                        f3 = i;
                        f4 = j;
                     }
                  }
               }
            }

            var0.B(f3 == 1.0F);
            var0.u(f3 == -1.0F);
            var0.L(f4 == 1.0F);
            var0.R(f4 == -1.0F);
         }
      }
   }

   private static void R() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }
}
