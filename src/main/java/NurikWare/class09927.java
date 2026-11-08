package NurikWare;

import java.util.ArrayList;
import java.util.List;

final class class09927 {
   class09927() {
      super();
   }

   private static void y(class10021 var0, List<class09935> var1, float var2, float var3) {
      float f = var0.c().y() + var2;
      float f1 = var0.c().L() + var3;
      float f2 = var0.c().u();
      float f3 = var0.c().i();
      if (!(f2 <= 1.0F) && !(f3 <= 1.0F)) {
         int i = N(var0.N());
         N(var1, f, f1, f2, f3, i);
      }
   }

   private static int N(String var0) {
      int i = var0 == null ? 0 : var0.hashCode();
      int j = 64 + (i >>> 16 & 127);
      int k = 64 + (i >>> 8 & 127);
      int l = 64 + (i & 127);
      return 0xFF000000 | j << 16 | k << 8 | l;
   }

   private static void N(List<class09935> var0, float var1, float var2, float var3, float var4, int var5) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         float f = Math.min(2.0F, Math.min(var3, var4));
         var0.add(new class09909(new class09925(var1, var2, var3, var4, class09889.N, class09662.N(var5, class09677.ALPHA, 34), var5, f, 0, 0.0F)));
      }
   }

   List<class09935> N(class10021 var1) {
      ArrayList arraylist = new ArrayList();
      if (var1 != null) {
         N(var1, arraylist, 0.0F, 0.0F);
      }

      return arraylist;
   }

   private static void N(class10021 var0, List<class09935> var1, float var2, float var3) {
      float f = var2;
      float f1 = var3;
      y(var0, var1, var2, var3);
      float f2 = class09918.N(var0);

      for (class10021 class10021 : class10047.N(var0)) {
         if (class10019.N(class10021)) {
            N(class10021, var1, 0.0F, 0.0F);
         } else {
            float f3 = f1;
            if (f2 > 0.0F && class10019.y(class10021)) {
               f3 = f1 - f2;
            }

            N(class10021, var1, f, f3);
         }
      }
   }
}
