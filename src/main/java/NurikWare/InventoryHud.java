package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;

@class11761(
   u = "inventory",
   i = 100.0F,
   N = 320.0F
)
public class InventoryHud extends class11769 {
   public static Object N_0 = class09991.N().u(32.0F, 32.0F).N(8.0F).N(class09983.BORDER_BOX);
   public static Object N_1 = class09991.N().u(16.0F, 16.0F);
   public static Object N_2 = class09991.N().N(class09969.FLOATING).N(1.0F, 13.0F).u(14.0F, 2.0F).y((Integer)InventoryHud.L_0);
   public static Object N_3 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).R().N(class09973.END).y(class09973.END).i((Integer)class09181.N_0);
   public static Object N_4 = class09991.N().N(class09969.FLOATING).N(class09962.y(1.0F)).y(class09962.y(98.0F)).y((Integer)class09181.L_3);
   public static Object N_5 = class09991.N().N(class09969.FLOATING).N(class09962.y(296.0F)).y(class09962.y(1.0F)).y((Integer)class09181.L_3);
   public static Object N_6 = class09991.N().t(8.0F).N(new class09838("minecraft", class09079.REGULAR.N()));
   public static Object N_7;
   public static Object y_0 = class06202.Nq();
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;
   public static Object L_0 = class11300.y(0, 0, 0, 255);
   public static Object L_1;
   public static Object L_2 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(100.0F))
      .N(12.0F)
      .i(11.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object L_3 = class09227.N(var0 -> class09991.N().u(16.0F, 16.0F).i(var0.M()));
   public static Object L_4 = class09991.N().N(class09962.y(297.0F)).y(class09962.y(100.0F)).L(1.0F).N(class09975.COLUMN).B(1.0F).N(class09983.BORDER_BOX);
   public static Object L_5 = class09991.N().N(class09962.N(100.0F)).y(class09962.y(32.0F)).N(class09975.ROW).B(1.0F);
   public static Object u_0;
   public static Object u_1;
   public static Object i_0;
   public static Object i_1;
   public static Object i_2;
   public static Object i_3;
   public static Object i_4;
   public static Object R_0;
   public static Object R_1;
   public static Object R_2;
   public static Object R_3;
   public static Object R_4;

   private static void T() {
      y_0 = null;
      y_1 = "itemSlot";
      y_2 = 9;
      y_3 = 3;
      y_4 = 9;
      y_5 = 16;
      i_0 = 32;
      i_1 = 1;
      i_2 = 296;
      i_3 = 98;
      i_4 = 1;
      u_0 = 297;
      u_1 = 100;
      R_0 = 361;
      R_1 = 1;
      R_2 = 14;
      R_3 = 2;
      R_4 = 10;
      L_0 = -16777216;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
      N_7 = null;
   }

   public InventoryHud() {
      super(InventoryHud::N);
   }

   static {
      T();
      class09991 class09991 = class09991.N().N(class09962.N(0.0F, 361.0F));
      L_1 = class09991.N((class09991)class11756.y_1, class09991.y(class09962.N()).N(class09975.ROW));
      class09991 class09991x = class09991.N();
      N_7 = class09991.N((class09991)N_6, class09991x.i((Integer)class09181.N_0).N(1.0F, -16777216));
   }

   private static class09798 i(int var0) {
      String s = "itemSlot" + var0;
      class06584 class06584 = (class04453)((class06202)y_0).T_4 == null ? class06584.E : ((class04453)((class06202)y_0).T_4).method_31548().method_5438(var0);
      return class09778.N((class09991)N_0, var2x -> {
         var2x.N(s);
         if (!class06584.R()) {
            class11867 class11867 = class11938.k().N(class06584);
            if (class11867.L()) {
               class09991 class09991 = class09991.N((class09991)N_1, class09991.N().N(class11867.y(), class11867.N(), class11867.R(), class11867.i()));
               var2x.L(var2xx -> var2xx.N(s + "-icon").L(class11938.k().y()).N(class09991));
            }

            N(var2x, s, class06584);
            y(var2x, s, class06584);
         }
      });
   }

   private static class09798 b() {
      return class09778.N((class09991)L_4, var0 -> {
         var0.N("inventoryContent");

         for (int i = 0; i < 8; i++) {
            float f = i * 33 + 32;
            int j = i;
            var0.N(var2x -> var2x.N("inventoryVDivider-" + j).N(class09991.N((class09991)N_4, class09991.N().N(f, 0.0F))));
         }

         for (int k = 0; k < 2; k++) {
            float f1 = k * 33 + 32;
            int j1 = k;
            var0.N(var2x -> var2x.N("inventoryHDivider-" + j1).N(class09991.N((class09991)N_5, class09991.N().N(0.0F, f1))));
         }

         for (int l = 0; l < 3; l++) {
            int i1 = l;
            var0.N_3((class09991)L_5, var1x -> {
               var1x.N("inventoryRow-" + i1);

               for (int ix = 0; ix < 9; ix++) {
                  int jx = 9 + i1 * 9 + ix;
                  var1x.y(i(jx));
               }
            });
         }
      });
   }

   @Override
   public boolean y() {
      return class11938.u().NQ().U();
   }

   private static void y(class09784 var0, String var1, class06584 var2) {
      int i = var2.c();
      if (i > 1) {
         String s = Integer.toString(i);
         var0.N_3((class09991)N_3, var2x -> {
            var2x.N(var1 + "-count");
            var2x.y(var2xx -> var2xx.N(var1 + "-count-text").L(s).N((class09991)N_7));
         });
      }
   }

   private static class09798 N(Void var0, class09809 var1) {
      class09211 class09211 = var1.N((class09804<class09211>)class09211.N_6);
      return class09778.N((class09991)L_1, var1x -> {
         var1x.N("inventoryWindow");
         var1x.N_3((class09991)L_2, var1xx -> {
            var1xx.N("inventoryIconArea");
            var1xx.L(var1xxx -> var1xxx.N("hud-inventory").L("icon:hud/inventory").N(((class09227)L_3).N(class09211)));
         });
         var1x.N(var0xx -> var0xx.N("inventoryDivider").N((class09991)class09180.N_3));
         var1x.y(b());
      });
   }

   @class11782
   public void N(class11352 var1) {
      if (this.y()) {
         class11938.i().N();
      }
   }

   private static void N(class09784 var0, String var1, class06584 var2) {
      if (var2.m()) {
         int i = var2.s();
         if (i > 0) {
            float f = 1.0F - (float)var2.P() / i;
            int j = Math.max(0, Math.round(f * 14.0F));
            int k = class11300.N(f);
            var0.N_3((class09991)N_2, var3x -> {
               var3x.N(var1 + "-damageBg");
               if (j > 0) {
                  class09991 class09991 = class09991.N().u(j, 1.0F).y(k);
                  var3x.N(var2xx -> var2xx.N(var1 + "-damageBar").N(class09991));
               }
            });
         }
      }
   }
}
