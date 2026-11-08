package NurikWare;

public class class11621 {
   private static String[] L;
   public static Object N_0 = new class11621()::N;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object y_0 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(30.0F, Float.POSITIVE_INFINITY))
      .y(-16119286)
      .N(4.0F)
      .N(class09983.BORDER_BOX)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F)
      .B(4.0F)
      .v(10.0F)
      .L(class09662.N(-16777216, 0.25F))
      .N(class09975.COLUMN)
      .l(1.0F)
      .y(var0 -> var0.l(0.0F))
      .N(class09994.s((class09743)class11644.N_0));
   public static Object y_1 = class09991.N()
      .N(class09962.y(142.0F, Float.POSITIVE_INFINITY))
      .y(class09962.y(30.0F))
      .y(class09973.CENTER)
      .N(4.0F)
      .N(class09983.BORDER_BOX)
      .Z(6.0F)
      .L(var0 -> var0.y(-15592942));
   public static Object y_2 = class09991.N((class09991)y_1, class09991.N().y(-15592942));
   public static Object y_3 = class09991.N(class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object y_4;
   public static Object y_5 = class11629.N();
   public static Object y_6;

   private static void M() {
      N_1 = 30;
      N_2 = 4;
      N_3 = 1;
      N_4 = 4;
      y_6 = L[3];
   }

   private class11621() {
      super();
   }

   static {
      N();
      y();
      M();
      class09991 class09991 = class09991.N();
      y_4 = class09991.N(class09991.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
   }

   private static void y() {
      L = new String[4];
      L[0] = "entryListMount";
      L[1] = "entryListCatcher";
      L[2] = "entryListPanel";
      L[3] = "entryListAnchor";
   }

   private class09798 N(class11851 var1, class09809 var2) {
      boolean flag = var1.N().L();
      String s = "entryListAnchor" + System.identityHashCode(var1.N());
      class09991 class09991x = class09991.N().N(class09969.FLOATING).U(var1.y()).u(0.0F, 0.0F);
      class09991 class09991x = var1.L() != null ? class09991.N((class09991)y_0, class09991.N().N(class09962.y(var1.L()))) : (class09991)y_0;
      return class11629.N((class09991)y_5, var5x -> {
         var5x.N(L[0]);
         var5x.N_3(class09991x, var1xx -> var1xx.N(s));
         if (flag) {
            var5x.y(class11629.N(L[1], 2000, () -> var1.N().N(false)));
            var5x.N_3(class09991.N(class09991, class11629.N(s, 0.0F, 2001)), var1xx -> {
               var1xx.N(L[2]);

               for (class11535 class11535 : var1.i()) {
                  var1xx.N_3(class11535.U() ? (class09991)y_2 : (class09991)y_1, var2xx -> {
                     var2xx.N(class12020.N(class11535.E()), class11535.U() ? (class09991)y_4 : (class09991)y_3);
                     var2xx.N_1(var2xxx -> {
                        var1.u().accept(class11535);
                        var1.N().N(false);
                     });
                  });
               }
            });
         }
      });
   }

   private static void N() {
   }
}
