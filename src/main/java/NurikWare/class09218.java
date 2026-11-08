package NurikWare;

public class class09218 {
   public static Object N_0 = new class09218()::N;
   public static Object N_1 = class09991.N().N(class09692.N(class09994.y((class09743)class11644.N_0), class09994.N((class09743)class11644.N_0)));
   public static Object N_2 = class09991.N().N(class09692.N(class09994.L((class09743)class11644.N_0)));
   public static Object N_3;
   public static Object N_4 = class09227.N(var0 -> class09991.N((class09991)N_3, (class09991)N_1, class09991.N().y(var0.y()).Z(12.0F).u(var0.u()).z(1.0F)));
   public static Object N_5 = class09991.N().u(24.0F, 24.0F);

   private class09218() {
      super();
   }

   static {
      N();
      R();
      class09991 class09991 = class09991.N()
         .N(class09962.y(229.0F))
         .y(class09962.y(50.0F))
         .u(20.0F)
         .B(20.0F)
         .N(class09983.BORDER_BOX)
         .Z(12.0F)
         .u(class11300.L(10205439, 0.0F));
      N_3 = class09991.N((class09991)N_1, class09991.y(class11300.L(4362239, 0.0F)).z(1.0F).y(class09973.CENTER));
   }

   private class09798 N(class11839 var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      boolean flag = var1.N() == var1.y().L();
      class09991 class09991 = class09991.N().i(flag ? class09211.M() : class11300.L(14606046, 76.0F));
      return class09778.N(
         flag ? ((class09227)N_4).N(class09211) : (class09991)N_3,
         var2x -> {
            var2x.N("tab" + var1.N().name());
            var2x.N(class09867.POINTER_DOWN, class09860::T);
            var2x.N_1(var1xx -> var1.y().N(var1.N()));
            var2x.L(var2xx -> var2xx.N("texture" + var1.u()).L("icon:menu/" + var1.u()).N(class09991.N(class09991, (class09991)N_2, (class09991)N_5)));
            var2x.y(
               var2xx -> var2xx.N("text" + var1.N().name())
                  .L(class12020.N(var1.L()))
                  .N(class09991.N(class09991, (class09991)N_2, class09221.N(20, class09079.REGULAR)))
            );
         }
      );
   }

   private static void N() {
   }

   private static void R() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
   }
}
