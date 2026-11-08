package NurikWare;

final class class10022 {
   private final class10030 N;
   private final class10053 y;
   private final float L;
   private final boolean u;

   class10022(class10030 var1, class10053 var2, float var3, boolean var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   private void y(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6) {
      class10009 class10009 = var2.E();
      boolean flag = class10048.N(class10009);
      if (var2.M() == class09975.ROW) {
         this.N(var1, var2, var3, var4, var5, var6, class10009, flag);
      } else {
         this.y(var1, var2, var3, var4, var5, var6, class10009, flag);
      }
   }

   private void y(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6, class10009 var7, boolean var8) {
      int i = 0;
      float f = 0.0F;

      for (int j = 0; j < var1.u(); j++) {
         class10021 class10021x = var1.N(j);
         if (class10048.N(class10021x)) {
            i++;
            f += this.y.y(class10021x);
         }
      }

      if (i != 0) {
         float f2 = class10048.N(i, var7, var6 - f);
         f += class10048.N(i, f2);
         float f3 = var4;
         if (!var8) {
            f3 = var4 + class10048.y(var2.Z(), var6 - f);
         }

         for (int k = 0; k < var1.u(); k++) {
            class10021 class10021 = var1.N(k);
            if (class10048.N(class10021)) {
               float f1 = var3 + class10048.N(var2.B(), var5 - this.y.N(class10021));
               this.N(class10021, f1, f3);
               f3 += this.y.y(class10021) + f2;
            }
         }
      }
   }

   private float y(class10021 var1) {
      int i = 0;
      float f = 0.0F;

      for (int j = 0; j < var1.u(); j++) {
         class10021 class10021 = var1.N(j);
         if (class10048.N(class10021)) {
            i++;
            f += this.y.y(class10021);
         }
      }

      return f + class10048.N(i, var1.o().E());
   }

   private void N(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6, class10009 var7, boolean var8) {
      int i = 0;
      float f = 0.0F;

      for (int j = 0; j < var1.u(); j++) {
         class10021 class10021x = var1.N(j);
         if (class10048.N(class10021x)) {
            i++;
            f += this.y.N(class10021x);
         }
      }

      if (i != 0) {
         float f2 = class10048.N(i, var7, var5 - f);
         f += class10048.N(i, f2);
         float f3 = var3;
         if (!var8) {
            f3 = var3 + class10048.y(var2.B(), var5 - f);
         }

         for (int k = 0; k < var1.u(); k++) {
            class10021 class10021 = var1.N(k);
            if (class10048.N(class10021)) {
               float f1 = var4 + class10048.N(var2.Z(), var6 - this.y.y(class10021));
               this.N(class10021, f3, f1);
               f3 += this.y.N(class10021) + f2;
            }
         }
      }
   }

   private float N(float var1) {
      return class10048.L(var1, this.L);
   }

   void N(class10021 var1) {
      this.N(var1, 0.0F, 0.0F);
   }

   private void N(class10021 var1, float var2, float var3) {
      this.N.M++;
      class09980 class09980 = var1.o();
      class09937 class09937 = var1.c();
      float f = this.y.N(var1);
      float f1 = this.y.y(var1);
      class09937.N(f, f1);
      float f2 = this.N(var2);
      float f3 = this.N(var3);
      class09937.L(f2, f3);
      class09937.u(f2, f3);
      class09937.y(this.N(var2 + f) - f2, this.N(var3 + f1) - f3);
      float f4 = var2 + class10048.i(class09980, class10036.WIDTH);
      float f5 = var3 + class10048.i(class09980, class10036.HEIGHT);
      float f6 = Math.max(0.0F, f - class10048.u(class09980, class10036.WIDTH) - class10048.N(class09980));
      float f7 = Math.max(0.0F, f1 - class10048.u(class09980, class10036.HEIGHT));
      float f8 = this.N(f4);
      float f9 = this.N(f5);
      class09937.N(f8, f9, this.N(f4 + f6) - f8, this.N(f5 + f7) - f9);
      if (this.u) {
         this.N(var1, class09937);
         this.N(var1, class09937, class09980, f7);
      }

      this.N(var1, class09980, f4, f5, f6, f7);
   }

   private void N(class10021 var1, class09937 var2) {
      if (var1.y() == class10049.TEXT) {
         var2.N(Math.max(0.0F, var2.Z()));
         String s = this.y.L(var1);
         var2.N(s == null ? var1.B() : s);
      } else {
         var2.N(0.0F);
         var2.N("");
      }
   }

   private void N(class10021 var1, class09937 var2, class09980 var3, float var4) {
      float f = 0.0F;
      if (var3.y()) {
         f = Math.max(0.0F, this.y(var1) - var4);
      }

      var2.i(f, this.L);
   }

   private void N(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6) {
      this.y(var1, var2, var3, var4, var5, var6);

      for (int i = 0; i < var1.u(); i++) {
         class10021 class10021 = var1.N(i);
         if (!class10048.N(class10021)) {
            class09980 class09980 = class10021.o();
            if (class10019.N(class10021)) {
               this.N(class10021, class09980.j(), class09980.v());
            } else {
               this.N(class10021, var3 + class09980.j(), var4 + class09980.v());
            }
         }
      }
   }
}
