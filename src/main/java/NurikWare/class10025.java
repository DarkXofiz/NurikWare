package NurikWare;

final class class10025 {
   private final class10052 N;

   class10025(class10052 var1) {
      super();
      this.N = var1;
   }

   void y(class10021 var1) {
      this.N.i().R++;

      for (int i = 0; i < var1.u(); i++) {
         class10021 class10021xx = var1.N(i);
         this.y(class10021xx);
      }

      class09980 class09980 = var1.o();
      class10061 class10061x = this.N.N(var1);
      boolean flag = class09980.y();
      if (class09980.M() == class09975.ROW) {
         float f3 = class10048.u(class09980, class10036.HEIGHT);
         float f4 = class10048.u(class09980, class10036.HEIGHT);
         float f5 = class10048.u(class09980, class10036.HEIGHT);
         int l = 0;

         for (int i1 = 0; i1 < var1.u(); i1++) {
            class10021 class10021 = var1.N(i1);
            if (class10048.N(class10021)) {
               l++;
               class10061 class10061x = this.N.N(class10021);
               f3 = Math.max(f3, class10061x.y + class10048.u(class09980, class10036.HEIGHT));
               if (!flag) {
                  f4 = Math.max(f4, class10061x.R + class10048.u(class09980, class10036.HEIGHT));
                  f5 = Math.max(f5, class10061x.y(class10036.HEIGHT) + class10048.u(class09980, class10036.HEIGHT));
               }
            }
         }

         if (l == 0) {
            this.N(var1, class10061x);
         } else {
            class10061x.y = class10048.R(class09980, class10036.HEIGHT, f3);
            class10061x.R = class10048.M(class09980, class10036.HEIGHT, flag ? class10048.u(class09980, class10036.HEIGHT) : f4);
            class10061x.u(class10036.HEIGHT, class10048.M(class09980, class10036.HEIGHT, flag ? class10048.u(class09980, class10036.HEIGHT) : f5));
            this.N(var1, class10061x);
         }
      } else {
         float f = class10048.u(class09980, class10036.HEIGHT);
         float f1 = class10048.u(class09980, class10036.HEIGHT);
         float f2 = class10048.u(class09980, class10036.HEIGHT);
         int j = 0;

         for (int k = 0; k < var1.u(); k++) {
            class10021 class10021x = var1.N(k);
            if (class10048.N(class10021x)) {
               j++;
               class10061 class10061x = this.N.N(class10021x);
               f += class10061x.y;
               if (!flag) {
                  f1 += class10061x.R;
                  f2 += class10061x.y(class10036.HEIGHT);
               }
            }
         }

         if (j == 0) {
            this.N(var1, class10061x);
         } else {
            float f6 = class10048.N(j, class09980.E());
            class10061x.y = class10048.R(class09980, class10036.HEIGHT, f + f6);
            class10061x.R = class10048.M(class09980, class10036.HEIGHT, flag ? class10048.u(class09980, class10036.HEIGHT) : f1 + f6);
            class10061x.u(class10036.HEIGHT, class10048.M(class09980, class10036.HEIGHT, flag ? class10048.u(class09980, class10036.HEIGHT) : f2 + f6));
            this.N(var1, class10061x);
         }
      }
   }

   void N(class10021 var1) {
      this.N.i().i++;

      for (int i = 0; i < var1.u(); i++) {
         class10021 class10021 = var1.N(i);
         this.N(class10021);
      }

      if (var1.y() == class10049.TEXT) {
         class09980 class09980 = var1.o();
         class10061 class10061 = this.N.N(var1);
         class10061.Z = var1.B();
         boolean flag = class10048.N(class09980.O());
         boolean flag1 = class09980.a() == class09964.WORDS;
         if (!flag && !flag1) {
            this.N(var1, class10061);
         } else {
            float f = Float.POSITIVE_INFINITY;
            if (flag1) {
               f = Math.max(0.0F, class10061.N - class10048.u(class09980, class10036.WIDTH) - class10048.N(class09980));
            }

            class10026 class10026 = this.N.N(var1, class09980, f);
            class10061.Z = class10026.N();
            if (!flag) {
               this.N(var1, class10061);
            } else {
               float f1 = class10048.u(class09980, class10036.HEIGHT) + class10026.L();
               class10061.y = class10048.R(class09980, class10036.HEIGHT, f1);
               class10061.R = class10048.M(class09980, class10036.HEIGHT, f1);
               class10061.u(class10036.HEIGHT, class10061.R);
               this.N(var1, class10061);
            }
         }
      }
   }

   private void N(class10021 var1, class10061 var2) {
      var2.y(class10036.HEIGHT, var2.y);
      var2.y = this.N.N(var1, class10036.HEIGHT, var2.y);
      var2.i(class10036.HEIGHT);
   }
}
