package NurikWare;

import java.util.ArrayDeque;
import java.util.Deque;

final class class09928 {
   private static final int N = 32;
   private final class10007 y;
   private final class09917 L;
   private final Deque<class09892> u = new ArrayDeque<>();
   private final float[] i = new float[128];
   private int R;
   private boolean M;

   class09916 L(class10021 var1) {
      class09892 class09892 = this.y();

      class09916 class09916;
      try {
         class09980 class09980 = var1.o();
         if (var1.y() != class10049.INPUT) {
            this.y(var1, class09892);
            if (class09980.d() != class09976.PARENT) {
               this.N(this.y.N(var1, class09980), class09892);
            }

            this.L(var1, class09892);
            return class09892.L();
         }

         class09916 class09916x = this.L.N(var1, class09980);
         class09892.N(class09916x.y(), class09916x.L(), class09916x.u(), class09916x.i());
         class09916 = class09892.L();
      } finally {
         this.N(class09892);
      }

      return class09916;
   }

   private void L(class10021 var1, class09892 var2) {
      float f = class09918.N(var1);

      for (class10021 class10021 : class10047.N(var1)) {
         if (!class10019.N(class10021)) {
            class09892 class09892 = this.y();

            try {
               this.N(class10021, class09892);
               if (class10019.y(class10021)) {
                  class09892.N(0.0F, -f);
               }

               var2.N(class09892);
            } finally {
               this.N(class09892);
            }
         }
      }
   }

   private static void L(class10021 var0, class09980 var1, class09892 var2) {
      if (!var2.y() && var1.d() != class09976.NONE) {
         class09887 class09887 = class09918.N(var0, var1);
         if (class09887 != null) {
            var2.y(class09887.y(), class09887.L(), class09887.u(), class09887.i());
         }
      }
   }

