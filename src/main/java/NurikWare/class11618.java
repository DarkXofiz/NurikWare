package NurikWare;

public class class11618 {
   private static String[] y;
   public static Object N_0;

   private static void L() {
      y = new String[1];
      y[0] = "modalFade";
   }

   private class11618() {
      super();
   }

   static {
      L();
      u();
   }

   private static void u() {
      N_0 = 0.18F;
   }

   public static class11610 N(class09809 var0, boolean var1) {
      class11608 class11608 = var0.u(y[0], class11608::new);
      class11608.N(var1);
      return new class11610(class11608.L(), var1 || class11608.B() > 0.0F);
   }
}
