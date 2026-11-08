package NurikWare;

final class class09771 {
   private class09771() {
      super();
   }

   static boolean N(class10021 var0, class09715 var1) {
      if (var0 == null) {
         return false;
      } else {
         class09991 class09991 = var0.i();
         class10002 class10002 = class09991 == null ? class10002.N : class09991.E();
         if (class10002.N()) {
            return false;
         } else if (var1.y(var0)) {
            return true;
         } else {
            class09980 class09980x = var0.o();
            class09980 class09980x = class10002.N(class09980x);
            class09713 class09713 = class09980x.A();

            for (class09736 class09736 : class09736.values()) {
               if (class09736.N(class09980x, class09980x)) {
                  class09743 class09743 = class09713.N(class09736);
                  if (class09743.u() && class09736.y(class09980x, class09980x, class09743)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }
}