   class09928(class10007 var1, class09917 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private static void u(class10021 var0, class09892 var1) {
      var1.N(var0.c().R(), var0.c().M(), var0.c().B(), var0.c().Z());
   }

   class09916 y(class10021 var1) {
      class09892 class09892 = this.y();

      class09916 class09916;
      try {
         this.N(var1, class09892);
         class09916 = class09892.L();
      } finally {
         this.N(class09892);
      }

      return class09916;
   }

   private void y(class10021 var1, class09892 var2) {
      if (var1.y() == class10049.CANVAS) {
         if (var1.U() != null) {
            var2.N(var1.c().y(), var1.c().L(), var1.c().u(), var1.c().i());
         }
      } else if (var1.y() == class10049.TEXT && !var1.B().isEmpty()) {
         u(var1, var2);
      } else if (var1.y() == class10049.INPUT) {
         u(var1, var2);
      } else {
         if (var1.y() == class10049.TEXTURE && !var1.z().isEmpty()) {
            u(var1, var2);
         }
      }
   }

   private void y(class10021 var1, class09980 var2, class09892 var3) {
      if (var1.y() != class10049.CANVAS) {
         boolean flag = class09662.R(var2.o());
         boolean flag1 = var2.m() > 0.0F && class09662.R(var2.e());
         boolean flag2 = class09897.y(var2);
         if (flag || flag1 || flag2) {
            float f = Math.max(0.0F, var2.m());
            float f1 = flag1 && var2.P() == class09981.OUTSIDE ? f : 0.0F;
            float f2 = flag2 ? Math.max(0.0F, var2.K()) : 0.0F;
            float f3 = f1 + f2;
            var3.N(var1.c().y() - f3, var1.c().L() - f3, var1.c().u() + f3 * 2.0F, var1.c().i() + f3 * 2.0F);
         }
      }
   }

   private class09892 y() {
      class09892 class09892 = this.u.pollFirst();
      if (class09892 == null) {
         return new class09892();
      } else {
         class09892.N();
         return class09892;
      }
   }

   private void N(class10021 var1, class09980 var2, class09892 var3) {
      if (class09897.N(var2)) {
         var3.N(var1.c().y(), var1.c().L(), var1.c().u(), var1.c().i());
      }
   }

   private void N(class09830 var1, class09892 var2) {
      if (var1 != null) {
         var2.N(var1.i(), var1.R(), var1.M(), var1.B());
         var2.N(var1.Z(), var1.z(), var1.U(), var1.E());
      }
   }

   boolean N(class10021 var1) {
      this.M = true;
      this.R = 0;
      this.N(var1, 0.0F, 0.0F, true);
      return this.M && !this.N();
   }

   private void N(class10021 var1, float var2, float var3) {
      float f = var1.c().R() + var2;
      float f1 = var1.c().M() + var3;
      float f2 = var1.c().B();
      float f3 = var1.c().Z();
      if (!(f2 <= 0.0F) && !(f3 <= 0.0F)) {
         if (Float.isFinite(f) && Float.isFinite(f1) && Float.isFinite(f2) && Float.isFinite(f3)) {
            if (this.R >= 32) {
               this.M = false;
            } else {
               int ix = this.R * 4;
               this.i[ix] = f;
               this.i[ix + 1] = f1;
               this.i[ix + 2] = f + f2;
               this.i[ix + 3] = f1 + f3;
               this.R++;
            }
         }
      }
   }

   private void N(class10021 var1, class09892 var2) {
      class09980 class09980 = var1.o();
      if (class09980.g() && !(class09980.f() <= 0.0F)) {
         class09892 class09892 = this.y();

         try {
            class09830 class09830 = this.y.N(var1, class09980);
            this.N(var1, class09980, class09830, class09892);
            this.L(var1, class09892);
            L(var1, class09980, class09892);
            var2.N(class09892);
         } finally {
            this.N(class09892);
         }
      }
   }

   private boolean N(class10021 var1, class09980 var2, float var3, float var4) {
      class10049 class10049 = var1.y();
      if (class10049 == class10049.CANVAS) {
         return var1.U() == null;
      } else if (class09662.R(var2.o())) {
         return false;
      } else if (var2.m() > 0.0F && class09662.R(var2.e())) {
         return false;
      } else if (class09897.y(var2)) {
         return false;
      } else if (this.y.N(var1, var2, this.y.N(var1, var2))) {
         return false;
      } else if (class10049 == class10049.INPUT) {
         return false;
      } else {
         if (class10049 == class10049.TEXT && !var1.B().isEmpty()) {
            this.N(var1, var3, var4);
         } else if (class10049 == class10049.TEXTURE && !var1.z().isEmpty()) {
            this.N(var1, var3, var4);
         }

         return true;
      }
   }

   private static boolean N(class09980 var0) {
      return var0.f() > 0.0F && var0.f() < 1.0F || var0.C() > 0.0F;
   }

   private boolean N() {
      for (int ix = 0; ix < this.R; ix++) {
         int j = ix * 4;
         float f = this.i[j];
         float f1 = this.i[j + 1];
         float f2 = this.i[j + 2];
         float f3 = this.i[j + 3];

         for (int k = ix + 1; k < this.R; k++) {
            int l = k * 4;
            if (f < this.i[l + 2] && this.i[l] < f2 && f1 < this.i[l + 3] && this.i[l + 1] < f3) {
               return true;
            }
         }
      }

      return false;
   }

   private void N(class10021 var1, float var2, float var3, boolean var4) {
      if (this.M) {
         class09980 class09980 = var1.o();
         if (class09980.g() && !(class09980.f() <= 0.0F)) {
            if (!var4 && N(class09980)) {
               this.M = false;
            } else if (class09897.N(class09980)) {
               this.M = false;
            } else if (!this.N(var1, class09980, var2, var3)) {
               this.M = false;
            } else {
               float f = class09918.N(var1);

               for (class10021 class10021 : class10047.N(var1)) {
                  if (!class10019.N(class10021)) {
                     float f1 = var3 + (class10019.y(class10021) ? -f : 0.0F);
                     this.N(class10021, var2, f1, false);
                     if (!this.M) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private void N(class09892 var1) {
      this.u.push(var1);
   }

   private void N(class10021 var1, class09980 var2, class09830 var3, class09892 var4) {
      this.N(var1, var2, var4);
      this.y(var1, var2, var4);
      this.y(var1, var4);
      this.N(var3, var4);
   }
}
