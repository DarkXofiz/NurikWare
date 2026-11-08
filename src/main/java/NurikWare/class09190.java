package NurikWare;

public class class09190 {
   public static Object N_0 = new class12018("bind.visible");
   public static Object N_1 = new class12018("bind.type");
   public static Object N_2 = new class12018("bind.hold");
   public static Object y_0 = new class12018("bind.toggle");
   public static Object y_1 = new class12018("bind.remove");
   public static Object y_2;
   public static Object y_3 = class09991.N()
      .N(class09962.y(240.0F))
      .y(class09962.N())
      .y((Integer)class09181.y_0)
      .j(4.0F)
      .v(20.0F)
      .L(class09662.N(-16777216, 0.25F))
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(12.0F)
      .N(class09983.BORDER_BOX)
      .N(class09975.COLUMN)
      .N(class09994.s((class09743)class11644.N_0))
      .N(var0 -> var0.l(0.0F))
      .y(var0 -> var0.l(0.0F));
   public static Object y_4 = class09991.N()
      .N(class09962.y(0.0F, Float.POSITIVE_INFINITY))
      .N(class09975.COLUMN)
      .u(12.0F)
      .i(12.0F)
      .R(3.0F)
      .N(class09983.BORDER_BOX);
   public static Object y_5 = class09991.N().N(class09962.N()).y(class09962.N()).y(class09973.CENTER);
   public static Object y_6 = class09991.N()
      .N(class09962.y(0.0F, Float.POSITIVE_INFINITY))
      .N(class09976.SELF)
      .N(class09975.COLUMN)
      .N(class09983.BORDER_BOX)
      .N(class09692.N(class09994.W((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0)));
   public static Object y_7 = class09991.N().N(class09962.y(0.0F, Float.POSITIVE_INFINITY)).N(class09975.COLUMN).N(class09976.SELF);
   public static Object L_0 = new class09190()::N;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object L_5 = new class12018("bind.hotkey");

   private class09190() {
      super();
   }

   static {
      y();
      N();
      i();
   }

   private static void i() {
      L_0 = null;
      L_1 = 240;
      L_2 = 12;
      L_3 = 3;
      L_4 = 5;
      L_5 = null;
      N_0 = null;
      N_1 = null;
      N_2 = null;
      y_0 = null;
      y_1 = null;
      y_2 = "bindAnchor";
      y_3 = null;
      y_4 = null;
      y_5 = null;
      y_6 = null;
      y_7 = null;
   }

   private static void y() {
   }

   private static class09991 y(boolean var0) {
      return class09991.N((class09991)y_6, class09991.N().y(var0 ? class09962.N() : class09962.N(0.0F, 0.0F)).l(var0 ? 1.0F : 0.0F));
   }

   private class09798 N(class11866 var1, String var2, class09809 var3) {
      class11067 class11067 = var1.y();
      class09785 class09785 = var3.N("updater", null);
      boolean flag = !class11067.R().B();
      class09991 class09991x = class09991.N((class09991)y_3, class11629.N(var2, 0.0F, 1001));
      class09991 class09991x = class09991.N((class09991)y_4, class09991.N().M(flag ? 5.0F : 3.0F));
      return class09778.N(
         class09991x,
         var7x -> var7x.N("bindPanel")
            .N_3(
               class09991,
               var6xx -> {
                  var6xx.N_3(
                     (class09991)class09183.N_3,
                     var3xxx -> {
                        class09785 class09785x = var3.N("active" + class11067.N(), false);
                        var3xxx.N(class12020.N((class12018)L_5), class09785x.L() ? (class09991)class09183.N_5 : (class09991)class09183.N_4);
                        var3xxx.y(
                           var3.N(
                              "hotkey" + class11067.N(),
                              (class09788<class11860>)class11641.N_0,
                              new class11860(class11067.R().y(), class11067.R().Z(), (var2xxxx, var3xxxx) -> {
                                 class11067.N(var2xxxx, var3xxxx, class11067.R().i(), class11067.R().N());
                                 class09785.y();
                              }, class09785x)
                           )
                        );
                     }
                  );
                  var6xx.y((class09991)class09180.N_2);
                  var6xx.N_3((class09991)class09183.N_3, var3xxx -> {
                     var3xxx.N(class12020.N((class12018)N_0), class11067.R().N() ? (class09991)class09183.N_5 : (class09991)class09183.N_4);
                     var3xxx.y(var3.N("visible", (class09788<class11861>)class11622.N_0, new class11861(class11067.R().N(), var2xxxx -> {
                        class11067.N(class11067.R().y(), class11067.R().Z(), class11067.R().i(), var2xxxx);
                        class09785.y();
                     })));
                  });
                  var6xx.y((class09991)class09180.N_2);
                  var6xx.N_3((class09991)class09183.N_3, var4xxx -> {
                     var4xxx.N(class12020.N((class12018)N_1), (class09991)class09183.N_4);
                     var4xxx.y(this.N(class11067, class09785, var3));
                  });
                  var6xx.N_3(
                     y(flag),
                     var5xxx -> {
                        var5xxx.N("removeSection");
                        var5xxx.N_3(
                           N(flag),
                           var4xxxx -> {
                              var4xxxx.y((class09991)class09180.N_2);
                              var4xxxx.N_3(
                                 (class09991)class09183.N_3,
                                 var4xxxxx -> var4xxxxx.y(var3.N("remove", (class09788<class11870>)class11605.N_0, new class11870((class12018)y_1, () -> {
                                    class11067.N(class12002.UNKNOWN, 0, class09045.TOGGLE, true);
                                    class09785.y();
                                    var1.N().N(false);
                                 })))
                              );
                           }
                        );
                     }
                  );
               }
            )
      );
   }

   private class09798 N(class11067 var1, class09785<Void> var2, class09809 var3) {
      return class09778.N(
         (class09991)y_5,
         var4 -> {
            var4.y(
               var3.N(
                  "type-hold",
                  (class09788<class11853>)class11603.L_0,
                  this.N(var1, class09045.HOLD, (class12018)N_2, class11856.staticFields_0195a4643e2ea35d789c4540fa44e325e_1, var2)
               )
            );
            var4.y(
               var3.N(
                  "type-toggle",
                  (class09788<class11853>)class11603.L_0,
                  this.N(var1, class09045.TOGGLE, (class12018)y_0, class11856.staticFields_0195a4643e2ea35d789c4540fa44e325e_2, var2)
               )
            );
         }
      );
   }

   private class09798 N(class11866 var1, class09809 var2) {
      boolean flag = var1.N().L();
      String s = "bindAnchor" + System.identityHashCode(var1.N());
      return class11629.N(class09991.N, var5 -> {
         var5.N(s);
         if (flag) {
            var5.y(class11629.N("bindCatcher", 1000, () -> var1.N().N(false)));
            var5.y(this.N(var1, s, var2));
         }
      });
   }

   private static class09991 N(boolean var0) {
      return var0 ? (class09991)y_7 : class09991.N((class09991)y_7, class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F));
   }

   private class11853 N(class11067 var1, class09045 var2, class12018 var3, class11856 var4, class09785<Void> var5) {
      return new class11853(class12020.N(var3), var1.R().i() == var2, () -> {
         var1.N(var1.R().y(), var1.R().Z(), var2, var1.R().N());
         var5.y();
      }, var4);
   }

   private static void N() {
   }
}
