package NurikWare;

public class class11622 {
   public static Object N_0 = new class11622()::N;
   public static Object N_1 = new class11863(500.0F, 34.0F, 1.0F, 0.5F, 2.0F, 0.008333334F);
   public static Object N_2 = class09991.N().u(52.0F, 24.0F).Z(9999.0F).N(class09692.N(class09994.N((class09743)N_1), class09994.y((class09743)N_1))).z(1.0F);
   public static Object N_3 = class09991.N()
      .u(28.0F, 20.0F)
      .N(class09969.FLOATING)
      .N(class09692.N(class09994.N((class09743)N_1), class09994.B((class09743)N_1)))
      .N(2.0F, 2.0F)
      .v(5.0F)
      .L(class09662.N(-16777216, 0.15F))
      .Z(9999.0F);
   public static Object N_4 = class09227.N(var0 -> class09991.N().y(var0.L()).u(var0.R()));
   public static Object N_5 = class09991.N().y(-14869219).u((Integer)class09181.u_0);
   public static Object N_6 = class09227.N(var0 -> class09991.N().y(var0.z()).U(22.0F));
   public static Object N_7 = class09991.N().y((Integer)class09181.u_1);

   private class11622() {
      super();
   }

   static {
      N();
      y();
      i();
   }

   private static void i() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
      N_7 = null;
   }

   private static void y() {
   }

   private class09798 N(class11861 var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      boolean flag = var1.N();
      class09991 class09991x = class09991.N((class09991)N_2, flag ? ((class09227)N_4).N(class09211) : (class09991)N_5);
      class09991 class09991x = class09991.N((class09991)N_3, flag ? ((class09227)N_6).N(class09211) : (class09991)N_7);
      return class09778.N(class09991x, var3x -> {
         var3x.N_1(var2xx -> var1.y().accept(!flag));
         var3x.y(class09991);
      });
   }

   private static void N() {
   }
}
