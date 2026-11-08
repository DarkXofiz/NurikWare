package NurikWare;

public class class11641 {
   private static String[] u;
   public static Object N_0 = new class11641()::N;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3 = class09991.N()
      .N(class09962.N(80.0F, 130.0F))
      .y(class09962.y(30.0F))
      .u(10.0F)
      .i(10.0F)
      .y((Integer)class09181.L_1)
      .z(1.0F)
      .u((Integer)class09181.y_1)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX)
      .Z(8.0F)
      .N(class09976.SELF)
      .y(true);
   public static Object N_4 = class09991.N(class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object N_5;

   private static void M() {
      N_1 = u[3];
      N_2 = u[4];
   }

   private class11641() {
      super();
   }

   static {
      N();
      y();
      M();
      class09991 class09991 = class09991.N();
      N_5 = class09991.N((class09991)N_4, class09991.i((Integer)class09181.N_0));
   }

   private static void y() {
      u = new String[5];
      u[0] = "listener";
      u[1] = "—";
      u[2] = "...";
      u[3] = "—";
      u[4] = "...";
   }

   private static void N(class09785<class11348> var0, class09785<Boolean> var1) {
      class11348 class11348 = (class11348)var0.L();
      if (class11348 != null) {
         class11938.L().N(class11348);
         var0.N(null);
         var1.N(false);
      }
   }

   private static void N(class11860 var0, class09785<class11348> var1) {
      N(var1, var0.u());
      class11348 class11348 = new class11348((var2x, var3) -> {
         var0.N().accept(var2x, var3);
         N(var1, var0.u());
      });
      var1.N(class11348);
      class11938.L().y(class11348);
      var0.u().N(true);
   }

   private static void N() {
   }

   private static String N(class12002 var0, int var1) {
      return var0 != null && !var0.y() ? class12013.N(var0, var1) : u[1];
   }

   private class09798 N(class11860 var1, class09809 var2) {
      class09785 class09785 = var2.N(u[0], (class11348)null);
      return class09778.N((class09991)N_3, var2x -> {
         boolean flag = var1.u().L();
         var2x.N(flag ? u[2] : N(var1.y(), var1.L()), flag ? (class09991)N_5 : (class09991)N_4);
         var2x.N(class09867.POINTER_DOWN, var2xx -> {
            if (((class09864)var2xx).L() == 0 && class09785.L() == null) {
               N(var1, class09785);
            }
         });
         var2x.N(class09867.FOCUS, var2xx -> N(var1, class09785));
      });
   }
}
