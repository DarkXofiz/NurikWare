package NurikWare;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01463;
import minecraft.class01488;
import minecraft.class04453;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;

public class class09678 {
   public static class09674 N;
   private static class06202 L;
   private static class05096 u;
   private static class09670 i;
   private static boolean R;
   private static class06937 M;
   private static double B;
   private static boolean Z;
   private static boolean z;
   private static boolean U;
   private static boolean E;

   public static boolean L(class05096 var0, double var1, double var3, class09690 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         class06937 class06937 = i.N(var1, var3);
         if (class06937 == M) {
            return false;
         } else {
            class06584 class06584x = ((class07482)((class04453)L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
            if (z && var5 == class09690.RIGHT && !U) {
               U = true;
               i.u();
               N(M, class06584x);
            }

            M = class06937;
            if (class06937 == null) {
               return false;
            } else if (i.y(class06937)) {
               return false;
            } else {
               if (var5 == class09690.LEFT) {
                  if (!Z) {
                     return false;
                  }

                  class06584 class06584x = class06937.i();
                  if (class06584x.R()) {
                     return false;
                  }

                  boolean flag = class04655.N(L.Nt(), 340) || class04655.N(L.Nt(), 344);
                  if (class06584x.R()) {
                     if (!N.L || !flag) {
                        return false;
                     }

                     i.N(class06937, class09690.LEFT, true);
                  } else {
                     if (!N.y) {
                        return false;
                     }

                     if (!N(class06584x, class06584x)) {
                        return false;
                     }

                     if (flag) {
                        i.N(class06937, class09690.LEFT, true);
                     } else {
                        if (class06584x.c() + class06584x.c() > class06584x.U()) {
                           return false;
                        }

                        i.N(class06937, class09690.LEFT, false);
                        if (!i.N(class06937)) {
                           i.N(class06937, class09690.LEFT, false);
                        }
                     }
                  }
               } else if (var5 == class09690.RIGHT) {
                  if (!z) {
                     return false;
                  }

                  N(class06937, class06584x);
               }

               return false;
            }
         }
      }
   }

   public class09678() {
      super();
   }

   public static boolean y(class05096 var0, double var1, double var3, class09690 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         if (var5 == class09690.LEFT) {
            Z = false;
         } else if (var5 == class09690.RIGHT) {
            z = false;
         }

         return false;
      }
   }

   private static class09670 y(class05096 var0) {
      if (var0 instanceof class09679) {
         return new class09680((class09679)var0);
      } else if (var0 instanceof class01488) {
         return new class09671((class01488)var0);
      } else {
         return var0 instanceof class01463 ? new class09669((class01463)var0) : null;
      }
   }

