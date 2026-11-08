package NurikWare;

final class class10051 {
   private final class10052 N;

   class10051(class10052 var1) {
      super();
      this.N = var1;
   }

   private class10063 y(class10021 var1, class09980 var2) {
      class09962 class09962x = var2.Q();
      class09962 class09962x = var2.O();
      boolean flag = class10048.N(class09962x);
      boolean flag1 = class10048.N(class09962x) && flag;
      if (!flag) {
         return new class10063(0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         class10056 class10056 = this.N.N(var1, var2);
         float f = class10048.N(class09962x) ? class10056.y() : 0.0F;
         float f1 = var2.a() == class09964.WORDS ? class10056.L() : class10056.N();
         return new class10063(class10056.N(), flag1 ? class10056.y() : 0.0F, f1, f);
      }
   }

   private static float N(class09980 var0, class10036 var1, float var2) {
      return class10048.M(var0, var1, var2);
   }

   private class10063 N(class10021 var1, class09980 var2) {
      return var1.y() == class10049.TEXT ? this.y(var1, var2) : new class10063(0.0F, 0.0F, 0.0F, 0.0F);
   }

   void N(class10021 var1) {
      this.N.i().y++;

      for (int i = 0; i < var1.u(); i++) {
         class10021 class10021x = var1.N(i);
         this.N(class10021x);
      }

      class09980 class09980 = var1.o();
      boolean flag1 = class09980.y();
      boolean flag = class09980.M() == class09975.ROW;
      int j = 0;
      float f;
      float f1;
      float f2;
      float f3;
      float f4;
      float f5;
      if (flag) {
         f = class10048.u(class09980, class10036.WIDTH);
         f1 = class10048.u(class09980, class10036.HEIGHT);
         f2 = class10048.u(class09980, class10036.WIDTH);
         f3 = class10048.u(class09980, class10036.HEIGHT);
         f4 = class10048.u(class09980, class10036.WIDTH);
         f5 = class10048.u(class09980, class10036.HEIGHT);

         for (int k = 0; k < var1.u(); k++) {
            class10021 class10021 = var1.N(k);
            if (class10048.N(class10021)) {
               j++;
               class10061 class10061xx = this.N.N(class10021);
               f += N(class10061xx, class10036.WIDTH);
               f1 = Math.max(f1, class10061xx.y + class10048.u(class09980, class10036.HEIGHT));
               if (!flag1) {
                  f2 += class10061xx.i;
                  f3 = Math.max(f3, class10061xx.R + class10048.u(class09980, class10036.HEIGHT));
                  f4 += class10061xx.y(class10036.WIDTH);
                  f5 = Math.max(f5, class10061xx.y(class10036.HEIGHT) + class10048.u(class09980, class10036.HEIGHT));
               }
            }
         }
      } else {
         f = class10048.u(class09980, class10036.WIDTH);
         f1 = class10048.u(class09980, class10036.HEIGHT);
         f2 = class10048.u(class09980, class10036.WIDTH);
         f3 = class10048.u(class09980, class10036.HEIGHT);
         f4 = class10048.u(class09980, class10036.WIDTH);
         f5 = class10048.u(class09980, class10036.HEIGHT);

         for (int l = 0; l < var1.u(); l++) {
            class10021 class10021xx = var1.N(l);
            if (class10048.N(class10021xx)) {
               j++;
               class10061 class10061 = this.N.N(class10021xx);
               f1 += class10061.y;
               f = Math.max(f, N(class10061, class10036.WIDTH) + class10048.u(class09980, class10036.WIDTH));
               if (!flag1) {
                  f3 += class10061.R;
                  f2 = Math.max(f2, class10061.i + class10048.u(class09980, class10036.WIDTH));
                  f5 += class10061.y(class10036.HEIGHT);
                  f4 = Math.max(f4, class10061.y(class10036.WIDTH) + class10048.u(class09980, class10036.WIDTH));
               }
            }
         }
      }

      if (j == 0) {
         class10063 class10063 = this.N(var1, class09980);
         f = class10048.u(class09980, class10036.WIDTH) + class10063.N();
         f1 = class10048.u(class09980, class10036.HEIGHT) + class10063.y();
         f2 = class10048.u(class09980, class10036.WIDTH) + class10063.L();
         f3 = class10048.u(class09980, class10036.HEIGHT) + class10063.u();
         f4 = f2;
         f5 = f3;
      } else if (flag) {
         float f6 = class10048.N(j, class09980.E());
         f += f6;
         f2 = flag1 ? class10048.u(class09980, class10036.WIDTH) : f2 + f6;
         f3 = flag1 ? class10048.u(class09980, class10036.HEIGHT) : f3;
         f4 = flag1 ? class10048.u(class09980, class10036.WIDTH) : f4 + f6;
         f5 = flag1 ? class10048.u(class09980, class10036.HEIGHT) : f5;
      } else {
         float f7 = class10048.N(j, class09980.E());
         f1 += f7;
         f2 = flag1 ? class10048.u(class09980, class10036.WIDTH) : f2;
         f3 = flag1 ? class10048.u(class09980, class10036.HEIGHT) : f3 + f7;
         f4 = flag1 ? class10048.u(class09980, class10036.WIDTH) : f4;
         f5 = flag1 ? class10048.u(class09980, class10036.HEIGHT) : f5 + f7;
      }

      class10061 class10061x = this.N.N(var1);
      class10061x.N = class10048.R(class09980, class10036.WIDTH, f);
      class10061x.y = class10048.R(class09980, class10036.HEIGHT, f1);
      class10061x.y(class10036.WIDTH, class10061x.N);
      class10061x.y(class10036.HEIGHT, class10061x.y);
      class10061x.i = class10048.M(class09980, class10036.WIDTH, f2);
      class10061x.R = class10048.M(class09980, class10036.HEIGHT, f3);
      class10061x.u(class10036.WIDTH, N(class09980, class10036.WIDTH, f4));
      class10061x.u(class10036.HEIGHT, N(class09980, class10036.HEIGHT, f5));
      if (class09980.Q().L()) {
         class10061x.i = Math.max(class10061x.i, f2);
         class10061x.u(class10036.WIDTH, Math.max(class10061x.y(class10036.WIDTH), f2));
      }

      class10061x.N = this.N.N(var1, class10036.WIDTH, class10061x.N);
      if (!class09980.Q().L()) {
         class10061x.i(class10036.WIDTH);
      }
   }

   private static float N(class10061 var0, class10036 var1) {
      return Math.max(var0.u(var1), var0.N(var1));
   }
}
