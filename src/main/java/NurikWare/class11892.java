package NurikWare;

import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08038;

public class class11892 {
   private static double[] u;
   private static String[] B;
   public static Object N_0 = class06202.Nq();

   private static void L() {
   }

   private class11892() {
      super();
      throw new UnsupportedOperationException(B[0]);
   }

   static {
      N();
      y();
      u();
      L();
   }

   private static void u() {
      B = new String[1];
      B[0] = "This is a utility class and cannot be instantiated";
   }

   public static Optional<class06889> y(class06889 var0, class06889 var1, class07049 var2) {
      class00734 class00734 = var2.method_5829().M(var2.method_5871());
      return class00734.u(var0) ? Optional.of(var0) : class00734.y(var0, var1);
   }

   private static void y() {
   }

   private static class06145 N(class07049 var0, Predicate<class07049> var1, class06889 var2, class06889 var3, double var4, double var6) {
      class06889 class06889 = var3.y(var2.M * var4, var2.B * var4, var2.Z * var4);
      float f = 1.0F;
      class00734 class00734 = var0.method_5829().y(var2.L(var4)).L(f, f, f);
      return class08038.N(var0, var3, class06889, class00734, var1, var6);
   }

   public static boolean N(class06889 var0, class06889 var1, class00734 var2) {
      return var2.u(var0) ? false : var2.y(var0, var1).isEmpty();
   }

   public static class06183 N(class05862 var0) {
      return N(var0, (var0x, var1) -> true);
   }

   public static class07089 N(class07049 var0, class11499 var1, double var2, boolean var4, Predicate<class07049> var5) {
      return N(var0, var1.y(), var1.R(), var2, var4, var5);
   }

   public static class07089 N(class07049 var0, double var1, boolean var3, Predicate<class07049> var4) {
      return N(var0, var0.method_5828(1.0F), var1, var3, var4);
   }

   public static class06183 N(class05862 var0, BiPredicate<class00500, class07209> var1) {
      return (class06183)class07290.N(var0.y(), var0.N(), var0, (var1x, var2) -> {
         class00500 class00500 = ((class03448)((class06202)N_0).T_3).method_8320(var2);
         class04688 class04688 = ((class03448)((class06202)N_0).T_3).method_8316(var2);
         class06889 class06889x = var1x.y();
         class06889 class06889x = var1x.N();
         boolean flag = var1.test(class00500, var2);
         class09331 class09331 = class09331.N(class00500, var2);
         class11938.L().L(class09331);
         if (class09331.y()) {
            flag = false;
         }

         class00494 class00494 = var1x.N(class00500, (class03448)((class06202)N_0).T_3, var2);
         class06183 class06183x = ((class03448)((class06202)N_0).T_3).N(class06889x, class06889x, var2, class00494, class00500);
         class06183 class06183x = var1x.N(class04688, (class03448)((class06202)N_0).T_3, var2).method_1092(class06889x, class06889x, var2);
         double d0 = class06183x == null ? u[0] : class06889x.M(class06183x.y());
         double d1 = class06183x == null ? u[1] : class06889x.M(class06183x.y());
         return d0 <= d1 && flag ? class06183x : class06183x;
      }, var0x -> {
         class06889 class06889 = var0x.y().u(var0x.N());
         return class06183.N(var0x.N(), class07211.N(class06889.M, class06889.B, class06889.Z), class07209.method_49638(var0x.N()));
      });
   }

   public static boolean N(class11499 var0, double var1, class05849 var3, class05835 var4) {
      class06889 class06889xx = ((class04453)((class06202)N_0).T_4).method_5631(var0.R(), var0.y());
      class06889 class06889x = ((class04453)((class06202)N_0).T_4).method_33571();
      class06889 class06889xx = class06889xx.L(var1).i(class06889x);
      return ((class03448)((class06202)N_0).T_3).N(new class05862(class06889x, class06889xx, var3, var4, (class04453)((class06202)N_0).T_4)).N()
         == class07113.field_1333;
   }

   private static class06145 N(class07049 var0, Predicate<class07049> var1, class06889 var2, double var3, double var5) {
      return N(var0, var1, var0.method_5828(1.0F), var2, var3, var5);
   }

   public static boolean N(class06889 var0, class06889 var1, class05849 var2, class05835 var3) {
      return N(new class05862(var0, var1, var2, var3, (class04453)((class06202)N_0).T_4)).N() == class07113.field_1333;
   }

   private static void N() {
      u = new double[2];
      u[0] = Double.longBitsToDouble(9218868437227405311L);
      u[1] = Double.longBitsToDouble(9218868437227405311L);
   }

   public static boolean N(class06889 var0, class05849 var1, class05835 var2) {
      return N(((class04453)((class06202)N_0).T_4).method_33571(), var0, var1, var2);
   }

   public static class07089 N(class07049 var0, float var1, float var2, double var3, boolean var5, Predicate<class07049> var6) {
      return N(var0, var0.method_5631(var2, var1), var3, var5, var6);
   }

   public static boolean N(class06889 var0, class06889 var1, class07049 var2) {
      return N(var0, var1, var2.method_5829().M(var2.method_5871()));
   }

   private static class07089 N(class07089 var0, class06889 var1, double var2) {
      if (!var0.y().N(var1, var2)) {
         class06889 class06889 = var0.y();
         class07211 class07211 = class07211.N(class06889.M - var1.M, class06889.B - var1.B, class06889.Z - var1.Z);
         return class06183.N(class06889, class07211, class07209.method_49638(class06889));
      } else {
         return var0;
      }
   }

   public static class07089 N(class07049 var0, class06889 var1, double var2, boolean var4, Predicate<class07049> var5) {
      return N(var0, var0.method_5836(1.0F), var1, var2, var4, var5);
   }

   public static boolean N(class11499 var0, double var1, class07049 var3) {
      class06889 class06889xx = ((class04453)((class06202)N_0).T_4).method_5631(var0.R(), var0.y());
      class06889 class06889x = ((class04453)((class06202)N_0).T_4).method_33571();
      class06889 class06889xx = class06889xx.L(var1);
      return N(class06889x, class06889x.i(class06889xx), var3);
   }

   public static boolean N(class11499 var0, double var1, class00734 var3) {
      class06889 class06889xx = ((class04453)((class06202)N_0).T_4).method_5631(var0.R(), var0.y());
      class06889 class06889x = ((class04453)((class06202)N_0).T_4).method_33571();
      class06889 class06889xx = class06889xx.L(var1);
      return N(class06889x, class06889x.i(class06889xx), var3);
   }

   private static class07089 N(class07049 var0, double var1, Predicate<class07049> var3) {
      double d0 = var1;
      double d1 = class04995.E(var1);
      class06889 class06889 = var0.method_5836(1.0F);
      class07089 class07089 = var0.method_5745(var1, 1.0F, false);
      double d2 = class07089.y().M(class06889);
      if (class07089.N() != class07113.field_1333) {
         d1 = d2;
         d0 = Math.sqrt(d2);
      }

      class06145 class06145 = N(var0, var3, class06889, d0, d1);
      return class06145 != null && class06145.y().M(class06889) < d2 ? N(class06145, class06889, var1) : N(class07089, class06889, var1);
   }

   public static class07089 N(class07049 var0, class06889 var1, class06889 var2, double var3, boolean var5, Predicate<class07049> var6) {
      if (var5) {
         return N(var0, var3, var6);
      } else {
         double d0 = class04995.E(var3);
         class06145 class06145 = N(var0, var6, var2, var1, var3, d0);
         return class06145 == null ? null : N(class06145, var1, var3);
      }
   }
}
