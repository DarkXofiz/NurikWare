package NurikWare;

public class class11601 {
   public static Object N_0 = R(28);
   public static Object N_1 = (Integer)class11601.y_0;
   public static Object N_2;
   public static Object N_3 = new class11863(500.0F, 34.0F, 1.0F, 0.5F, 2.0F, 0.008333334F);
   public static Object N_4;
   public static Object y_0 = R(24);
   public static Object y_1;
   public static Object L_0;
   public static Object L_1 = class09227.N(var0 -> class09991.N().y(var0.L()).u(var0.R()));
   public static Object L_2 = class09991.N().y(-14869219).u((Integer)class09181.u_0);
   public static Object L_3 = class09227.N(var0 -> class09991.N().y(var0.z()).U(((Integer)N_2).intValue()));
   public static Object L_4 = class09991.N().y((Integer)class09181.u_1);
   public static Object u_0 = new class11601()::N;
   public static Object u_1;
   public static Object u_2 = R(52);

   private class11601() {
      super();
   }

   static {
      y();
      N();
      int i = (Integer)u_2;
      (Integer)N_0;
      N_2 = i;
      class09991 class09991x = class09991.N();
      int j = (Integer)u_2;
      N_4 = class09991x.u(j, ((Integer)y_0).intValue()).Z(9999.0F).N(class09692.N(class09994.N((class09743)N_3), class09994.y((class09743)N_3))).z(1.0F);
      class09991 class09991x = class09991.N();
      int k = (Integer)N_0;
      L_0 = class09991x.u(k, ((Integer)N_1).intValue())
         .N(class09969.FLOATING)
         .N(class09692.N(class09994.N((class09743)N_3), class09994.B((class09743)N_3)))
         .N(2.0F, 2.0F)
         .v(5.0F)
         .L(class09662.N(-16777216, 0.15F))
         .Z(9999.0F);
   }

   private static void y() {
   }

   private class09798 N(class11861 var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      boolean flag = var1.N();
      class09991 class09991x = class09991.N((class09991)N_4, flag ? ((class09227)L_1).N(class09211) : (class09991)L_2);
      class09991 class09991x = class09991.N((class09991)L_0, flag ? ((class09227)L_3).N(class09211) : (class09991)L_4);
      return class09778.N(class09991x, var3x -> {
         var3x.N_1(var2xx -> var1.y().accept(!flag));
         var3x.y(class09991);
      });
   }

   private static void N() {
      u_1 = 0.6F;
      u_2 = 0;
      y_0 = 0;
      y_1 = 2;
      N_0 = 0;
      N_1 = 0;
      N_2 = 0;
   }

   private static int R(int var0) {
      return Math.round(var0 * 0.6F / 2.0F) * 2;
   }
}
