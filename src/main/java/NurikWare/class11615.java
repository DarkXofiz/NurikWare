package NurikWare;

public class class11615 {
   private static String[] Z;
   public static Object N_0 = new class11615()::N;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;
   public static Object y_6;
   public static Object y_7;
   public static Object L_0 = class09991.N()
      .u(150.0F, 30.0F)
      .y((Integer)class09181.L_1)
      .z(1.0F)
      .u((Integer)class09181.y_1)
      .y()
      .y(class09973.CENTER)
      .u(8.0F)
      .i(8.0F)
      .N(class09983.BORDER_BOX)
      .Z(8.0F);
   public static Object L_1 = class09991.N().N(class09969.FLOATING).U(-8.0F).u(150.0F, 30.0F);
   public static Object L_2 = class09991.N().N(class09969.FLOATING).U(122.0F).E(9.0F).u(12.0F, 12.0F).i(-7171438);
   public static Object L_3 = class09991.N(class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object L_4 = class09991.N(class09991.N().N(false), class09221.N(14, class09079.REGULAR));

   private static void L() {
      N_1 = 150;
      N_2 = 30;
      N_3 = 8;
      y_0 = 1;
      y_1 = 8;
      y_2 = 30;
      y_3 = 112;
      y_4 = 134;
      y_5 = 12;
      y_6 = 14;
      y_7 = Z[5];
   }

   private class11615() {
      super();
   }

   static {
      N();
      L();
   }

   private class09798 N(class11835 var1, class09809 var2) {
      String s = class12020.N(var1.N().E());
      boolean flag = N(s);
      return class09778.N(
         (class09991)L_0,
         var4x -> {
            var4x.y(var2xx -> {
               var2xx.N(Z[4]);
               var2xx.L(s);
               var2xx.N(flag ? (class09991)L_4 : (class09991)L_3);
            });
            var4x.i(
               var2xx -> {
                  var2xx.N(Z[3]);
                  var2xx.N((class09991)L_1);
                  if (flag) {
                     var2xx.y(
                        var1xxx -> class11617.N(
                           s, -7171438, 14.0F, class09079.REGULAR, 150.0F, 8.0F, 112.0F, 134.0F, var1xxx.N(), var1xxx.y(), var1xxx.L(), var1xxx.u()
                        )
                     );
                  }
               }
            );
            var4x.L(var0x -> {
               var0x.N(Z[1]);
               var0x.L(Z[2]);
               var0x.N((class09991)L_2);
            });
            var4x.N_1(var1xx -> var1.u().N(true));
            var4x.y(var2.N(Z[0], (class09788<class11851>)class11621.N_0, new class11851(var1.L(), var1.u(), var1.y())));
         }
      );
   }

   private static void N() {
      Z = new String[6];
      Z[0] = "entryList";
      Z[1] = "selectableCheckIcon";
      Z[2] = "icon:menu/angles";
      Z[3] = "selectableSelectedFadeCanvas";
      Z[4] = "selectableSelectedText";
      Z[5] = "icon:menu/angles";
   }

   private static boolean N(String var0) {
      return class09222.N(var0, 14.0F, class09079.REGULAR) > 104.0F;
   }
}
