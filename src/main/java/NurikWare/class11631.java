package NurikWare;

public class class11631 {
   public static Object N_0 = new class11631()::N;
   public static Object N_1;

   private static void L() {
   }

   private class11631() {
      super();
   }

   static {
      L();
      y();
      N();
      class09991 class09991 = class09991.N()
         .u(150.0F, 30.0F)
         .y((Integer)class09181.L_1)
         .z(1.0F)
         .u((Integer)class09181.y_1)
         .i((Integer)class09181.N_4)
         .y(class09973.CENTER)
         .u(8.0F)
         .N(class09983.BORDER_BOX)
         .Z(8.0F);
      N_1 = class09991.N(class09991.u(var0 -> var0.i((Integer)class09181.N_0)), class09221.N(14, class09079.REGULAR));
   }

   private static void y() {
   }

   private class09798 N(class11858 var1, class09809 var2) {
      return class09778.i()
         .N(var1.u())
         .L(var1.i())
         .N((class09991)N_1)
         .i(class12020.N(var1.u()))
         .N(class09867.FOCUS, var1x -> var1.L().N(true))
         .N(class09867.BLUR, var1x -> {
            var1.L().N(false);
            class09904 class09904 = var1x.z();
            if (var1.y() != null && !var1.y().matcher(class09904.B()).matches()) {
               class09904.N(var1.i());
            }
         })
         .N(class09867.INPUT, var1x -> {
            class09844 class09844 = (class09844)var1x;
            String s = class09844.y();
            if (var1.y() == null || var1.y().matcher(s).matches()) {
               var1.N().accept(s);
            } else if (!s.isEmpty()) {
               var1x.z().N(class09844.N());
            }
         })
         .i();
   }

   private static void N() {
   }
}
