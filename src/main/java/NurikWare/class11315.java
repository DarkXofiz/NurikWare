package NurikWare;

import minecraft.class00734;
import minecraft.class01312;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07047;

public class class11315 {
   private static String[] i;
   private static double[] M;
   private static double[] Z;
   public static Object N_0 = class06202.Nq();

   public static boolean L() {
      return N(0.5F);
   }

   private static void M() {
      Z = new double[6];
      Z[0] = Double.longBitsToDouble(0L);
      Z[1] = Double.longBitsToDouble(0L);
      Z[2] = Double.longBitsToDouble(4591149604126578442L);
      Z[3] = Double.longBitsToDouble(0L);
      Z[4] = Double.longBitsToDouble(0L);
      Z[5] = Double.longBitsToDouble(4591870180066957722L);
      M = new double[7];
      M[0] = Double.longBitsToDouble(0L);
      M[1] = Double.longBitsToDouble(0L);
      M[2] = Double.longBitsToDouble(4603579539098121011L);
      M[3] = Double.longBitsToDouble(0L);
      M[4] = Double.longBitsToDouble(0L);
      M[5] = Double.longBitsToDouble(0L);
      M[6] = Double.longBitsToDouble(0L);
   }

   private class11315() {
      super();
      throw new UnsupportedOperationException(i[0]);
   }

   static {
      M();
      R();
      i();
   }

   private static void i() {
   }

   public static boolean y() {
      if (!((class04453)((class06202)N_0).T_4).method_6059(class07047.d)
         && !((class04453)((class06202)N_0).T_4).method_6059(class07047.P)
         && ((class04453)((class06202)N_0).T_4).field_17046 == class06889.L
         && !((class04453)((class06202)N_0).T_4).method_5765()
         && !class11919.N()
         && !((class04453)((class06202)N_0).T_4).method_6101()) {
         class00734 class00734 = ((class04453)((class06202)N_0).T_4).method_5829().L(Z[1], Z[2], Z[3]).u(Z[4], Z[5], M[0]);
         if (((class04453)((class06202)N_0).T_4).method_24828()
            && ((class03448)((class06202)N_0).T_3).method_8600((class04453)((class06202)N_0).T_4, class00734).iterator().hasNext()) {
            return false;
         } else if (((class04453)((class06202)N_0).T_4).method_24828() && ((class04453)((class06202)N_0).T_4).method_18376() == class01312.field_18079) {
            return false;
         } else if (((class04453)((class06202)N_0).T_4).method_31549().y) {
            return false;
         } else {
            class00734 class00734x = ((class04453)((class06202)N_0).T_4).method_5829();
            double d0 = ((class04453)((class06202)N_0).T_4).method_5681() ? M[1] : M[2];
            class00734x = class00734x.N(M[3], d0, M[4]).u(M[5], d0, M[6]);
            return !((class03448)((class06202)N_0).T_3).u(class00734x);
         }
      } else {
         return false;
      }
   }

   public static boolean N(boolean var0) {
      return !var0 ? false : ((class04453)((class06202)N_0).T_4).field_6017 == Z[0];
   }

   public static boolean N(float var0) {
      float f = TickRateSync.m();
      float f1 = 1.0F / (float)((class04453)((class06202)N_0).T_4).method_45325(class05298.R) * 20.0F;
      float f2 = ((class04453)((class06202)N_0).T_4).fields_3212a028292fd3c078969e3ee4c71d9e8_1.intValue() + var0;
      float f3 = f1 * (20.0F / f);
      return class04995.N(f2 / f3, 0.0F, 1.0F) <= 0.9F;
   }

   public static boolean N(int var0) {
      return N() < var0;
   }

   public static int N() {
      return ((class11799)((class03443)((class06202)N_0).T_2)).N();
   }

   private static void R() {
      i = new String[1];
      i[0] = "This is a utility class and cannot be instantiated";
   }
}
