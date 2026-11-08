package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

final class class09972 {
   private static final int N = 1;
   private static final int y = 2;
   private static final int L = 4;
   private final class09917 u;
   private final class10007 i;
   private final class09929 R;
   private final class09897 M;
   private final class09890 B;
   private final class09928 Z;
   private class09887 z;

   private static boolean L(class09980 var0) {
      return var0.C() > 0.0F;
   }

   class09972(class09781 var1) {
      super();
      class09781 class09781 = Objects.requireNonNull(var1, "context");
      this.u = new class09917(class09781);
      this.i = new class10007(class09781);
      this.R = new class09929(this.u, this.i);
      this.M = new class09897(this.i);
      this.B = new class09890();
      this.Z = new class09928(this.i, this.u);
   }

   private static boolean u(class09980 var0) {
      return !var0.g() || var0.f() <= 0.0F;
   }

   private static boolean y(List<class10021> var0) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if (((class10021)iterator.next()).R(1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean y(class09980 var0) {
      return var0.f() > 0.0F && var0.f() < 1.0F;
   }

   private static List<class10021> N(List<class10021> var0) {
      boolean flag = false;

      for (class10021 class10021x : var0) {
         if (class10019.N(class10021x)) {
            flag = true;
            break;
         }
      }

      if (!flag) {
         return var0;
      } else {
         ArrayList arraylist = new ArrayList(var0.size());

         for (class10021 class10021x : var0) {
            if (!class10019.N(class10021x)) {
               arraylist.add(class10021x);
            }
         }

         return arraylist;
      }
   }

   private class09895 N(class10021 var1, class09895 var2, List<String> var3, class09896 var4) {
      if (var1.K() != null && var1.K().i()) {
         List<class10021> list = var1.K().u();
         if (list.isEmpty()) {
            return var2;
         } else {
            ArrayList arraylist = null;
            int ix = var2.y();

            for (class10021 class10021 : list) {
               class09895 class09895 = this.N(class10021, var3, var4, 0.0F, this.z);
               if (!class09895.N().isEmpty()) {
                  if (arraylist == null) {
                     arraylist = new ArrayList(var2.N().size() + list.size());
                     arraylist.addAll(var2.N());
                  }

                  arraylist.addAll(class09895.N());
                  ix += class09895.y();
               }
            }

            return arraylist == null ? var2 : new class09895(arraylist, ix);
         }
      } else {
         return var2;
      }
   }

   private static boolean N(class09916 var0, class09916 var1) {
      return var0.y() < var1.y() + var1.u() && var1.y() < var0.y() + var0.u() && var0.L() < var1.L() + var1.i() && var1.L() < var0.L() + var0.i();
   }

   private static boolean N(List<class09922> var0, class09916 var1) {
      for (int ix = 0; ix < var0.size(); ix++) {
         if (N(((class09922)var0.get(ix)).N(), var1)) {
            return true;
         }
      }

      return false;
   }

   private static int N(List<class09935> var0, List<class09922> var1, int var2) {
      if (var1 != null && !var1.isEmpty()) {
         int ix = var1.size();
         if (ix == 1) {
            var0.add((class09935)var1.get(0));
            var1.clear();
            return var2;
         } else {
            class09922 class09922x = (class09922)var1.get(0);
            int j = 0;

            for (int k = 0; k < ix; k++) {
               j += ((class09922)var1.get(k)).L().size();
            }

            ArrayList arraylist = new ArrayList(j);
            class09916 class09916x = class09922x.N();
            float f = class09916x.y();
            float f1 = class09916x.L();
            float f2 = class09916x.y() + class09916x.u();
            float f3 = class09916x.L() + class09916x.i();
            arraylist.addAll(class09922x.L());

            for (int l = 1; l < ix; l++) {
               class09922 class09922x = (class09922)var1.get(l);
               arraylist.addAll(class09922x.L());
               class09916 class09916x = class09922x.N();
               f = Math.min(f, class09916x.y());
               f1 = Math.min(f1, class09916x.L());
               f2 = Math.max(f2, class09916x.y() + class09916x.u());
               f3 = Math.max(f3, class09916x.L() + class09916x.i());
            }

            var0.add(new class09922(new class09916(f, f1, f2 - f, f3 - f1), class09922x.y(), arraylist));
            var1.clear();
            return var2;
         }
      } else {
         return 0;
      }
   }

   private static boolean N(class10021 var0, class09908 var1, int var2, int var3) {
      return !var0.R(1) && var1.N(var2, var3);
   }

   private static boolean N(class10021 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, List<class10021> var9) {
      boolean flag = var0.M(1);
      boolean flag1 = y(var9);
      return !flag && !flag1 && var0.q().N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static boolean N(class09980 var0, List<class10021> var1, boolean var2) {
      return var1.isEmpty() ? !var2 : var0.d() != class09976.NONE && !var2;
   }

   private static void N(class10021 var0, List<String> var1) {
      String s = var0.N();
      if (s != null && !s.isBlank()) {
         var1.add(s);
      }
   }

   private static boolean N(class10021 var0, int var1, int var2, int var3, int var4, int var5) {
      return !var0.M(1) && var0.q().N(var1, var2, var3, var4, var5);
   }

   private static class09895 N(class09908 var0) {
      return new class09895(var0.B(), var0.Z());
   }

   private int N(class10021 var1, class09980 var2, class09887 var3, float var4, class09887 var5) {
      float f = class09929.N(var2);
      boolean flag = f > 0.0F;
      boolean flag1 = var3 != null && var3.N();
      if (!flag1 && !flag) {
         return 0;
      } else {
         boolean flag2 = var2.d() == class09976.SELF;
         boolean flag3 = flag2 && flag1 && var2.W().y();
         boolean flag4 = flag1 && class09918.y(var3, var4, var5);
         boolean flag5 = false;
         boolean flag6 = false;
         boolean flag7 = var1.c().P() > 0.0F;
         boolean flag8 = flag2 && flag1 && (!flag4 || flag3) && !flag7;
         if (flag8 || flag) {
            class09916 class09916 = this.Z.L(var1);
            if (class09916.N()) {
               if (flag8) {
                  flag4 = true;
                  flag5 = flag3;
               }
            } else {
               float f1 = class09916.y();
               float f2 = class09916.L();
               float f3 = class09916.y() + class09916.u();
               float f4 = class09916.L() + class09916.i();
               if (flag8 && !flag4 && class09918.N(var3, f1, f2, f3, f4)) {
                  flag4 = true;
               }

               if (flag8 && flag3 && class09918.N(var3, var2.W().u() + f, var2.W().i() + f, var2.W().R() + f, var2.W().M() + f, f1, f2, f3, f4)) {
                  flag5 = true;
               }

               if (flag) {
                  flag6 = N(var1, var2, f, f1, f2, f3, f4);
               }
            }
         }

         byte b0 = 0;
         if (flag4) {
            b0 |= 1;
         }

         if (flag5) {
            b0 |= 2;
         }

         if (flag6) {
            b0 |= 4;
         }

         return b0;
      }
   }

   private static boolean N(class10021 var0, class09980 var1, float var2, float var3, float var4, float var5, float var6) {
      float f = var0.c().y();
      float f1 = var0.c().L();
      float f2 = Math.max(0.0F, var0.c().u());
      float f3 = Math.max(0.0F, var0.c().i());
      float f4 = f + var2;
      float f5 = f1 + var2;
      float f6 = f + Math.max(var2, f2 - var2);
      float f7 = f1 + Math.max(var2, f3 - var2);
      return !class09918.N(
         new class09887(f4, f5, Math.max(f4, f6), Math.max(f5, f7)), var1.W().u(), var1.W().i(), var1.W().R(), var1.W().M(), var3, var4, var5, var6
      );
   }

   private static class09895 N(class09908 var0, class09980 var1, class09887 var2, int var3, class09895 var4) {
      boolean flag = (var3 & 4) != 0;
      List<class09935> list = flag ? var0.L() : var0.y();
      List list1 = flag ? var0.u() : List.of();
      List<class09935> list2 = var0.i();
      List<class09935> list3 = var0.R();
      class09926 class09926 = (var3 & 2) != 0 ? null : var0.M();
      boolean flag1 = var1.d() != class09976.PARENT;
      boolean flag2 = var2 != null && var2.N() && (var3 & 1) == 0 && class09926 == null;
      int ix = list2.size() + var4.y() + (flag1 ? list3.size() : 0);
      int j = list.size() + ix + (flag1 ? 0 : list3.size()) + list1.size();
      ArrayList arraylist = new ArrayList(list.size() + list2.size() + var4.N().size() + list3.size() + list1.size() + 1);
      arraylist.addAll(list);
      if (ix > 0) {
         if (class09926 == null && !flag2) {
            arraylist.addAll(list2);
            arraylist.addAll(var4.N());
            if (flag1) {
               arraylist.addAll(list3);
            }
         } else {
            ArrayList arraylist1 = new ArrayList(list2.size() + var4.N().size() + (flag1 ? list3.size() : 0));
            arraylist1.addAll(list2);
            arraylist1.addAll(var4.N());
            if (flag1) {
               arraylist1.addAll(list3);
            }

            class09934 class09934 = class09926 != null ? new class09934(class09926, arraylist1) : null;
            if (flag2) {
               Object object = class09934 != null ? List.of(class09934) : arraylist1;
               arraylist.add(new class09903(var2.y(), var2.L(), var2.u() - var2.y(), var2.i() - var2.L(), (List<class09935>)object));
            } else {
               arraylist.add(class09934);
            }
         }
      }

      if (!flag1) {
         arraylist.addAll(list3);
      }

      arraylist.addAll(list1);
      return arraylist.isEmpty() ? class09895.N : new class09895(arraylist, j);
   }

   private class09895 N(class10021 var1, List<String> var2, class09896 var3, float var4, class09887 var5) {
      class09908 class09908 = var1.q();
      if (class09918.N(var5)) {
         return class09895.N;
      } else {
         int ix = class09908.y(var5, var4);
         int j = var1.O();
         if (N(var1, class09908, ix, j)) {
            var3.N++;
            return N(class09908);
         } else {
            class09980 class09980 = var1.o();
            class09830 class09830 = this.i.N(var1, class09980);
            List<class10021> list = class10047.N(var1);
            class09887 class09887x = class09918.N(var1, class09980);
            class09887 class09887x = class09918.N(class09887x, var4, var5);
            boolean flag = class09918.N(var5, var1, var4);
            if (N(class09980, list, flag)) {
               return class09895.N;
            } else if (u(class09980)) {
               return class09895.N;
            } else {
               class09915 class09915 = this.u.N(var1);
               int k = class09908.N(class09915);
               int l = class09908.N(class09887x);
               int i1 = class09908.N(class09887x, var4);
               int j1 = var1.G();
               int k1 = var1.c().W();
               int l1 = var1.w();
               int i2 = this.N(var1, class09980, class09887x, var4, var5);
               if (N(var1, j, j1, k1, l1, k, l, i1, i2, list)) {
                  var3.N++;
                  class09908.N(ix);
                  return N(class09908);
               } else {
                  var3.y++;
                  N(var1, var2);
                  if (!N(var1, j1, k1, l1, k, l)) {
                     this.R.N(var1, class09980, class09830, class09915, class09887x, j1, k1, l1, k, l);
                     var3.L++;
                  }

                  class09895 class09895x = this.N(N(list), var2, var3, var4, class09887x, class09918.N(var1));
                  if ((!flag || !this.M.N(var1, class09980, class09830, class09915)) && class09895x.y() == 0) {
                     return class09895.N;
                  } else {
                     class09895 class09895x = N(class09908, class09980, class09887x, i2, class09895x);
                     class09895x = this.N(var1, class09980, class09895x);
                     class09908.N(class09895x.N(), class09895x.y(), j, i1, i2, ix);
                     return N(class09908);
                  }
               }
            }
         }
      }
   }

   class09936 N(class10021 var1, float var2, float var3, class09770 var4, boolean var5) {
      if (var1 == null) {
         return class09936.N();
      } else {
         class09770 class09770 = var4 == null ? class09770.N : var4;
         class09896 class09896 = new class09896();
         ArrayList arraylist = new ArrayList();
         class09887 class09887 = class09918.N(var2, var3);
         this.z = class09887;
         class09895 class09895x = this.N(var1, arraylist, class09896, 0.0F, class09887);
         var1.I();
         class09895 class09895x = this.N(var1, class09895x, arraylist, class09896);
         this.B.N(var1, class09895x.y(), class09896, class09770);
         return this.B.N(var1, class09895x, arraylist, var5);
      }
   }

   class09936 N(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, class09770.N, false);
   }

   private class09895 N(class10021 var1, class09895 var2, class09914 var3, float var4) {
      class09916 class09916 = N(this.Z.y(var1), var3.N() + var4);
      if (class09916.N()) {
         return class09895.N;
      } else {
         List list = List.of(new class09922(class09916, var3, var2.N()));
         return new class09895(list, var2.y());
      }
   }

   private static class09916 N(class09916 var0, float var1) {
      return var1 <= 0.0F ? var0 : new class09916(var0.y() - var1, var0.L() - var1, var0.u() + var1 * 2.0F, var0.i() + var1 * 2.0F);
   }

   private class09895 N(List<class10021> var1, List<String> var2, class09896 var3, float var4, class09887 var5, float var6) {
      if (var1.isEmpty()) {
         return class09895.N;
      } else {
         boolean flag = var6 > 0.0F;
         ArrayList arraylist = new ArrayList(var1.size() + 1);
         int ix = 0;
         ArrayList arraylist1 = null;
         int j = 0;
         ArrayList arraylist2 = null;
         float f = 0.0F;
         int k = 0;

         for (class10021 class10021 : var1) {
            boolean flag1 = class10019.y(class10021);
            float f1 = !flag1 ? var4 : var4 - var6;
            class09895 class09895 = this.N(class10021, var2, var3, f1, var5);
            if (!class09895.N().isEmpty()) {
               if (flag && flag1) {
                  ix += N(arraylist, arraylist2, k);
                  k = 0;
                  if (arraylist1 == null) {
                     arraylist1 = new ArrayList();
                  }

                  arraylist1.addAll(class09895.N());
                  j += class09895.y();
               } else {
                  if (arraylist1 != null) {
                     arraylist.add(class09919.N(0.0F, -var6, arraylist1));
                     ix += j;
                     arraylist1 = null;
                     j = 0;
                  }

                  class09922 class09922 = N(class09895);
                  if (class09922 == null) {
                     ix += N(arraylist, arraylist2, k);
                     k = 0;
                     arraylist.addAll(class09895.N());
                     ix += class09895.y();
                  } else {
                     float f2 = ((class09932)class09922.y()).y();
                     if (arraylist2 == null || arraylist2.isEmpty() || f2 != f || N(arraylist2, class09922.N())) {
                        ix += N(arraylist, arraylist2, k);
                        k = 0;
                        if (arraylist2 == null) {
                           arraylist2 = new ArrayList();
                        }

                        f = f2;
                     }

                     arraylist2.add(class09922);
                     k += class09895.y();
                  }
               }
            }
         }

         ix += N(arraylist, arraylist2, k);
         if (arraylist1 != null) {
            arraylist.add(class09919.N(0.0F, -var6, arraylist1));
            ix += j;
         }

         return arraylist.isEmpty() ? class09895.N : new class09895(arraylist, ix);
      }
   }

   private static class09922 N(class09895 var0) {
      List<class09935> list = var0.N();
      return list.size() == 1 && list.get(0) instanceof class09922 class09922 && class09922.y() instanceof class09932 ? class09922 : null;
   }

   private static class09895 N(float var0, class09895 var1) {
      List list = List.of(new class09899(var0, var1.N()));
      return new class09895(list, var1.y());
   }

   private static boolean N(class09980 var0) {
      return var0.G() != 1.0F || var0.l() != 0.0F;
   }

   private class09895 N(class10021 var1, class09980 var2, class09895 var3) {
      if (var3.y() == 0) {
         return var3;
      } else {
         float f = 0.0F;
         boolean flag = L(var2);
         if (flag) {
            class09888 class09888 = new class09888(var2.C());
            var3 = this.N(var1, var3, class09888, f);
            if (var3.y() == 0) {
               return var3;
            }

            f += class09888.N();
         }

         if (y(var2)) {
            if (!flag && this.Z.N(var1)) {
               var3 = N(var2.f(), var3);
            } else {
               var3 = this.N(var1, var3, new class09932(var2.f()), f);
            }
         }

         if (N(var2) && var3.y() > 0) {
            float f2 = var1.c().y() + var1.c().u() / 2.0F;
            float f1 = var1.c().L() + var1.c().i() / 2.0F;
            var3 = this.N(var1, var3, new class09901(f2, f1, var2.G(), var2.l()), f);
         }

         return var3;
      }
   }
}
