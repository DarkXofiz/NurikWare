package NurikWare;

final class class09878 {
   private class09878() {
      super();
   }

   private static boolean y(class10021 var0) {
      return var0.c().m() <= 0.0F ? false : var0.o().y();
   }

   static class09849 N(class10021 var0) {
      float f = 0.0F;
      class10021 class10021x = var0;

      for (class10021 class10021x = var0.X(); class10021x != null && !class10019.N(class10021x); class10021x = class10021x.X()) {
         if (y(class10021x) && class10019.y(class10021x)) {
            f -= Math.max(0.0F, class10021x.c().m());
         }

         class10021x = class10021x;
      }

      return new class09849(var0.c().y(), var0.c().L() + f, var0.c().u(), var0.c().i());
   }
}
