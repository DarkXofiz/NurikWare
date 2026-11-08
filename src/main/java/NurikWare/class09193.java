package NurikWare;

import java.util.Objects;
import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class09193 {
   public static Object N_0;
   public static Object N_1 = new class09193();
   public static Object N_2 = ((class09193)N_1)::N;
   public static Object N_3 = new class11854[]{
      class11854.COMBAT,
      class11854.MOVEMENT,
      class11854.VISUAL,
      class11854.PLAYER,
      class11854.MISC,
      class11854.CONFIGS,
      class11854.AUTO_BUY,
      class11854.ACCOUNTS
   };
   public static Object N_4 = class09991.N()
      .N(class09962.y(1196.0F))
      .y(class09962.y(750.0F))
      .j(10.0F)
      .y((Integer)class09181.L_1)
      .v(20.0F)
      .L(class09662.N(-16777216, 0.2F))
      .u((Integer)class09181.L_2)
      .z(1.0F)
      .N(class09975.ROW)
      .Z(16.0F);
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   public static void L() {
      class09785 class09785 = (class09785)((class09193)N_1).y_3;
      if (class09785 != null) {
         class09785.N(!(Boolean)class09785.L());
      }
   }

   private class09193() {
      super();
      this.W();
      this.y_0 = new class09793();
   }

   static {
      z();
      Objects.requireNonNull(N_1);
   }

   private static void z() {
      N_0 = "menu";
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
   }

   public static class09904 u() {
      class09904 class09904 = (class09904)((class09793)((class09193)N_1).y_0).N();
      return class09904 != null && class09904.K() != null ? class09904 : null;
   }

   public static Vector2f y() {
      if ((class09785)((class09193)N_1).y_1 == null) {
         return null;
      } else {
         Vector4f vector4f = (Vector4f)((class09785)((class09193)N_1).y_1).L();
         return vector4f == null ? null : new Vector2f(vector4f.x(), vector4f.y());
      }
   }

   private static void N(class09785<Vector4f> var0, boolean var1) {
      if (!var1) {
         Vector4f vector4f = (Vector4f)var0.L();
         if (vector4f != null) {
            if (class11938.w() != null) {
               class08844 class08844 = class06202.Nq().Nt();
               float f = class09222.L();
               float f1 = Math.max(1, class08844.U()) / f;
               float f2 = Math.max(1, class08844.E()) / f;
               float f3 = class11623.N(vector4f.x, f1, 1196.0F);
               float f4 = class11623.N(vector4f.y, f2, 750.0F);
               if (f3 != vector4f.z || f4 != vector4f.w) {
                  vector4f.z = f3;
                  vector4f.w = f4;
                  var0.N(vector4f);
               }
            }
         }
      }
   }

   public static boolean N() {
      class09785 class09785 = (class09785)((class09193)N_1).y_4;
      return class09785 != null && !((String)class09785.L()).isEmpty();
   }

   public static void N(int var0) {
      class09785 class09785 = (class09785)((class09193)N_1).y_2;
      if (class09785 != null && var0 >= 0 && var0 < ((class11854[])N_3).length) {
         class09785.N(((class11854[])N_3)[var0]);
      }
   }

   private class09798 N(class09785<class11854> var1, class09809 var2) {
      class09785 class09785xxxxxxx = var2.N("menuPos", () -> {
         Vector2f vector2f = class11938.M().N(class11292.class).L();
         return vector2f == null ? null : new Vector4f(vector2f.x, vector2f.y, vector2f.x, vector2f.y);
      });
      this.y_1 = class09785xxxxxxx;
      class09785 class09785x = var2.N("menuDrag", false);
      class09785 class09785xx = var2.N("menuOffset", new Vector2f());
      class09785 class09785xxx = var2.N("menuCategory", class11854.COMBAT);
      class09785 class09785xxxx = var2.y("nurikware:clientSettingsOpened", false);
      class09785 class09785xxxxx = var2.y("nurikware:openModuleSettings", "");
      class09785 class09785xxxxxx = var2.y("nurikware:searchQuery", "");
      class09785 class09785xxxxxxx = var2.N("searchCategory", (class11854)class09785xxx.L());
      if (class09785xxxxxxx.L() != class09785xxx.L()) {
         class09785xxxxxxx.N((class11854)class09785xxx.L());
         if (!((String)class09785xxxxxx.L()).isEmpty()) {
            class09785xxxxxx.N("");
         }
      }

      this.y_2 = class09785xxx;
      this.y_3 = class09785xxxx;
      this.y_4 = class09785xxxxx;
      N(class09785xxxxxxx, (Boolean)class09785x.L());
      return var2.N(
         "draggableMenu",
         (class09788<class11613>)class11609.N_0,
         new class11613(
            "menu",
            (class09793<class09904>)this.y_0,
            (class09991)N_4,
            class11609.N(class09785xxxxxxx),
            class09785x,
            class09785xx,
            (class11623)class11623.L_0,
            (var2x, var3x) -> {
               var2x.y(var2.N("sidebar", (class09788<class09785>)class09210.N_0, class09785xxxx));
               var2x.y(var2.N("main", (class09788<class09785>)class09203.L_0, class09785xxxx));
               var2x.y(var2.N("accountModal", (class09788)class09228.M_0, null));
               var2x.y(var2.N("deleteAccountsModal", (class09788)class09182.R_0, null));
               var2x.y(var2.N("sharePresetModal", (class09788)class09194.u_0, null));
            }
         )
      );
   }

   private void W() {
   }
}
