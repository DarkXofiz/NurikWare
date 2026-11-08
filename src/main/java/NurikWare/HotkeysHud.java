package NurikWare;

import java.util.List;

@class11761(
   u = "hotkeys",
   i = 100.0F,
   N = 220.0F,
   L = true
)
public class HotkeysHud extends class11769 {
   public static Object N_0 = class09991.N()
      .y(class09962.N(38.0F, Float.POSITIVE_INFINITY))
      .N(10.0F)
      .i(9.0F)
      .M(9.0F)
      .N(class09975.COLUMN)
      .N(class09983.BORDER_BOX);
   public static Object N_1;
   public static Object N_2 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()), class09221.N(14, class09079.MEDIUM)));
   public static Object N_3 = class09991.N().N(class09962.N(16.0F, Float.POSITIVE_INFINITY)).y(class09962.N(100.0F)).N(class09973.END).y(class09973.CENTER);
   public Object y_0;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object L_5;
   public static Object L_6 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(100.0F))
      .N(11.0F)
      .i(11.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object L_7 = class09227.N(var0 -> class09991.N().u(16.0F, 16.0F).i(var0.M()));

   private static void T() {
      L_0 = 10;
      L_1 = 120;
      L_2 = 14;
      L_3 = 20;
      L_4 = 16;
      L_5 = null;
      L_6 = null;
      L_7 = null;
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
   }

   public HotkeysHud() {
      super(HotkeysHud::N);
      this.d();
      this.y_0 = new class11740(120.0F);
   }

   static {
      T();
      class09991 class09991x = class09991.N().N(class09962.N());
      L_5 = class09991.N((class09991)class11756.y_1, class09991x.y(class09962.N()).N(class09975.ROW).N(class09976.SELF).N(1.0F));
      class09991 class09991x = class09991.N();
      N_1 = class09991.N(class09991x.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
   }

   private void d() {
   }

   private static List<class11067> t() {
      return class11938.u().a().filter(HotkeysHud::N).toList();
   }

   private static String j() {
      return class12020.N("hud.example");
   }

   @Override
   public boolean y() {
      return class11938.u().J().U();
   }

   private static float N(String var0, String var1) {
      class11753 class11753 = class11938.i();
      float f = class11753.N(var0, 14.0F, class09079.REGULAR);
      float f1 = Math.max(16.0F, class11753.N(var1, 14.0F, class09079.MEDIUM));
      return 19.0F + f + 20.0F + f1;
   }

   private static float N(List<class11067> var0, boolean var1) {
      if (var0.isEmpty() && var1) {
         return N(j(), "None");
      } else {
         float f = 0.0F;

         for (class11067 class11067 : var0) {
            f = Math.max(f, N(class11067.L(), class11067.R().z()));
         }

         return f;
      }
   }

   @Override
   public boolean N() {
      return class11753.y() || class11938.u().a().anyMatch(HotkeysHud::N);
   }

   private static class09798 N(List<class11067> var0, boolean var1, class09211 var2, boolean var3, float var4) {
      return class09778.N(
         var3 ? class11756.N((class09991)N_0, var4, 120.0F, (class09728)class11644.N_0) : class11756.N((class09991)N_0, var4, 120.0F),
         var4x -> {
            var4x.N("hotkeysContentBox");
            if (var0.isEmpty() && var1) {
               String s1 = "hotkey-row-example";
               var4x.N_3(class11756.N(true, var3), var2xx -> {
                  var2xx.N(s1);
                  var2xx.y(var1xxx -> var1xxx.N(s1 + "-name").L(j()).N((class09991)N_1));
                  var2xx.N_3((class09991)N_3, var2xxx -> {
                     var2xxx.N(s1 + "-bind-box");
                     var2xxx.y(var2xxxx -> var2xxxx.N(s1 + "-bind").L("None").N(((class09227)N_2).N(var2)));
                  });
               });
            } else {
               int i = 0;

               for (class11067 class11067 : var0) {
                  String s = "hotkey-" + class11067.N();
                  class09991 class09991 = ((class11740)((HotkeysHud)class11730.N_1).y_0).N(class11067)
                     ? (class09991)class11756.L_5
                     : class11756.N(i++ == 0, var3);
                  var4x.N_3(class09991, var3xx -> {
                     var3xx.N(s);
                     var3xx.y(var2xxx -> var2xxx.N(s + "-name").L(class11067.L()).N((class09991)N_1));
                     var3xx.N_3((class09991)N_3, var3xxx -> {
                        var3xxx.N(s + "-bind-box");
                        var3xxx.y(var3xxxx -> var3xxxx.N(s + "-bind").L(class11067.R().z()).N(((class09227)N_2).N(var2)));
                     });
                  });
               }
            }
         }
      );
   }

   @class11782
   public void N(class11398 var1) {
      String s = var1.y().L();
      if (s != null && s.startsWith("module/")) {
         class11938.i().N();
      }
   }

   private static class09798 N(Void var0, class09809 var1) {
      class09211 class09211 = var1.N((class09804<class09211>)class09211.N_6);
      HotkeysHud hotkeyshud = (HotkeysHud)class11730.N_1;
      var1.u("hotkeysTicker", () -> (class11740)hotkeyshud.y_0);
      List list = ((class11740)hotkeyshud.y_0).N(t(), var0x -> var0x);
      boolean flag = class11753.y();
      boolean flag1 = !list.isEmpty() || flag;
      boolean flag2 = ((class11740)hotkeyshud.y_0).N(flag1);
      float f = ((class11740)hotkeyshud.y_0).N(flag1, N(list, flag));
      return class09778.N((class09991)L_5, var5x -> {
         var5x.N("hotkeysWindow");
         var5x.N_3((class09991)L_6, var1xx -> {
            var1xx.N("hotkeysIconArea");
            var1xx.L(var1xxx -> var1xxx.N("hud-hotkeys").L("icon:hud/hotkeys").N(((class09227)L_7).N(class09211)));
         });
         var5x.N(var0xx -> var0xx.N("hotkeysDivider").N((class09991)class09180.N_3));
         var5x.y(N(list, flag, class09211, flag2, f));
      });
   }

   private static boolean N(class11067 var0) {
      return var0.U() && var0.R().N() && !var0.R().B();
   }
}
