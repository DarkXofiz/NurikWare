package NurikWare;

public class class11600 {
   public static Object N_0 = new class11600()::N;
   public static Object N_1;
   public static Object N_2 = class09991.N()
      .N(class09962.N())
      .y(class09962.N())
      .N(12.0F)
      .B(8.0F)
      .y(class09973.CENTER)
      .N(class09975.ROW)
      .N(class09983.BORDER_BOX)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F);
   public static Object N_3;
   public static Object N_4 = class09991.N(class09991.N().i(-7171438), class09221.N(16, class09079.REGULAR));

   private class11600() {
      super();
   }

   static {
      N();
      i();
      class09991 class09991 = class09991.N();
      N_3 = class09991.N(class09991.i((Integer)class09181.N_0), class09221.N(16, class09079.REGULAR));
   }

   private static void i() {
      N_1 = 20;
   }

   private static void N() {
   }

   private class09798 N(class11837 var1, class09809 var2) {
      return class09778.N((class09991)N_2, var1x -> {
         var1x.N(class09867.POINTER_DOWN, class09860::T);
         if (!var1.L()) {
            var1x.N_1(var1xx -> var1.i().run());
         }

         var1x.L(var1xx -> {
            var1xx.L(var1.u());
            var1xx.N(class09991.N().u(20.0F, 20.0F).i(var1.y()));
         });
         if (var1.N() != null && !var1.N().isEmpty()) {
            var1x.N(var1.N(), var1.L() ? (class09991)N_4 : (class09991)N_3);
         }
      });
   }
}
