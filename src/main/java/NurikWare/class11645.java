package NurikWare;

import java.util.stream.Collectors;

public class class11645 {
   private static String[] R;
   private static String[] j;
   public static Object N_0 = new class11645()::N;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public static Object y_0;
   public static Object y_1 = class09991.N()
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
   public static Object y_2 = class09991.N().N(class09969.FLOATING).U(-8.0F).u(150.0F, 30.0F);
   public static Object y_3 = class09991.N().N(class09969.FLOATING).U(122.0F).E(9.0F).u(12.0F, 12.0F).i(-7171438);
   public static Object y_4 = class09991.N(class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object y_5 = class09991.N(class09991.N().N(false), class09221.N(14, class09079.REGULAR));
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;

   private class11645() {
      super();
   }

   static {
      N();
      y();
   }

   private static boolean Z(String var0) {
      return class09222.N(var0, 14.0F, class09079.REGULAR) > 104.0F;
   }

   private static void y() {
      N_1 = j[1];
      N_2 = 150;
      N_3 = 30;
      N_4 = 8;
      N_5 = 1;
      N_6 = 8;
      L_0 = 30;
      L_1 = 112;
      L_2 = 134;
      L_3 = 12;
      L_4 = 14;
      y_0 = j[2];
   }

   private class09798 N(class11840 var1, class09809 var2) {
      String s = N(var1);
      boolean flag = Z(s);
      return class09778.N(
         (class09991)y_1,
         var4x -> {
            var4x.y(var2xx -> {
               var2xx.N(j[0]);
               var2xx.L(s);
               var2xx.N(flag ? (class09991)y_5 : (class09991)y_4);
            });
            var4x.i(
               var2xx -> {
                  var2xx.N(R[5]);
                  var2xx.N((class09991)y_2);
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
               var0x.N(R[3]);
               var0x.L(R[4]);
               var0x.N((class09991)y_3);
            });
            var4x.N_1(var1xx -> var1.L().N(true));
            var4x.y(var2.N(R[2], (class09788<class11840>)class11614.y_0, var1));
         }
      );
   }

   private static void N() {
      R = new String[6];
      R[0] = ", ";
      R[1] = "—";
      R[2] = "comboList";
      R[3] = "comboCheckIcon";
      R[4] = "icon:menu/angles";
      R[5] = "comboSelectedFadeCanvas";
      j = new String[3];
      j[0] = "comboSelectedText";
      j[1] = "—";
      j[2] = "icon:menu/angles";
   }

   private static String N(class11840 var0) {
      String s = var0.u().stream().filter(class11535::U).map(var0x -> class12020.N(var0x.E())).collect(Collectors.joining(R[0]));
      return s.isEmpty() ? R[1] : s;
   }
}
