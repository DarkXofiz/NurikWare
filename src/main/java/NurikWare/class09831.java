package NurikWare;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

final class class09831 {
   private static final float N = 28.0F;
   private final class09794 y;
   private final Map<class10021, class09861> L = new IdentityHashMap<>();
   private class09833 u = class09833.N();

   private static boolean L(class10021 var0, float var1) {
      if (var0 != null && var0.o().y() && !(var0.c().P() <= 0.0F)) {
         float f = var0.c().m();
         float f1 = var0.c().P();
         return var1 > 0.0F && f > 0.0F || var1 < 0.0F && f < f1;
      } else {
         return false;
      }
   }

   class09831(class09794 var1) {
      super();
      this.y = Objects.requireNonNull(var1, "uiScalePolicy");
   }

   void y() {
      this.L.clear();
   }

   void y(class10021 var1) {
      if (!this.L.isEmpty()) {
         this.L.keySet().removeIf(var1x -> !N(var1, var1x));
      }
   }

   private boolean y(class10021 var1, float var2) {
      float f = var1.c().m() - var2 * 28.0F;
      if (!var1.c().R(f, this.y.N())) {
         return false;
      } else {
         var1.i(8);
         return true;
      }
   }

   private static boolean N(class10021 var0, class10021 var1) {
      return var0 != null && var1 != null ? class09828.N(var0, var1) && var1.o().y() && var1.c().P() > 0.0F : false;
   }

   private static float N(float var0, float var1, float var2) {
      return !(var1 <= 0.0F) && !(var2 <= 0.0F) ? var0 * (float)Math.exp(-var1 * var2) : var0;
   }

   void N(class09833 var1) {
      this.u = Objects.requireNonNull(var1, "nextOptions");
      if (!this.u.L()) {
         this.y();
      }
   }

   class09833 N() {
      return this.u;
   }

   void N(class10021 var1) {
      if (var1 != null) {
         this.L.remove(var1);
      }
   }

   private void N(class10021 var1, float var2, float var3) {
      this.L.computeIfAbsent(var1, var0 -> new class09861()).y(-var2 * var3);
   }

   boolean N(class10021 var1, float var2) {
      if (var1 != null && !this.L.isEmpty()) {
         if (!this.u.L()) {
            this.y();
            return false;
         } else {
            boolean flag = false;
            float f = Math.max(0.0F, var2);
            Iterator<Entry<class10021, class09861>> iterator = this.L.entrySet().iterator();

            while (iterator.hasNext()) {
               Entry entry = iterator.next();
               class10021 class10021 = (class10021)entry.getKey();
               class09861 class09861 = (class09861)entry.getValue();
               if (!N(var1, class10021)) {
                  iterator.remove();
               } else if (!(f <= 0.0F)) {
                  float f1 = class10021.c().P();
                  float f2 = class10021.c().m() + class09861.N() * f;
                  if (class10021.c().R(f2, this.y.N())) {
                     class10021.i(8);
                     flag = true;
                  }

                  float f3 = class10021.c().m();
                  if ((!(f3 <= 0.0F) || !(class09861.N() < 0.0F)) && (!(f3 >= f1) || !(class09861.N() > 0.0F))) {
                     float f4 = N(class09861.N(), this.u.i(), f);
                     if (Math.abs(f4) <= this.u.R()) {
                        iterator.remove();
                     } else {
                        class09861.N(f4);
                     }
                  } else {
                     iterator.remove();
                  }
               }
            }

            return flag;
         }
      } else {
         return false;
      }
   }

   boolean N(class10021 var1, class10021 var2, float var3) {
      if (var1 == null || var3 == 0.0F) {
         return false;
      } else if (var2 != null && !class09828.N(var2, var1)) {
         return false;
      } else {
         for (class10021 class10021 = var1; class10021 != null; class10021 = class10021.X()) {
            if (L(class10021, var3)) {
               if (!this.u.L()) {
                  return this.y(class10021, var3);
               }

               this.N(class10021, var3, this.u.u());
               return true;
            }

            if (class10021 == var2 || class10019.N(class10021)) {
               break;
            }
         }

         return false;
      }
   }
}
