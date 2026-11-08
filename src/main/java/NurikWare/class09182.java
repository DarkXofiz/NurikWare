package NurikWare;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class class09182 {
   public static Object N_0 = class09992.N("account.delete.modal.close");
   public static Object N_1 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).y(class09973.CENTER).y().N(class09975.ROW);
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object L_0;
   public static Object L_1 = class09991.N()
      .N(class09969.FLOATING)
      .N(0.0F, 0.0F)
      .R()
      .N(1001)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09976.SELF)
      .Z(16.0F)
      .j(5.0F)
      .y(class09662.N(-16777216, 0.35F))
      .l(1.0F)
      .N(class09994.s((class09743)class11644.N_0))
      .N(var0 -> var0.l(0.0F))
      .y(var0 -> var0.l(0.0F));
   public static Object L_2 = class09991.N()
      .N(class09962.y(360.0F))
      .y(class09962.N())
      .N(16.0F)
      .B(12.0F)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(12.0F)
      .v(20.0F)
      .L(class09662.N(-16777216, 0.25F))
      .N(class09973.START)
      .y(class09973.START)
      .N(class09983.BORDER_BOX)
      .N(class09975.COLUMN);
   public static Object L_3;
   public static Object L_4;
   public static Object u_0 = class09991.N(class09991.N().i(-7171438), class09221.N(16, class09079.REGULAR));
   public static Object u_1 = class09991.N().u(12.0F, 12.0F).i(-7171438);
   public static Object u_2 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(44.0F))
      .B(12.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F)
      .N(class09975.ROW);
   public static Object u_3 = class09991.N((class09991)u_2, class09991.N().L(true).l(0.5F));
   public static Object u_4 = class09991.N(class09991.N().i(-29813), class09221.N(16, class09079.REGULAR));
   public static Object i_0 = class09991.N()
      .u(16.0F, 16.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N((class09992)N_0, var0 -> var0.i((Integer)class09181.N_0));
   public static Object i_1 = class09991.N().u(16.0F, 16.0F).N((class09992)N_0).i(-7171438).N(class09692.N(class09994.L((class09743)class11644.N_0)));
   public static Object i_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).B(6.0F).N(class09975.COLUMN);
   public static Object i_3 = class09991.N(class09991.N().i(-7171438), class09221.N(13, class09079.REGULAR));
   public static Object i_4 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(44.0F))
      .u(12.0F)
      .i(12.0F)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F)
      .N(class09983.BORDER_BOX)
      .y(class09973.CENTER)
      .y()
      .N(class09975.ROW);
   public static Object i_5;
   public static Object i_6;
   public static Object R_0 = new class09182()::N;
   public static Object R_1;
   public static Object R_2;
   public static Object R_3;
   public static Object M_0;
   public static Object M_1;
   public static Object M_2;

   private static void L() {
   }

   private static List<class11535> L(int var0) {
      ArrayList arraylist = new ArrayList(((List)L_0).size());

      for (int i = 0; i < ((List)L_0).size(); i++) {
         arraylist.add(new class11535(((class09200)((List)L_0).get(i)).N(), (var0 & 1 << i) != 0));
      }

      return arraylist;
   }

   private class09182() {
      super();
   }

   static {
      L();
      y();
      N();
      class09200 class09200 = new class09200("account-generated", class09054.OFFLINE_GENERATED);
      class09200 class09200x = new class09200("account-offline", class09054.OFFLINE);
      L_0 = List.of(class09200, class09200x, new class09200("account-microsoft", class09054.MICROSOFT));
      class09991 class09991xx = class09991.N();
      L_3 = class09991.N(class09991xx.i((Integer)class09181.N_0), class09221.N(20, class09079.SEMI_BOLD));
      class09991 class09991x = class09991.N();
      i_5 = class09991.N((class09991)i_4, class09991x.u((Integer)class09181.y_2));
      class09991 class09991xx = class09991.N();
      i_6 = class09991.N(class09991xx.i((Integer)class09181.N_0), class09221.N(16, class09079.REGULAR));
   }

   private static String z(int var0) {
      StringJoiner stringjoiner = new StringJoiner(", ");

      for (int i = 0; i < ((List)L_0).size(); i++) {
         if ((var0 & 1 << i) != 0) {
            stringjoiner.add(class12020.N("entry." + ((class09200)((List)L_0).get(i)).N()));
         }
      }

      return stringjoiner.toString();
   }

   private static Set<class09054> u(int var0) {
      EnumSet<class09054> enumset = EnumSet.noneOf(class09054.class);

      for (int i = 0; i < ((List)L_0).size(); i++) {
         if ((var0 & 1 << i) != 0) {
            enumset.add(((class09200)((List)L_0).get(i)).y());
         }
      }

      return enumset;
   }

   private static void y() {
   }

   private static void N(Set<class09054> var0) {
      class11491 class11491 = class11938.M().N(class11491.class);
      boolean flag = false;

      for (class09250 class09250 : class11938.s().u()) {
         if (!class09250.y() && var0.contains(class09250.L())) {
            class11054.N(class09250.R());
            if (class09250.R().equals(class11491.y())) {
               class11491.N(null);
               flag = true;
            }

            class11938.s().N(class09250.R());
         }
      }

      if (flag) {
         class11519.y(class11491.class);
      }
   }

   private class09798 N(Void var1, class09809 var2) {
      class09785 class09785xx = var2.y("nurikware:deleteAccountsModalOpened", false);
      if (!(Boolean)class09785xx.L()) {
         return class09778.N(var0 -> var0.N("deleteAccountsModalHidden").N(class11629.N()));
      } else {
         class09785 class09785x = var2.N("deleteAccountsTargets", 0);
         class09785 class09785xx = var2.N("deleteAccountsListOpened", false);
         Runnable runnable = () -> {
            class09785x.N(0);
            class09785.N(false);
            class09785xx.N(false);
         };
         return class09778.N((class09991)L_1, var4x -> {
            var4x.N("deleteAccountsModalBlur");
            var4x.N(class09867.POINTER_DOWN, class09860::T);
            var4x.N(class09867.CLICK, class09860::T);
            var4x.N(class09867.KEY_DOWN, var1xx -> {
               if (var1xx instanceof class09865 class09865 && class09865.y() && class09865.N() == 256) {
                  runnable.run();
                  var1xx.T();
               }
            });
            var4x.N_3((class09991)L_2, var4xx -> {
               var4xx.N("deleteAccountsModalPanel");
               var4xx.N(class09867.POINTER_DOWN, class09860::T);
               var4xx.N(class09867.CLICK, class09860::T);
               var4xx.N_3((class09991)N_1, var1xxx -> {
                  var1xxx.N(class12020.N("account.delete.title"), (class09991)L_3);
                  var1xxx.y(N(runnable));
               });
               var4xx.N_3((class09991)i_2, var3xxx -> {
                  var3xxx.N("deleteAccountsTargetGroup");
                  var3xxx.N(class12020.N("account.delete.select"), (class09991)i_3);
                  var3xxx.y(N(var2, class09785x, class09785));
               });
               boolean flag = (Integer)class09785x.L() == 0;
               var4xx.N_3(flag ? (class09991)u_3 : (class09991)u_2, var3xxx -> {
                  var3xxx.N("deleteAccountsConfirmButton");
                  var3xxx.N(class09867.POINTER_DOWN, class09860::T);
                  if (!flag) {
                     var3xxx.N_1(var2xxxx -> {
                        N(u((Integer)class09785x.L()));
                        runnable.run();
                        var2xxxx.T();
                     });
                  }

                  var3xxx.N(class12020.N("account.delete.confirm"), (class09991)u_4);
               });
            });
         });
      }
   }

   private static void N() {
      R_0 = null;
      R_1 = "nurikware:deleteAccountsModalOpened";
      R_2 = 256;
      R_3 = 360;
      y_0 = 44;
      y_1 = -29813;
      y_2 = 12;
      y_3 = "icon:menu/angles";
      y_4 = 16;
      M_0 = 12;
      M_1 = 328.0F;
      M_2 = 0;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = 16;
      N_0 = null;
      N_1 = null;
      i_0 = null;
      i_1 = null;
      i_2 = null;
      i_3 = null;
      i_4 = null;
      i_5 = null;
      i_6 = null;
      u_0 = null;
      u_1 = null;
      u_2 = null;
      u_3 = null;
      u_4 = null;
   }

   private static void N(class09785<Integer> var0, class11535 var1) {
      for (int i = 0; i < ((List)L_0).size(); i++) {
         if (var1.E().N().equals("entry." + ((class09200)((List)L_0).get(i)).N())) {
            var0.N((Integer)var0.L() ^ 1 << i);
            return;
         }
      }
   }

   private static class09798 N(class09809 var0, class09785<Integer> var1, class09785<Boolean> var2) {
      return class09778.N(
         var2.L() ? (class09991)i_5 : (class09991)i_4,
         var3 -> {
            var3.N("deleteAccountsTargetField");
            var3.N(class09867.POINTER_DOWN, class09860::T);
            boolean flag = (Integer)var1.L() == 0;
            var3.N(flag ? "—" : z((Integer)var1.L()), flag ? (class09991)u_0 : (class09991)i_6);
            var3.L(var0xx -> {
               var0xx.N("deleteAccountsTargetChevron");
               var0xx.L("icon:menu/angles");
               var0xx.N((class09991)u_1);
            });
            var3.N_1(var1xx -> {
               var2.N(true);
               var1xx.T();
            });
            var3.y(
               var0.N(
                  "deleteAccountsTargetList",
                  (class09788<class11840>)class11614.y_0,
                  new class11840(L((Integer)var1.L()), var2, var1xx -> N(var1, var1xx), 328.0F, -12.0F)
               )
            );
         }
      );
   }

   private static class09798 N(Runnable var0) {
      return class09778.N((class09991)i_0, var1 -> {
         var1.N("deleteAccountsModalClose");
         var1.N(class09867.POINTER_DOWN, class09860::T);
         var1.N_1(var1x -> {
            var0.run();
            var1x.T();
         });
         var1.L(var0xx -> var0xx.L("icon:menu/xmark").N((class09991)i_1));
      });
   }
}
