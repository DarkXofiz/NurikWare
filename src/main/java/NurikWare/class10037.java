package NurikWare;

import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public final class class10037 {
   private static final float N = 0.001F;
   private final class09715 y;
   private final Map<class10021, class10044> L = new IdentityHashMap<>();

   private class10037(class09715 var1) {
      super();
      this.y = Objects.requireNonNull(var1, "animationManager");
   }

   private static boolean y(class09962 var0, class09962 var1) {
      if (var0 != null && var1 != null && var0.u() == var1.u()) {
         return switch (var0.u()) {
            case FIT, GROW -> Float.isFinite(var0.i()) && Float.isFinite(var0.R()) && Float.isFinite(var1.i()) && Float.isFinite(var1.R());
            case FIXED, PERCENT -> Float.isFinite(var0.M()) && Float.isFinite(var1.M());
         };
      } else {
         return false;
      }
   }

   private float y(class10021 var1, class10036 var2, float var3) {
      return this.N(var1, var2, var3, false);
   }

   private static class09743 y(class09980 var0, class10036 var1) {
      return var0.A().N(N(var1));
   }

   private static class10023 N(class10044 var0, class10036 var1) {
      return var1 == class10036.WIDTH ? var0.N : var0.y;
   }

   private static boolean N(class09743 var0) {
      if (var0 == null || !var0.u()) {
         return false;
      } else if (var0 instanceof class09728) {
         return true;
      } else {
         return var0 instanceof class09815 ? ((class09815)var0).N(class09782.FLOAT) : false;
      }
   }

   private static class09736 N(class10036 var0) {
      return var0 == class10036.WIDTH ? class09736.WIDTH : class09736.HEIGHT;
   }

   public boolean N(float var1) {
      if (!(var1 <= 0.0F) && !this.L.isEmpty()) {
         boolean flag = false;

         for (Entry entry : this.L.entrySet()) {
            class10021 class10021 = (class10021)entry.getKey();
            class10044 class10044 = (class10044)entry.getValue();
            flag |= this.N(class10021, class10044.N, var1);
            flag |= this.N(class10021, class10044.y, var1);
         }

         return flag;
      } else {
         return false;
      }
   }

   private static boolean N(float var0, float var1) {
      return Math.abs(var0 - var1) <= 0.001F;
   }

   public static class10037 N(class09781 var0) {
      class09781 class09781 = Objects.requireNonNull(var0, "context");
      return class09781.N(class10037.class).orElseGet(() -> {
         class10037 class10037 = new class10037(class09715.N(class09781));
         class09781.N(class10037.class, class10037);
         return class10037;
      });
   }

   private static boolean N(class09962 var0, class09962 var1) {
      if (var0 != null && var1 != null && var0.u() == var1.u() && !Objects.equals(var0, var1)) {
         return switch (var1.u()) {
            case FIT, GROW -> !y(var0, var1);
            default -> false;
         };
      } else {
         return false;
      }
   }

   private boolean N(class10021 var1, class10023 var2, float var3) {
      if (var2.i == null) {
         return false;
      } else {
         boolean flag = var2.i.N(var3);
         var2.L = var2.i.y();
         if (var2.i.N()) {
            var2.L = var2.u;
            var2.i = null;
            flag = true;
         }

         if (flag) {
            var1.i(2);
         }

         return flag;
      }
   }

   private float N(class10021 var1, class10036 var2, float var3, boolean var4) {
      class10044 class10044 = this.L.get(var1);
      if (class10044 == null) {
         return var3;
      } else {
         class10023 class10023 = N(class10044, var2);
         class10023.N = true;
         class10023.y = class10048.y(var1.o(), var2);
         class10023.L = var3;
         class10023.u = var3;
         class10023.i = null;
         class10023.R = var4;
         return var3;
      }
   }

   private static boolean N(class09980 var0, class10036 var1) {
      class09962 class09962 = class10048.y(var0, var1);
      return class09962.u() == class09982.FIT || class09962.u() == class09982.GROW;
   }

   float N(class10021 var1, class10036 var2, float var3) {
      if (var1 == null) {
         return var3;
      } else {
         class09980 class09980 = var1.o();
         if (!N(class09980, var2)) {
            return this.y(var1, var2, var3);
         } else {
            class09743 class09743 = y(class09980, var2);
            if (!N(class09743)) {
               return this.y(var1, var2, var3);
            } else {
               class10023 class10023 = N(this.L.computeIfAbsent(var1, var0 -> new class10044()), var2);
               class09962 class09962x = class10048.y(class09980, var2);
               if (!class10023.N) {
                  class10023.N = true;
                  class10023.y = class09962x;
                  class10023.L = var3;
                  class10023.u = var3;
                  return var3;
               } else {
                  class09962 class09962x = class10023.y;
                  boolean flag = N(class09962x, class09962x);
                  boolean flag1 = N(class09962x, class09962x, class10023.u, var3);
                  boolean flag2 = this.y.L(var1);
                  boolean flag3 = !flag && flag1 && (flag2 || class10023.R);
                  class10023.R = flag2;
                  if (flag3) {
                     return this.N(var1, var2, var3, flag2);
                  } else {
                     boolean flag4 = class10023.i != null || flag || flag1;
                     class10023.y = class09962x;
                     if (!flag4) {
                        return this.N(var1, var2, var3, flag2);
                     } else if (N(class10023.u, var3) && class10023.i == null) {
                        class10023.L = var3;
                        return var3;
                     } else if (class10023.i != null) {
                        if (!N(class10023.u, var3)) {
                           class10023.i = class10039.N(N(var2), class09743, class10023.L, var3);
                           class10023.u = var3;
                        }

                        return class10023.L;
                     } else if (N(class10023.L, var3)) {
                        class10023.u = var3;
                        return var3;
                     } else {
                        class10023.i = class10039.N(N(var2), class09743, class10023.L, var3);
                        class10023.u = var3;
                        return class10023.L;
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean N(class09962 var0, class09962 var1, float var2, float var3) {
      return var1 != null && Objects.equals(var0, var1) && !N(var2, var3) ? var1.u() == class09982.FIT || var1.u() == class09982.GROW : false;
   }

   public void N(class10021 var1) {
      if (var1 != null) {
         ArrayDeque arraydeque = new ArrayDeque();
         arraydeque.push(var1);

         while (!arraydeque.isEmpty()) {
            class10021 class10021 = (class10021)arraydeque.pop();
            this.L.remove(class10021);

            for (int i = 0; i < class10021.u(); i++) {
               arraydeque.push(class10021.N(i));
            }
         }
      }
   }
}
