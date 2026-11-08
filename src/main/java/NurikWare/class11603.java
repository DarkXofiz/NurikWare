package NurikWare;

public class class11603 {
   public static Object N_0 = class09991.N().N(class09692.N(class09994.y((class09743)class11644.N_0), class09994.N((class09743)class11644.N_0)));
   public static Object N_1 = class09991.N().N(class09994.L((class09743)class11644.N_0));
   public static Object N_2;
   public static Object y_0 = N(class09965.N(8.0F));
   public static Object y_1 = N(new class09965(8.0F, 0.0F, 0.0F, 8.0F));
   public static Object y_2 = N(new class09965(0.0F, 8.0F, 8.0F, 0.0F));
   public static Object y_3 = y(class09965.N(8.0F));
   public static Object y_4 = y(new class09965(8.0F, 0.0F, 0.0F, 8.0F));
   public static Object y_5 = y(new class09965(0.0F, 8.0F, 8.0F, 0.0F));
   public static Object y_6 = class09991.N((class09991)N_1, class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object y_7;
   public static Object L_0 = new class11603()::N;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;

   private class11603() {
      super();
   }

   static {
      N();
      class09991 class09991x = class09991.N().N(class09962.N());
      N_2 = class09991.N(
         (class09991)N_0,
         class09991x.y(class09962.N()).u(12.0F).i(12.0F).R(4.0F).M(4.0F).z(1.0F).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX)
      );
      class09991 class09991x = class09991.N();
      y_7 = class09991.N((class09991)N_1, class09991x.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
   }

   private static class09991 y(class09965 var0) {
      return class09991.N((class09991)N_2, class09991.N().y(class11300.L(1184274, 64.0F)).u(class11300.L(1644825, 96.0F)).N(var0));
   }

   private static class09227 N(class09965 var0) {
      return class09227.N(var1 -> class09991.N((class09991)N_2, class09991.N().y(var1.L()).u(var1.R()).N(var0)));
   }

   private static class09991 N(class11853 var0, class09211 var1) {
      return switch (((int[])class11634.N_0)[var0.y().ordinal()]) {
         case 1 -> var0.u() ? ((class09227)y_0).N(var1) : (class09991)y_3;
         case 2 -> var0.u() ? ((class09227)y_1).N(var1) : (class09991)y_4;
         case 3 -> var0.u() ? ((class09227)y_2).N(var1) : (class09991)y_5;
         default -> throw new MatchException(null, null);
      };
   }

   private class09798 N(class11853 var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      return class09778.N(N(var1, class09211), var1x -> {
         var1x.N_1(var1xx -> var1.N().run());
         var1x.N(var1.L(), var1.u() ? (class09991)y_7 : (class09991)y_6);
      });
   }

   private static void N() {
      L_1 = 12;
      L_2 = 4;
      L_3 = 8;
   }
}
