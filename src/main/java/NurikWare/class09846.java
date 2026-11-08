package NurikWare;

import java.util.Objects;

final class class09846 {
   private final class09794 N;

   class09846(class09794 var1) {
      super();
      this.N = Objects.requireNonNull(var1, "uiScalePolicy");
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class09830 y(class10021 var1) {
      if (!var1.o().y()) {
         return null;
      } else if (var1.o().k() == class09970.HIDDEN) {
         return null;
      } else {
         float f = var1.c().P();
         if (f <= 0.0F) {
            return null;
         } else {
            class10001 class10001 = var1.o().Y();
            float f1 = var1.c().B();
            float f2 = var1.c().Z();
            float f3 = class09693.N(class10001.N(), 0.0F, Math.max(0.0F, f1));
            if (!(f3 <= 0.0F) && !(f2 <= 0.0F)) {
               float f4 = switch (class09877.N[var1.o().k().ordinal()]) {
                  case 1 -> var1.c().R() + f1;
                  case 2 -> var1.c().R() + Math.max(0.0F, f1 - f3);
                  case 3 -> var1.c().R();
                  default -> throw new MatchException(null, null);
               };
               float f5 = this.N.N();
               float f6 = class09693.N(class10001.y(), 0.0F, f3 * 0.5F);
               float f7 = class09693.N(class10001.L(), 0.0F, f2 * 0.5F);
               float f8 = class09693.N(var1.c().M() + f7, f5);
               float f9 = class09693.N(Math.max(0.0F, f2 - f7 * 2.0F), f5);
               if (f9 <= 0.0F) {
                  return null;
               } else {
                  float f10 = class09693.N(f4 + f6, f5);
                  float f11 = class09693.N(Math.max(0.0F, f3 - f6 * 2.0F), f5);
                  float f12 = f2 + f;
                  float f13 = f12 <= 0.0F ? 1.0F : f2 / f12;
                  float f14 = f9 * f13;
                  f14 = class09693.N(class09693.N(f14, class10001.u(), f9), f5);
                  float f15 = Math.max(0.0F, f9 - f14);
                  float f16 = class09693.N(var1.c().m() / f * f15, 0.0F, f15);
                  float f17 = class09693.N(f8 + f16, f5);
                  return new class09830(f4, f8, f3, f9, f10, f8, f11, f9, f10, f17, f11, f14, f15);
               }
            } else {
               return null;
            }
         }
      }
   }

   class09830 N(class10021 var1) {
      if (var1 == null) {
         return null;
      } else {
         int i = var1.c().W();
         int j = var1.d();
         int k = this.N.y();
         if (var1.q().y(i, j, k)) {
            return var1.q().z();
         } else {
            class09830 class09830 = this.y(var1);
            var1.q().N(class09830, i, j, k);
            return class09830;
         }
      }
   }
}
