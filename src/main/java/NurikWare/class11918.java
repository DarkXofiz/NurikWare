package NurikWare;

public class class11918 {
   private static String[] y;
   private static String[] L;
   private static String[] i;
   private static String[] B;
   private static String[] z;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2 = new String[320];

   private class11918() {
      super();
      throw new UnsupportedOperationException(y[0]);
   }

   static {
      R();
      i();
      ((String[])N_2)[0] = y[1];
      ((String[])N_2)[86] = y[2];
      ((String[])N_2)[96] = z[0];
      ((String[])N_2)[9] = z[1];
      ((String[])N_2)[1] = z[2];
      ((String[])N_2)[82] = z[3];
      ((String[])N_2)[72] = B[0];
      ((String[])N_2)[64] = B[1];
      ((String[])N_2)[40] = B[2];
      ((String[])N_2)[36] = B[3];
      ((String[])N_2)[32] = B[4];
      ((String[])N_2)[22] = B[5];
      ((String[])N_2)[18] = B[6];
      ((String[])N_2)[8] = B[7];
      ((String[])N_2)[4] = L[0];
      ((String[])N_2)[68] = L[1];
      ((String[])N_2)[55] = L[2];
      ((String[])N_2)[54] = L[3];
      ((String[])N_2)[5] = L[4];
      ((String[])N_2)[19] = L[5];
      ((String[])N_2)[23] = L[6];
      ((String[])N_2)[33] = i[0];
      ((String[])N_2)[37] = i[1];
      ((String[])N_2)[41] = i[2];
      ((String[])N_2)[306] = i[3];
      ((String[])N_2)[307] = i[4];
      ((String[])N_2)[65] = i[5];
      ((String[])N_2)[69] = i[6];
   }

   private static void i() {
      N_0 = 42240;
      N_1 = 320;
   }

   public static String N(char var0) {
      int ix = var0 - 'ꔀ';
      return ix >= 0 && ix < 320 ? ((String[])N_2)[ix] : null;
   }

   public static String N(int var0) {
      return var0 >= 42240 && var0 <= 42559 ? ((String[])N_2)[var0 - 42240] : null;
   }

   private static void R() {
      y = new String[3];
      y[0] = "This is a utility class and cannot be instantiated";
      y[1] = "ИГРОК";
      y[2] = "BUNNY";
      z = new String[4];
      z[0] = "D.HELPER";
      z[1] = "HELPER";
      z[2] = "MEDIA";
      z[3] = "RABBIT";
      B = new String[8];
      B[0] = "COBRA";
      B[1] = "HYDRA";
      B[2] = "DRAGON";
      B[3] = "IMPERATOR";
      B[4] = "MAGISTER";
      B[5] = "OVERLORD";
      B[6] = "AVENGER";
      B[7] = "TITAN";
      L = new String[7];
      L[0] = "HERO";
      L[1] = "DRACULA";
      L[2] = "ADMIN";
      L[3] = "TIGER";
      L[4] = "YT";
      L[5] = "ML.MODER";
      L[6] = "MODER";
      i = new String[7];
      i[0] = "MODER+";
      i[1] = "ST.MODER";
      i[2] = "GL.MODER";
      i[3] = "BULL";
      i[4] = "ML.ADMIN";
      i[5] = "GOD";
      i[6] = "VAMPIRE";
   }
}
