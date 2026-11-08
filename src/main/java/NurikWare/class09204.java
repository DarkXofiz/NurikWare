package NurikWare;

import java.util.List;

public class class09204 {
   private static String[] u;
   public static Object N_0 = (class09788<class11844>)(var0, var1) -> class09778.N(
      (class09991)class09183.N_3,
      var2 -> {
         class11536<?> class11536 = var0.y();
         class09785 class09785 = var1.N("opened" + class11536.P().N(), false);
         var2.N(class12020.N(var0.y().P()), class09785.L() ? (class09991)class09183.N_5 : (class09991)class09183.N_4);
         var2.y(
            var1.N(
               u[0], (class09788<class11835>)class11615.N_0, new class11835((List<? extends class11535>)class11536.L(), class11536.i(), class09785, var2x -> {
                  class11536.y(var2x);
                  var0.N().y();
               })
            )
         );
      }
   );

   private class09204() {
      super();
   }

   static {
      N();
      u();
   }

   private static void u() {
   }

   private static void N() {
      u = new String[1];
      u[0] = "selectable";
   }
}
