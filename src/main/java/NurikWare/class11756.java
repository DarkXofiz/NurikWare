package NurikWare;

public class class11756 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object y_0;
   public static Object y_1 = class09991.N()
      .j(4.0F)
      .v(10.0F)
      .L((Integer)class09181.y_5)
      .y((Integer)class09181.y_4)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(12.0F)
      .N(class09983.BORDER_BOX);
   public static Object y_2 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.N(0.0F, 32.0F))
      .y()
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX)
      .N(class09692.N(class09994.W((class09743)class11644.N_0), class09994.M((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0)))
      .y(var0 -> var0.y(class09962.N(0.0F, 0.0F)).R(0.0F).l(0.0F));
   public static Object L_0 = class09991.N().N(var0 -> var0.y(class09962.N(0.0F, 0.0F)).R(0.0F).l(0.0F));
   public static Object L_1 = class09991.N((class09991)y_2, class09991.N().R(0.0F));
   public static Object L_2 = class09991.N((class09991)y_2, class09991.N().R(10.0F));
   public static Object L_3 = class09991.N((class09991)L_1, (class09991)L_0);
   public static Object L_4 = class09991.N((class09991)L_2, (class09991)L_0);
   public static Object L_5;

   private static void L() {
      N_0 = 4;
      N_1 = 10;
      N_2 = 1;
      N_3 = 12;
      N_4 = 10;
      y_0 = 32;
      y_1 = null;
      y_2 = null;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
   }

   private class11756() {
      super();
   }

   static {
      y();
      N();
      L();
      class09991 class09991 = class09991.N();
      L_5 = class09991.N((class09991)y_2, class09991.y(class09962.N(0.0F, 0.0F)).R(0.0F).l(0.0F));
   }

   private static void y() {
   }

   public static class09991 N(boolean var0, boolean var1) {
      if (var1) {
         return var0 ? (class09991)L_3 : (class09991)L_4;
      } else {
         return var0 ? (class09991)L_1 : (class09991)L_2;
      }
   }

   public static class09991 N(class09991 var0, float var1, float var2) {
      float f = Math.max(var2, (float)Math.ceil(var1));
      return class09991.N(var0, class09991.N().N(class09962.y(f)));
   }

   public static class09991 N(class09991 var0, float var1, float var2, class09743 var3) {
      return class09991.N(N(var0, var1, var2), class09991.N().N(class09692.N(class09994.E(var3))));
   }

   private static void N() {
   }
}
