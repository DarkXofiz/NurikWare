package NurikWare;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public class class09194 {
   public static Object N_0;
   public static Object N_1 = class09991.N().u(12.0F, 12.0F).i(-7171438);
   public static Object N_2 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(44.0F))
      .u(12.0F)
      .i(12.0F)
      .N(class09976.SELF)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F)
      .N(class09983.BORDER_BOX)
      .y(class09973.CENTER)
      .N(class09975.ROW);
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6 = class09991.N()
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
   public static Object y_0;
   public static Object y_1 = class09992.N("share.modal.close");
   public static Object y_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).y(class09973.CENTER).y().N(class09975.ROW);
   public static Object y_3 = class09991.N()
      .u(16.0F, 16.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N((class09992)y_1, var0 -> var0.i((Integer)class09181.N_0));
   public static Object y_4 = class09991.N().u(16.0F, 16.0F).N((class09992)y_1).i(-7171438).N(class09692.N(class09994.L((class09743)class11644.N_0)));
   public static Object y_5 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).B(6.0F).N(class09975.COLUMN);
   public static Object y_6 = class09991.N()
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
   public static Object y_7;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object L_5;
   public static Object L_6;
   public static Object u_0 = new class09194()::N;
   public static Object u_1;
   public static Object u_2;
   public static Object u_3;
   public static Object i_0;
   public static Object i_1 = class09991.N(class09991.N().i(-7171438), class09221.N(13, class09079.REGULAR));
   public static Object i_2 = class09991.N(class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object i_3 = class09991.N(class09991.N().i(-1720197), class09221.N(14, class09079.REGULAR));
   public static Object i_4 = class09991.N(class09991.N().i(-29813), class09221.N(16, class09079.REGULAR));
   public static Object R_0;
   public static Object R_1 = class09991.N()
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
   public static Object R_2 = class09991.N()
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
   public static Object R_3;
   public static Object M_0;
   public static Object M_1 = Pattern.compile("^[0-9]{0,4}$");
   public static Object M_2 = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");

   private static boolean L(class11789 var0) {
      return var0 != null && var0.y() != 0L;
   }

   private class09194() {
      super();
   }

   static {
      N();
      y();
      u();
      class09192 class09192 = new class09192("share-1-day", 1);
      class09192 class09192x = new class09192("share-7-days", 7);
      class09192 class09192xx = new class09192("share-30-days", 30);
      R_0 = List.of(class09192, class09192x, class09192xx, new class09192("share-forever", 0));
      class09991 class09991xx = class09991.N();
      R_3 = class09991.N(class09991xx.i((Integer)class09181.N_0), class09221.N(20, class09079.SEMI_BOLD));
      class09991 class09991x = class09991.N();
      y_7 = class09991.N((class09991)y_6, class09991x.u((Integer)class09181.y_2));
      class09991 class09991xx = class09991.N();
      N_0 = class09991.N(class09991xx.i((Integer)class09181.N_0), class09221.N(16, class09079.REGULAR));
      class09991 class09991xxx = class09991.N().N(class09962.y(0.0F, Float.POSITIVE_INFINITY));
      N_3 = class09991.N(class09991xxx.y(class09962.y(0.0F, 100.0F)).y(class09973.CENTER).N(class09983.BORDER_BOX), class09221.N(16, class09079.REGULAR));
      N_4 = class09991.N((class09991)N_3, class09991.N().i(-7171438));
      class09991 class09991xxxx = class09991.N();
      N_5 = class09991.N((class09991)N_3, class09991xxxx.i((Integer)class09181.N_0));
      class09991 class09991xxxxx = class09991.N();
      i_0 = class09991.N(class09991xxxxx.i((Integer)class09181.N_0), class09221.N(16, class09079.REGULAR));
   }

   private static List<class11535> Z(int var0) {
      ArrayList arraylist = new ArrayList(((List)R_0).size());

      for (int i = 0; i < ((List)R_0).size(); i++) {
         arraylist.add(new class11535(((class09192)((List)R_0).get(i)).N(), i == var0));
      }

      return arraylist;
   }

   private static void u() {
      u_0 = null;
      u_1 = "nurikware:shareModalTarget";
      u_2 = 256;
      u_3 = 360;
      L_0 = 44;
      L_1 = -29813;
      L_2 = 12;
      L_3 = "icon:menu/angles";
      L_4 = 16;
      L_5 = 12;
      L_6 = 328.0F;
      M_0 = 86400000L;
      M_1 = null;
      M_2 = null;
      R_0 = null;
      R_1 = null;
      R_2 = null;
      R_3 = null;
      y_0 = 16;
      y_1 = null;
      y_2 = null;
      y_3 = null;
      y_4 = null;
      y_5 = null;
      y_6 = null;
      y_7 = null;
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
      i_0 = null;
      i_1 = null;
      i_2 = null;
      i_3 = null;
      i_4 = null;
   }

   private static void y() {
   }

   private static class09991 y(class09211 var0) {
      return class09991.N(class09991.N().i(var0.M()), class09221.N(16, class09079.REGULAR));
   }

   private static String y(class11789 var0) {
      return L(var0)
         ? class12020.N("share.modal.expires")
            + " "
            + LocalDateTime.ofInstant(Instant.ofEpochMilli(var0.y()), ZoneId.systemDefault()).format((DateTimeFormatter)M_2)
         : class12020.N("share.modal.forever");
   }

   private static void y(class11290 var0) {
      class11938.J().N(var0.Z(), 0L, 1);
   }

   private static int E(String var0) {
      String s = var0.trim();
      if (s.isEmpty()) {
         return 0;
      } else {
         try {
            int i = Integer.parseInt(s);
            return i <= 0 ? 0 : Math.min(i, 9999);
         } catch (NumberFormatException numberformatexception) {
            return 0;
         }
      }
   }

   private static class09798 N(class09809 var0, class09785<Integer> var1, class09785<Boolean> var2) {
      return class09778.N(
         var2.L() ? (class09991)y_7 : (class09991)y_6,
         var3 -> {
            var3.N("shareDurationField");
            var3.N(class09867.POINTER_DOWN, class09860::T);
            var3.N(N((Integer)var1.L()), (class09991)N_0);
            var3.L(var0xx -> {
               var0xx.N("shareDurationChevron");
               var0xx.L("icon:menu/angles");
               var0xx.N((class09991)N_1);
            });
            var3.N_1(var1xx -> {
               var2.N(true);
               var1xx.T();
            });
            var3.y(
               var0.N(
                  "shareDurationList",
                  (class09788<class11851>)class11621.N_0,
                  new class11851(Z((Integer)var1.L()), var2, var1xx -> N(var1, var1xx), 328.0F, -12.0F)
               )
            );
         }
      );
   }

   private static void N(class09809 var0, UUID var1) {
      var0.N("shareSeenGen:" + var1);
      var0.N("shareDuration:" + var1);
      var0.N("shareDurationOpen:" + var1);
      var0.N("shareActs:" + var1);
   }

   private static String N(class11789 var0) {
      return var0.i() == 0 ? String.valueOf(var0.L()) : var0.L() + " / " + var0.i();
   }

   private class09798 N(Void var1, class09809 var2) {
      class09785 class09785xxxx = var2.y("nurikware:shareModalTarget", (UUID)null);
      UUID uuid = (UUID)class09785xxxx.L();
      if (uuid == null) {
         return class09778.N(var0 -> var0.N("shareModalHidden").N(class11629.N()));
      } else {
         class11290 class11290 = class11938.G().N(uuid).orElse(null);
         if (class11290 == null || class11290.Z() <= 0L) {
            class09785xxxx.N(null);
            return class09778.N(var0 -> var0.N("shareModalHidden").N(class11629.N()));
         } else if (!Boolean.TRUE.equals(var2.L("shareModalConnected", () -> class11938.z().R()))) {
            class09785xxxx.N(null);
            return class09778.N(var0 -> var0.N("shareModalHidden").N(class11629.N()));
         } else {
            class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
            class11324 class11324 = class11938.J();
            long i = class11290.Z();
            class11789 class11789 = var2.L("shareEntry:" + uuid, () -> class11324.i(i));
            boolean flag = class11789 != null;
            class11316 class11316 = var2.L("shareSignal", class11324::N);
            class09785 class09785x = var2.N("shareSeenGen:" + uuid, class11316.y());
            if (class11316.y() > (Long)class09785x.L() && class11316.u() == i) {
               class09785x.N(class11316.y());
               if (class11316.N() == class11308.CREATED || class11316.N() == class11308.DELETED) {
                  N(var2, uuid);
                  class09785xxxx.N(null);
                  return class09778.N(var0 -> var0.N("shareModalHidden").N(class11629.N()));
               }
            }

            class09785 class09785xx = var2.N("shareDuration:" + uuid, ((List)R_0).size() - 1);
            class09785 class09785xxx = var2.N("shareDurationOpen:" + uuid, false);
            class09785 class09785xxxx = var2.N("shareActs:" + uuid, "");
            return class09778.N((class09991)R_1, var13x -> {
               var13x.N("shareModalBlur");
               var13x.N(class09867.POINTER_DOWN, class09860::T);
               var13x.N(class09867.CLICK, class09860::T);
               var13x.N(class09867.KEY_DOWN, var1xx -> {
                  if (var1xx instanceof class09865 class09865 && class09865.y() && class09865.N() == 256) {
                     class09785xxxx.N(null);
                     var1xx.T();
                  }
               });
               var13x.N_3((class09991)R_2, var13xx -> {
                  var13xx.N("shareModalPanel");
                  var13xx.N(class09867.POINTER_DOWN, class09860::T);
                  var13xx.N(class09867.CLICK, class09860::T);
                  var13xx.N_3((class09991)y_2, var2xxx -> {
                     var2xxx.N(class12020.N(flag ? "share.modal.title-shared" : "share.modal.title"), (class09991)R_3);
                     var2xxx.y(N("shareModalClose", () -> class09785xxxx.N(null)));
                  });
                  if (flag) {
                     var13xx.N_3((class09991)y_5, var1xxx -> {
                        var1xxx.N("shareInfoGroup");
                        var1xxx.N(y(class11789), (class09991)i_2);
                        var1xxx.N(class12020.N("share.modal.used") + " " + N(class11789), (class09991)i_2);
                        if (class11789.N()) {
                           var1xxx.N(class12020.N("share.modal.stale-hint"), (class09991)i_3);
                        }
                     });
                     var13xx.N_3((class09991)N_6, var5xxx -> {
                        var5xxx.N("shareCopyExistingButton");
                        var5xxx.N(class09867.POINTER_DOWN, class09860::T);
                        var5xxx.N_1(var5xxxx -> {
                           class11324.N(class11789);
                           N(var2, uuid);
                           class09785xxxx.N(null);
                           var5xxxx.T();
                        });
                        var5xxx.N(class12020.N("share.modal.copy"), (class09991)i_0);
                     });
                     var13xx.N_3((class09991)N_6, var3xxx -> {
                        var3xxx.N("shareRefreshButton");
                        var3xxx.N(class09867.POINTER_DOWN, class09860::T);
                        var3xxx.N_1(var3xxxx -> {
                           class11324.u(i);
                           var3xxxx.T();
                        });
                        var3xxx.N(class12020.N("share.modal.refresh"), (class09991)i_0);
                     });
                     var13xx.N_3((class09991)N_6, var4xxx -> {
                        var4xxx.N("shareDeleteButton");
                        var4xxx.N(class09867.POINTER_DOWN, class09860::T);
                        var4xxx.N_1(var4xxxx -> {
                           N(class11290);
                           N(var2, uuid);
                           class09785xxxx.N(null);
                           var4xxxx.T();
                        });
                        var4xxx.N(class12020.N("share.modal.delete-link"), (class09991)i_4);
                     });
                  } else {
                     var13xx.N_3((class09991)y_5, var3xxx -> {
                        var3xxx.N("shareDurationGroup");
                        var3xxx.N(class12020.N("share.modal.duration"), (class09991)i_1);
                        var3xxx.y(N(var2, class09785xx, class09785x));
                     });
                     var13xx.N_3((class09991)y_5, var1xxx -> {
                        var1xxx.N("shareLimitGroup");
                        var1xxx.N(class12020.N("share.modal.limit"), (class09991)i_1);
                        var1xxx.y(N(class09785));
                     });
                     var13xx.N_3((class09991)N_6, var6xx -> {
                        var6xx.N("shareCopyLinkButton");
                        var6xx.N(class09867.POINTER_DOWN, class09860::T);
                        var6xx.N_1(var6xxx -> {
                           N(class11290, class09785xx, class09785);
                           N(var2, uuid);
                           class09785xxxx.N(null);
                           var6xxx.T();
                        });
                        var6xx.N(class12020.N("share.modal.copy-link"), (class09991)i_0);
                     });
                     var13xx.N_3(N(class09211), var5xxx -> {
                        var5xxx.N("shareCopyOnceButton");
                        var5xxx.N(class09867.POINTER_DOWN, class09860::T);
                        var5xxx.N_1(var4xxxx -> {
                           y(class11290);
                           N(var2, uuid);
                           class09785xxxx.N(null);
                           var4xxxx.T();
                        });
                        var5xxx.N(class12020.N("share.modal.copy-once"), y(class09211));
                     });
                  }
               });
            });
         }
      }
   }

   private static class09798 N(class09785<String> var0) {
      return class09778.N((class09991)N_2, var1 -> {
         var1.N("shareActivationsField");
         var1.u(var1x -> {
            var1x.N("shareActivationsInput");
            var1x.L((String)var0.L());
            var1x.N(((String)var0.L()).isEmpty() ? (class09991)N_4 : (class09991)N_5);
            var1x.i(class12020.N("share.modal.unlimited"));
            var1x.N(class09867.INPUT, var1xx -> {
               class09844 class09844 = (class09844)var1xx;
               String s = class09844.y();
               if (((Pattern)M_1).matcher(s).matches()) {
                  var0.N(s);
               } else {
                  var1xx.z().N(class09844.N());
               }
            });
         });
      });
   }

   private static void N() {
   }

   private static String N(int var0) {
      return class12020.N("entry." + ((class09192)((List)R_0).get(var0)).N());
   }

   private static class09798 N(String var0, Runnable var1) {
      return class09778.N((class09991)y_3, var2 -> {
         var2.N(var0);
         var2.N(class09867.POINTER_DOWN, class09860::T);
         var2.N_1(var1xx -> {
            var1.run();
            var1xx.T();
         });
         var2.L(var0xx -> var0xx.L("icon:menu/xmark").N((class09991)y_4));
      });
   }

   private static void N(class09785<Integer> var0, class11535 var1) {
      for (int i = 0; i < ((List)R_0).size(); i++) {
         if (var1.E().N().equals("entry." + ((class09192)((List)R_0).get(i)).N())) {
            var0.N(i);
            return;
         }
      }
   }

   private static void N(class11290 var0, class09785<Integer> var1, class09785<String> var2) {
      int i = ((class09192)((List)R_0).get((Integer)var1.L())).y();
      long j = i == 0 ? 0L : System.currentTimeMillis() + i * 86400000L;
      class11938.J().N(var0.Z(), j, E((String)var2.L()));
   }

   private static class09991 N(class09211 var0) {
      return class09991.N((class09991)N_6, class09991.N().y(class09662.N(var0.M(), 0.15F)).u(var0.M()));
   }

   private static void N(class11290 var0) {
      class11938.J().y(var0.Z());
   }
}
