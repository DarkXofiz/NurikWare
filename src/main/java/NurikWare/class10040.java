package NurikWare;

import java.util.ArrayList;
import java.util.List;

final class class10040 {
   private final class10052 N;
   private final ArrayList<class10021> y = new ArrayList<>();
   private float[] L = new float[0];

   class10040(class10052 var1) {
      super();
      this.N = var1;
   }

   void y(List<class10021> var1, class10036 var2, float var3) {
      ArrayList<class10021> arraylist = this.y;
      arraylist.clear();
      arraylist.addAll(var1);

      while (var3 > 0.01F && !arraylist.isEmpty()) {
         float f = Float.MAX_VALUE;
         float f1 = Float.MAX_VALUE;
         float f2 = var3;

         for (class10021 class10021x : arraylist) {
            float f3 = this.N.N(class10021x).L(var2);
            if (!class10048.N(f3, f)) {
               if (f3 < f) {
                  f1 = f;
                  f = f3;
               }

               if (f3 > f) {
                  f1 = Math.min(f1, f3);
                  f2 = f1 - f;
               }
            }
         }

         f2 = Math.min(f2, var3 / arraylist.size());

         for (int i = 0; i < arraylist.size(); i++) {
            class10021 class10021x = arraylist.get(i);
            class10061 class10061 = this.N.N(class10021x);
            float f4 = class10061.L(var2);
            if (class10048.N(f4, f)) {
               float f5 = class10048.u(class10021x.o(), var2, class10061.N(var2));
               float f6 = f4 + f2;
               if (f6 >= f5) {
                  f6 = f5;
                  arraylist.remove(i--);
               }

               class10061.N(var2, f6);
               var3 -= f6 - f4;
            }
         }
      }
   }

   void N(List<class10021> var1, class10036 var2, float var3) {
      ArrayList<class10021> arraylist = this.y;
      arraylist.clear();
      arraylist.addAll(var1);
      if (this.L.length < arraylist.size()) {
         this.L = new float[arraylist.size()];
      }

      while (var3 < -0.01F && !arraylist.isEmpty()) {
         float f = 0.0F;

         for (class10021 class10021xx : arraylist) {
            f += this.N.N(class10021xx).L(var2);
         }

         if (f <= 0.01F) {
            break;
         }

         float f5 = -var3;
         float f6 = 0.0F;
         boolean flag = false;
         float[] afloat = this.L;

         for (int i = 0; i < arraylist.size(); i++) {
            class10021 class10021x = arraylist.get(i);
            class10061 class10061x = this.N.N(class10021x);
            float f1 = class10061x.L(var2);
            float f2 = class10061x.y(var2);
            float f3 = f5 * (f1 / f);
            float f4 = Math.max(f2, f1 - f3);
            if (f4 <= f2 + 0.01F) {
               flag = true;
            }

            afloat[i] = f4;
            f6 += f1 - f4;
         }

         for (int j = 0; j < arraylist.size(); j++) {
            this.N.N(arraylist.get(j)).N(var2, afloat[j]);
         }

         var3 += f6;
         if (f6 <= 0.01F || !flag) {
            break;
         }

         for (int k = 0; k < arraylist.size(); k++) {
            class10021 class10021 = arraylist.get(k);
            class10061 class10061 = this.N.N(class10021);
            if (class10048.N(class10061.L(var2), class10061.y(var2))) {
               arraylist.remove(k--);
            }
         }
      }
   }
}
