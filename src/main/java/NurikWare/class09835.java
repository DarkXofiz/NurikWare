package NurikWare;

public final class class09835 {
   private static class09858 L(class10021 var0) {
      float f = var0.c().y();
      float f1 = var0.c().L();
      float f2 = f + Math.max(0.0F, var0.c().u());
      float f3 = f1 + Math.max(0.0F, var0.c().i());
      return new class09858(f, f1, f2, f3);
   }

   private class09835() {
      super();
   }

   private static class09858 i(class10021 var0) {
      class10021 class10021 = var0.X();
      if (class10021 == null) {
         return null;
      } else {
         float f = class10019.y(var0) ? N(class10021) : 0.0F;
         float f1 = class10021.c().y();
         float f2 = class10021.c().L() + f;
         float f3 = f1 + Math.max(0.0F, class10021.c().u());
         float f4 = f2 + Math.max(0.0F, class10021.c().i());
         return new class09858(f1, f2, f3, f4);
      }
   }

   private static class09858 u(class10021 var0) {
      float f = var0.c().R();
      float f1 = var0.c().M();
      float f2 = f + Math.max(0.0F, var0.c().B());
      float f3 = f1 + Math.max(0.0F, var0.c().Z());
      return new class09858(f, f1, f2, f3);
   }

   private static boolean y(class10021 var0) {
      class09937 class09937x = var0.c();
      int i = var0.O();
      if (class09937x.s() == i) {
         return class09937x.T();
      } else {
         float f = class09937x.y();
         float f1 = class09937x.L();
         float f2 = f + Math.max(0.0F, class09937x.u());
         float f3 = f1 + Math.max(0.0F, class09937x.i());
         class09980 class09980 = var0.o();
         boolean flag;
         if (class09980.d() != class09976.NONE) {
            flag = true;
         } else if (class09980.y()) {
            flag = false;
         } else {
            flag = true;
            int j = 0;

            for (int k = var0.u(); j < k; j++) {
               class10021 class10021 = var0.N(j);
               if (!class10019.N(class10021)) {
                  flag &= y(class10021);
                  class09937 class09937x = class10021.c();
                  f = Math.min(f, class09937x.b());
                  f1 = Math.min(f1, class09937x.j());
                  f2 = Math.max(f2, class09937x.v());
                  f3 = Math.max(f3, class09937x.n());
               }
            }
         }

         class09937x.N(f, f1, f2, f3, i, flag);
         return flag;
      }
   }

   public static boolean y(class10021 var0, float var1, float var2, float var3) {
      if (!y(var0)) {
         return false;
      } else {
         class09937 class09937 = var0.c();
         return var2 < class09937.b() || var2 > class09937.v() || var3 < class09937.j() + var1 || var3 > class09937.n() + var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class09858 N(class10021 var0, class09980 var1) {
      return switch (class09856.N[var1.d().ordinal()]) {
         case 1 -> var0.y() == class10049.INPUT ? u(var0) : L(var0);
         case 2 -> i(var0);
         default -> null;
      };
   }

   public static boolean N(class10021 var0, float var1, float var2, float var3) {
      float f = Math.max(0.0F, var0.c().u());
      float f1 = Math.max(0.0F, var0.c().i());
      if (!(f <= 0.0F) && !(f1 <= 0.0F)) {
         float f2 = var0.c().y();
         float f3 = var0.c().L() + var1;
         return var2 >= f2 && var2 <= f2 + f && var3 >= f3 && var3 <= f3 + f1;
      } else {
         return false;
      }
   }

   public static float N(float var0, class10021 var1, float var2) {
      return class10019.y(var1) ? var0 - var2 : var0;
   }

   public static class09858 N(class10021 var0, float var1) {
      float f = var0.c().y();
      float f1 = var0.c().L() + var1;
      float f2 = f + Math.max(0.0F, var0.c().u());
      float f3 = f1 + Math.max(0.0F, var0.c().i());
      return new class09858(f, f1, f2, f3);
   }

   public static class09858 N(class09858 var0, float var1, class09858 var2) {
      if (var0 == null) {
         return var2;
      } else {
         float f = var0.L() + var1;
         float f1 = var0.i() + var1;
         return var2 == null
            ? new class09858(var0.y(), f, var0.u(), f1)
            : new class09858(Math.max(var2.y(), var0.y()), Math.max(var2.L(), f), Math.min(var2.u(), var0.u()), Math.min(var2.i(), f1));
      }
   }

   public static float N(class10021 var0) {
      return !var0.o().y() ? 0.0F : Math.max(0.0F, var0.c().m());
   }
}
