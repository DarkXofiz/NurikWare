package NurikWare;

import java.util.List;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class05018;
import minecraft.class05913;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class08388;
import minecraft.class08392;
import minecraft.class08923;

@class11761(
   u = "effects",
   i = 100.0F,
   N = 270.0F,
   L = true
)
public class EffectsHud extends class11769 {
   public Object N_0;
   public static Object y_0 = class09991.N()
      .y(class09962.N(38.0F, Float.POSITIVE_INFINITY))
      .N(10.0F)
      .i(9.0F)
      .M(9.0F)
      .N(class09975.COLUMN)
      .N(class09983.BORDER_BOX);
   public static Object y_1 = class09991.N()
      .N(class09962.N(0.0F, Float.POSITIVE_INFINITY))
      .y(class09962.N())
      .N(class09975.ROW)
      .B(4.0F)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object y_2 = class09991.N().u(18.0F, 18.0F);
   public static Object y_3 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW).B(4.0F).y(class09973.CENTER);
   public static Object y_4;
   public static Object y_5;
   public static Object y_6 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()), class09221.N(14, class09079.MEDIUM)));
   public static Object y_7 = class09991.N().N(class09962.N(45.0F, Float.POSITIVE_INFINITY)).y(class09962.N()).N(class09973.END).y(class09973.CENTER);
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3 = class11300.L(-1, 72.0F);
   public static Object L_4;
   public static Object L_5 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(100.0F))
      .N(11.0F)
      .i(11.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object L_6 = class09227.N(var0 -> class09991.N().u(16.0F, 16.0F).i(var0.M()));
   public static Object u_0 = class09227.N(var0 -> class09991.N(((class09227)y_6).N(var0), class09991.N().i(var0.M()).l(1.0F)));
   public static Object u_1 = class09227.N(var0 -> class09991.N(((class09227)y_6).N(var0), class09991.N().i(-35981).l(1.0F)));
   public static Object i_0;
   public static Object i_1 = class01894.y("textures/atlas/gui.png");
   public static Object i_2;
   public static Object R_0;
   public static Object R_1;
   public static Object R_2;
   public static Object R_3;
   public static Object M_0 = class06202.Nq();
   public static Object M_1 = new class07055(class07047.N, 999);

   private static String L(class07055 var0) {
      int i = Byte.toUnsignedInt((byte)var0.i()) + 1;
      return i <= 1 ? "" : Integer.toString(i);
   }

   private static String L(class03556<class07084> var0) {
      return var0.i().map(var0x -> var0x.N().toString()).orElse("unknown");
   }

   private static boolean M(class07055 var0) {
      return var0 != null && !((class07084)var0.L().N()).z();
   }

   private static List<class07055> T() {
      return (class04453)((class06202)M_0).T_4 == null
         ? List.of()
         : ((class04453)((class06202)M_0).T_4).method_6026().stream().filter(var0 -> !((class07084)var0.L().N()).N()).toList();
   }

   public EffectsHud() {
      super(EffectsHud::N);
      this.b();
      this.N_0 = new class11740(120.0F);
   }

   static {
      n();
      class09991 class09991xx = class09991.N().N(class09962.N());
      L_4 = class09991.N((class09991)class11756.y_1, class09991xx.y(class09962.N()).N(class09975.ROW).N(class09976.SELF).N(1.0F));
      class09991 class09991x = class09991.N();
      y_4 = class09991.N(class09991x.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
      class09991 class09991xx = class09991.N();
      y_5 = class09991.N(class09991xx.i((Integer)L_3).m(1.0F), class09221.N(12, class09079.REGULAR));
   }

   private static String i(class07055 var0) {
      return N(var0.L());
   }

   private void b() {
   }

   private static void n() {
      M_0 = null;
      M_1 = null;
      i_0 = "mcatlas:textures/atlas/gui.png";
      i_1 = null;
      i_2 = 10;
      R_0 = 20;
      R_1 = 18;
      R_2 = 120;
      R_3 = 14;
      L_0 = 12;
      L_1 = 4;
      L_2 = 45;
      L_3 = -1191182337;
      L_4 = null;
      L_5 = null;
      L_6 = null;
      y_0 = null;
      y_1 = null;
      y_2 = null;
      y_3 = null;
      y_4 = null;
      y_5 = null;
      y_6 = null;
      y_7 = null;
      u_0 = null;
      u_1 = null;
   }

   private static String d() {
      return class12020.N("hud.example");
   }

   private static List<String> t() {
      return T().stream().map(EffectsHud::N).toList();
   }

   private static String u(class07055 var0) {
      return class08392.N(var0.z(), new Object[0]);
   }

   private static float y(String var0, String var1, String var2) {
      class11753 class11753 = class11938.i();
      float f = class11753.N(var0, 14.0F, class09079.REGULAR);
      float f1 = class11753.N(var1, 12.0F, class09079.REGULAR);
      float f2 = Math.max(45.0F, class11753.N(var2, 14.0F, class09079.MEDIUM));
      return 41.0F + f + ((f1 > 0.0F ? 4 : 0) + f1) + 20.0F + f2;
   }

   @Override
   public boolean y() {
      return class11938.u().Y().U();
   }

   private static class01894 y(class03556<class07084> var0) {
      return var0.i().<class01894>map(class05946::N).map(var0x -> var0x.R("mob_effect/")).orElseGet(class08923::L);
   }

   @Override
   public boolean N() {
      return !T().isEmpty() || class11753.y();
   }

   private static class09798 N(String var0, String var1, String var2) {
      return class09778.N((class09991)y_3, var3 -> {
         var3.N(var0 + "-nameBox");
         var3.y(var2xx -> var2xx.N(var0 + "-name").L(var1).N((class09991)y_4));
         if (!var2.isEmpty()) {
            var3.y(var2xx -> var2xx.N(var0 + "-level").L(var2).N((class09991)y_5));
         }
      });
   }

   private static class09798 N(String var0, class03556<class07084> var1) {
      class08388 class08388 = ((class06202)M_0).yW().N(new class05913((class01894)i_1, y(var1)));
      class09991 class09991 = class09991.N(
         (class09991)y_2, class09991.N().N(class08388.method_4594(), class08388.method_4593(), class08388.method_4577(), class08388.method_4575())
      );
      return class09778.N((class09991)y_2, var2x -> {
         var2x.N(var0 + "-iconSlot");
         var2x.L(var2xx -> var2xx.N(var0 + "-icon").L("mcatlas:textures/atlas/gui.png").N(class09991));
      });
   }

   private static class09798 N(List<class07055> var0, boolean var1, class09211 var2, boolean var3, float var4) {
      return class09778.N(
         var3 ? class11756.N((class09991)y_0, var4, 120.0F, (class09728)class11644.N_0) : class11756.N((class09991)y_0, var4, 120.0F),
         var4x -> {
            var4x.N("effectsContentBox");
            if (var0.isEmpty() && var1) {
               String s1 = "effectRow-example";
               var4x.N_3(class11756.N(true, var3), var2xx -> {
                  var2xx.N(s1);
                  var2xx.y(N(s1, class07047.N, d(), "2", (class07055)M_1));
                  var2xx.y(N(s1, "9:41", null, var2));
               });
            } else {
               int i = 0;

               for (class07055 class07055 : var0) {
                  String s = i(class07055);
                  class09991 class09991 = ((class11740)((EffectsHud)class11730.N_0).N_0).N(L(class07055.L()))
                     ? (class09991)class11756.L_5
                     : class11756.N(i++ == 0, var3);
                  var4x.N_3(class09991, var3xx -> {
                     var3xx.N(s);
                     var3xx.y(N(s, class07055.L(), u(class07055), L(class07055), class07055));
                     var3xx.y(N(s, N(class07055), class07055, var2));
                  });
               }
            }
         }
      );
   }

   private static class09798 N(String var0, String var1, class07055 var2, class09211 var3) {
      class09991 class09991 = M(var2) ? ((class09227)u_1).N(var3) : ((class09227)u_0).N(var3);
      return class09778.N((class09991)y_7, var3x -> {
         var3x.N(var0 + "-durationBox");
         var3x.y(var3xx -> var3xx.N(var0 + "-duration").L(var1).N(class09991));
      });
   }

   private static String N(class07055 var0) {
      if (var0.y()) {
         return "**:**";
      } else {
         float f = (class03448)((class06202)M_0).T_3 != null ? ((class03448)((class06202)M_0).T_3).method_54719().R() : 20.0F;
         return class05018.N(var0.u(), f);
      }
   }

   private static String N(class03556<class07084> var0) {
      return "effectRow-" + L(var0);
   }

   private static class09798 N(Void var0, class09809 var1) {
      class09211 class09211 = var1.N((class09804<class09211>)class09211.N_6);
      EffectsHud effectshud = (EffectsHud)class11730.N_0;
      var1.u("effectsTicker", () -> (class11740)effectshud.N_0);
      var1.L("effectsDurations", EffectsHud::t);
      List list = ((class11740)effectshud.N_0).N(T(), var0x -> L(var0x.L()));
      boolean flag = class11753.y();
      boolean flag1 = !list.isEmpty() || flag;
      boolean flag2 = ((class11740)effectshud.N_0).N(flag1);
      float f = ((class11740)effectshud.N_0).N(flag1, N(list, flag));
      return class09778.N((class09991)L_4, var5x -> {
         var5x.N("effectsWindow");
         var5x.N_3((class09991)L_5, var1xx -> {
            var1xx.N("effectsIconArea");
            var1xx.L(var1xxx -> var1xxx.N("hud-effects").L("icon:hud/potions").N(((class09227)L_6).N(class09211)));
         });
         var5x.N(var0xx -> var0xx.N("effectsDivider").N((class09991)class09180.N_3));
         var5x.y(N(list, flag, class09211, flag2, f));
      });
   }

   private static class09798 N(String var0, class03556<class07084> var1, String var2, String var3, class07055 var4) {
      return class09778.N((class09991)y_1, var4x -> {
         var4x.N(var0 + "-left");
         var4x.y(N(var0, var1));
         var4x.y(N(var0, var2, var3));
      });
   }

   private static float N(List<class07055> var0, boolean var1) {
      if (var0.isEmpty() && var1) {
         return y(d(), "2", "9:41");
      } else {
         float f = 0.0F;

         for (class07055 class07055 : var0) {
            f = Math.max(f, y(u(class07055), L(class07055), N(class07055)));
         }

         return f;
      }
   }

   @class11782
   public void N(class10997 var1) {
      class11938.i().N();
   }
}
