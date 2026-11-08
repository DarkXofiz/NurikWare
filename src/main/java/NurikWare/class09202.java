package NurikWare;

import java.util.Iterator;
import java.util.List;

public class class09202 {
   public static Object N_0;
   public static Object N_1 = class09991.N()
      .N(class09962.y(0.0F, Float.POSITIVE_INFINITY))
      .y(class09962.N(40.0F, 500.0F))
      .N(class09976.PARENT)
      .N(class09993.AUTO)
      .N(class09970.OVERLAY)
      .N(class09180.N(8.0F, 2.0F).L(4.0F))
      .N(class09975.COLUMN)
      .N(class09983.BORDER_BOX);
   public static Object N_2 = class09991.N().N(class09962.y(0.0F, Float.POSITIVE_INFINITY)).N(class09975.COLUMN).u(12.0F).i(12.0F).N(class09983.BORDER_BOX);
   public static Object N_3 = class09991.N()
      .N(class09962.N())
      .y(class09962.N())
      .y((Integer)class09181.y_0)
      .j(4.0F)
      .v(20.0F)
      .L(class09662.N(-16777216, 0.25F))
      .N(4.0F)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(12.0F)
      .N(class09983.BORDER_BOX)
      .l(1.0F)
      .N(class09994.E((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0))
      .N(var0 -> var0.l(0.0F))
      .y(var0 -> var0.l(0.0F));
   public static Object N_4 = class09991.N()
      .N(class09976.SELF)
      .N(class09975.COLUMN)
      .N(class09983.BORDER_BOX)
      .N(class09692.N(class09994.W((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0)));
   public static Object N_5;
   public static Object N_6 = class09991.N().N(class09962.y(0.0F, Float.POSITIVE_INFINITY)).N(class09976.SELF);
   public static Object N_7 = (class09788<class11862>)(var0, var1) -> {
      List<class11536<?>> list = var0.y().w().values().stream().toList();
      class09785 class09785 = var1.N("updater", null);
      N(list);
      return class09778.N(class09991.N((class09991)N_3, class11629.N("settingsAnchor" + System.identityHashCode(var0.N()), 0.0F, 1001)), var3x -> {
         var3x.N("settingsPanel");
         var3x.N_3((class09991)N_1, var3xx -> var3xx.N_3((class09991)N_2, var3xxx -> {
            for (int i = 0; i < list.size(); i++) {
               class11536 class11536 = list.get(i);
               N(var3xxx, class11536, L(list, i), class09785, var1);
            }
         }));
      });
   };
   public static Object y_0 = new class09202()::y;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;

   private static void L() {
   }

   private static float L(List<class11536<?>> var0, int var1) {
      if (!((class11536)var0.get(var1)).E()) {
         return -1.0F;
      } else if (N(var0, var1)) {
         return 1.0F;
      } else {
         return y(var0, var1) ? 0.0F : -1.0F;
      }
   }

   private class09202() {
      super();
   }

   static {
      N();
      L();
      y();
      R();
      class09991 class09991 = class09991.N();
      N_5 = class09991.N((class09991)class09180.N_2, class09991.N(class09994.s((class09743)class11644.N_0)));
   }

   private static class09991 y(boolean var0) {
      return var0 ? (class09991)N_6 : class09991.N((class09991)N_6, class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F));
   }

   private static boolean y(List<class11536<?>> var0, int var1) {
      for (int i = var1 + 1; i < var0.size(); i++) {
         if (!((class11536)var0.get(i)).E()) {
            return true;
         }
      }

      return false;
   }

   private class09798 y(class11862 var1, class09809 var2) {
      boolean flag = var1.N().L();
      String s = "settingsAnchor" + System.identityHashCode(var1.N());
      return class11629.N(class09991.N, var4x -> {
         var4x.N(s);
         if (flag) {
            var4x.y(class11629.N("settingsCatcher", 1000, () -> var1.N().N(false)));
            var4x.y(var2.N("settingList", (class09788<class11862>)N_7, var1));
         }
      });
   }

   private static void y() {
   }

   private static class09991 N(float var0) {
      return class09991.N((class09991)N_5, class09991.N().l(var0));
   }

   private static void N(List<class11536<?>> var0) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         ((class11536)iterator.next()).m();
      }
   }

   private static boolean N(List<class11536<?>> var0, int var1) {
      for (int i = var1 + 1; i < var0.size(); i++) {
         if (((class11536)var0.get(i)).E()) {
            return true;
         }
      }

      return false;
   }

   private static void N() {
   }

   private static class09991 N(boolean var0) {
      return class09991.N(
         (class09991)N_4, class09991.N().N(class09962.y(0.0F, 368.0F)).y(var0 ? class09962.N() : class09962.N(0.0F, 0.0F)).l(var0 ? 1.0F : 0.0F)
      );
   }

   private static void N(class09784 var0, class11536<?> var1, float var2, class09785<Void> var3, class09809 var4) {
      String s = var1.P().N();
      var0.N_3(N(var1.E()), var4x -> {
         var4x.N("setting-row:" + s);
         var4x.N_3(y(var1.E()), var4xx -> {
            var4xx.N(class09867.POINTER_DOWN, var2xxx -> {
               if (((class09864)var2xxx).L() == 2) {
                  var1.s();
                  var3.y();
                  var2xxx.j();
                  var2xxx.T();
               }
            });
            var4xx.y(var4.N(s, (class09788<class11844>)class09219.N_0, new class11844(var1, var3)));
         });
      });
      if (var2 >= 0.0F) {
         var0.N_3(N(var2), var1x -> var1x.N("setting-divider:" + s));
      }
   }

   private static void R() {
      y_0 = null;
      y_1 = "settingsAnchor";
      y_2 = 4;
      y_3 = 12;
      y_4 = 4;
      y_5 = 2;
      L_0 = 4;
      L_1 = 40;
      L_2 = 500;
      L_3 = 400;
      N_0 = 368;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
      N_7 = null;
   }
}
