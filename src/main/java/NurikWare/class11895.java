package NurikWare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;

public class class11895 {
   private static double[] Z;
   private static double[] m;
   private static double[] P;
   private static String[] s;
   private static double[] G;
   private static double[] Y;
   public static Object N_0 = class06202.Nq();
   public static Object N_1;

   private static void L() {
   }

   private class11895() {
      super();
      throw new UnsupportedOperationException(s[0]);
   }

   static {
      i();
      L();
      N();
      R();
      y();
      u();
   }

   private static void i() {
   }

   private static void u() {
      N_1 = P[5];
   }

   private static void y() {
      s = new String[1];
      s[0] = "This is a utility class and cannot be instantiated";
   }

   public static class06889 N(class07049 var0, boolean var1, double var2) {
      return N(var0, class11505.N(), var1, var2, var0x -> var0x.B(P[4]));
   }

   private static double N(class11499 var0, class06889 var1) {
      class07109 class07109 = class11505.N(var0, var1).L();
      return class07109.z * class07109.z + class07109.U * class07109.U;
   }

   private static class06889 N(class06889 var0, class06889 var1, class06889 var2, double var3) {
      class06889 class06889x = var1.u(var0);
      double d0 = class06889x.y(class06889x);
      if (d0 < m[5]) {
         return var1;
      } else {
         class06889 class06889x = var0.u(var2);
         double d1 = Y[0] * class06889x.y(class06889x);
         double d2 = class06889x.y(class06889x) - var3 * var3;
         double d3 = d1 * d1 - Y[1] * d0 * d2;
         if (d3 < Y[2]) {
            return var1;
         } else {
            double d4 = (-d1 - Math.sqrt(d3)) / (Y[3] * d0);
            return var0.i(class06889x.L(class04995.N(d4, Y[4], Y[5])));
         }
      }
   }

   private static void N(List<class06889> var0, class07049 var1, class06889 var2, double var3) {
      class06889 class06889x = ((class04453)((class06202)N_0).T_4).method_33571();
      class06889 class06889x = class11505.N(var2).U().L(var3).i(class06889x);
      if (!class11892.N(class06889x, class06889x, var1)) {
         var0.add(var2);
      }
   }

   private static void N() {
      G = new double[4];
      G[0] = Double.longBitsToDouble(4576918229304087675L);
      G[1] = Double.longBitsToDouble(4587366580439587226L);
      G[2] = Double.longBitsToDouble(4587366580439587226L);
      G[3] = Double.longBitsToDouble(4547007122018943789L);
      m = new double[6];
      m[0] = Double.longBitsToDouble(4517329193108106637L);
      m[1] = Double.longBitsToDouble(0L);
      m[2] = Double.longBitsToDouble(9218868437227405311L);
      m[3] = Double.longBitsToDouble(4587366580439587226L);
      m[4] = Double.longBitsToDouble(0L);
      m[5] = Double.longBitsToDouble(4472406533629990549L);
      Y = new double[8];
      Y[0] = Double.longBitsToDouble(4611686018427387904L);
      Y[1] = Double.longBitsToDouble(4616189618054758400L);
      Y[2] = Double.longBitsToDouble(0L);
      Y[3] = Double.longBitsToDouble(4611686018427387904L);
      Y[4] = Double.longBitsToDouble(0L);
      Y[5] = Double.longBitsToDouble(4607182418800017408L);
      Y[6] = Double.longBitsToDouble(4587366580439587226L);
      Y[7] = Double.longBitsToDouble(4611686018427387904L);
      Z = new double[3];
      Z[0] = Double.longBitsToDouble(4603741974828149072L);
      Z[1] = Double.longBitsToDouble(0L);
      Z[2] = Double.longBitsToDouble(4607182418800017408L);
      P = new double[6];
      P[0] = Double.longBitsToDouble(4602678819172646912L);
      P[1] = Double.longBitsToDouble(4576918229304087675L);
      P[2] = Double.longBitsToDouble(4576918229304087675L);
      P[3] = Double.longBitsToDouble(4576918229304087675L);
      P[4] = Double.longBitsToDouble(4576918229304087675L);
      P[5] = Double.longBitsToDouble(4587366580439587226L);
   }

