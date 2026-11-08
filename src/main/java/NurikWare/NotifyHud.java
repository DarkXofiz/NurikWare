package NurikWare;

import java.util.List;
import org.joml.Vector2f;

@class11761(
   u = "notify",
   i = 0.0F,
   N = 200.0F,
   y = class11616.VERTICAL
)
public class NotifyHud extends class11769 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6 = class11300.L(16777215, 12.0F);
   public static Object N_7 = class09991.N().N(class09975.COLUMN).N(class09973.CENTER).y(class09962.N()).L(true);
   public static Object y_0 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(0.0F, 64.0F))
      .M(8.0F)
      .N(class09692.N(class09994.W((class09743)class11644.N_0), class09994.M((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0)))
      .N(var0 -> var0.y(class09962.N(0.0F, 0.0F)).M(0.0F).l(0.0F))
      .y(var0 -> var0.y(class09962.N(0.0F, 0.0F)).M(0.0F).l(0.0F));
   public static Object y_1 = class09991.N((class09991)y_0, class09991.N().M(0.0F));
   public static Object L_0 = class11863.N();
   public static Object L_1 = class09991.N().R().Z(999.0F).N(class09692.N(class09994.Z((class09743)L_0)));
   public static Object L_2;
   public static Object L_3 = List.of(new class11875(() -> true), new class11875(() -> false));
   public static Object L_4 = -1;
   public static Object L_5;
   public static Object u_0;
   public static Object u_1;
   public static Object u_2 = class09991.N().N(class09962.N()).y(class09962.N()).L(10.0F).y(class09973.CENTER);
   public static Object u_3 = class09991.N((class09991)u_2, class09991.N().N(class09976.SELF));
   public static Object u_4 = class09991.N().N(class09962.N()).y(class09962.y(0.0F, Float.POSITIVE_INFINITY)).L(10.0F).N(class09983.BORDER_BOX);
   public static Object u_5 = class09991.N().N(class09962.y(4.0F)).y(class09962.N(100.0F)).Z(999.0F).N(class09976.SELF).y((Integer)N_6);

   public NotifyHud() {
      super(NotifyHud::N);
   }

   static {
      d();
      class09991 class09991x = class09991.N();
      u_0 = class09991.N((class09991)y_0, class09991x.y(class09962.N(0.0F, 0.0F)).M(0.0F).l(0.0F));
      class09991 class09991x = class09991.N().N(class09962.N());
      u_1 = class09991.N((class09991)class11756.y_1, class09991x.y(class09962.N()).N(class09975.ROW).y(class09973.CENTER).B(9.0F).y(10.0F));
   }

   private static void d() {
      N_0 = 0.6F;
      N_1 = 10;
      N_2 = 8;
      N_3 = 9;
      N_4 = 64;
      N_5 = 4.0F;
      N_6 = 536870911;
      N_7 = null;
      y_0 = null;
      y_1 = null;
      u_0 = null;
      u_1 = null;
      u_2 = null;
      u_3 = null;
      u_4 = null;
      u_5 = null;
      L_0 = null;
      L_1 = null;
      L_2 = 5000L;
      L_3 = null;
      L_4 = -1;
      L_5 = null;
   }

   private static boolean k() {
      return class11938.g().N().stream().anyMatch(class11834::W);
   }

   @Override
   public Vector2f U() {
      return new Vector2f(0.0F, u() * 0.6F);
   }

   @Override
   public class09991 z() {
      return class09991.N().N(class09666.N(B() / 2.0F, -50.0F));
   }

   private static class11834 u(int var0) {
      if ((class11834)L_5 == null || (Integer)L_4 != var0 || !((class11834)L_5).E()) {
         L_4 = var0;
         long i = System.currentTimeMillis();
         long j = i - i % 5000L + 5000L;
         L_5 = class11938.g().i().y().N((class11849)((List)L_3).get(var0)).N(new class11857(class12020.N("hud.example.notify"))).N(5000L).i().N(j);
      }

      return (class11834)L_5;
   }

   @Override
   public boolean y() {
      return class11938.u().Nv().U() || k();
   }

   private static class09666 N(class11834 var0) {
      long i = var0.M();
      if (i <= 0L) {
         return class09666.N;
      } else {
         float f = class09693.N((float)(var0.Z() - System.currentTimeMillis()) / (float)i);
         return class09666.y((1.0F - f) * 100.0F);
      }
   }

   private static class09798 N(class11834 var0, boolean var1, class09809 var2) {
      String s = "notify-" + var0.N();
      return class09778.N(var0.E() ? (var1 ? (class09991)y_1 : (class09991)y_0) : (class09991)u_0, var3x -> {
         var3x.N(s);
         var3x.N_3((class09991)u_1, var3xx -> {
            var3xx.N(s + "-card");
            class11849 class11849 = var0.L();
            if (class11849 != null) {
               var3xx.N_3((class09991)u_2, var4x -> {
                  var4x.N(s + "-thumbnail");
                  var4x.y(class11849.N(var2, var0));
               });
               var3xx.N(var1xxx -> var1xxx.N(s + "-divider").N((class09991)class09180.N_3));
            }

            class11868 class11868 = var0.y();
            if (class11868 != null) {
               class09991 class09991 = class11756.N((class09991)u_3, class11868.N(), 0.0F, (class09728)class11644.N_0);
               var3xx.N_3(class09991, var4x -> {
                  var4x.N(s + "-content");
                  var4x.y(class11868.N(var2, var0));
               });
            }

            if (var0.M() > 0L) {
               var3xx.y(N(s, var0));
            }
         });
      });
   }

   private static class09798 N(Void var0, class09809 var1) {
      class11845 class11845 = class11938.g();
      var1.L("notifyRevision", class11845::y);
      var1.u("notifyTicker", class11766::new);
      List<class11834> list = class11845.N();
      if (!class11938.u().Nv().U()) {
         list = list.stream().filter(class11834::W).toList();
      }

      List list1 = list.isEmpty() && class11753.y() ? List.of(u(var1.L("notifyExampleStage", NotifyHud::G))) : list;
      int i = -1;

      for (int j = 0; j < list1.size(); j++) {
         if (((class11834)list1.get(j)).E()) {
            i = j;
            break;
         }
      }

      int k = i;
      return class09778.N((class09991)N_7, var3x -> {
         var3x.N("notifyStack");

         for (int ix = list1.size() - 1; ix >= 0; ix--) {
            var3x.y(N((class11834)list1.get(ix), ix == k, var1));
         }
      });
   }

   private static class09798 N(String var0, class11834 var1) {
      class09991 class09991 = class09991.N((class09991)L_1, class09991.N().y(var1.B().color()).y(N(var1)));
      return class09778.N((class09991)u_4, var2x -> {
         var2x.N(var0 + "-timeZone");
         var2x.N_3((class09991)u_5, var2xx -> {
            var2xx.N(var0 + "-timeTrack");
            var2xx.N(var2xxx -> var2xxx.N(var0 + "-timeFill").N(class09991));
         });
      });
   }

   @Override
   public boolean N() {
      return !class11938.g().N().isEmpty() || class11753.y();
   }

   private static int G() {
      return (int)(System.currentTimeMillis() / 5000L % ((List)L_3).size());
   }
}
