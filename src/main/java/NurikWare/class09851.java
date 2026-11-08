package NurikWare;

import java.util.List;
import java.util.Objects;

public final class class09851 {
   private final class09828 N;

   public class09851(class09781 var1) {
      super();
      this.N = class09828.N(Objects.requireNonNull(var1, "context"));
   }

   private class09854 y(class10021 var1, float var2, float var3, boolean var4) {
      class09841 class09841 = var1.K();
      if (class09841 != null && class09841.i()) {
         List<class10021> list = class09841.u();

         for (int i = list.size() - 1; i >= 0; i--) {
            class10021 class10021 = list.get(i);
            if (!N(class10021)) {
               class09854 class09854 = this.N(class10021, var2, var3, null, 0.0F, var4);
               if (class09854 != null) {
                  return class09854;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public class10021 y(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, false).L();
   }

   private static class09871 N(class09830 var0, float var1, float var2, float var3) {
      float f = var3 - var1;
      if (var2 >= var0.Z() && var2 <= var0.Z() + var0.U() && f >= var0.z() && f <= var0.z() + var0.E()) {
         return class09871.THUMB;
      } else {
         return var2 >= var0.N() && var2 <= var0.N() + var0.L() && f >= var0.y() && f <= var0.y() + var0.u() ? class09871.TRACK : class09871.NONE;
      }
   }

   private class09854 N(class10021 var1, class09980 var2, class09858 var3, float var4, float var5, float var6) {
      if (!var2.y()) {
         return null;
      } else {
         class09830 class09830 = this.N.u(var1);
         if (class09830 == null) {
            return null;
         } else {
            class09871 class09871 = N(class09830, var4, var5, var6);
            if (class09871 == class09871.NONE) {
               return null;
            } else {
               if (var2.d() != class09976.PARENT) {
                  class09858 class09858 = class09835.N(class09835.N(var1, var2), var4, var3);
                  if (class09858 != null && !class09858.N(var5, var6)) {
                     return null;
                  }
               }

               return new class09854(var1, class09871, var4);
            }
         }
      }
   }

   private class09854 N(class10021 var1, float var2, float var3, class09858 var4, float var5, boolean var6) {
      if (var1 != null && !var1.T()) {
         class09980 class09980 = var1.o();
         if (!class09980.g() || class09980.f() <= 0.0F || class09980.J()) {
            return null;
         } else if (var4 != null && !var4.N(var2, var3)) {
            return null;
         } else if (var1.u() > 0 && class09835.y(var1, var5, var2, var3)) {
            return null;
         } else {
            if (var6) {
               class09854 class09854x = this.N(var1, class09980, var4, var5, var2, var3);
               if (class09854x != null) {
                  return class09854x;
               }
            }

            class09858 class09858 = class09835.N(class09835.N(var1, class09980), var5, var4);
            if (class09858 == null || class09858.N()) {
               List<class10021> list = class10047.N(var1);
               float f = class09835.N(var1);

               for (int i = list.size() - 1; i >= 0; i--) {
                  class10021 class10021 = list.get(i);
                  if (!class10019.N(class10021)) {
                     float f1 = class09835.N(var5, class10021, f);
                     class09854 class09854 = this.N(class10021, var2, var3, class09858, f1, var6);
                     if (class09854 != null) {
                        return class09854;
                     }
                  }
               }
            }

            return class09835.N(var1, var5, var2, var3) ? new class09854(var1, class09871.NONE, var5) : null;
         }
      } else {
         return null;
      }
   }

   private static boolean N(class10021 var0) {
      for (class10021 class10021 = var0; class10021 != null; class10021 = class10021.X()) {
         if (class10021.T()) {
            return true;
         }
      }

      return false;
   }

   public class09854 N(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, true);
   }

   private class09854 N(class10021 var1, float var2, float var3, boolean var4) {
      if (var1 == null) {
         return class09854.N;
      } else {
         class09854 class09854x = this.y(var1, var2, var3, var4);
         if (class09854x != null) {
            return class09854x;
         } else {
            class09854 class09854x = this.N(var1, var2, var3, null, 0.0F, var4);
            return class09854x != null ? class09854x : class09854.N;
         }
      }
   }
}
