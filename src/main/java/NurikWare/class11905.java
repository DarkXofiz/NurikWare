package NurikWare;

public class class11905 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5 = (class11887)var0 -> var0;
   public static Object N_6 = y(2);
   public static Object y_0 = (class11887)var0 -> 1.0 + 2.70158 * Math.pow(var0 - 1.0, 3.0) + 1.70158 * Math.pow(var0 - 1.0, 2.0);
   public static Object y_1 = (class11887)var0 -> var0 < 0.5
      ? Math.pow(2.0 * var0, 2.0) * (7.189819 * var0 - 2.5949095) / 2.0
      : (Math.pow(2.0 * var0 - 2.0, 2.0) * (3.5949095 * (var0 * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0;
   public static Object y_2 = (class11887)var0 -> {
      double d0 = 7.5625;
      double d1 = 2.75;
      if (var0 < 1.0 / d1) {
         return d0 * Math.pow(var0, 2.0);
      } else if (var0 < 2.0 / d1) {
         return d0 * Math.pow(var0 - 1.5 / d1, 2.0) + 0.75;
      } else {
         return var0 < 2.5 / d1 ? d0 * Math.pow(var0 - 2.25 / d1, 2.0) + 0.9375 : d0 * Math.pow(var0 - 2.625 / d1, 2.0) + 0.984375;
      }
   };
   public static Object y_3 = (class11887)var0 -> 1.0 - ((class11887)y_2).ease(1.0 - var0);
   public static Object y_4 = (class11887)var0 -> var0 < 0.5
      ? (1.0 - ((class11887)y_2).ease(1.0 - 2.0 * var0)) / 2.0
      : (1.0 + ((class11887)y_2).ease(2.0 * var0 - 1.0)) / 2.0;
   public static Object L_0 = N(2);
   public static Object L_1 = L(2.0);
   public static Object L_2 = y(3);
   public static Object L_3 = N(3);
   public static Object L_4 = L(3.0);
   public static Object L_5 = y(4);
   public static Object u_0 = y(5);
   public static Object u_1 = N(5);
   public static Object u_2 = L(5.0);
   public static Object u_3 = (class11887)var0 -> 1.0 - Math.cos(var0 * Math.PI / 2.0);
   public static Object u_4 = (class11887)var0 -> Math.sin(var0 * Math.PI / 2.0);
   public static Object u_5 = (class11887)var0 -> -(Math.cos(Math.PI * var0) - 1.0) / 2.0;
   public static Object u_6 = (class11887)var0 -> 1.0 - Math.sqrt(1.0 - Math.pow(var0, 2.0));
   public static Object u_7 = (class11887)var0 -> Math.sqrt(1.0 - Math.pow(var0 - 1.0, 2.0));
   public static Object i_0 = N(4);
   public static Object i_1 = L(4.0);
   public static Object R_0 = (class11887)var0 -> var0 < 0.5
      ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var0, 2.0))) / 2.0
      : (Math.sqrt(1.0 - Math.pow(-2.0 * var0 + 2.0, 2.0)) + 1.0) / 2.0;
   public static Object R_1 = (class11887)var0 -> var0 != 0.0 && var0 != 1.0
      ? Math.pow(-2.0, 10.0 * var0 - 10.0) * Math.sin((var0 * 10.0 - 10.75) * (Math.PI * 2.0 / 3.0))
      : var0;
   public static Object R_2 = (class11887)var0 -> var0 != 0.0 && var0 != 1.0
      ? Math.pow(2.0, -10.0 * var0) * Math.sin((var0 * 10.0 - 0.75) * (Math.PI * 2.0 / 3.0)) + 1.0
      : var0;
   public static Object R_3 = (class11887)var0 -> {
      if (var0 == 0.0 || var0 == 1.0) {
         return var0;
      } else {
         return var0 < 0.5
            ? -(Math.pow(2.0, 20.0 * var0 - 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0))) / 2.0
            : Math.pow(2.0, -20.0 * var0 + 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0)) / 2.0 + 1.0;
      }
   };
   public static Object R_4 = (class11887)var0 -> var0 != 0.0 ? Math.pow(2.0, 10.0 * var0 - 10.0) : var0;
   public static Object R_5 = (class11887)var0 -> var0 != 1.0 ? 1.0 - Math.pow(2.0, -10.0 * var0) : var0;
   public static Object R_6 = (class11887)var0 -> {
      if (var0 == 0.0 || var0 == 1.0) {
         return var0;
      } else {
         return var0 < 0.5 ? Math.pow(2.0, 20.0 * var0 - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * var0 + 10.0)) / 2.0;
      }
   };
   public static Object R_7 = (class11887)var0 -> 2.70158 * Math.pow(var0, 3.0) - 1.70158 * Math.pow(var0, 2.0);

   private static void L() {
   }

   public static class11887 L(double var0) {
      return var2 -> var2 < 0.5 ? Math.pow(2.0, var0 - 1.0) * Math.pow(var2, var0) : 1.0 - Math.pow(-2.0 * var2 + 2.0, var0) / 2.0;
   }

   private class11905() {
      super();
   }

   static {
      y();
      u();
      L();
      N();
      i();
   }

   private static void i() {
      N_0 = 1.70158;
      N_1 = 2.5949095;
      N_2 = 2.70158;
      N_3 = Math.PI * 2.0 / 3.0;
      N_4 = Math.PI * 4.0 / 9.0;
      N_5 = null;
      N_6 = null;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      i_0 = null;
      i_1 = null;
      u_0 = null;
      u_1 = null;
      u_2 = null;
      u_3 = null;
      u_4 = null;
      u_5 = null;
      u_6 = null;
      u_7 = null;
      R_0 = null;
      R_1 = null;
      R_2 = null;
      R_3 = null;
      R_4 = null;
      R_5 = null;
      R_6 = null;
      R_7 = null;
      y_0 = null;
      y_1 = null;
      y_2 = null;
      y_3 = null;
      y_4 = null;
   }

   private static void u() {
   }

   private static void y() {
   }

   public static class11887 y(int var0) {
      return N((double)var0);
   }

   public static class11887 y(double var0) {
      return var2 -> 1.0 - Math.pow(1.0 - var2, var0);
   }

   public static class11887 N(double var0) {
      return var2 -> Math.pow(var2, var0);
   }

   private static void N() {
   }

   public static class11887 N(int var0) {
      return y((double)var0);
   }
}
