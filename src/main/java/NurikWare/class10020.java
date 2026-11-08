package NurikWare;

import java.util.ArrayList;

final class class10020 {
   private final class10052 N;
   private final class10040 y;
   private final ArrayList<class10021> L = new ArrayList<>();
   private final ArrayList<class10021> u = new ArrayList<>();
   private final ArrayList<class10021> i = new ArrayList<>();

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void L(class10021 var1, class10036 var2, float var3) {
      for (int ix = 0; ix < var1.u(); ix++) {
         class10021 class10021 = var1.N(ix);
         if (!class10048.N(class10021)) {
            class10061 class10061 = this.N.N(class10021);
            class09980 class09980 = class10021.o();
            class09962 class09962 = class10048.y(class09980, var2);
            float f = class10019.N(class10021) ? (var2 == class10036.WIDTH ? this.N.y() : this.N.L()) : var3;

            class10061.N(var2, switch (class10038.N[class09962.u().ordinal()]) {
               case 1 -> class10048.N(class09980, var2, class09962.M());
               case 2 -> this.N(class09980, var2, f);
               case 3 -> class10048.L(class09980, var2, f);
               case 4 -> class10048.L(class09980, var2, class10061.u(var2));
               default -> throw new MatchException(null, null);
            });
            this.y(class10021, var2);
         }
      }
   }

   class10020(class10052 var1) {
      super();
      this.N = var1;
      this.y = new class10040(var1);
   }

   private void y(class10021 var1, class10036 var2) {
      class10061 class10061 = this.N.N(var1);
      class10061.y(var2, class10061.L(var2));
      class10061.N(var2, this.N.N(var1, var2, class10061.L(var2)));
      class10061.i(var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void y(class10021 var1, class10036 var2, float var3) {
      for (int ix = 0; ix < var1.u(); ix++) {
         class10021 class10021 = var1.N(ix);
         if (class10048.N(class10021)) {
            class10061 class10061 = this.N.N(class10021);
            class09980 class09980 = class10021.o();
            class09962 class09962 = class10048.y(class09980, var2);

            float f = switch (class10038.N[class09962.u().ordinal()]) {
               case 1 -> Math.min(class10048.N(class09980, var2, class09962.M()), var3);
               case 2 -> class10048.i(class09980, var2, var3);
               case 3 -> class10048.L(class09980, var2, var3);
               case 4 -> class10048.L(class09980, var2, Math.min(class10061.u(var2), var3));
               default -> throw new MatchException(null, null);
            };
            class10061.N(var2, Math.max(class10061.N(var2), f));
            this.y(class10021, var2);
         }
      }
   }

   private float N(class09980 var1, class10036 var2, float var3) {
      float f = Math.max(0.0F, var3 - class10048.R(var1, var2));
      float f1 = class10048.y(var1, var2).i(f);
      return class10048.N(var1, var2, f1);
   }

   private static boolean N(class09980 var0, class10036 var1) {
      return var1 == class10036.HEIGHT && var0.y();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void N(class10021 var1, class10036 var2, float var3) {
      class10061 class10061 = this.N.N(var1);
      class09980 class09980 = var1.o();
      class09962 class09962 = class10048.y(class09980, var2);
      float f = class10061.u(var2);

      class10061.N(var2, switch (class10038.N[class09962.u().ordinal()]) {
         case 1 -> class10048.N(class09980, var2, class09962.M());
         case 2 -> class10048.i(class09980, var2, var3);
         case 3 -> class10048.L(class09980, var2, var3);
         case 4 -> class10048.R(class09980, var2, f);
         default -> throw new MatchException(null, null);
      });
      class10061.y(var2, class10061.L(var2));
      this.y(var1, var2);
   }

   void N(class10021 var1, class10036 var2) {
      this.N(var1, var2, false);
   }

   private void N(class10021 var1, class10036 var2, boolean var3) {
      if (var2 == class10036.WIDTH) {
         this.N.i().L++;
      } else {
         this.N.i().u++;
      }

      class09980 class09980 = var1.o();
      float f = class10048.N(this.N.N(var1), class09980, var2);
      if (class10048.N(class09980, var2)) {
         this.N(var1, class09980, var2, f, var3);
      } else {
         this.y(var1, var2, f);
      }

      this.L(var1, var2, f);
      boolean flag = var3 || N(class09980, var2);

      for (int ix = 0; ix < var1.u(); ix++) {
         class10021 class10021 = var1.N(ix);
         this.N(class10021, var2, flag);
      }
   }

   private void N(class10021 var1, class09980 var2, class10036 var3, float var4, boolean var5) {
      ArrayList<class10021> arraylist = this.L;
      ArrayList<class10021> arraylist1 = this.u;
      ArrayList<class10021> arraylist2 = this.i;
      arraylist.clear();
      arraylist1.clear();
      arraylist2.clear();
      int ix = 0;
      float f = 0.0F;
      float f1 = 0.0F;
      float f2 = 0.0F;

      for (int j = 0; j < var1.u(); j++) {
         class10021 class10021x = var1.N(j);
         if (class10048.N(class10021x)) {
            ix++;
            class10061 class10061 = this.N.N(class10021x);
            class09980 class09980x = class10021x.o();
            class09962 class09962 = class10048.y(class09980x, var3);
            if (class09962.u() == class09982.PERCENT) {
               arraylist2.add(class10021x);
               f1 += class09962.M();
               f2 += class10048.R(class09980x, var3);
            } else {
               f += class10061.L(var3);
            }

            if (class09962.u() != class09982.FIXED) {
               arraylist.add(class10021x);
            }

            if (class09962.u() == class09982.GROW) {
               arraylist1.add(class10021x);
            }
         }
      }

      if (ix != 0) {
         f += class10048.N(ix, var2.E());
         if (!arraylist2.isEmpty()) {
            float f4 = Math.max(0.0F, var4 - f);
            float f6 = Math.max(0.0F, f4 - f2);
            float f7 = f1 > 100.01F ? f1 : 100.0F;

            for (int k = 0; k < arraylist2.size(); k++) {
               class10021 class10021 = arraylist2.get(k);
               class10061 class10061x = this.N.N(class10021);
               class09980 class09980x = class10021.o();
               class09962 class09962x = class10048.y(class09980x, var3);
               float f3 = f6 * class09962x.M() / f7;
               class10061x.N(var3, class10048.N(class09980x, var3, f3));
               f += class10061x.L(var3);
            }
         }

         float f5 = var4 - f;
         if (f5 < -0.01F) {
            if (!var5 && !N(var2, var3)) {
               if (!arraylist.isEmpty()) {
                  this.y.N(arraylist, var3, f5);
               }
            }
         } else {
            if (f5 > 0.01F && !arraylist1.isEmpty()) {
               this.y.y(arraylist1, var3, f5);
            }
         }
      }
   }
}
