package NurikWare;

import minecraft.class05630;
import minecraft.class06202;

public class class11302 {
   private static double[] y;
   private static String[] u;
   private static double[] i;
   public static Object N_0 = class06202.Nq();

   private static double L(double var0) {
      double d0 = var0 * y[3] + y[4];
      return d0 * d0 * d0 * y[5] * y[6];
   }

   private static void L() {
   }

   private class11302() {
      super();
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      N();
      y();
      L();
   }

   public static double y(double var0) {
      double d0 = (Double)((class05630)((class06202)N_0).i_7).u().method_41753() * y[0] + y[1];
      double d1 = d0 * d0 * d0 * y[2];
      return var0 * d1;
   }

   private static void y() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }

   public static float N(float var0, float var1, double var2) {
      double d0 = L(var2);
      return var1 - (float)((var1 - var0) % d0);
   }

   public static double N(double var0) {
      double d0 = (Double)((class05630)((class06202)N_0).i_7).u().method_41753() * i[0] + i[1];
      return var0 / (i[2] * d0 * d0 * d0);
   }

   private static void N() {
      i = new double[3];
      i[0] = Double.longBitsToDouble(4603579539098121011L);
      i[1] = Double.longBitsToDouble(4596373779694328218L);
      i[2] = Double.longBitsToDouble(4620693217682128896L);
      y = new double[7];
      y[0] = Double.longBitsToDouble(4603579539312869376L);
      y[1] = Double.longBitsToDouble(4596373779801702400L);
      y[2] = Double.longBitsToDouble(4620693217682128896L);
      y[3] = Double.longBitsToDouble(4603579539312869376L);
      y[4] = Double.longBitsToDouble(4596373779801702400L);
      y[5] = Double.longBitsToDouble(4620693217682128896L);
      y[6] = Double.longBitsToDouble(4594572339843380019L);
   }

   public static float N(float var0, float var1) {
      return N(var0, var1, (Double)((class05630)((class06202)N_0).i_7).u().method_41753());
   }
}
