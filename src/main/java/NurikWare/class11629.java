package NurikWare;

import java.util.function.Consumer;

public class class11629 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;

   private static void L() {
      N_0 = 500;
      N_1 = 1000;
      N_2 = 1001;
      N_3 = 2000;
      N_4 = 2001;
      N_5 = 256;
   }

   private class11629() {
      super();
   }

   static {
      y();
      L();
   }

   private static void y() {
   }

   public static class09991 N() {
      return class09991.N().N(class09969.FLOATING).u(0.0F, 0.0F);
   }

   private static void N(Runnable var0) {
      if (var0 != null) {
         var0.run();
      }
   }

   public static class09798 N(String var0, int var1, Runnable var2) {
      return class09778.N(class09991.N().N(class09969.FIXED).R().N(var1), var2x -> var2x.N(var0).N(class09867.CLICK, var1xx -> {
         N(var2);
         var1xx.T();
      }).N(class09867.POINTER_DOWN, class09860::T).N(class09867.KEY_DOWN, var1xx -> {
         if (var1xx instanceof class09865 class09865 && class09865.y() && class09865.N() == 256) {
            N(var2);
            var1xx.T();
         }
      }));
   }

   public static class09798 N(class09991 var0, Consumer<class09784> var1) {
      return class09778.N(var0, var1x -> {
         N(var1x);
         var1.accept(var1x);
      });
   }

   public static class09991 N(String var0, float var1, int var2) {
      return class09991.N().N(class09969.FIXED).N(var0).N(class10003.BOTTOM, var1).L(class09973.START).i().N(var2);
   }

   private static void N(class09784 var0) {
      var0.N(class09867.CLICK, class09860::T);
      var0.N(class09867.POINTER_DOWN, class09860::T);
   }
}
