package NurikWare;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;

public class class11064 {
   private static double[] y;
   private static double[] L;
   public static Object N_0;
   public static Object N_1;

   public static class00734 L(class07049 var0) {
      return var0.method_5829();
   }

   private class11064() {
      super();
   }

   static {
      i();
      y();
   }

   private static void i() {
      L = new double[8];
      L[0] = Double.longBitsToDouble(4585925428558828667L);
      L[1] = Double.longBitsToDouble(0L);
      L[2] = Double.longBitsToDouble(4593311331947716280L);
      L[3] = Double.longBitsToDouble(4585925428558828667L);
      L[4] = Double.longBitsToDouble(0L);
      L[5] = Double.longBitsToDouble(4593311331947716280L);
      L[6] = Double.longBitsToDouble(4581421828931458171L);
      L[7] = Double.longBitsToDouble(0L);
      y = new double[6];
      y[0] = Double.longBitsToDouble(4585925428558828667L);
      y[1] = Double.longBitsToDouble(4611686018427387904L);
      y[2] = Double.longBitsToDouble(4611686018427387904L);
      y[3] = Double.longBitsToDouble(4611686018427387904L);
      y[4] = Double.longBitsToDouble(4585925428558828667L);
      y[5] = Double.longBitsToDouble(4581421828931458171L);
   }

   public static class00734 u(class07049 var0) {
      class00734 class00734 = L(var0);
      double d0 = Math.min(L[0], Math.max(L[1], (class00734.u - class00734.N) * L[2]));
      double d1 = Math.min(L[3], Math.max(L[4], (class00734.R - class00734.L) * L[5]));
      double d2 = Math.min(L[6], Math.max(L[7], (class00734.i - class00734.y) * y[0]));
      return !(class00734.u - class00734.N <= d0 * y[1]) && !(class00734.i - class00734.y <= d2 * y[2]) && !(class00734.R - class00734.L <= d1 * y[3])
         ? new class00734(class00734.N + d0, class00734.y + d2, class00734.L + d1, class00734.u - d0, class00734.i - d2, class00734.R - d1)
         : class00734;
   }

   private static void y() {
      N_0 = y[4];
      N_1 = y[5];
   }

   public static class06889 y(class07049 var0) {
      return L(var0).R();
   }

   public static class06889 y(class07049 var0, class06889 var1) {
      class00734 class00734 = L(var0);
      return new class06889(
         class04995.N(var1.M, class00734.N, class00734.u), class04995.N(var1.B, class00734.y, class00734.i), class04995.N(var1.Z, class00734.L, class00734.R)
      );
   }

   public static class06889 N(class07049 var0, class06889 var1) {
      class00734 class00734 = L(var0);
      return new class06889(
         class04995.N(var1.M, class00734.N, class00734.u), class04995.N(var1.B, class00734.y, class00734.i), class04995.N(var1.Z, class00734.L, class00734.R)
      );
   }

   public static class06889 N(class07049 var0) {
      return N(var0, ((class04453)((class06202)class11087.N_0).T_4).method_33571());
   }
}
