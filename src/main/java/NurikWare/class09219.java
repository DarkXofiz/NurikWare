package NurikWare;

public class class09219 {
   public static Object N_0 = new class09219()::N;

   private class09219() {
      super();
   }

   static {
      N();
   }

   private class09798 N(class11844 var1, class09809 var2) {
      String s = var1.y().P().N();

      return switch (var1.y()) {
         case class11507 class11507 -> var2.N("$checkbox" + s, (class09788)class09188.N_0, var1);
         case class11533 class11533 -> var2.N("$input" + s, (class09788)class09206.N_0, var1);
         case class11527 class11527 -> var2.N("$hotkey" + s, (class09788)class09185.N_0, var1);
         case class11532 class11532 -> var2.N("$button" + s, (class09788)class09220.N_0, var1);
         case class11504 class11504 -> var2.N("$slider" + s, (class09788)class09178.N_0, var1);
         case class11525 class11525 -> var2.N("$rangeSlider" + s, (class09788)class09201.N_0, var1);
         case class11515 class11515 -> var2.N("$colorPicker" + s, (class09788)class09199.N_0, var1);
         case class11523 class11523 -> var2.N("$combo" + s, (class09788)class09208.N_0, var1);
         case class11517 class11517 -> var2.N("$selectable" + s, (class09788)class09204.N_0, var1);
         default -> class09778.N(class12020.N(var1.y().P()), (class09991)class09183.N_4);
      };
   }

   private static void N() {
   }
}
