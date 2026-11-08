package NurikWare;

public class class09201 {
   private static String[] L;
   public static Object N_0 = (class09788<class11844>)(var0, var1) -> class09778.N(
      (class09991)class09183.N_3,
      var2 -> {
         class11536<?> class11536 = var0.y();
         class09785 class09785 = var1.N("rangeSliderWasMove" + class11536.P().N(), false);
         var2.N(class12020.N(var0.y().P()), class09785.L() ? (class09991)class09183.N_5 : (class09991)class09183.N_4);
         var2.y(
            var1.N(
               L[0],
               (class09788<class11871>)class11636.i_0,
               new class11871(class11536.i(), class11536.M(), class11536.R(), class11536.L(), class11536::N, class09785)
            )
         );
      }
   );

   private static void L() {
   }

   private class09201() {
      super();
   }

   static {
      N();
      u();
      L();
   }

   private static void u() {
      L = new String[1];
      L[0] = "rangeSlider";
   }

   private static void N() {
   }
}
