package NurikWare;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class07451;

public class class11891 {
   private static double[] L;
   private static String[] i;
   public static Object N_0 = class06202.Nq();

   private static void L() {
      L = new double[8];
      L[0] = Double.longBitsToDouble(0L);
      L[1] = Double.longBitsToDouble(0L);
      L[2] = Double.longBitsToDouble(0L);
      L[3] = Double.longBitsToDouble(0L);
      L[4] = Double.longBitsToDouble(4607182418800017408L);
      L[5] = Double.longBitsToDouble(0L);
      L[6] = Double.longBitsToDouble(4607182418800017408L);
      L[7] = Double.longBitsToDouble(4607002274986721280L);
   }

   private static boolean L(class11781 var0) {
      return var0.y() && !var0.L() && var0.M() - var0.u() > L[0];
   }

   private class11891() {
      super();
      throw new UnsupportedOperationException(i[0]);
   }

   static {
      L();
      u();
      R();
   }

   private static class06889 i(class11781 var0) {
      return var0.i().method_18796(new class06889(var0.N().M, var0.N().B, var0.N().Z), class07451.field_6308);
   }

   private static void u(class11781 var0) {
      class07438 class07438 = var0.i();
      float f = ((class03448)((class06202)N_0).T_3).method_8320(class07438.method_23314()).i().Z();
      float f1 = var0.R() ? f * 0.91F : 0.91F;
      class06889 class06889 = var0.N();
      var0.N(new class06889(class06889.M * f1, (class06889.B - class07438.method_61426()) * L[7], class06889.Z * f1));
   }

   private static void u() {
      i = new String[1];
      i[0] = "This is a utility class and cannot be instantiated";
   }

   private static void y(class11781 var0) {
      var0.N(new class06889(var0.N().M, var0.i().method_6106(), var0.N().Z));
   }

   public static class06889 y() {
      return ((class11781)((class04453)((class06202)N_0).T_4)).N();
   }

   public static void N(class11781 var0) {
      if (L(var0)) {
         y(var0);
      }

      class06889 class06889x = i(var0);
      class06889 class06889x = N(var0, class06889x);
      N(var0, class06889x, class06889x);
      u(var0);
   }

   private static void N(class11781 var0, class06889 var1, class06889 var2) {
      boolean flag = !class04995.y(var1.M, var2.M);
      boolean flag1 = !class04995.y(var1.Z, var2.Z);
      boolean flag2 = flag || flag1;
      boolean flag3 = var1.B != var2.B;
      boolean flag4 = flag3 && var1.B < L[1];
      if (flag2) {
         class06889 class06889 = var0.N();
         var0.N(new class06889(flag ? L[2] : class06889.M, class06889.B, flag1 ? L[3] : class06889.Z));
      }

      if (flag3) {
         var0.N(var0.N().u(L[4], L[5], L[6]));
      }

      var0.N(flag4);
   }

   private static class06889 N(class11781 var0, class06889 var1) {
      return var0.i().method_17835(var1);
   }

   public static boolean N() {
      return ((class11781)((class04453)((class06202)N_0).T_4)).R();
   }

   private static void R() {
   }
}