   public static boolean N(class05096 var0, double var1, double var3, double var5) {
      N(var0);
      if (i != null && !R && N.u) {
         class06937 class06937xx = i.N(var1, var3);
         if (class06937xx != null && !i.y(class06937xx)) {
            class06584 class06584x = class06937xx.i();
            if (class06584x.B() instanceof class05462) {
               return false;
            } else {
               double d0 = N.M.N(var5);
               if (B != 0.0 && Math.signum(d0) != Math.signum(B)) {
                  B = 0.0;
               }

               B += d0;
               int ix = (int)B;
               B -= ix;
               if (ix == 0) {
                  return true;
               } else {
                  List<class06937> list = i.L();
                  int j = Math.abs(ix);
                  boolean flag = ix < 0;
                  if (N.R.L() && N(class06937xx, list)) {
                     flag = !flag;
                  }

                  if (N.R.y()) {
                     flag = !flag;
                  }

                  if (class06584x.R()) {
                     return true;
                  } else {
                     class06584 class06584x = ((class07482)((class04453)L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
                     if (i.N(class06937xx)) {
                        if (!N(class06584x, class06584x)) {
                           return true;
                        } else {
                           if (class06584x.R()) {
                              if (!flag) {
                                 return true;
                              }

                              while (j-- > 0) {
                                 List<class06937> list2 = N(list, class06937xx, class06584x.c(), true);
                                 if (list2 == null) {
                                    break;
                                 }

                                 i.N(class06937xx, class09690.LEFT, false);

                                 for (int k1 = 0; k1 < list2.size(); k1++) {
                                    class06937 class06937x = list2.get(k1);
                                    if (k1 == list2.size() - 1) {
                                       i.N(class06937x, class09690.LEFT, false);
                                    } else {
                                       int i2 = class06937x.b_(class06937x.i()) - class06937x.i().c();

                                       while (i2-- > 0) {
                                          i.N(class06937x, class09690.RIGHT, false);
                                       }
                                    }
                                 }
                              }
                           } else {
                              while (j-- > 0) {
                                 i.N(class06937xx, class09690.LEFT, false);
                              }
                           }

                           return true;
                        }
                     } else if (!class06584x.R() && N(class06584x, class06584x)) {
                        return true;
                     } else if (flag) {
                        if (!class06584x.R() && !class06937xx.N(class06584x)) {
                           return true;
                        } else {
                           j = Math.min(j, class06584x.c());
                           List<class06937> list1 = N(list, class06937xx, j, false);
                           if (!y && list1 == null) {
                              throw new AssertionError();
                           } else if (list1.isEmpty()) {
                              return true;
                           } else {
                              i.N(class06937xx, class09690.LEFT, false);

                              for (class06937 class06937x : list1) {
                                 int l1 = class06937x.b_(class06937x.i()) - class06937x.i().c();
                                 l1 = Math.min(l1, j);
                                 j -= l1;

                                 while (l1-- > 0) {
                                    i.N(class06937x, class09690.RIGHT, false);
                                 }
                              }

                              i.N(class06937xx, class09690.LEFT, false);
                              return true;
                           }
                        }
                     } else {
                        int var16 = class06937xx.b_(class06584x) - class06584x.c();
                        j = Math.min(j, var16);

                        while (j > 0) {
                           class06937 class06937x = N(list, class06937xx);
                           if (class06937x == null) {
                              break;
                           }

                           int l = class06937x.i().c();
                           if (i.N(class06937x)) {
                              if (var16 < l) {
                                 break;
                              }

                              var16 -= l;
                              j = Math.min(j - 1, var16);
                              if (!class06584x.R() && !class06937xx.N(class06584x)) {
                                 break;
                              }

                              i.N(class06937xx, class09690.LEFT, false);
                              i.N(class06937x, class09690.LEFT, false);
                              i.N(class06937xx, class09690.LEFT, false);
                           } else {
                              int i1 = Math.min(j, l);
                              var16 -= i1;
                              j -= i1;
                              if (!class06584x.R() && !class06937x.N(class06584x)) {
                                 break;
                              }

                              i.N(class06937x, class09690.LEFT, false);
                              if (i1 == l) {
                                 i.N(class06937xx, class09690.LEFT, false);
                              } else {
                                 for (int j1 = 0; j1 < i1; j1++) {
                                    i.N(class06937xx, class09690.RIGHT, false);
                                 }
                              }

                              i.N(class06937x, class09690.LEFT, false);
                           }
                        }

                        return true;
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean N(class06584 var0, class06584 var1) {
      return var0.R() || var1.R() || class06584.y(var0, var1) && class06584.L(var0, var1);
   }

   private static class06937 N(List<class06937> var0, class06937 var1) {
      int ix;
      int j;
      byte b0;
      if (N.i == class09684.FIRST_TO_LAST) {
         ix = 0;
         j = var0.size();
         b0 = 1;
      } else {
         ix = var0.size() - 1;
         j = -1;
         b0 = -1;
      }

      class06584 class06584x = var1.i();
      boolean flag = var1.L != ((class04453)L.T_4).method_31548();

      for (int k = ix; k != j; k += b0) {
         class06937 class06937 = (class06937)var0.get(k);
         if (!i.y(class06937)) {
            boolean flag1 = class06937.L == ((class04453)L.T_4).method_31548();
            if (flag == flag1) {
               class06584 class06584x = class06937.i();
               if (!class06584x.R() && N(class06584x, class06584x)) {
                  return class06937;
               }
            }
         }
      }

      return null;
   }

   private static List<class06937> N(List<class06937> var0, class06937 var1, int var2, boolean var3) {
      class06584 class06584x = var1.i();
      boolean flag = var1.L != ((class04453)L.T_4).method_31548();
      ArrayList arraylist = new ArrayList();
      ArrayList arraylist1 = new ArrayList();

      for (int ix = 0; ix != var0.size() && var2 > 0; ix++) {
         class06937 class06937x = (class06937)var0.get(ix);
         if (!i.y(class06937x)) {
            boolean flag1 = class06937x.L == ((class04453)L.T_4).method_31548();
            if (flag == flag1 && !i.N(class06937x)) {
               class06584 class06584x = class06937x.i();
               if (class06584x.R()) {
                  if (class06937x.N(class06584x)) {
                     arraylist1.add(class06937x);
                  }
               } else if (N(class06584x, class06584x) && class06584x.c() < class06937x.b_(class06584x)) {
                  arraylist.add(class06937x);
                  var2 -= Math.min(var2, class06937x.b_(class06584x) - class06584x.c());
               }
            }
         }
      }

      for (int j = 0; j != arraylist1.size() && var2 > 0; j++) {
         class06937 class06937 = (class06937)arraylist1.get(j);
         arraylist.add(class06937);
         var2 -= Math.min(var2, class06937.y());
      }

      return var3 && var2 > 0 ? null : arraylist;
   }

   public static boolean N(class05096 var0, double var1, double var3, class09690 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         M = i.N(var1, var3);
         class06584 class06584 = ((class07482)((class04453)L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
         if (var5 == class09690.LEFT) {
            if (class06584.R()) {
               Z = true;
            }
         } else if (var5 == class09690.RIGHT) {
            if (class06584.R()) {
               return false;
            }

            if (!N.N) {
               return false;
            }

            z = true;
            U = false;
         }

         return false;
      }
   }

   private static void N(class06937 var0, class06584 var1) {
      if (var0 != null) {
         if (!var1.R()) {
            if (!i.y(var0)) {
               if (!i.N(var0)) {
                  if (!(var1.B() instanceof class05462)) {
                     class06584 class06584 = var0.i();
                     if (!N(class06584, var1)) {
                        return;
                     }

                     if (class06584.c() == var0.b_(class06584)) {
                        return;
                     }
                  }

                  i.N(var0, class09690.RIGHT, false);
               }
            }
         }
      }
   }

   private static void N(class05096 var0) {
      if (var0 != u) {
         u = var0;
         i = null;
         M = null;
         B = 0.0;
         Z = false;
         z = false;
         U = false;
         if (u != null) {
            class09673.y("You have just opened a " + u.getClass().getName() + ".");
            N.N();
            i = y(u);
            if (i == null) {
               class09673.y("No valid handler found; Mouse Tweaks is disabled.");
            } else {
               boolean flag = i.N();
               R = i.y();
               class09673.y(
                  "Handler: "
                     + i.getClass().getSimpleName()
                     + "; Mouse Tweaks is "
                     + (flag ? "disabled" : "enabled")
                     + "; wheel tweak is "
                     + (R ? "disabled" : "enabled")
                     + "."
               );
               if (flag) {
                  i = null;
               }
            }
         }
      }
   }

   public static void N() {
      class09673.N("Main.initialize()");
      if (!E) {
         L = class06202.Nq();
         N = new class09674(((File)L.l_1).getAbsolutePath() + File.separator + "config" + File.separator + "MouseTweaks.cfg");
         N.N();
         class09673.N("Initialized.");
         E = true;
      }
   }

   private static boolean N(class06937 var0, List<class06937> var1) {
      boolean flag = var0.L == ((class04453)L.T_4).method_31548();
      int ix = 0;
      int j = 0;

      for (class06937 class06937 : var1) {
         if (class06937.L == ((class04453)L.T_4).method_31548() != flag) {
            if (class06937.R < var0.R) {
               j++;
            } else {
               ix++;
            }
         }
      }

      return j > ix;
   }
}
