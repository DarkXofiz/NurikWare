package NurikWare;

import java.util.ArrayList;
import java.util.List;
import org.joml.Vector4f;

final class class09929 {
   private final class09917 N;
   private final class10007 y;

   class09929(class09917 var1, class10007 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   private static class09924 N(class10021 var0, class09980 var1) {
      if (!class09897.N(var1)) {
         return null;
      } else {
         float f = var0.c().u();
         float f1 = var0.c().i();
         if (!(f <= 0.0F) && !(f1 <= 0.0F)) {
            float f2 = Math.max(0.0F, var1.m());
            return new class09907(
               var0.c().y(), var0.c().L(), f, f1, var1.q(), -1, new Vector4f(var1.W().u() + f2, var1.W().i() + f2, var1.W().R() + f2, var1.W().M() + f2)
            );
         } else {
            return null;
         }
      }
   }

   private static void N(class10021 var0, class09980 var1, List<class09924> var2, List<class09924> var3, List<class09924> var4) {
      class09924 class09924 = N(var0, var1);
      if (class09924 != null) {
         var2.add(class09924);
      }

      if (var0.y() != class10049.CANVAS) {
         int i = var1.o();
         boolean flag = class09662.R(i);
         float f = var1.m();
         int j = var1.e();
         boolean flag1 = f > 0.0F && class09662.R(j);
         float f1 = var1.K();
         int k = f1 > 0.01F ? var1.V() : 0;
         boolean flag2 = f1 > 0.01F && class09662.R(k);
         if (flag || flag1 || flag2) {
            class09981 class09981 = var1.P();
            float f2 = flag1 && class09981 == class09981.OUTSIDE ? f : 0.0F;
            float f3 = var0.c().y() + f2;
            float f4 = var0.c().L() + f2;
            float f5 = Math.max(0.0F, var0.c().u() - f2 * 2.0F);
            float f6 = Math.max(0.0F, var0.c().i() - f2 * 2.0F);
            float f7 = flag1 && class09981 == class09981.INSIDE ? f : 0.0F;
            Vector4f vector4f = new Vector4f(var1.W().u() + f7, var1.W().i() + f7, var1.W().R() + f7, var1.W().M() + f7);
            var2.add(new class09925(f3, f4, f5, f6, vector4f, flag ? i : 0, flag1 ? j : 0, flag1 ? f : 0.0F, class09981, k, flag2 ? f1 : 0.0F));
            if (flag1 && class09981 == class09981.INSIDE) {
               if (class09924 != null) {
                  var3.add(class09924);
               }

               if (flag || flag2) {
                  var3.add(new class09925(f3, f4, f5, f6, vector4f, flag ? i : 0, 0, 0.0F, class09981, k, flag2 ? f1 : 0.0F));
               }

               var4.add(new class09925(f3, f4, f5, f6, vector4f, 0, j, f, class09981, 0, 0.0F));
            }
         }
      }
   }

   private void N(class10021 var1, class09915 var2, List<class09924> var3) {
      if (var1.y() == class10049.CANVAS) {
         if (var1.U() != null && var1.c().u() > 0.0F && var1.c().i() > 0.0F) {
            var3.add(new class09891(var1.U(), var1.c().y(), var1.c().L(), var1.c().u(), var1.c().i()));
         }
      } else {
         class09980 class09980 = var1.o();
         float f = var1.c().R();
         float f1 = var1.c().M();
         float f2 = var1.c().B();
         float f3 = var1.c().Z();
         if (var1.y() == class10049.TEXT && !var1.B().isEmpty()) {
            String s = var1.c().E().isEmpty() ? var1.B() : var1.c().E();
            var3.add(N(s, f, f1, class09980.H(), class09980));
         } else if (var1.y() == class10049.INPUT) {
            this.N.N(var2, class09980, var3, f, f1, f2, f3);
         } else {
            if (var1.y() == class10049.TEXTURE && !var1.z().isEmpty()) {
               var3.add(new class09906(var1.z(), f, f1, f2, f3, class09980.H(), class09980.S()));
            }
         }
      }
   }

   private static class09924 N(String var0, float var1, float var2, int var3, class09980 var4) {
      float f = var4.F();
      int i = var4.p();
      return (class09924)(f > 0.0F && class09662.R(i)
         ? new class09931(var0, var1, var2, var3, var4.c(), var4.X(), i, f)
         : new class09902(var0, var1, var2, var3, var4.c(), var4.X()));
   }

   void N(class10021 var1, class09980 var2, class09830 var3, class09915 var4, class09887 var5, int var6, int var7, int var8, int var9, int var10) {
      ArrayList arraylist = new ArrayList(2);
      ArrayList arraylist1 = new ArrayList(2);
      ArrayList arraylist2 = new ArrayList(1);
      N(var1, var2, arraylist, arraylist1, arraylist2);
      ArrayList arraylist3 = new ArrayList(4);
      this.N(var1, var4, arraylist3);
      ArrayList arraylist4 = new ArrayList(2);
      this.y.N(var1, var2, var3, arraylist4);
      class09926 class09926 = N(var2, var5);
      var1.q().N(N(arraylist), N(arraylist1), N(arraylist2), N(arraylist3), N(arraylist4), class09926, var6, var7, var8, var9, var10);
   }

   private static class09926 N(class09980 var0, class09887 var1) {
      if (var0.d() != class09976.SELF || !var0.W().y()) {
         return null;
      } else if (var1 != null && var1.N()) {
         float f = N(var0);
         Vector4f vector4f = new Vector4f(var0.W().u() + f, var0.W().i() + f, var0.W().R() + f, var0.W().M() + f);
         return new class09893(var1.y(), var1.L(), var1.u() - var1.y(), var1.i() - var1.L(), vector4f);
      } else {
         return null;
      }
   }

   static float N(class09980 var0) {
      return var0.m() > 0.0F && class09662.R(var0.e()) && var0.P() == class09981.INSIDE ? var0.m() : 0.0F;
   }

   private static List<class09935> N(List<class09924> var0) {
      if (var0.isEmpty()) {
         return List.of();
      } else {
         ArrayList arraylist = new ArrayList(var0.size());

         for (int i = 0; i < var0.size(); i++) {
            arraylist.add(new class09909((class09924)var0.get(i)));
         }

         return arraylist;
      }
   }
}
