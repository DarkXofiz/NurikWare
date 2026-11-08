package NurikWare;

public class class09210 {
   public static Object N_0 = new class09210()::N;
   public static Object N_1 = class09991.N().N(class09962.y(270.0F)).y(class09962.N(100.0F)).N(class09975.ROW);
   public static Object N_2 = class09991.N().N(class09962.y(269.0F)).y(class09962.N(100.0F)).N(class09975.COLUMN);
   public static Object N_3 = class09991.N().N(class09962.N(100.0F)).y(class09962.y(89.0F)).N(class09973.CENTER).y(class09973.CENTER);
   public static Object N_4 = class09227.N(var0 -> class09991.N().N(class09962.y(52.0F)).y(class09962.y(38.0F)).i(var0.M()));
   public static Object N_5 = class09991.N().N(class09962.N(100.0F)).y(class09962.N(100.0F)).R(30.0F).u(22.0F).N(class09983.BORDER_BOX).N(class09975.COLUMN);
   public static Object N_6 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).B(6.0F).M(33.0F).N(class09975.COLUMN).R(9.0F);

   private static void L() {
   }

   private class09210() {
      super();
   }

   static {
      L();
      y();
      N();
      u();
   }

   private static class11878 i() {
      int i = ((class11472)class11938.L_2).U();
      String s = i > 0 ? "glid:" + i : "icons/unknown.png";
      return new class11878(s, ((class11472)class11938.L_2).Z(), ((class11472)class11938.L_2).z());
   }

   private static void u() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
   }

   private static void y() {
   }

   private static class09798 N(class09809 var0, class09785<class11854> var1, String var2, String var3, class11854 var4) {
      return var0.N(var3, (class09788<class11839>)class09218.N_0, new class11839(var2, var3, var4, var1));
   }

   private class09798 N(class09785<class11854> var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      class11878 class11878 = i();
      return class09778.N(
         (class09991)N_1,
         var4x -> var4x.N(
            new Object[]{
               class09778.N(
                  (class09991)N_2,
                  var4xx -> {
                     var4xx.N(
                        new Object[]{
                           class09778.N(
                              (class09991)N_3, var1xxx -> var1xxx.L(var1xxxx -> var1xxxx.N("logo").L("icon:menu/nurikware").N(((class09227)N_4).N(class09211)))
                           ),
                           class09778.N((class09991)class09180.N_2),
                           class09778.N(
                              (class09991)N_5,
                              var2xxx -> {
                                 var2xxx.N(class12020.N("tab.features"), (class09991)class09180.N_4);
                                 var2xxx.N_3(
                                    (class09991)N_6,
                                    var2xxxx -> var2xxxx.N(
                                       new Object[]{
                                          N(var2, var1, "category.combat", "combat", class11854.COMBAT),
                                          N(var2, var1, "category.movement", "movement", class11854.MOVEMENT),
                                          N(var2, var1, "category.visual", "visuals", class11854.VISUAL),
                                          N(var2, var1, "category.player", "player", class11854.PLAYER),
                                          N(var2, var1, "category.misc", "misc", class11854.MISC)
                                       }
                                    )
                                 );
                                 var2xxx.N(class12020.N("tab.manager"), (class09991)class09180.N_4);
                                 var2xxx.N_3(
                                    (class09991)N_6,
                                    var2xxxx -> var2xxxx.N(
                                       new Object[]{
                                          N(var2, var1, "category.configs", "presets", class11854.CONFIGS),
                                          N(var2, var1, "category.autobuy", "autobuy", class11854.AUTO_BUY),
                                          N(var2, var1, "category.accounts", "accounts", class11854.ACCOUNTS)
                                       }
                                    )
                                 );
                              }
                           ),
                           class09778.N((class09991)class09180.N_2)
                        }
                     );
                     var4xx.y(var2.N("avatar", (class09788<class11878>)class09195.N_0, class11878));
                  }
               ),
               class09778.N((class09991)class09180.N_3)
            }
         )
      );
   }

   private static void N() {
   }
}