   private static void N(List<class06889> var0, class06889 var1, class00734 var2, int var3, double var4, double var6) {
      double[] adouble;
      double[] adouble1;
      if (var3 == 0) {
         adouble = N(var2.y, var2.i);
         adouble1 = N(var2.L, var2.R);
      } else if (var3 == 1) {
         adouble = N(var2.N, var2.u);
         adouble1 = N(var2.L, var2.R);
      } else {
         adouble = N(var2.N, var2.u);
         adouble1 = N(var2.y, var2.i);
      }

      byte b0 = 4;

      for (int i = 0; i < b0; i++) {
         double d0 = adouble[0] + (adouble[1] - adouble[0]) * i / (b0 - 1);

         for (int j = 0; j < b0; j++) {
            double d1 = adouble1[0] + (adouble1[1] - adouble1[0]) * j / (b0 - 1);
            class06889 class06889 = N(N(var3, var4, d0, d1), var1, var3, var4, adouble, adouble1, var6);
            N(var0, var1, class06889);
         }
      }
   }

   public static class06889 N(class07049 var0, class11499 var1, boolean var2, double var3, Function<class00734, class00734> var5) {
      ArrayList arraylist = new ArrayList();
      class00734 class00734 = (class00734)var5.apply(var0.method_5829());
      byte b0 = 10;
      byte b1 = 10;
      byte b2 = 10;
      double d0 = class00734.L() / b0;
      double d1 = class00734.y() / b1;
      double d2 = class00734.u() / b2;
      class06889 class06889 = ((class04453)((class06202)N_0).T_4).method_33571();
      double d3 = class06889.L();
      double d4 = class06889.N();
      double d5 = class06889.y();
      boolean flag = d4 >= class00734.N && d4 < class00734.u && d3 >= class00734.L && d3 < class00734.R;
      boolean flag1 = flag || d3 > class00734.R;
      boolean flag2 = flag || d3 < class00734.L;
      boolean flag3 = flag || d4 > class00734.u;
      boolean flag4 = flag || d4 < class00734.N;
      boolean flag5 = flag || d5 > class00734.i;
      boolean flag6 = flag || d5 < class00734.y;

      for (int i = 0; i <= b0; i++) {
         double d6 = class00734.y + i * d0;
         N(arraylist, var0, new class06889(var0.method_23317(), d6, var0.method_23321()), var3);

         for (int j = 0; j <= b1; j++) {
            double d8 = class00734.N + j * d1;
            if (flag1) {
               class06889 class06889x = new class06889(d8, d6, class00734.R);
               N(arraylist, var0, class06889x, var3);
            }

            if (flag2) {
               class06889 class06889x = new class06889(d8, d6, class00734.L);
               N(arraylist, var0, class06889x, var3);
            }
         }

         for (int i1 = 0; i1 <= b2; i1++) {
            double d9 = class00734.L + i1 * d2;
            if (flag3) {
               class06889 class06889x = new class06889(class00734.u, d6, d9);
               N(arraylist, var0, class06889x, var3);
            }

            if (flag4) {
               class06889 class06889x = new class06889(class00734.N, d6, d9);
               N(arraylist, var0, class06889x, var3);
            }
         }
      }

      for (int k = 0; k <= b2; k++) {
         for (int l = 0; l <= b1; l++) {
            double d7 = class00734.N + l * d1;
            double d10 = class00734.L + k * d2;
            if (flag6) {
               N(arraylist, var0, new class06889(d7, class00734.y, d10), var3);
            }

            if (flag5) {
               N(arraylist, var0, new class06889(d7, class00734.i, d10), var3);
            }
         }
      }

      return N(arraylist, var1, var0.method_33571(), var2);
   }

   public static class06889 N(class07049 var0, double var1) {
      return N(var0, class11505.N(), var1, var0x -> var0x.B(P[2]));
   }

   private static class06889 N(class11499 var0, class06889 var1, class06889 var2) {
      class06889 class06889x = var2.u(var1);
      double d0 = Z[0];
      double d1 = Z[1];
      double d2 = Z[2];
      double d3 = d2 - d0 * (d2 - d1);
      double d4 = d1 + d0 * (d2 - d1);
      double d5 = N(var0, var1.i(class06889x.L(d3)));
      double d6 = N(var0, var1.i(class06889x.L(d4)));

      for (int i = 0; i < 8; i++) {
         if (d5 < d6) {
            d2 = d4;
            d4 = d3;
            d6 = d5;
            d3 = d2 - d0 * (d2 - d1);
            d5 = N(var0, var1.i(class06889x.L(d3)));
         } else {
            d1 = d3;
            d3 = d4;
            d5 = d6;
            d4 = d1 + d0 * (d2 - d1);
            d6 = N(var0, var1.i(class06889x.L(d4)));
         }
      }

      class06889 class06889x = var1.i(class06889x.L((d1 + d2) * P[0]));
      double d7 = N(var0, class06889x);
      double d8 = N(var0, var1);
      if (d8 < d7) {
         d7 = d8;
         class06889x = var1;
      }

      if (N(var0, var2) < d7) {
         class06889x = var2;
      }

      return class06889x;
   }

