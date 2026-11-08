package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class08066;
import org.joml.Vector2i;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public class class11619 {
   private static String[] G;
   private static double[] I;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2 = 1;
   public static Object L_3 = (Integer)L_2;
   public static Object L_4 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.u_0).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 6, 6))
      .N();
   public Object u_0;
   public boolean u_init;

   private void L() {
      long i = ((class06202)this.y_0).Nt().B();
      this.N_6 = GLFW.glfwGetInputMode(i, 208897);
      GLFW.glfwSetInputMode(i, 208897, 212994);
      this.N_7 = true;
   }

   public class11619(
      class11872 var1,
      class09785<class11619> var2,
      class09785<Boolean> var3,
      class09785<Float> var4,
      class09785<Float> var5,
      class09785<Float> var6,
      class09785<String> var7,
      class09785<String> var8
   ) {
      super();
      this.y();
      this.y_0 = class06202.Nq();
      this.y_1 = class09064.y((Integer)L_3, (Integer)L_3).y(class11181.RGB8).N(class11199.NEAREST, class11199.NEAREST).N(G[0]).N();
      this.N_6 = 212993;
      this.y_2 = var1;
      this.y_3 = var2;
      this.N_0 = var3;
      this.N_1 = var4;
      this.N_2 = var5;
      this.N_3 = var6;
      this.N_4 = var7;
      this.N_5 = var8;
      this.L();
   }

   static {
      z();
      i();
      Z();
      Math.ceil(I[0]);
   }

   private void B() {
      class08066 class08066 = ((class06202)this.y_0).e();
      Vector2i vector2i = class11307.N(((class06220)((class06202)this.y_0).L_2).i(), ((class06220)((class06202)this.y_0).L_2).R());
      int i = Math.clamp((long)vector2i.x(), 0, class08066.N - 1);
      int j = Math.clamp((long)vector2i.y(), 0, class08066.y - 1);
      int k = Math.clamp((long)(i - (Integer)L_2), 0, class08066.N - (Integer)L_3);
      int l = Math.clamp((long)(j - (Integer)L_2), 0, class08066.y - (Integer)L_3);
      int i1 = class08066.y - l - (Integer)L_3;
      class11925.N(class08066, (class09064)this.y_1, k, i1, (Integer)L_3, (Integer)L_3, 0, 0, (Integer)L_3, (Integer)L_3);
      class11925.N(class08066, false);
      float f = 144.0F;
      class11176.N(((class11174)L_4).u(), vector2i.x() - 72.0F, vector2i.y() - 72.0F, f, f, 0.0F, 0.0F, 1.0F, 1.0F, -1);
      ((class11174)L_4).N(var5x -> {
         var5x.z(G[1]).N(class11925.L());
         var5x.z(G[2]).N(RenderSystem.getModelViewMatrix());
         var5x.M(G[3]).N(((class09064)this.y_1).U());
         var5x.R(G[4]).N(((Integer)L_3).intValue(), ((Integer)L_3).intValue());
         var5x.R(G[5]).N(i - k, j - l);
      });
   }

   private static void Z() {
      L_0 = 72.0F;
      L_1 = 12.0F;
      L_2 = 0;
      L_3 = 0;
   }

   private static void i() {
      G = new String[6];
      G[0] = "color_picker_pipette_preview";
      G[1] = "u_projection";
      G[2] = "u_view";
      G[3] = "texture_in";
      G[4] = "u_source_size";
      G[5] = "u_center_px";
   }

   private void m() {
      if ((Boolean)this.N_7) {
         GLFW.glfwSetInputMode(((class06202)this.y_0).Nt().B(), 208897, (Integer)this.N_6);
         this.N_7 = false;
      }
   }

   private static void z() {
      I = new double[1];
      I[0] = Double.longBitsToDouble(4618441417868443648L);
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_6 = 0;
         this.N_7 = false;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = false;
      }
   }

   @class11782(
      y = class11777.LISTENER
   )
   public void N(class10989 var1) {
      if ((Boolean)this.u_0) {
         this.u_0 = false;
         int i = class11300.N(this.R(), class11300.y(((class11872)this.y_2).y()));
         class11595.N((class11872)this.y_2, i, (class09785<Float>)this.N_1, (class09785<Float>)this.N_2, (class09785<Float>)this.N_3);
         class11595.N((class11872)this.y_2, i, (class09785<String>)this.N_4, (class09785<String>)this.N_5);
         this.N();
      } else {
         this.B();
      }
   }

   @class11782(
      y = class11777.BEFORE_ALL
   )
   public void N(class11389 var1) {
      if (var1.B()) {
         if (var1.Z().N(class11381.MOUSE) && var1.z() == 0) {
            var1.N();
            this.u_0 = true;
         } else {
            if (var1.Z().N(class11381.KEYBOARD) && var1.y(class12002.ESCAPE)) {
               var1.N();
               this.N();
            }
         }
      }
   }

   public void N() {
      class11938.L().N(this);
      ((class09785)this.y_3).N(null);
      ((class09785)this.N_0).N(false);
      this.u_0 = false;
      this.m();
   }

   private int R() {
      class08066 class08066 = ((class06202)this.y_0).e();
      Vector2i vector2i = class11307.N(((class06220)((class06202)this.y_0).L_2).i(), ((class06220)((class06202)this.y_0).L_2).R());
      int i = Math.clamp((long)vector2i.x(), 0, class08066.N - 1);
      int j = Math.clamp((long)(class08066.y - 1 - vector2i.y()), 0, class08066.y - 1);
      ByteBuffer bytebuffer = BufferUtils.createByteBuffer(3);
      class11925.N(class08066, false);
      int k = GL11.glGetInteger(3333);
      GL11.glPixelStorei(3333, 1);
      GL11.glReadPixels(i, j, 1, 1, 6407, 5121, bytebuffer);
      GL11.glPixelStorei(3333, k);
      int l = bytebuffer.get(0) & 255;
      int i1 = bytebuffer.get(1) & 255;
      int j1 = bytebuffer.get(2) & 255;
      return class11300.y(l, i1, j1, 255);
   }
}
