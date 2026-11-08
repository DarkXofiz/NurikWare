package NurikWare;

import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;

public class class11642 {
   public static Object N_0 = class09991.N().N(class09975.ROW).N(class09962.N()).y(class09962.N());

   private class11642() {
      super();
   }

   static {
      N();
   }

   public static class09798 y(class01028 var0, int var1, class09079 var2, int var3) {
      return N(N(var0, var1, var2, var3));
   }

   public static List<class09798> y(class00392 var0, int var1, class09079 var2, int var3) {
      class11630 class11630 = new class11630(var1, var2, var3);
      var0.N((var1x, var2x) -> {
         class11630.N(var1x, var2x);
         return Optional.empty();
      }, class00405.N);
      return class11630.N();
   }

   public static List<class09798> y(class00392 var0, int var1, int var2) {
      return y(var0, var1, class09079.REGULAR, var2);
   }

   public static class09798 y(class01028 var0, int var1, int var2) {
      return y(var0, var1, class09079.REGULAR, var2);
   }

   private static class09798 N(List<class09798> var0) {
      return class09778.N((class09991)N_0, var1 -> var1.N(var0));
   }

   private static void N() {
   }

   public static class09798 N(class00392 var0, int var1, class09079 var2, int var3) {
      return N(y(var0, var1, var2, var3));
   }

   public static List<class09798> N(class01028 var0, int var1, int var2) {
      return N(var0, var1, class09079.REGULAR, var2);
   }

   public static List<class09798> N(class01028 var0, int var1, class09079 var2, int var3) {
      class11630 class11630 = new class11630(var1, var2, var3);
      var0.accept((var1x, var2x, var3x) -> {
         class11630.N(var2x, var3x);
         return true;
      });
      return class11630.N();
   }

   public static class09798 N(class00392 var0, int var1, int var2) {
      return N(var0, var1, class09079.REGULAR, var2);
   }
}
