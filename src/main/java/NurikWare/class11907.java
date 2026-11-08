package NurikWare;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import minecraft.class00518;
import minecraft.class00556;
import minecraft.class01683;
import minecraft.class01766;
import minecraft.class01890;
import minecraft.class02484;
import minecraft.class02834;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class05298;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06683;
import minecraft.class06889;
import minecraft.class07041;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07064;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08609;
import org.joml.Vector3d;

public class class11907 {
   private static String[] z;
   private static double[] d;
   public static Object N_0 = class06202.Nq();
   public static Object N_1 = Pattern.compile(z[1]);
   public static Object N_2 = new Vector3d();

   public static List<class06584> L(class07438 var0) {
      ArrayList arraylist = new ArrayList();

      for (class07085 class07085 : class02834.field_49224) {
         if (class07085.N() == class07043.field_6178) {
            class06584 class06584 = var0.method_6118(class07085);
            if (!class06584.R()) {
               arraylist.add(class06584);
            }
         }
      }

      return arraylist;
   }

   public static void L() {
      IBaritone ibaritone = N();
      if (ibaritone != null) {
         ibaritone.getPathingBehavior().cancelEverything();
      }
   }

   private static void M() {
      z = new String[2];
      z[0] = "This is a utility class and cannot be instantiated";
      z[1] = "^[а-яА-Яa-zA-Z0-9_Ёё]+$";
   }

   private class11907() {
      super();
      throw new UnsupportedOperationException(z[0]);
   }

   static {
      E();
      M();
      z();
   }

   public static boolean i() {
      IBaritone ibaritone = N();
      return ibaritone == null ? false : ibaritone.getPathingBehavior().hasPath();
   }

   private static void z() {
   }

   private static class06584 u(class07438 var0) {
      class06584 class06584x = var0.method_62821();
      if (class06584x != null) {
         return class06584x;
      } else if (!(var0 instanceof class11781) && var0.method_6115() && var0.method_6030().R()) {
         class06584 class06584x = var0.method_5998(var0.method_6058());
         return class06584x.method_58694(class02484.H) != null ? class06584x : null;
      } else {
         return null;
      }
   }

   public static boolean u() {
      return (class04453)((class06202)N_0).T_4 == null ? false : ((class11822)((class04453)((class06202)N_0).T_4)).dataManager().y().N().N();
   }

   public static void y(class10401 var0) {
      class11821<Vector3d> class11821 = ((class11824)((class11783)var0).dataManager()).L();
      if (class11821.N().y != d[0]) {
         var0.method_5814(class11821.N().x, class11821.N().y, class11821.N().z);
         class11821.N().y = d[1];
      }
   }

   public static void y(class07438 var0) {
      int i = class11281.y(
         (class11328)(var0x -> Optional.ofNullable((class08609)var0x.y().method_58694(class02484.g)).<Float>map(class08609::y).orElse(0.0F) > 0.0F)
      );
      if (!class11281.y(i)) {
         class11322.N(i);
         ((class01683)((class04453)((class06202)N_0).T_4).y_0).N(class00556.N(var0, ((class04453)((class06202)N_0).T_4).method_5715()));
         ((class04453)((class06202)N_0).T_4).method_6104(class07050.field_5808);
         class11322.i();
      }
   }

   public static class06889 y() {
      return new class06889(
         ((class04453)((class06202)N_0).T_4).method_23317() - (Double)((class04453)((class06202)N_0).T_4).M_1,
         ((class04453)((class06202)N_0).T_4).method_23318() - (Double)((class04453)((class06202)N_0).T_4).M_2,
         ((class04453)((class06202)N_0).T_4).method_23321() - (Double)((class04453)((class06202)N_0).T_4).R_0
      );
   }

   public static boolean y(GameProfile var0) {
      if (!class11910.i()) {
         return false;
      } else {
         class01683 class01683 = ((class06202)N_0).NE();
         return class01683 == null ? false : class01683.N(var0.id()) == null;
      }
   }

   private static void E() {
      d = new double[3];
      d[0] = Double.longBitsToDouble(-4571373524106608640L);
      d[1] = Double.longBitsToDouble(-4571373524106608640L);
      d[2] = Double.longBitsToDouble(0L);
   }