   public static class06889 N(class00734 var0) {
      class06889 class06889 = ((class04453)((class06202)N_0).T_4).method_33571();
      return new class06889(class04995.N(class06889.M, var0.N, var0.u), class04995.N(class06889.B, var0.y, var0.i), class04995.N(class06889.Z, var0.L, var0.R));
   }

   private static double[] N(double var0, double var2) {
      double d0 = Math.min(Y[6], (var2 - var0) / Y[7]);
      return new double[]{var0 + d0, var2 - d0};
   }

   public static class06889 N(class07049 var0, class11499 var1, double var2, Function<class00734, class00734> var4) {
      class00734 class00734 = (class00734)var4.apply(var0.method_5829());
      class06889 class06889 = ((class04453)((class06202)N_0).T_4).method_33571();
      double d0 = class06889.N();
      double d1 = class06889.y();
      double d2 = class06889.L();
      boolean flag = d0 >= class00734.N && d0 < class00734.u && d2 >= class00734.L && d2 < class00734.R;
      boolean flag1 = flag || d0 > class00734.u;
      boolean flag2 = flag || d0 < class00734.N;
      boolean flag3 = flag || d1 > class00734.i;
      boolean flag4 = flag || d1 < class00734.y;
      boolean flag5 = flag || d2 > class00734.R;
      boolean flag6 = flag || d2 < class00734.L;
      ArrayList arraylist = new ArrayList();
      if (flag1) {
         N(arraylist, class06889, var1, class00734, 0, class00734.u, var2);
      }

      if (flag2) {
         N(arraylist, class06889, var1, class00734, 0, class00734.N, var2);
      }

      if (flag3) {
         N(arraylist, class06889, var1, class00734, 1, class00734.i, var2);
      }

      if (flag4) {
         N(arraylist, class06889, var1, class00734, 1, class00734.y, var2);
      }

      if (flag5) {
         N(arraylist, class06889, var1, class00734, 2, class00734.R, var2);
      }

      if (flag6) {
         N(arraylist, class06889, var1, class00734, 2, class00734.L, var2);
      }

      if (arraylist.isEmpty()) {
         if (flag1) {
            N(arraylist, class06889, class00734, 0, class00734.u, var2);
         }

         if (flag2) {
            N(arraylist, class06889, class00734, 0, class00734.N, var2);
         }

         if (flag3) {
            N(arraylist, class06889, class00734, 1, class00734.i, var2);
         }

         if (flag4) {
            N(arraylist, class06889, class00734, 1, class00734.y, var2);
         }

         if (flag5) {
            N(arraylist, class06889, class00734, 2, class00734.R, var2);
         }

         if (flag6) {
            N(arraylist, class06889, class00734, 2, class00734.L, var2);
         }
      }

      double d3 = (var2 - G[1]) * (var2 - G[2]) + G[3];
      return arraylist.stream()
         .min(Comparator.<class06889>comparingInt(var3 -> var3.M(class06889) <= d3 ? 0 : 1).thenComparingDouble(var1x -> N(var1, var1x)))
         .orElseGet(() -> N(class00734));
   }

   private static void N(List<class06889> var0, class06889 var1, class11499 var2, class00734 var3, int var4, double var5, double var7) {
      class06889 class06889 = N(var1, var2, var3, var4, var5, var7);
      N(var0, var1, class06889);
   }

   private static class06889 N(int var0, double var1, double var3, double var5) {
      if (var0 == 0) {
         return new class06889(var1, var3, var5);
      } else {
         return var0 == 1 ? new class06889(var3, var1, var5) : new class06889(var3, var5, var1);
      }
   }

   public static class06889 N(class07049 var0, class11499 var1, boolean var2, double var3) {
      return N(var0, var1, var2, var3, var0x -> var0x.B(P[3]));
   }

