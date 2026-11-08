package NurikWare;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06556;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class08044;

@class11761(
   u = "cooldowns",
   i = 100.0F,
   N = 380.0F,
   L = true
)
public class CooldownsHud extends class11769 {
   public static Object N_0 = class06202.Nq();
   public static Object N_1 = class06570.nz.E();
   public static Object N_2;
   public static Object N_3 = class01894.y("nurikware_example_ender_pearl");
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public static Object N_7;
   public static Object y_0;
   public static Object y_1;
   public static Object L_0 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(100.0F))
      .N(11.0F)
      .i(11.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object L_1 = class09227.N(var0 -> class09991.N().u(16.0F, 16.0F).i(var0.M()));
   public static Object L_2 = class09991.N()
      .y(class09962.N(38.0F, Float.POSITIVE_INFINITY))
      .N(10.0F)
      .i(9.0F)
      .M(9.0F)
      .N(class09975.COLUMN)
      .N(class09983.BORDER_BOX);
   public static Object L_3 = class09991.N()
      .N(class09962.N(0.0F, Float.POSITIVE_INFINITY))
      .y(class09962.N())
      .N(class09975.ROW)
      .B(4.0F)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object L_4 = class09991.N().u(16.0F, 16.0F);
   public static Object L_5;
   public static Object L_6 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()), class09221.N(14, class09079.MEDIUM)));
   public static Object L_7 = class09991.N().N(class09962.N(45.0F, Float.POSITIVE_INFINITY)).y(class09962.N()).N(class09973.END).y(class09973.CENTER);
   public static Object u_0;
   public static Object u_1;
   public Object i_0;

   public CooldownsHud() {
      super(CooldownsHud::N);
      this.t();
      this.i_0 = new class11740(120.0F);
   }

   static {
      d();
      class09991 class09991x = class09991.N().N(class09962.N());
      y_1 = class09991.N((class09991)class11756.y_1, class09991x.y(class09962.N()).N(class09975.ROW).N(class09976.SELF).N(1.0F));
      class09991 class09991x = class09991.N();
      L_5 = class09991.N(class09991x.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
   }

   private static String i(int var0) {
      float f = (class03448)((class06202)N_0).T_3 != null ? ((class03448)((class06202)N_0).T_3).method_54719().R() : 20.0F;
      int i = Math.max(0, (int)Math.ceil(var0 / Math.max(1.0F, f)));
      int j = i / 60;
      int k = i % 60;
      return j + ":" + (k < 10 ? "0" + k : Integer.toString(k));
   }

   private static List<class11751> b() {
      if ((class04453)((class06202)N_0).T_4 == null) {
         return List.of();
      } else {
         class06556 class06556 = ((class04453)((class06202)N_0).T_4).method_7357();
         Set set = class11938.u().G().m() ? N(class06556) : null;
         int i = class06556.y;
         ArrayList arraylist = new ArrayList();

         for (Entry entry : class06556.N.entrySet()) {
            int j = ((class10621)entry.getValue()).y() - i;
            if (j > 0 && (set == null || set.contains(entry.getKey()))) {
               class06581 class06581 = (class06581)class04206.B.N((class01894)entry.getKey());
               if (class06581 != class06570.N) {
                  arraylist.add(new class11751((class01894)entry.getKey(), class06581.E(), j));
               }
            }
         }

         return arraylist;
      }
   }

   private static void d() {
      N_0 = null;
      N_1 = null;
      N_2 = 600;
      N_3 = null;
      N_4 = 10;
      N_5 = 16;
      N_6 = 120;
      N_7 = 14;
      u_0 = 4;
      u_1 = 20;
      y_0 = 45;
      y_1 = null;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      L_6 = null;
      L_7 = null;
   }

   private void t() {
   }

   private static List<String> j() {
      return b().stream().map(var0 -> var0.y() + " " + i(var0.N())).toList();
   }

   @Override
   public boolean y() {
      return class11938.u().G().U();
   }

   private static float N(String var0, String var1) {
      class11753 class11753 = class11938.i();
      float f = class11753.N(var0, 14.0F, class09079.REGULAR);
      float f1 = Math.max(45.0F, class11753.N(var1, 14.0F, class09079.MEDIUM));
      return 59.0F + f + f1;
   }

   private static class09798 N(String var0, class06584 var1) {
      class11867 class11867 = class11938.k().N(var1);
      return class09778.N((class09991)L_4, var2x -> {
         var2x.N(var0 + "-iconSlot");
         if (class11867.L()) {
            class09991 class09991 = class09991.N((class09991)L_4, class09991.N().N(class11867.y(), class11867.N(), class11867.R(), class11867.i()));
            var2x.L(var2xx -> var2xx.N(var0 + "-icon").L(class11938.k().y()).N(class09991));
         }
      });
   }

   private static class09798 N(String var0, String var1, class09211 var2) {
      return class09778.N((class09991)L_7, var3 -> {
         var3.N(var0 + "-durationBox");
         var3.y(var3x -> var3x.N(var0 + "-duration").L(var1).N(((class09227)L_6).N(var2)));
      });
   }

   private static class09798 N(Void var0, class09809 var1) {
      class09211 class09211 = var1.N((class09804<class09211>)class09211.N_6);
      CooldownsHud cooldownshud = (CooldownsHud)class11730.N_5;
      var1.u("cooldownsTicker", () -> (class11740)cooldownshud.i_0);
      var1.L("cooldownsDurations", CooldownsHud::j);
      List list = ((class11740)cooldownshud.i_0).N(b(), class11751::y);
      boolean flag = class11753.y();
      boolean flag1 = !list.isEmpty() || flag;
      boolean flag2 = ((class11740)cooldownshud.i_0).N(flag1);
      float f = ((class11740)cooldownshud.i_0).N(flag1, N(list, flag));
      return class09778.N((class09991)y_1, var5x -> {
         var5x.N("cooldownsWindow");
         var5x.N_3((class09991)L_0, var1xx -> {
            var1xx.N("cooldownsIconArea");
            var1xx.L(var1xxx -> var1xxx.N("hud-cooldowns").L("icon:hud/cooldowns").N(((class09227)L_1).N(class09211)));
         });
         var5x.N(var0xx -> var0xx.N("cooldownsDivider").N((class09991)class09180.N_3));
         var5x.y(N(list, flag, class09211, flag2, f));
      });
   }

   @Override
   public boolean N() {
      return !b().isEmpty() || class11753.y();
   }

   private static String N(class01894 var0) {
      return "cooldownRow-" + var0.toString().replace(':', '-');
   }

   private static class09798 N(List<class11751> var0, boolean var1, class09211 var2, boolean var3, float var4) {
      return class09778.N(
         var3 ? class11756.N((class09991)L_2, var4, 120.0F, (class09728)class11644.N_0) : class11756.N((class09991)L_2, var4, 120.0F),
         var4x -> {
            var4x.N("cooldownsContentBox");
            if (var0.isEmpty() && var1) {
               String s1 = N((class01894)N_3);
               var4x.N_3(class11756.N(true, var3), var2xx -> {
                  var2xx.N(s1);
                  var2xx.y(N(s1, (class06584)N_1, ((class06584)N_1).d().getString()));
                  var2xx.y(N(s1, i(600), var2));
               });
            } else {
               int i = 0;

               for (class11751 class11751 : var0) {
                  String s = N(class11751.y());
                  class09991 class09991 = ((class11740)((CooldownsHud)class11730.N_5).i_0).N(class11751.y())
                     ? (class09991)class11756.L_5
                     : class11756.N(i++ == 0, var3);
                  var4x.N_3(class09991, var3xx -> {
                     var3xx.N(s);
                     var3xx.y(N(s, class11751.L(), class11751.L().d().getString()));
                     var3xx.y(N(s, i(class11751.N()), var2));
                  });
               }
            }
         }
      );
   }

   private static float N(List<class11751> var0, boolean var1) {
      if (var0.isEmpty() && var1) {
         return N(((class06584)N_1).d().getString(), i(600));
      } else {
         float f = 0.0F;

         for (class11751 class11751 : var0) {
            f = Math.max(f, N(class11751.L().d().getString(), i(class11751.N())));
         }

         return f;
      }
   }

   private static Set<class01894> N(class06556 var0) {
      HashSet hashset = new HashSet();
      class08044 class08044 = ((class04453)((class06202)N_0).T_4).method_31548();

      for (int i = 0; i < class08044.method_5439(); i++) {
         class06584 class06584 = class08044.method_5438(i);
         if (!class06584.R()) {
            class01894 class01894 = var0.y(class06584);
            if (class01894 != null) {
               hashset.add(class01894);
            }
         }
      }

      return hashset;
   }

   private static class09798 N(String var0, class06584 var1, String var2) {
      return class09778.N((class09991)L_3, var3 -> {
         var3.N(var0 + "-left");
         var3.y(N(var0, var1));
         var3.y(var2xx -> var2xx.N(var0 + "-name").L(var2).N((class09991)L_5));
      });
   }
}