   public static boolean N(class07050 var0, class06183 var1) {
      class07082 class07082 = ((class03443)((class06202)N_0).T_2).N((class04453)((class06202)N_0).T_4, var0, var1);
      if (class07082 instanceof class07041 && ((class07041)class07082).i() == class07064.field_52427) {
         ((class04453)((class06202)N_0).T_4).method_6104(var0);
         return true;
      } else {
         return false;
      }
   }

   public static boolean N(class04477 var0) {
      if ((class04453)((class06202)N_0).T_4 == null || var0 == (class04453)((class06202)N_0).T_4) {
         return false;
      } else if (class11910.i()) {
         return false;
      } else if (var0.method_5740()) {
         return true;
      } else {
         GameProfile gameprofile = var0.method_7334();
         return y(gameprofile) ? true : N(var0, gameprofile) || N(gameprofile);
      }
   }

   public static boolean N(class04477 var0, GameProfile var1) {
      boolean flag = class02834.field_49224.N().stream().<class06584>map(var0::method_6118).anyMatch(var0x -> var0x.L(class02484.o))
         && var0.method_45325(class05298.y) == d[2];
      int i = var1.id().version();
      return i == 3 && flag ? true : flag && i == 4 && var1.properties().isEmpty();
   }

   public static boolean N(class07438 var0, class07049 var1) {
      class06584 class06584 = u(var0);
      return class06584 != null && !class06584.R();
   }

   public static boolean N(class07438 var0) {
      return L(var0).isEmpty();
   }

   public static IBaritone N() {
      return BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)((class06202)N_0).T_4);
   }

   public static void N(class10401 var0) {
      N(var0, false);
   }

   public static void N(class10401 var0, boolean var1) {
      class11824 class11824 = (class11824)((class11783)var0).dataManager();
      class11824.L().N().set(var0.method_23317(), var0.method_23318(), var0.method_23321());
      if (!var0.method_5765()
         && var0.field_6012 >= 2
         && (var0.field_6038 != var0.method_23317() || var0.field_5971 != var0.method_23318() || var0.field_5989 != var0.method_23321())) {
         if (!var1 && !var0.method_6128()) {
            ((Vector3d)N_2)
               .set(
                  ((class04453)((class06202)N_0).T_4).method_23317(),
                  ((class04453)((class06202)N_0).T_4).method_23320(),
                  ((class04453)((class06202)N_0).T_4).method_23321()
               );
            Vector3d vector3d3 = class11824.u().N();
            Vector3d vector3d1 = class11824.N().N();
            Vector3d vector3d2 = ((Vector3d)N_2).distance(vector3d3) > ((Vector3d)N_2).distance(vector3d1) ? vector3d1 : vector3d3;
            var0.method_5814(vector3d2.x, vector3d2.y, vector3d2.z);
         } else {
            Vector3d vector3d = class11824.N().N();
            var0.method_5814(vector3d.x, vector3d.y, vector3d.z);
         }
      }
   }

   public static boolean N(GameProfile var0) {
      return !((Pattern)N_1).matcher(var0.name()).find();
   }

   public static void N(class07050 var0) {
      class07082 class07082 = ((class03443)((class06202)N_0).T_2).N((class04453)((class06202)N_0).T_4, var0);
      if (class07082 instanceof class07041 && ((class07041)class07082).i() == class07064.field_52427) {
         ((class04453)((class06202)N_0).T_4).method_6104(var0);
      }
   }

   public static float N(class07438 var0, float var1) {
      if ((class03448)((class06202)N_0).T_3 != null && BypassHealth.m() && !((class06202)N_0).q() && !(var0 instanceof class11781)) {
         class06683 class06683 = ((class03448)((class06202)N_0).T_3).method_8428();
         if (class06683 == null) {
            return var1;
         } else {
            class00518 class00518 = class06683.N(class01890.field_45158);
            if (class00518 == null) {
               return var1;
            } else {
               int i = class06683.N(class01766.N(var0.method_5820()), class00518).N();
               return i > 0 ? i : var1;
            }
         }
      } else {
         return var1;
      }
   }
}
