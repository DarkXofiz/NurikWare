package NurikWare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07211;
import minecraft.class07438;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;

@class11080(
   L = "Trajectory",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Trajectory extends class11067 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public static Object R_0;

   private static void T() {
      R_0 = 4.0F;
   }

   public Trajectory() {
      super();
      this.j();
      this.i_0 = new class11254("pearl", true, new class11228((class11225)class11225.L_2, class11264.N));
      this.i_1 = new class11254("trident", true, new class11249((class11225)class11225.L_1, class11264.N));
      this.i_2 = new class11254("bow", true, new class11249((class11225)class11225.L_0, class11264.N));
      this.i_3 = new class11254("potions", true, new class11228((class11225)class11225.L_3, class11264.N));
      this.i_4 = new class11254("crossbow", true, new class11249((class11225)class11225.L_0, class11264.N));
      this.u_0 = new class11254("snowball", true, new class11228((class11225)class11225.L_4, class11264.N));
      this.u_1 = new class11254("windcharge", true, new class11228((class11225)class11225.L_5, class11264.N));
      this.u_2 = class11524.y(
         this,
         "predict-entity",
         (class11254)this.i_1,
         (class11254)this.i_0,
         (class11254)this.i_2,
         (class11254)this.i_4,
         (class11254)this.i_3,
         (class11254)this.u_0,
         (class11254)this.u_1
      );
      this.u_3 = class11524.N(this, "line-color", -11104513);
      this.u_4 = class11524.N(this, "hit-line-color", -43691);
      this.u_5 = class06889.L;
      this.u_6 = class06889.L;
      this.L_0 = 0;
      this.L_1 = 0;
   }

   static {
      T();
   }

   private int s() {
      if ((class04453)((class06202)super.y_0).T_4 == null) {
         return 0;
      } else {
         for (class07050 class07050 : class07050.values()) {
            class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_5998(class07050);
            if (class06584.N(class06570.sx)) {
               return class06584.N((class04453)((class06202)super.y_0).T_4) - ((class04453)((class06202)super.y_0).T_4).method_6014();
            }
         }

         return 0;
      }
   }

   private void j() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
      }
   }

   private void y(class11174 var1, Matrix4fStack var2, int var3) {
      float f = 0.6F;
      class11184 class11184 = var1.R();
      int i = class11184.i();
      class06889 class06889xxx = new class06889(f, 0.0, 0.0);
      class06889 class06889x = new class06889(0.0, 0.0, f);
      class06889 class06889xx = new class06889(-f, 0.0, 0.0);
      class06889 class06889xxx = new class06889(0.0, 0.0, -f);
      int j = class11300.N(var3, (int)(class11300.y(var3) * 0.196F * 2.0F));
      class11184.N(var2, (float)class06889xxx.M, (float)class06889xxx.B, (float)class06889xxx.Z).y(j).y();
      class11184.N(var2, (float)class06889x.M, (float)class06889x.B, (float)class06889x.Z).y(j).y();
      class11184.N(var2, (float)class06889xx.M, (float)class06889xx.B, (float)class06889xx.Z).y(j).y();
      class11184.N(var2, (float)class06889xxx.M, (float)class06889xxx.B, (float)class06889xxx.Z).y(j).y();
      var1.L().y(i);
   }

   private List<class11266> y(class06889 var1, float var2) {
      this.j();
      float f = ((class04453)((class06202)super.y_0).T_4).method_36455();
      float f1 = ((class04453)((class06202)super.y_0).T_4).method_36454();
      class06889 class06889xx = new class06889(
         class11925.i((class04453)((class06202)super.y_0).T_4),
         class11925.u((class04453)((class06202)super.y_0).T_4)
            + ((class04453)((class06202)super.y_0).T_4).method_18381(((class04453)((class06202)super.y_0).T_4).method_18376()),
         class11925.L((class04453)((class06202)super.y_0).T_4)
      );

      for (class07050 class07050 : class07050.values()) {
         class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_5998(class07050);
         if (class06584.N(class06570.db) && ((class11254)this.i_1).U()) {
            return List.of(new class11266(class06889xx, N((class04453)((class06202)super.y_0).T_4, var1, f, f1, 0.0F, 2.5F), ((class11254)this.i_1).N()));
         }

         if (class06584.N(class06570.nz) && ((class11254)this.i_0).U()) {
            return List.of(new class11266(class06889xx, N((class04453)((class06202)super.y_0).T_4, var1, f, f1, 0.0F, 1.5F), ((class11254)this.i_0).N()));
         }

         if (class06584.N(class06570.dw) && ((class11254)this.i_4).U()) {
            if (!class06593.u(class06584)) {
               return Collections.emptyList();
            }

            int[] aint;
            if (((class02820)class06584.a_(class02484.x, class02820.N)).N().size() == 1) {
               aint = new int[]{0};
            } else {
               aint = new int[]{-10, 0, 10};
            }

            ArrayList arraylist = new ArrayList();

            for (int i : aint) {
               class06889 class06889x = ((class04453)((class06202)super.y_0).T_4).method_18864(1.0F);
               Quaternionf quaternionf = new Quaternionf().setAngleAxis(i * (float) (Math.PI / 180.0), class06889x.M, class06889x.B, class06889x.Z);
               Vector3f vector3f = ((class04453)((class06202)super.y_0).T_4).method_5828(1.0F).W().rotate(quaternionf);
               class06889 class06889xx = N(vector3f.x, vector3f.y, vector3f.z, 3.15F);
               arraylist.add(new class11266(class06889xx, class06889xx, ((class11254)this.i_4).N()));
            }

            return arraylist;
         }

         if (class06584.N(class06570.sx) && ((class11254)this.i_2).U()) {
            float f2 = var2 <= 0.0F ? 1.0F : N(var2) * 3.0F;
            return List.of(new class11266(class06889xx, N((class04453)((class06202)super.y_0).T_4, var1, f, f1, 0.0F, f2), ((class11254)this.i_2).N()));
         }

         if (class06584.N(class06570.lO) && ((class11254)this.i_3).U()) {
            return List.of(
               new class11266(class06889xx, N((class04453)((class06202)super.y_0).T_4, var1, f, f1, -20.0F, 0.5F), ((class11254)this.i_3).N(), 4.0F)
            );
         }

         if (class06584.N(class06570.jP) && ((class11254)this.u_0).U()) {
            return List.of(new class11266(class06889xx, N((class04453)((class06202)super.y_0).T_4, var1, f, f1, 0.0F, 1.5F), ((class11254)this.u_0).N()));
         }

         if (class06584.N(class06570.Gz) && ((class11254)this.u_1).U()) {
            return List.of(new class11266(class06889xx, N((class04453)((class06202)super.y_0).T_4, var1, f, f1, 0.0F, 1.5F), ((class11254)this.u_1).N()));
         }
      }

      return Collections.emptyList();
   }

   private static float N(float var0) {
      float f = var0 / 20.0F;
      f = (f * f + f * 2.0F) / 3.0F;
      return Math.min(f, 1.0F);
   }

   private void N(class11174 var1, Matrix4fStack var2, class06889 var3, class06889 var4, class06889 var5, int var6, int var7, float var8) {
      class06889 class06889x = var4.u(var3);
      class06889 class06889x = var5.u(var3);
      var1.R()
         .N(var2, (float)class06889x.M, (float)class06889x.B, (float)class06889x.Z)
         .N(var2, (float)class06889x.M, (float)class06889x.B, (float)class06889x.Z)
         .y(var6)
         .y(var7)
         .N(var8)
         .y();
   }

   @class11782
   public void N(class11355 var1) {
      this.j();
      this.u_5 = (class06889)this.u_6;
      this.u_6 = class11907.y();
      this.L_0 = (Integer)this.L_1;
      this.L_1 = this.s();
   }

   private int N(class11241 var1, float var2) {
      this.j();
      if (var1.N().isPresent()) {
         class11223 class11223 = var1.N().get();
         if (class11223.y() instanceof class06145) {
            return ((class11515)this.u_4).i();
         }

         if (var2 > 0.0F && this.N(class11223.N(), var2)) {
            return ((class11515)this.u_4).i();
         }
      }

      return ((class11515)this.u_3).i();
   }

   public static class06889 N(class07049 var0, class06889 var1, float var2, float var3, float var4, float var5) {
      float f = -class04995.m(var3 * (float) (Math.PI / 180.0)) * class04995.P(var2 * (float) (Math.PI / 180.0));
      float f1 = -class04995.m((var2 + var4) * (float) (Math.PI / 180.0));
      float f2 = class04995.P(var3 * (float) (Math.PI / 180.0)) * class04995.P(var2 * (float) (Math.PI / 180.0));
      return N(f, f1, f2, var5).y(var1.M, var0.method_24828() ? 0.0 : var1.B, var1.Z);
   }

   private boolean N(class06889 var1, float var2) {
      class00734 class00734 = class00734.N(var1, var2 * 2.0F, var2 * 2.0F, var2 * 2.0F);
      double d0 = var2 * var2;
      return !((class03448)((class06202)super.y_0).T_3)
         .N(class07438.class, class00734, var4x -> var4x != (class04453)((class06202)super.y_0).T_4 && var4x.method_5805() && var4x.method_5707(var1) <= d0)
         .isEmpty();
   }

   public static class06889 N(double var0, double var2, double var4, float var6) {
      return new class06889(var0, var2, var4).u().L(var6);
   }

   @class11782
   public void N(class09321 var1) {
      this.j();
      float f = var1.u().N(true);
      class06889 class06889xxx = ((class06889)this.u_5).L(1.0F - f).i(((class06889)this.u_6).L(f));
      float f1 = ((Integer)this.L_0).intValue() + ((Integer)this.L_1 - (Integer)this.L_0) * f;
      List<class11266> list = this.y(class06889xxx, f1);
      if (!list.isEmpty()) {
         ArrayList arraylist = new ArrayList();

         for (class11266 class11266 : list) {
            arraylist.add(class11266.y());
         }

         float f2 = ((class04453)((class06202)super.y_0).T_4).method_36454();
         class06889 class06889x = new class06889(
            -class04995.P(f2 * (float) (Math.PI / 180.0)) * 0.15F, 0.0, -class04995.m(f2 * (float) (Math.PI / 180.0)) * 0.15F
         );
         class11174 class11174 = (class11174)class11190.N_2;
         class11174 class11174x = (class11174)class11190.y_3;
         Matrix4fStack matrix4fstack = var1.R();
         class06889 class06889xx = var1.y().y();

         for (int i = 0; i < arraylist.size(); i++) {
            class11241 class11241 = (class11241)arraylist.get(i);
            int j = this.N(class11241, list.get(i).u());
            List<class06889> list1 = class11241.y();
            if (!list1.isEmpty()) {
               class06889 class06889xxx = list1.getFirst();
               class06889 class06889xxxx = class11241.N().map(class11223::N).orElse(list1.getLast());
               Quaternionf quaternionf = new Quaternionf()
                  .rotationTo(
                     new Vector3f(
                        (float)(class06889xxx.M - class06889xxxx.M), (float)(class06889xxx.B - class06889xxxx.B), (float)(class06889xxx.Z - class06889xxxx.Z)
                     ),
                     new Vector3f(
                        (float)(class06889xxx.M + class06889x.M - class06889xxxx.M),
                        (float)(class06889xxx.B + class06889x.B - class06889xxxx.B),
                        (float)(class06889xxx.Z + class06889x.Z - class06889xxxx.Z)
                     )
                  );
               matrix4fstack.pushMatrix();
               matrix4fstack.translate(
                  (float)(class06889xxxx.M - class06889xx.M), (float)(class06889xxxx.B - class06889xx.B), (float)(class06889xxxx.Z - class06889xx.Z)
               );
               matrix4fstack.rotate(quaternionf);
               matrix4fstack.translate(
                  (float)(class06889xx.M - class06889xxxx.M), (float)(class06889xx.B - class06889xxxx.B), (float)(class06889xx.Z - class06889xxxx.Z)
               );
               class06889 class06889xxxxx = list1.getFirst();

               for (int k = 1; k < list1.size(); k++) {
                  class06889 class06889xxxxxx = list1.get(k);
                  this.N(
                     class11174,
                     matrix4fstack,
                     class06889xx,
                     class06889xxxxx,
                     class06889xxxxxx,
                     class11300.N(j, (int)(Math.min(1.0F, (k - 1) / 5.0F) * 255.0F)),
                     class11300.N(j, (int)(Math.min(1.0F, k / 5.0F) * 255.0F)),
                     0.0F
                  );
                  class06889xxxxx = class06889xxxxxx;
               }

               matrix4fstack.popMatrix();
               if (!class11241.N().isEmpty()) {
                  class11223 class11223 = class11241.N().get();
                  float f3 = list.get(i).u();
                  if (f3 > 0.0F) {
                     class11226.N(class06889xx, class11223.N(), f3, j);
                  } else {
                     class06889 class06889xxxxxx = new class06889(0.0, 1.0, 0.0);
                     if (class11223.y() instanceof class06183 class06183) {
                        class07211 class07211 = class06183.i();
                        class06889xxxxxx = new class06889(class07211.P(), class07211.s(), class07211.T());
                     } else if (class11223.y() instanceof class06145 class06145) {
                        class07049 class07049 = class06145.L();
                        class06889 class06889xxxxxxx = class06145.y();
                        class00734 class00734 = class07049.method_5829().M(1.0E-6);
                        double d0 = Math.max(1.0E-6, 0.5 * class00734.y());
                        double d1 = Math.max(1.0E-6, 0.5 * class00734.L());
                        double d2 = Math.max(1.0E-6, 0.5 * class00734.u());
                        class06889 class06889xxxxxxxx = class00734.R();
                        double d3 = class06889xxxxxxx.M - class06889xxxxxxxx.M;
                        double d4 = class06889xxxxxxx.B - class06889xxxxxxxx.B;
                        double d5 = class06889xxxxxxx.Z - class06889xxxxxxxx.Z;
                        double d6 = d3 / d0;
                        double d7 = d4 / d1;
                        double d8 = d5 / d2;
                        double d9 = Math.abs(d6);
                        double d10 = Math.abs(d7);
                        double d11 = Math.abs(d8);
                        if (d9 >= d10 && d9 >= d11) {
                           class06889xxxxxx = new class06889(Math.signum(d3), 0.0, 0.0);
                        } else if (d10 >= d9 && d10 >= d11) {
                           class06889xxxxxx = new class06889(0.0, Math.signum(d4), 0.0);
                        } else {
                           class06889xxxxxx = new class06889(0.0, 0.0, Math.signum(d5));
                        }
                     }

                     class06889 class06889xxxxxxx = class11223.N();
                     class06889xxxxxx = class06889xxxxxx.u();
                     matrix4fstack.pushMatrix();
                     matrix4fstack.translate(
                        (float)(class06889xxxxxxx.M - class06889xx.M),
                        (float)(class06889xxxxxxx.B - class06889xx.B),
                        (float)(class06889xxxxxxx.Z - class06889xx.Z)
                     );
                     matrix4fstack.rotate(
                        new Quaternionf()
                           .rotateTo(
                              new Vector3f(0.0F, 1.0F, 0.0F), new Vector3f((float)class06889xxxxxx.M, (float)class06889xxxxxx.B, (float)class06889xxxxxx.Z)
                           )
                     );
                     this.y(class11174x, matrix4fstack, j);
                     this.N(class11174, matrix4fstack, j);
                     matrix4fstack.popMatrix();
                  }
               }
            }
         }

         class11226.N(var1);
      }
   }

   private void N(class11174 var1, Matrix4fStack var2, int var3) {
      float f = 0.6F;
      byte b0 = 4;
      double d0 = (float) (Math.PI * 2) / b0;
      class06889 class06889x = null;

      for (int i = 0; i <= b0; i++) {
         double d1 = i * d0;
         float f1 = (float)(Math.cos(d1) * f);
         float f2 = (float)(Math.sin(d1) * f);
         class06889 class06889x = new class06889(f1, 0.0, f2);
         if (class06889x != null) {
            int j = class11300.N(var3, 0.7F);
            this.N(var1, var2, class06889.L, class06889x, class06889x, j, j, 1.0F);
         }

         class06889x = class06889x;
      }
   }
}
