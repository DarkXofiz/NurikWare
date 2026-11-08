package NurikWare;

import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

final class class10008 {
   private class10008() {
      super();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void N(class09996 var0, class10001 var1, class09989 var2, Object var3) {
      switch (class10000.N[var2.ordinal()]) {
         case 1:
            var0.N(var1.N((Float)var3));
            break;
         case 2:
            var0.N(var1.y((Float)var3));
            break;
         case 3:
            var0.N(var1.u((Float)var3));
            break;
         case 4:
            var0.N(var1.N((Integer)var3));
            break;
         case 5:
            var0.N(var1.y((Integer)var3));
            break;
         case 6:
            var0.N(var1.L((Integer)var3));
            break;
         case 7:
            var0.N(var1.u((Integer)var3));
            break;
         case 8:
            var0.N(var1.i((Integer)var3));
            break;
         case 9:
            var0.N(var1.R((Integer)var3));
            break;
         default:
            N(var0, var2, var3);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void N(class09996 var0, class09989 var1, Object var2) {
      switch (class10000.N[var1.ordinal()]) {
         case 10:
            var0.N((class09975)var2);
            break;
         case 11:
            var0.N((class09973)var2);
            break;
         case 12:
            var0.y((class09973)var2);
            break;
         case 13:
            var0.N((class09983)var2);
            break;
         case 14:
            var0.N((Float)var2, null, null, null);
            break;
         case 15:
            var0.N(null, (Float)var2, null, null);
            break;
         case 16:
            var0.N(null, null, (Float)var2, null);
            break;
         case 17:
            var0.N(null, null, null, (Float)var2);
            break;
         case 18:
            var0.N((class10009)var2);
            break;
         case 19:
            var0.N((class09965)var2);
            break;
         case 20:
            var0.N((Float)var2);
            break;
         case 21:
            var0.N((class09981)var2);
            break;
         case 22:
            var0.N((class09969)var2);
            break;
         case 23:
            class09966 class09966 = (class09966)var2;
            var0.N(class09966.N());
            var0.N(class09966.y());
            break;
         case 24:
            var0.y((Float)var2);
            break;
         case 25:
            var0.L((Float)var2);
            break;
         case 26:
            var0.N((String)var2);
            break;
         case 27:
            var0.N((class10003)var2);
            break;
         case 28:
            var0.E((Float)var2);
            break;
         case 29:
            var0.L((class09973)var2);
            break;
         case 30:
            var0.i((Boolean)var2);
            break;
         case 31:
            var0.R((Boolean)var2);
            break;
         case 32:
            var0.N((class09666)var2);
            break;
         case 33:
            var0.y((class09666)var2);
            break;
         case 34:
            var0.u((Float)var2);
            break;
         case 35:
            var0.i((Float)var2);
            break;
         case 36:
            var0.N((class09976)var2);
            break;
         case 37:
            var0.N((class09993)var2);
            break;
         case 38:
            var0.N((class09970)var2);
            break;
         case 39:
            var0.N((class09962)var2);
            break;
         case 40:
            var0.y((class09962)var2);
            break;
         case 41:
            var0.y((Boolean)var2);
            break;
         case 42:
            var0.L((Boolean)var2);
            break;
         case 43:
            var0.u((Boolean)var2);
            break;
         case 44:
            var0.y((Integer)var2);
            break;
         case 45:
            var0.R((Float)var2);
            break;
         case 46:
            var0.M((Float)var2);
            break;
         case 47:
            var0.L((Integer)var2);
            break;
         case 48:
            var0.u((Integer)var2);
            break;
         case 49:
            var0.i((Integer)var2);
            break;
         case 50:
            var0.B((Float)var2);
            break;
         case 51:
            var0.N((class09838)var2);
            break;
         case 52:
            var0.N((class09964)var2);
            break;
         case 53:
            var0.R((Integer)var2);
            break;
         case 54:
            var0.Z((Float)var2);
            break;
         case 55:
            var0.N((class09713)var2);
            break;
         case 56:
            var0.z((Float)var2);
            break;
         case 57:
            var0.U((Float)var2);
            break;
         case 58:
            var0.N((class09689)var2);
            break;
         default:
            throw new IllegalArgumentException("Unsupported direct style field: " + var1);
      }
   }

   private static class09980 N(class09980 var0, class09996 var1) {
      class09980 class09980 = var1.N();
      return class09980.equals(var0) ? var0 : class09980;
   }

   static class09980 N(class09980 var0, class09989 var1, Object var2) {
      class09996 class09996 = var0.R();
      N(class09996, var0.Y(), var1, Objects.requireNonNull(var2));
      return N(var0, class09996);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static class09980 N(class09980 var0, Map<class09989, Object> var1) {
      if (var1 != null && !var1.isEmpty()) {
         class09996 class09996 = var0.R();
         class10001 class10001 = var0.Y();
         float f = class10001.N();
         float f1 = class10001.y();
         float f2 = class10001.u();
         int i = class10001.i();
         int j = class10001.R();
         int k = class10001.M();
         int l = class10001.B();
         int i1 = class10001.Z();
         int j1 = class10001.z();
         boolean flag = false;

         for (Entry entry : var1.entrySet()) {
            Object object = Objects.requireNonNull(entry.getValue());
            switch (class10000.N[((class09989)entry.getKey()).ordinal()]) {
               case 1:
                  f = (Float)object;
                  flag = true;
                  break;
               case 2:
                  f1 = (Float)object;
                  flag = true;
                  break;
               case 3:
                  f2 = (Float)object;
                  flag = true;
                  break;
               case 4:
                  i = (Integer)object;
                  flag = true;
                  break;
               case 5:
                  j = (Integer)object;
                  flag = true;
                  break;
               case 6:
                  k = (Integer)object;
                  flag = true;
                  break;
               case 7:
                  l = (Integer)object;
                  flag = true;
                  break;
               case 8:
                  i1 = (Integer)object;
                  flag = true;
                  break;
               case 9:
                  j1 = (Integer)object;
                  flag = true;
                  break;
               default:
                  N(class09996, (class09989)entry.getKey(), object);
            }
         }

         if (flag) {
            class09996.N(new class10001(f, f1, f2, i, j, k, l, i1, j1));
         }

         return N(var0, class09996);
      } else {
         return var0;
      }
   }
}
