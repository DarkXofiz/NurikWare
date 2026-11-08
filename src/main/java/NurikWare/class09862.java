package NurikWare;

import java.util.Objects;

final class class09862 {
   static final Object N;
   private final class09862 y;
   private final class09804<?> L;
   private final Object u;

   class09862(class09862 var1, class09804<?> var2, Object var3) {
      super();
      this.y = var1;
      this.L = Objects.requireNonNull(var2, "context");
      this.u = var3;
   }

   Object N(class09804<?> var1) {
      for (class09862 class09862 = this; class09862 != null; class09862 = class09862.y) {
         if (class09862.L == var1) {
            return class09862.u;
         }
      }

      return N;
   }
}
