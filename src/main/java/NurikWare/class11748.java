package NurikWare;

import java.util.List;
import org.joml.Vector4f;

public class class11748 {
   private static String[] l;
   public static Object N_0 = class09991.N().N(class09969.FLOATING).N(class09962.N()).y(class09962.N()).N(class09975.COLUMN).B(3.0F).L(true);
   public static Object N_1 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW);
   public static Object N_2 = N(true, true);
   public static Object N_3 = N(true, false);
   public static Object N_4 = N(false, true);
   public static Object N_5 = N(false, false);
   public static Object N_6 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()).N(1.5F, -1778384896), class09221.N(12, class09079.REGULAR)));
   public static Object N_7;
   public static Object y_0;
   public static Object y_1;
   public static Object L_0 = 3.0F;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object u_0 = new String[][]{{l[0], l[1]}, {l[2], l[3]}, {l[4], l[5]}};
   public static Object u_1 = ((Object[])u_0).length;
   public static Object u_2;
   public static Object u_3;
   public static Object u_4;
   public static Object u_5;

   private class11748() {
      super();
   }

   static {
      N();
      u();
      y();
      (Integer)u_1;
      (Integer)u_1;
      class09991 class09991 = class09991.N();
      N_7 = class09991.N(class09991.i((Integer)class09181.N_0).N(1.5F, -1778384896), class09221.N(12, class09079.REGULAR));
   }

   private static void u() {
      l = new String[6];
      l[0] = "hud.hint.move.key";
      l[1] = "hud.hint.move.text";
      l[2] = "hud.hint.snap.key";
      l[3] = "hud.hint.snap.text";
      l[4] = "hud.hint.reset.key";
      l[5] = "hud.hint.reset.text";
   }

   private static void y() {
      u_1 = 0;
      u_2 = 12;
      u_3 = 3.0F;
      u_4 = 7.0F;
      u_5 = 5.0F;
      y_0 = 8.0F;
      y_1 = 2.0F;
      L_0 = 0.0F;
      L_1 = 0.18F;
      L_2 = 0.08F;
      L_3 = 0.144F;
      L_4 = 0.056F;
   }

   private static class09991[] N(boolean var0, boolean var1) {
      class09991[] aclass09991 = new class09991[(Integer)u_1];

      for (int i = 0; i < (Integer)u_1; i++) {
         int j = var1 ? (Integer)u_1 - 1 - i : i;
         class09728 class09728 = var0
            ? new class09728(0.18F, class09759.EASE_OUT, j * 0.08F)
            : new class09728(0.144F, class09759.EASE_OUT, ((Integer)u_1 - 1 - j) * 0.056F);
         aclass09991[i] = class09991.N(
            (class09991)N_1,
            class09991.N().l(var0 ? 1.0F : 0.0F).m(var0 ? 0.0F : (var1 ? 5.0F : -5.0F)).N(class09692.N(class09994.s(class09728), class09994.Z(class09728)))
         );
      }

      return aclass09991;
   }

   private static boolean N(class11769 var0, float var1, float var2, float var3, float var4) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         for (class11769 class11769 : (List)class11730.N_7) {
            if (class11769 != var0) {
               Vector4f vector4f = class11769.R();
               if (vector4f != null && var1 < vector4f.x + vector4f.z && var1 + var3 > vector4f.x && var2 < vector4f.y + vector4f.w && var2 + var4 > vector4f.y
                  )
                {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static void N() {
   }

   private static boolean N(class11769 var0, Vector4f var1, float var2, float var3, float var4) {
      if (var1 == null) {
         return true;
      } else {
         float f = var1.y - 7.0F - var4;
         float f1 = var1.y + var1.w + 7.0F;
         if (f < 2.0F) {
            return false;
         } else if (f1 + var4 > class11769.u() - 2.0F) {
            return true;
         } else {
            float f2 = var1.x + var2;
            return !N(var0, f2, f, var3, var4) || N(var0, f2, f1, var3, var4);
         }
      }
   }

   public static class09798 N(class09809 var0, class11769 var1) {
      String s = var1.E();
      class09211 class09211 = var0.N((class09804<class09211>)class09211.N_6);
      boolean flag = var0.L(s + "HintTargeted", var1::W);
      Vector4f vector4f = var1.R();
      class09904 class09904 = var1.i().N();
      boolean flag1 = class09904 != null && class09904.K() != null;
      float f = flag1 ? class09904.c().i() : (Float)L_0;
      float f1 = flag1 ? class09904.c().u() : 0.0F;
      float f2 = vector4f != null && f1 > 0.0F && vector4f.x + f1 > class11769.B() - 8.0F ? vector4f.z - f1 : 0.0F;
      boolean flag2 = N(var1, vector4f, f2, f1, f);
      float f3 = flag2 ? -(f + 7.0F) : vector4f.w + 7.0F;
      class09991[] aclass09991 = flag ? (flag2 ? (class09991[])N_2 : (class09991[])N_3) : (flag2 ? (class09991[])N_4 : (class09991[])N_5);
      return class09778.N(class09991.N((class09991)N_0, class09991.N().U(f2).E(f3)), var4x -> {
         var4x.N(s + "Hints");
         var4x.N(var1.i());

         for (int i = 0; i < (Integer)u_1; i++) {
            String sx = s + "Hint" + i;
            String[] astring = ((String[][])u_0)[i];
            class09991 class09991 = aclass09991[i];
            var4x.N_3(class09991, var3xx -> {
               var3xx.N(sx);
               var3xx.y(var3xxx -> var3xxx.N(sx + "Key").L(class12020.N(astring[0])).N(((class09227)N_6).N(class09211)));
               var3xx.y(var2xxx -> var2xxx.N(sx + "Body").L(" — " + class12020.N(astring[1])).N((class09991)N_7));
            });
         }
      });
   }
}
