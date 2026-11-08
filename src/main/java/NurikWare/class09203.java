package NurikWare;

public class class09203 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.N(100.0F)).N(class09975.COLUMN);
   public static Object N_3 = class09991.N()
      .N(class09976.SELF)
      .N(class09993.AUTO)
      .N(class09970.OVERLAY)
      .N(class09180.N(20.0F, 8.0F).L(4.0F))
      .N(class09975.COLUMN)
      .N(class09962.N(100.0F))
      .y(class09962.y(659.0F));
   public static Object N_4 = class09991.N().y(class09962.y(20.0F));
   public static Object N_5 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).N(class09975.COLUMN);
   public static Object N_6 = class09991.N((class09991)N_5, class09991.N().N(class09969.FLOATING).M());
   public static Object N_7 = class09203::N;
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object L_0 = new class09203()::y;
   public static Object L_1 = new class11863(220.0F, 20.0F, 1.0F, 0.2F, 4.0F, 0.008333334F);
   public static Object L_2;
   public static Object L_3 = class09759.EASE_OUT;
   public static Object L_4 = new class09728(0.25F, (class09759)L_3);
   public static Object L_5;

   private class09203() {
      super();
   }

   static {
      y();
      N();
   }

   private class09798 y(class09785<class11854> var1, class09809 var2) {
      return class09778.N(
         (class09991)N_2,
         var2x -> var2x.N(
            new Object[]{
               var2.N("header", (class09788<class09785>)class09216.i_0, var1),
               class09778.N((class09991)class09180.N_2),
               var2.N("container", (class09788<class09785>)N_7, var1)
            }
         )
      );
   }

   private static void y() {
   }

   private static String N(String var0, int var1, class11854 var2) {
      return var0 + "_" + var1 + "_" + var2.name();
   }

   private static class09798 N(class09785<class11854> var0, class09809 var1) {
      String s = var1.y("nurikware:searchQuery", "").L();
      if (s != null && !s.isBlank()) {
         return N(var0, var1, s);
      } else {
         class09785 class09785 = var1.N("contentTransition", () -> class09229.y((class11854)var0.L()));
         class11854 class11854xx = var0.L();
         class09229 class09229 = (class09229)class09785.L();
         if (class11854xx != class09229.y()) {
            class09229 = class09229.N(class11854xx);
            class09785.N(class09229);
         }

         class11854 class11854x = class09229.y();
         int i = class09229.N();
         boolean flag = class09229.B();
         class09798 class09798x;
         float f;
         if (flag) {
            class11854 class11854xx = class09229.L();
            int j = Math.abs(class11854x.ordinal() - class11854xx.ordinal());
            float f1 = Math.min(1.0F, Math.max(0, j - 1) * 0.5F);
            float f2 = 659.0F * (1.0F + f1);
            int k = class09229.u();
            f = k * f2;
            class09798x = N(N("prev", i, class11854xx), class11854xx, -k * f2, 0.0F, 0.0F, 1.0F, var1, "prev_", null, i, false);
         } else {
            f = 0.0F;
            class09798x = null;
         }

         class09798 class09798x = N(N("new", i, class11854x), class11854x, 0.0F, 1.0F, f, flag ? 0.0F : 1.0F, var1, "", flag ? class09785 : null, i, true);
         return class09778.N((class09991)N_3, var3x -> {
            var3x.N("content:" + class11854x.name());
            if (class09798x != null) {
               var3x.y(class09798x);
            }

            var3x.y(class09798);
         });
      }
   }

   private static class09798 N(class09809 var0, class11854 var1, String var2) {
      String s = var2 + "tab:" + var1.name();
      class11072 class11072 = var1.N();
      if (class11072 != null) {
         return var0.N(s, (class09788<class11072>)class09223.N_0, class11072);
      } else if (var1 == class11854.CONFIGS) {
         return var0.N(s, (class09788)class09179.N_0, null);
      } else {
         return var1 == class11854.AUTO_BUY ? var0.N(s, (class09788)class09212.N_0, null) : var0.N(s, (class09788)class09191.N_0, null);
      }
   }

   private static class09798 N(
      String var0,
      class11854 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      class09809 var6,
      String var7,
      class09785<class09229> var8,
      int var9,
      boolean var10
   ) {
      return class09778.N(
         class09991.N(
            var10 ? (class09991)N_5 : (class09991)N_6,
            class09991.N().m(var2).l(var3).N(class09692.N(class09994.Z((class11863)L_1), class09994.s((class09728)L_4))).N(var2x -> var2x.m(var4).l(var5))
         ),
         var6x -> {
            var6x.N(var0);
            if (var8 != null) {
               var6x.N(class09867.TRANSITION_END, var3xx -> {
                  class09842 class09842 = (class09842)var3xx;
                  if (class09842.N() == class09736.VISUAL_TRANSLATE_Y && class09842.y()) {
                     var8.N(var2xxx -> var2xxx.N() == var9 && var2xxx.y() == var1 ? var2xxx.R() : var2xxx);
                  }
               });
            }

            var6x.y((class09991)N_4);
            var6x.y(N(var6, var1, var7));
            if (var1 != class11854.ACCOUNTS) {
               var6x.y((class09991)N_4);
            }
         }
      );
   }

   private static void N() {
      L_0 = null;
      L_1 = null;
      L_2 = 0.25F;
      L_3 = null;
      L_4 = null;
      L_5 = 659;
      y_0 = 4;
      y_1 = 8;
      y_2 = 4;
      y_3 = 659.0F;
      N_0 = 0.5F;
      N_1 = 1.0F;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
      N_7 = null;
   }

   private static class09798 N(class09785<class11854> var0, class09809 var1, String var2) {
      return class09778.N(
         (class09991)N_3,
         var3 -> var3.N("content:search")
            .N(
               new Object[]{
                  class09778.N((class09991)N_4),
                  var1.N("searchResults", (class09788<class09214>)class09226.N_0, new class09214(var2, (class11854)var0.L())),
                  class09778.N((class09991)N_4)
               }
            )
      );
   }
}
