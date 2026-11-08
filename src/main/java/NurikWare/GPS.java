package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.regex.Pattern;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08844;
import org.joml.Matrix4f;
import org.joml.Vector2dc;

@class11080(
   L = "GPS",
   y = class11072.VISUAL,
   N = class11106.INTERFACE
)
public class GPS extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public static Object u_0 = Pattern.compile("^-?\\d*\\.?\\d*$");
   public static Object u_1;
   public static Object u_2;
   public static Object u_3;

   private static void P() {
      u_0 = null;
      u_1 = 32.0F;
      u_2 = 60.0F;
      u_3 = -1;
   }

   private void T() {
   }

   public GPS() {
      super();
      this.T();
      this.L_0 = (class11533)class11524.N(this, "target-x", "", (Pattern)u_0).N_6((var1, var2) -> this.s());
      this.L_1 = (class11533)class11524.N(this, "target-z", "", (Pattern)u_0).N_6((var1, var2) -> this.s());
      this.L_2 = class11524.N(this, "clear-target", this::m);
      this.L_3 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
         .N(class11213.N((class09087)class09063.N_2, 256, 64))
         .N();
      this.L_4 = ((class09322)class11185.Z_1).z("u_projection");
      this.L_5 = ((class09322)class11185.Z_1).z("u_view");
      this.L_6 = ((class09322)class11185.Z_1).M("texture_in");
      this.L_7 = new Matrix4f();
   }

   static {
      P();
   }

   private static Double B(String var0) {
      try {
         return Double.parseDouble(var0);
      } catch (NumberFormatException numberformatexception) {
         return null;
      }
   }

   private void s() {
      this.T();
      class11938.Q().N(B(((class11533)this.L_0).i()), B(((class11533)this.L_1).i()));
   }

   @Override
   public void m() {
      this.T();
      ((class11533)this.L_0).N("");
      ((class11533)this.L_1).N("");
   }

   private static String N(double var0) {
      return !Double.isInfinite(var0) && var0 == Math.rint(var0) ? Long.toString((long)var0) : Double.toString(var0);
   }

   public void N(double var1, double var3) {
      this.T();
      ((class11533)this.L_0).N(N(var1));
      ((class11533)this.L_1).N(N(var3));
   }

   @class11782
   public void N(class10967 var1) {
      this.T();
      class10705 class10705 = class11938.Q();
      if ((class04453)((class06202)super.y_0).T_4 != null && (class03448)((class06202)super.y_0).T_3 != null && class10705.L()) {
         Vector2dc vector2dc = class10705.u();
         class06889 class06889 = class11925.y();
         class08844 class08844 = ((class06202)super.y_0).Nt();
         float f = class11938.i().u();
         float f1 = class08844.U() / 2.0F;
         float f2 = class08844.E() / 4.0F;
         class11499 class11499 = class11505.y();
         float f3 = class11908.N(class11499.y());
         float f4 = class04995.P(f3);
         float f5 = class04995.m(f3);
         double d0 = vector2dc.x() - class06889.M;
         double d1 = vector2dc.y() - class06889.Z;
         double d2 = -(d1 * f4 - d0 * f5);
         double d3 = -(d0 * f4 + d1 * f5);
         float f6 = class11908.N((float)class04995.u(d2, d3) * 180.0F / (float) Math.PI);
         String s = "GPS: "
            + (int)Math.hypot(
               vector2dc.x() - ((class04453)((class06202)super.y_0).T_4).method_23317(),
               vector2dc.y() - ((class04453)((class06202)super.y_0).T_4).method_23321()
            )
            + "m";
         class09093 class09093 = class09080.u();
         float f7 = 16.0F * f;
         float f8 = class09093.y(s, f7, class09079.REGULAR, false);
         float f9 = class09093.N(f7, class09079.REGULAR, false);
         float f10 = 100.0F * f;
         float f11 = class11908.N(60.0F * (1.0F - Math.clamp(class11499.R(), 0.0F, 90.0F) / 90.0F));
         float f12 = f10 * class04995.P(f6);
         float f13 = f10 * class04995.m(f6);
         float f14 = 32.0F * f;
         ((Matrix4f)this.L_7).identity().translate(f1, f2, 0.0F).rotateX(f11).translate(f12, f13, 0.0F).rotateZ(f6);
         class11176.y(((class11174)this.L_3).u(), (Matrix4f)this.L_7, -f14 / 2.0F, -f14 / 2.0F, 0.0F, f14, f14, -1);
         class09093.y(s).N(f1 - f8 / 2.0F, f2 - f9 / 2.0F).N(f7).N(class09079.REGULAR).N(class11300.L(0, 50.0F)).i(-1).L();
         class11925.N(((class06202)super.y_0).e(), true);
         ((class11174)this.L_3).N(var1x -> {
            this.T();
            ((class12038)this.L_4).N(class11925.L());
            ((class12038)this.L_5).N(RenderSystem.getModelViewMatrix());
            ((class12026)this.L_6).N(((class12031)class11998.N_2).N());
         });
      }
   }
}
