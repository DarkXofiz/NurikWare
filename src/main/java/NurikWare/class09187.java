package NurikWare;

import java.util.List;

public class class09187 {
   public static Object N_0 = new class09187()::N;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5 = new class11863(260.0F, 30.0F, 1.4F, 0.2F, 4.0F, 0.008333334F);
   public static Object N_6;
   public static Object y_0 = class09991.N().N(class09692.N(class09994.L((class09743)N_5)));
   public static Object y_1 = class09991.N()
      .N(class09962.N(100.0F))
      .N(class09692.N(class09994.W((class09743)N_5)))
      .Z(12.0F)
      .z(1.0F)
      .N(class09975.COLUMN)
      .u((Integer)class09181.y_1)
      .y((Integer)class09181.y_0);
   public static Object y_2 = class09991.N().N(class09976.SELF);
   public static Object y_3 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(60.0F))
      .y(class09973.CENTER)
      .u(17.0F)
      .i(17.0F)
      .y()
      .N(class09983.BORDER_BOX)
      .N(new class09965(12.0F, 12.0F, 0.0F, 0.0F))
      .y((Integer)class09181.y_3);
   public static Object y_4;
   public static Object y_5 = class09991.N().u(24.0F, 24.0F);
   public static Object y_6 = class09991.N().u(24.0F, 24.0F);
   public static Object y_7;

   private class09187() {
      super();
   }

   static {
      N();
      u();
      float f = ((class11863)N_5).L();
      float f1 = ((class11863)N_5).i();
      float f2 = ((class11863)N_5).M();
      N_6 = new class11863(f, f1, f2, 0.05F, 1.0F, ((class11863)N_5).R());
      y_4 = class09991.N()
         .N(class09962.N(100.0F))
         .y(class09962.N())
         .u(18.0F)
         .i(18.0F)
         .N(class09975.COLUMN)
         .N(class09983.BORDER_BOX)
         .N(class09692.N(class09994.s((class09743)N_6)));
      y_7 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).u(24.0F, 24.0F).N(class09692.N(class09994.s((class09743)N_6), class09994.L((class09743)N_6)));
   }

   private static void u() {
      N_0 = null;
      N_1 = 1;
      N_2 = 2;
      N_3 = 12;
      N_4 = 24;
      N_5 = null;
      N_6 = null;
      y_0 = null;
      y_1 = null;
      y_2 = null;
      y_3 = null;
      y_4 = null;
      y_5 = null;
      y_6 = null;
      y_7 = null;
   }

   private static class09991 y(boolean var0) {
      return class09991.N((class09991)y_4, class09991.N().l(var0 ? 1.0F : 0.0F));
   }

   public static int N(int var0, boolean var1) {
      int i = Math.max(0, var0);
      int j = i * 66 + Math.max(0, i - 1);
      int k = var1 ? j : 12;
      return 61 + k + 2;
   }

   public static int N(int var0) {
      return N(var0, true);
   }

   private static void N() {
   }

   private static void N(class09784 var0, List<class11067> var1, class09809 var2) {
      int i = var1.size();

      for (int j = 0; j < i; j++) {
         class11067 class11067 = (class11067)var1.get(j);
         var0.N(
            new Object[]{
               var2.N(class11067.N(), (class09788<class11067>)class09213.y_1, class11067), j == i - 1 ? null : class09778.N((class09991)class09180.N_2)
            }
         );
      }
   }

   private static class09991 N(int var0, boolean var1, boolean var2) {
      class09991 class09991 = class09991.N((class09991)y_1, class09991.N().y(class09962.y(N(var0, var1))));
      return var2 ? class09991.N(class09991, (class09991)y_2) : class09991;
   }

   private static class09991 N(boolean var0) {
      return class09991.N((class09991)y_6, class09991.N().i(-7171438).N(var0));
   }

   private static class09991 N(boolean var0, class09211 var1) {
      int i = var0 ? var1.M() : -7171438;
      return class09991.N((class09991)y_0, class09991.N().i(i), class09221.N(22, class09079.SEMI_BOLD));
   }

   private class09798 N(class11838 var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      boolean flag = var1.L().L();
      class09785 class09785xxx = var2.N("renderList", flag);
      class09785 class09785x = var2.N("animatingHeight", false);
      class09785 class09785xx = var2.N("baseIconVisible", !flag);
      class09785 class09785xxx = var2.N("overlayIconVisible", flag);
      if (flag) {
         if (!(Boolean)class09785xxx.L()) {
            class09785xxx.N(true);
         }

         if (!(Boolean)class09785xxx.L()) {
            class09785xxx.N(true);
         }
      } else if (!(Boolean)class09785xx.L()) {
         class09785xx.N(true);
      }

      return class09778.N(N(var1.N().size(), flag, (Boolean)class09785x.L()), var8x -> {
         var8x.N("subcategoryCard" + var1.y().N().N());
         var8x.N(class09867.POINTER_DOWN, class09860::T);
         var8x.N(class09867.TRANSITION_END, var3xx -> {
            if (((class09842)var3xx).N() == class09736.HEIGHT) {
               class09785xx.N(false);
               if (!var1.L().L()) {
                  class09785xxx.N(false);
               }
            }
         });
         var8x.N_3((class09991)y_3, var7xx -> {
            var7xx.N(class12020.N(var1.y().N()), N(flag, class09211));
            var7xx.N_3((class09991)y_5, var7xxx -> {
               var7xxx.N(class09867.POINTER_DOWN, class09860::T);
               var7xxx.N_1(var5xxxx -> {
                  boolean flagx = !var1.L().L();
                  class09785xx.N(true);
                  if (flagx) {
                     class09785xxx.N(true);
                     class09785.N(true);
                  } else {
                     class09785x.N(true);
                  }

                  var1.L().N(flagx);
               });
               var7xxx.L(var6xxxx -> {
                  var6xxxx.L("icon:menu/expand");
                  var6xxxx.N(N((Boolean)class09785x.L()));
                  var7xxx.L(var5xxxxx -> {
                     var5xxxxx.L("icon:menu/squeeze");
                     var5xxxxx.N(N(flag, (Boolean)class09785.L(), class09211));
                     var5xxxxx.N(class09867.TRANSITION_END, var3xxxxxx -> {
                        if (((class09842)var3xxxxxx).N() == class09736.OPACITY) {
                           if (var1.L().L()) {
                              class09785x.N(false);
                           } else {
                              class09785.N(false);
                           }
                        }
                     });
                  });
               });
            });
         });
         var8x.y((class09991)class09180.N_2);
         if ((Boolean)class09785xxx.L()) {
            var8x.N_3(y(flag), var2xx -> N(var2xx, var1.N(), var2));
         }
      });
   }

   private static class09991 N(boolean var0, boolean var1, class09211 var2) {
      int i = var0 ? var2.M() : -7171438;
      return class09991.N((class09991)y_7, class09991.N().i(i).l(var0 ? 1.0F : 0.0F).N(var1));
   }
}