   private static class06889 N(class06889 var0, class06889 var1, int var2, double var3, double[] var5, double[] var6, double var7) {
      double d0 = var7 - m[3];
      double d1 = var2 == 0 ? var1.M : (var2 == 1 ? var1.B : var1.Z);
      double d2 = var3 - d1;
      double d3 = var2 == 0 ? var1.B : var1.M;
      double d4 = var2 == 2 ? var1.B : var1.Z;
      class06889 class06889x = N(var2, var3, d3, d4);
      class06889 class06889x = N(var2, var3, class04995.N(d3, var5[0], var5[1]), class04995.N(d4, var6[0], var6[1]));
      double d5 = d0 * d0 - d2 * d2;
      if (d5 <= m[4]) {
         return class06889x;
      } else if (var0.M(class06889x) <= d5) {
         return var0;
      } else {
         return class06889x.M(class06889x) > d5 ? class06889x : N(var0, class06889x, class06889x, Math.sqrt(d5));
      }
   }

   private static class06889 N(class06889 var0, class11499 var1, class00734 var2, int var3, double var4, double var6) {
      double[] adouble;
      double[] adouble1;
      if (var3 == 0) {
         adouble = N(var2.y, var2.i);
         adouble1 = N(var2.L, var2.R);
      } else if (var3 == 1) {
         adouble = N(var2.N, var2.u);
         adouble1 = N(var2.L, var2.R);
      } else {
         adouble = N(var2.N, var2.u);
         adouble1 = N(var2.y, var2.i);
      }

      class06889 class06889xxxxxxx = var1.U();
      class06889 class06889x = null;
      double d0 = var3 == 0 ? class06889xxxxxxx.M : (var3 == 1 ? class06889xxxxxxx.B : class06889xxxxxxx.Z);
      if (Math.abs(d0) > m[0]) {
         double d1 = var3 == 0 ? var0.M : (var3 == 1 ? var0.B : var0.Z);
         double d2 = (var4 - d1) / d0;
         if (d2 >= m[1]) {
            class06889 class06889xx = var0.i(class06889xxxxxxx.L(d2));
            double d3 = var3 == 0 ? class06889xx.B : class06889xx.M;
            double d4 = var3 == 2 ? class06889xx.B : class06889xx.Z;
            if (d3 >= adouble[0] && d3 <= adouble[1] && d4 >= adouble1[0] && d4 <= adouble1[1]) {
               class06889x = class06889xx;
            }
         }
      }

      if (class06889x == null) {
         class06889 class06889xx = N(var3, var4, adouble[0], adouble1[0]);
         class06889 class06889xxx = N(var3, var4, adouble[1], adouble1[0]);
         class06889 class06889xxxx = N(var3, var4, adouble[1], adouble1[1]);
         class06889 class06889xxxxx = N(var3, var4, adouble[0], adouble1[1]);
         class06889[][] aclass068891 = new class06889[][]{
            {class06889xx, class06889xxx}, {class06889xxx, class06889xxxx}, {class06889xxxx, class06889xxxxx}, {class06889xxxxx, class06889xx}
         };
         class06889x = class06889xx;
         double d6 = m[2];

         for (class06889[] aclass06889 : aclass068891) {
            class06889 class06889xxxxxx = N(var1, aclass06889[0], aclass06889[1]);
            double d5 = N(var1, class06889xxxxxx);
            if (d5 < d6) {
               d6 = d5;
               class06889x = class06889xxxxxx;
            }
         }
      }

      return N(class06889x, var0, var3, var4, adouble, adouble1, var6);
   }

   private static class06889 N(List<class06889> var0, class11499 var1, class06889 var2, boolean var3) {
      return var0.stream()
         .filter(var1x -> !var3 || class11892.N(var1x, class05849.field_17559, class05835.field_1348))
         .min(Comparator.<class06889>comparingDouble(var1x -> {
            double d0 = var1x.M - var2.M;
            double d1 = var1x.Z - var2.Z;
            return d0 * d0 + d1 * d1;
         }).thenComparing(var1x -> {
            class07109 class07109 = class11505.N(var1, var1x).L();
            return Math.hypot(class07109.z, class07109.U);
         }))
         .orElse(var2);
   }

   public static class06889 N(class07049 var0, class11499 var1, double var2) {
      return N(var0, var1, var2, var0x -> var0x.B(P[1]));
   }

   private static void N(List<class06889> var0, class06889 var1, class06889 var2) {
      if (class11892.N(var1, var2, class05849.field_17559, class05835.field_1348)) {
         var0.add(var2);
      }
   }

   public static class06889 N(class07049 var0) {
      return N(var0.method_5829().B(G[0]));
   }

   private static void R() {
   }
}
