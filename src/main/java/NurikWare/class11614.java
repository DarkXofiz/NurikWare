package NurikWare;

import java.util.function.Consumer;

public class class11614 {
   private static String[] G;
   public static Object N_0 = class09991.N()
      .N(class09962.y(142.0F, Float.POSITIVE_INFINITY))
      .y(class09962.y(30.0F))
      .y(class09973.CENTER)
      .Z(6.0F)
      .L(var0 -> var0.y(-15592942));
   public static Object N_1 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(100.0F))
      .y(class09973.CENTER)
      .N(4.0F)
      .N(class09983.BORDER_BOX)
      .N(class09994.N(class09736.PADDING_LEFT, (class09743)class11644.N_0));
   public static Object N_2 = class09991.N()
      .y(class09962.y(12.0F))
      .N(class09969.FLOATING)
      .N(4.0F, 9.0F)
      .N(class09976.SELF)
      .N(class09692.N(class09994.E((class09743)class11644.N_0)));
   public static Object y_0 = new class11614()::N;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;
   public static Object y_6;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3 = class09991.N()
      .N(class09962.N())
      .y(class09962.N())
      .y(-16119286)
      .N(4.0F)
      .N(class09983.BORDER_BOX)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F)
      .v(10.0F)
      .L(class09662.N(-16777216, 0.25F))
      .N(class09975.COLUMN)
      .l(1.0F)
      .y(var0 -> var0.l(0.0F))
      .N(class09994.s((class09743)class11644.N_0));
   public static Object L_4 = class09991.N().N(class09962.N()).y(class09962.N(30.0F, Float.POSITIVE_INFINITY)).N(class09975.COLUMN);
   public static Object L_5 = class09991.N().N(class09962.N()).y(class09962.N()).B(4.0F).N(class09975.COLUMN);
   public static Object u_0;
   public static Object u_1;
   public static Object u_2;
   public static Object u_3;
   public static Object u_4;
   public static Object u_5;
   public static Object i_0 = class09991.N().u(12.0F, 12.0F).i((Integer)class09181.N_0);
   public static Object i_1 = class09991.N().N(class09994.L((class09743)class11644.N_0));
   public static Object i_2 = class09991.N((class09991)i_1, class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object i_3;
   public static Object i_4 = class09991.N().N(class09962.N(100.0F));
   public static Object i_5 = class11629.N();
   public static Object i_6;

   private static class09991 L(boolean var0) {
      return !var0
         ? (class09991)L_4
         : class09991.N(
            (class09991)L_4,
            class09991.N().y(class09962.N(30.0F, 268.0F)).N(class09976.PARENT).N(class09993.AUTO).N(class09970.CLASSIC).N((class10001)class09180.N_0)
         );
   }

   private class11614() {
      super();
   }

   static {
      N();
      y();
      i();
      class09991 class09991 = class09991.N();
      i_3 = class09991.N((class09991)i_1, class09991.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
   }

   private static void i() {
      y_1 = 30;
      y_2 = 4;
      y_3 = 1;
      y_4 = 4;
      y_5 = 8;
      y_6 = 8;
      u_0 = 4;
      u_1 = 3;
      u_2 = 7;
      u_3 = 268;
      u_4 = 4;
      u_5 = 12;
      L_0 = 4;
      L_1 = 12;
      L_2 = 24;
      i_6 = G[4];
   }

   private static class09991 y(boolean var0) {
      return !var0 ? (class09991)L_5 : class09991.N((class09991)L_5, class09991.N().i(7.0F));
   }

   private static void y() {
      G = new String[5];
      G[0] = "icon:menu/check";
      G[1] = "comboListMount";
      G[2] = "comboListCatcher";
      G[3] = "comboListPanel";
      G[4] = "comboListAnchor";
   }

   private static void N() {
   }

   private static void N(class09784 var0, class11535 var1, boolean var2, Consumer<class11535> var3) {
      String s = var1.E().N();
      var0.N_3((class09991)N_0, var4x -> {
         var4x.N_3(N(var1.U()), var1xx -> var1xx.L(var1xxx -> {
            var1xxx.N("check-" + s);
            var1xxx.L(G[0]);
            var1xxx.N((class09991)i_0);
         }));
         var4x.N_3(N(var2, var1.U()), var1xx -> var1xx.N(class12020.N(var1.E()), var1.U() ? (class09991)i_3 : (class09991)i_2));
         var4x.N_1(var2xx -> var3.accept(var1));
      });
   }

   private class09798 N(class11840 var1, class09809 var2) {
      boolean flag = var1.L().L();
      boolean flag1 = var1.u().size() > 8;
      boolean flag2 = var1.u().stream().anyMatch(class11535::U);
      String s = "comboListAnchor" + System.identityHashCode(var1.L());
      class09991 class09991xxx = class09991.N().N(class09969.FLOATING).U(var1.y()).u(0.0F, 0.0F);
      boolean flag3 = var1.N() != null;
      class09991 class09991x = flag3 ? class09991.N((class09991)L_3, class09991.N().N(class09962.y(var1.N()))) : (class09991)L_3;
      class09991 class09991xx = flag3 ? class09991.N(L(flag1), (class09991)i_4) : L(flag1);
      class09991 class09991xxx = flag3 ? class09991.N(y(flag1), (class09991)i_4) : y(flag1);
      return class11629.N((class09991)i_5, var8x -> {
         var8x.N(G[1]);
         var8x.N_3(class09991xxx, var1xx -> var1xx.N(s));
         if (flag) {
            var8x.y(class11629.N(G[2], 2000, () -> var1.L().N(false)));
            var8x.N_3(class09991.N(class09991xx, class11629.N(s, 0.0F, 2001)), var4xx -> {
               var4xx.N(G[3]);
               var4xx.N_3(class09991x, var3xxx -> var3xxx.N_3(class09991, var2xxxx -> {
                  for (class11535 class11535 : var1.u()) {
                     N(var2xxxx, class11535, flag2, var1.i());
                  }
               }));
            });
         }
      });
   }

   private static class09991 N(boolean var0) {
      return class09991.N((class09991)N_2, class09991.N().N(class09962.y(var0 ? 12.0F : 0.0F)));
   }

   private static class09991 N(boolean var0, boolean var1) {
      if (var1) {
         return class09991.N((class09991)N_1, class09991.N().u(24.0F));
      } else {
         return var0 ? class09991.N((class09991)N_1, class09991.N().u(12.0F)) : (class09991)N_1;
      }
   }
}
