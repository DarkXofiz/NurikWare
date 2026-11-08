package NurikWare;

import java.util.List;

public final class class09923 {
   private class09923() {
      super();
   }

   public static void N(List<class09935> var0, class09911 var1) {
      int i = 0;

      for (int j = var0.size(); i < j; i++) {
         N((class09935)var0.get(i), var1);
      }
   }

   private static void N(class09935 var0, class09911 var1) {
      switch (var0) {
         case class09909 class09909:
            var1.N(class09909.N());
            break;
         case class09919 class09919:
            var1.N(class09919.N(), class09919.y(), class09919.L(), class09919.u(), class09919.i(), class09919.R());
            N(class09919.M(), var1);
            var1.R();
            break;
         case class09903 class09903:
            var1.N(class09903.N(), class09903.y(), class09903.L(), class09903.u());
            N(class09903.i(), var1);
            var1.M();
            break;
         case class09934 class09934:
            var1.N(class09934.N());
            N(class09934.y(), var1);
            var1.u();
            break;
         case class09922 class09922:
            if (var1.N(class09922.N(), class09922.y())) {
               N(class09922.L(), var1);
               var1.N(class09922.y());
            }
            break;
         case class09899 class09899:
            var1.N(class09899.N());
            N(class09899.y(), var1);
            var1.i();
            break;
         default:
            throw new MatchException(null, null);
      }
   }
}
