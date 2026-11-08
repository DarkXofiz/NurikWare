package NurikWare;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import minecraft.class04453;
import minecraft.class06202;

@class11761(
   u = "logo",
   i = 10.0F,
   N = 10.0F,
   y = class11616.NONE
)
public class LogoHud extends class11769 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.COLUMN).B(8.0F);
   public static Object N_3 = class09991.N((class09991)N_2, class09991.N().N(class09973.END));
   public static Object y_0 = class09991.N()
      .N(class09962.y(37.0F))
      .y(class09962.y(37.0F))
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .u(1.0F)
      .N(class09983.BORDER_BOX);
   public static Object y_1 = class09227.N(var0 -> class09991.N().u(16.0F, 16.0F).i(var0.M()));
   public static Object y_2 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW).y(class09973.CENTER);
   public static Object y_3 = class09991.N((class09991)y_2, class09991.N().u(4.0F));
   public static Object y_4;
   public static Object y_5;
   public static Object L_0 = class06202.Nq();
   public static Object L_1 = DateTimeFormatter.ofPattern("HH:mm:ss");
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object u_0 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW).B(8.0F).y(class09973.CENTER);
   public static Object u_1;
   public static Object u_2 = class09991.N()
      .N(class09962.N())
      .y(class09962.y(37.0F))
      .N(class09975.ROW)
      .y(10.0F)
      .B(4.0F)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);

   private static String w() {
      String s = ((class11472)class11938.L_2).Z();
      return s == null ? "" : s;
   }

   private static class09798 L(Logo var0, class09211 var1) {
      return class09778.N((class09991)u_1, var2 -> {
         var2.N("logoBottomPill");
         boolean[] aboolean = new boolean[]{false};
         if (var0.j().U()) {
            N(var2, var1);
            aboolean[0] = true;
         }

         if (var0.P().U()) {
            if (aboolean[0]) {
               N(var2, "logoDivAfterCoords");
            }

            N(var2, "logoItemBps", "bps", O(), "bps", var1);
            aboolean[0] = true;
         }

         if (var0.n().U()) {
            if (aboolean[0]) {
               N(var2, "logoDivAfterBps");
            }

            N(var2, "logoItemTps", "tps", Float.toString(class11938.U().y()), "tps", var1);
         }
      });
   }

   public LogoHud() {
      super(LogoHud::N);
   }

   static {
      G();
      class09991 class09991xx = class09991.N().N(class09962.N());
      u_1 = class09991.N((class09991)class11756.y_1, class09991xx.y(class09962.y(37.0F)).N(class09975.ROW).y(class09973.CENTER));
      class09991 class09991x = class09991.N();
      y_4 = class09991.N(class09991x.i((Integer)class09181.N_0), class09221.N(14, class09079.MEDIUM));
      class09991 class09991xx = class09991.N();
      y_5 = class09991.N(class09991xx.i(class11300.L(-1, 72.0F)), class09221.N(14, class09079.MEDIUM));
   }

   private static int b() {
      return (class04453)((class06202)L_0).T_4 == null ? 0 : Math.round(class11902.N() * 10.0F);
   }

   private static boolean t() {
      Logo logo = class11938.u().Nj();
      return logo.T().i() == logo.m();
   }

   @Override
   public class09991 z() {
      return !t() ? class09991.N : class09991.N().N(class09666.N(B() - 20.0F, -100.0F));
   }

   private static boolean u(Logo var0) {
      return var0.j().U() || var0.P().U() || var0.n().U();
   }

   private static String y(int var0) {
      return Integer.toString(N(var0));
   }

   @Override
   public boolean y() {
      return class11938.u().Nj().U();
   }

   private static boolean y(Logo var0) {
      return var0.t().U() || var0.s().U() || var0.b().U() || var0.v().U();
   }

   private static class09798 y(Logo var0, class09211 var1) {
      return class09778.N((class09991)u_0, var2 -> {
         var2.N("logoTopRow");
         var2.y(y(var1));
         if (y(var0)) {
            var2.y(N(var0, var1));
         }
      });
   }

   private static class09798 y(class09211 var0) {
      return class09778.N((class09991)u_1, var1 -> {
         var1.N("logoPill");
         var1.N_3((class09991)y_0, var1x -> {
            var1x.N("logoPillIconItem");
            var1x.L(var1xx -> var1xx.N("logoPillIcon").L("icon:hud/nurikware").N(((class09227)y_1).N(var0)));
         });
         N(var1, "logoPillDivider");
         var1.N_3((class09991)u_2, var0xx -> {
            var0xx.N("logoPillTextItem");
            var0xx.N_3((class09991)y_2, var0xxx -> {
               var0xxx.N("logoPillText");
               var0xxx.y(var0xxxx -> var0xxxx.N("logoPillText-value").L("NurikWare").N((class09991)y_4));
            });
         });
      });
   }

   private static void N(class09784 var0, String var1) {
      var0.N(var1x -> var1x.N(var1).N((class09991)class09180.N_3));
   }

   private static void N(class09784 var0, String var1, String var2, String var3, boolean var4) {
      class09991 class09991 = var4 ? (class09991)y_3 : (class09991)y_2;
      var0.N_3(class09991, var3x -> {
         var3x.N(var1);
         var3x.y(var2xx -> var2xx.N(var1 + "-label").L(var2).N((class09991)y_5));
         var3x.y(var2xx -> var2xx.N(var1 + "-value").L(var3).N((class09991)y_4));
      });
   }

   private static int N(int var0) {
      if ((class04453)((class06202)L_0).T_4 == null) {
         return 0;
      } else {
         return (int)Math.floor(switch (var0) {
            case 0 -> ((class04453)((class06202)L_0).T_4).method_23317();
            case 1 -> ((class04453)((class06202)L_0).T_4).method_23318();
            default -> ((class04453)((class06202)L_0).T_4).method_23321();
         });
      }
   }

   private static class09798 N(Logo var0, class09211 var1) {
      return class09778.N((class09991)u_1, var2 -> {
         var2.N("logoDetailsPill");
         boolean[] aboolean = new boolean[]{false};
         if (var0.t().U()) {
            N(var2, "logoItemLogin", "player", w(), null, var1);
            aboolean[0] = true;
         }

         if (var0.s().U()) {
            if (aboolean[0]) {
               N(var2, "logoDivAfterLogin");
            }

            N(var2, "logoItemFps", "fps", Integer.toString(((class06202)L_0).Nx()), "fps", var1);
            aboolean[0] = true;
         }

         if (var0.b().U()) {
            if (aboolean[0]) {
               N(var2, "logoDivAfterFps");
            }

            N(var2, "logoItemPing", "ping", Integer.toString(class11910.u()), "ms", var1);
            aboolean[0] = true;
         }

         if (var0.v().U()) {
            if (aboolean[0]) {
               N(var2, "logoDivAfterPing");
            }

            N(var2, "logoItemTime", "time", LocalTime.now().format((DateTimeFormatter)L_1), null, var1);
         }
      });
   }

   private static void N(class09784 var0, String var1, String var2, String var3, String var4, class09211 var5) {
      var0.N_3((class09991)u_2, var5x -> {
         var5x.N(var1);
         var5x.L(var3xx -> var3xx.N(var1 + "-icon").L("icon:hud/" + var2).N(((class09227)y_1).N(var5)));
         var5x.N_3((class09991)y_2, var3xx -> {
            var3xx.N(var1 + "-text");
            var3xx.y(var2xxx -> var2xxx.N(var1 + "-value").L(var3).N((class09991)y_4));
            if (var4 != null) {
               var3xx.y(var2xxx -> var2xxx.N(var1 + "-suffix").L(var4).N((class09991)y_5));
            }
         });
      });
   }

   private static void N(class09784 var0, class09211 var1) {
      String s = "logoItemCoords";
      var0.N_3((class09991)u_2, var2x -> {
         var2x.N(s);
         var2x.L(var2xx -> var2xx.N(s + "-icon").L("icon:hud/coordinates").N(((class09227)y_1).N(var1)));
         var2x.N_3((class09991)y_2, var1xx -> {
            var1xx.N(s + "-text");
            N(var1xx, s + "-x", "x", y(0), false);
            N(var1xx, s + "-y", "y", y(1), true);
            N(var1xx, s + "-z", "z", y(2), true);
         });
      });
   }

   private static class09798 N(Void var0, class09809 var1) {
      class09211 class09211 = var1.N((class09804<class09211>)class09211.N_6);
      Logo logo = class11938.u().Nj();
      var1.L("logoSelection", () -> N(logo));
      var1.L("logoX", () -> N(0));
      var1.L("logoY", () -> N(1));
      var1.L("logoZ", () -> N(2));
      var1.L("logoMotion", LogoHud::b);
      var1.L("logoFps", ((class06202)L_0)::Nx);
      var1.L("logoPing", class11910::u);
      var1.L("logoTime", () -> LocalTime.now().toSecondOfDay());
      var1.L("logoAlign", LogoHud::t);
      return class09778.N(t() ? (class09991)N_3 : (class09991)N_2, var2x -> {
         var2x.N("logoRoot");
         var2x.y(y(logo, class09211));
         if (u(logo)) {
            var2x.y(L(logo, class09211));
         }
      });
   }

   private static int N(Logo var0) {
      byte b0 = 0;
      if (var0.t().U()) {
         b0 |= 1;
      }

      if (var0.s().U()) {
         b0 |= 2;
      }

      if (var0.b().U()) {
         b0 |= 4;
      }

      if (var0.v().U()) {
         b0 |= 8;
      }

      if (var0.j().U()) {
         b0 |= 16;
      }

      if (var0.P().U()) {
         b0 |= 32;
      }

      if (var0.n().U()) {
         b0 |= 64;
      }

      return b0;
   }

   private static String O() {
      return (class04453)((class06202)L_0).T_4 == null ? "0.0" : String.format(Locale.ROOT, "%.1f", class11902.N());
   }

   private static void G() {
      L_0 = null;
      L_1 = null;
      L_2 = 8;
      L_3 = 4;
      L_4 = 16;
      N_0 = 10;
      N_1 = 37;
      N_2 = null;
      N_3 = null;
      u_0 = null;
      u_1 = null;
      u_2 = null;
      y_0 = null;
      y_1 = null;
      y_2 = null;
      y_3 = null;
      y_4 = null;
      y_5 = null;
   }
}
