package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08844;
import org.joml.Matrix4f;

@class11080(
   L = "Arrows",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class Arrows extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public static Object i_0;

   public Arrows() {
      super();
      this.m();
      this.u_0 = new class11023(this, "players", true);
      this.u_1 = new class11010(this, "friends", true);
      this.u_2 = new class11032(this, "villagers", true);
      this.u_3 = new class11044(this, "monsters", true);
      this.u_4 = new class11016(this, "animals", true);
      this.u_5 = new class11011(this, "items", true);
      this.u_6 = new class11012(this, "party", true);
      this.u_7 = class11524.y(
         this,
         "entities",
         (class11023)this.u_0,
         (class11012)this.u_6,
         (class11010)this.u_1,
         (class11032)this.u_2,
         (class11011)this.u_5,
         (class11044)this.u_3,
         (class11016)this.u_4
      );

      for (class11034 class11034 : ((class11523)this.u_7).L()) {
         if (class11034 instanceof class11801) {
            class11034.N(this);
         }
      }

      this.L_0 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
         .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
         .N();
      this.L_1 = ((class09322)class11185.Z_1).z("u_projection");
      this.L_2 = ((class09322)class11185.Z_1).z("u_view");
      this.L_3 = ((class09322)class11185.Z_1).M("texture_in");
      this.L_4 = new Matrix4f();
   }

   static {
      s();
   }

   private static void s() {
      i_0 = 32.0F;
   }

   private void m() {
   }

   @class11782
   public void N(class10967 var1) {
      this.m();
      class06889 class06889 = class11925.y();
      class08844 class08844 = ((class06202)super.y_0).Nt();
      float f = class08844.U() / 2.0F;
      float f1 = class08844.E() / 2.0F;
      float f2 = class11908.N(class11505.y().y());
      float f3 = class04995.P(f2);
      float f4 = class04995.m(f2);

      for (class07049 class07049 : ((class03448)((class06202)super.y_0).T_3).M()) {
         for (class11034 class11034 : (List)((class11523)this.u_7).i()) {
            if (class11034.test(class07049)) {
               double d0 = class11925.i(class07049);
               double d2 = class11925.L(class07049);
               double d4 = ((class04453)((class06202)super.y_0).T_4).method_5858(class07049);
               this.N(class11034, null, d0, class06889, d2, f3, f4, f, f1, d4);
            }
         }
      }

      if (((class11012)this.u_6).U()) {
         for (class09309 class09309 : class11938.N().N()) {
            float f5 = (float)(System.currentTimeMillis() - class09309.y()) / 1000.0F;
            double d6 = class09309.i().x();
            double d1 = class09309.i().z();
            double d3 = class04995.u(f5, class09309.N().x(), d6);
            double d5 = class04995.u(f5, class09309.N().z(), d1);
            String s = class09309.L()
               + " "
               + (int)Math.hypot(((class04453)((class06202)super.y_0).T_4).method_23317() - d6, ((class04453)((class06202)super.y_0).T_4).method_23321() - d1)
               + "m";
            this.N((class11012)this.u_6, s, d3, class06889, d5, f3, f4, f, f1, class09309.i().distanceSquared(class06889.M, class06889.B, class06889.Z));
         }
      }

      class11925.N(((class06202)super.y_0).e(), true);
      ((class11174)this.L_0).N(var1x -> {
         this.m();
         ((class12038)this.L_1).N(class11925.L());
         ((class12038)this.L_2).N(RenderSystem.getModelViewMatrix());
         ((class12026)this.L_3).N(((class12031)class11998.N_2).N());
      });
   }

   private int N(double var1, int var3) {
      var1 = Math.clamp(var1 / 512.0, 0.5, 1.0);
      return class11300.N(var3, (int)(class11300.y(var3) * var1));
   }

   private void N(class11034 var1, String var2, double var3, class06889 var5, double var6, float var8, float var9, float var10, float var11, double var12) {
      this.m();
      double d0 = var3 - var5.M;
      double d1 = var6 - var5.Z;
      double d2 = -(d1 * var8 - d0 * var9);
      double d3 = -(d0 * var8 + d1 * var9);
      float f = class11908.N((float)class04995.u(d2, d3) * 180.0F / (float) Math.PI);
      float f1 = var10 + var1.N() * class04995.P(f);
      float f2 = var11 + var1.N() * class04995.m(f);
      if (var2 != null) {
         class09093 class09093 = class09080.u();
         float f3 = 12.0F;
         class11176.N(class09093, var2, f1 - class09093.y(var2, f3, class09079.REGULAR, false) / 2.0F, f2 - 32.0F, f3, var1.L(), -16777216);
      }

      ((Matrix4f)this.L_4).identity().translate(f1, f2, 0.0F).rotate(f, 0.0F, 0.0F, 1.0F);
      class11176.y(((class11174)this.L_0).u(), (Matrix4f)this.L_4, -16.0F, -16.0F, 0.0F, 32.0F, 32.0F, this.N(var12, var1.L()));
   }
}
