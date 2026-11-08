package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.FloatBuffer;
import minecraft.class00056;
import minecraft.class00312;
import minecraft.class00734;
import minecraft.class01054;
import minecraft.class01383;
import minecraft.class03386;
import minecraft.class03394;
import minecraft.class03396;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08066;
import minecraft.class08844;
import minecraft.class08879;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL33C;

public class class11925 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public static Object y_0 = 1.5F;
   public static Object y_1 = 1.0F;
   public static Object y_2 = 2.2F;
   public static Object y_3 = new Matrix4f();
   public static Object y_4 = new Matrix4f();
   public static Object L_0 = new class03394().N(class03396.field_60101);
   public static Object L_1 = new class00056("nurikware-unscale", -1000.0F, 11000.0F, true);
   public static Object L_2 = class06202.Nq();
   public static Object L_3 = new Matrix4f();
   public static Object L_4;
   public static Object L_5 = new class10203(null, 1, 1, true);
   public static Object L_6 = new class11216();

   public static double L(class07049 var0) {
      return !var0.method_5805() ? var0.method_23321() : class04995.u(N(var0), var0.field_5969, var0.method_23321());
   }

   public static void L(class08066 var0) {
      var0.N((class08066)L_5);
   }

   public static Matrix4f L() {
      return (Matrix4f)L_3;
   }

   private class11925() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      Z();
   }

   private static void Z() {
      N_0 = 4;
      N_1 = 4;
      N_2 = 16;
      N_3 = 20;
      N_4 = 5;
      N_5 = 35;
      N_6 = -1442182646;
      y_0 = 1.5F;
      y_1 = 1.0F;
      y_2 = 2.2F;
      y_3 = null;
      y_4 = null;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      L_6 = null;
   }

   public static void i() {
      class08844 class08844 = class06202.Nq().Nt();
      float f = class08844.U() / class08844.j();
      float f1 = class08844.E() / class08844.j();
      RenderSystem.setProjectionMatrix(((class00056)L_1).y(f, f1), class00312.field_54954);
      ((Matrix4f)L_3).set(((class12035)((class00056)L_1)).N(f, f1));
   }

   public static double i(class07049 var0) {
      return !var0.method_5805() ? var0.method_23317() : class04995.u(N(var0), var0.field_6014, var0.method_23317());
   }

   public static double u(class07049 var0) {
      return !var0.method_5805() ? var0.method_23318() : class04995.u(N(var0), var0.field_6036, var0.method_23318());
   }

   public static int u() {
      return GL12.glGetInteger(3379);
   }

   public static void u(class08066 var0) {
      N((class08066)L_5, var0.N, var0.y);
      ((class08066)L_5).N(var0);
   }

   public static class11893 y(float var0, float var1, float var2) {
      Vector4f vector4f = new Vector4f(var0, var1, var2, 1.0F);
      vector4f.mul((Matrix4f)y_4);
      float f = vector4f.x / vector4f.w;
      float f1 = vector4f.y / vector4f.w;
      class08844 class08844 = ((class06202)L_2).Nt();
      float f2 = class08844.U();
      float f3 = class08844.E();
      float f4 = (f * 0.5F + 0.5F) * f2;
      float f5 = (1.0F - (f1 * 0.5F + 0.5F)) * f3;
      boolean flag = vector4f.w > 0.01F;
      if (!flag) {
         f4 = f2 - f4;
         f5 = f3 - f5;
      }

      return new class11893(new Vector2f(f4, f5), flag);
   }

   public static Matrix4f y(float var0, float var1) {
      RenderSystem.setProjectionMatrix(((class00056)L_1).y(var0, var1), class00312.field_54954);
      ((Matrix4f)L_3).set(((class12035)((class00056)L_1)).N(var0, var1));
      return (Matrix4f)L_3;
   }

   public static int y(class08066 var0) {
      GpuTexture gputexture = var0.i();
      return gputexture == null ? 0 : ((class08893)gputexture).N();
   }

   public static boolean y(class07049 var0) {
      return N(var0.method_5829());
   }

   public static class06889 y() {
      return ((class03386)((class06202)L_2).i_5).s().y();
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 16384, 9728);
   }

   public static void N(class01383 var0) {
      L_4 = var0;
   }

   public static Vector2f N(Vector2f var0, float var1, float var2, float var3) {
      float f = var1 / 2.0F;
      float f1 = var2 / 2.0F;
      float f2 = f - var3;
      float f3 = f1 - var3;
      float f4 = var0.x - f;
      float f5 = var0.y - f1;
      if (f4 == 0.0F && f5 == 0.0F) {
         return new Vector2f(f, f1 - f3);
      } else {
         float f6 = f4 * f4 / (f2 * f2) + f5 * f5 / (f3 * f3);
         float f7 = (float)(1.0 / Math.sqrt(f6));
         return new Vector2f(f + f4 * f7, f1 + f5 * f7);
      }
   }

   public static void N(FloatBuffer var0, int var1) {
      var0.clear();
      float f = Math.max(var1 / 3.0F, 1.0F);
      double d0 = 0.0;

      for (int i = 0; i <= var1; i++) {
         double d1 = N(i, f);
         var0.put((float)d1);
         d0 += i == 0 ? d1 : d1 * 2.0;
      }

      for (int j = 0; j <= var1; j++) {
         var0.put(j, (float)(var0.get(j) / d0));
      }

      var0.rewind();
   }

   public static double N(float var0, float var1) {
      double d0 = var1 * var1;
      return Math.exp(-(var0 * var0) / (2.0 * d0));
   }

   public static void N(class08066 var0, int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if (var1 != var0.N || var2 != var0.y) {
            var0.N(var1, var2);
            N(var0.L());
            N(var0.i());
         }
      }
   }

   public static Vector4f N(class07049 var0, boolean var1) {
      class06889 class06889 = y();
      double d0 = (var1 ? i(var0) : var0.method_23317()) - class06889.M;
      double d1 = (var1 ? u(var0) : var0.method_23318()) - class06889.B;
      double d2 = (var1 ? L(var0) : var0.method_23321()) - class06889.Z;
      float f = var0.method_17681() / 2.0F;
      float f1 = var0.method_17682();
      float f2 = (float)(d0 - f);
      float f3 = (float)d1;
      float f4 = (float)(d2 - f);
      float f5 = (float)(d0 + f);
      float f6 = (float)(d1 + f1 + 0.1);
      float f7 = (float)(d2 + f);
      float[] afloat = new float[]{f2, f3, f4, f2, f6, f4, f5, f3, f4, f5, f6, f4, f2, f3, f7, f2, f6, f7, f5, f3, f7, f5, f6, f7};
      Vector4f vector4f = new Vector4f(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);

      for (int i = 0; i < 8; i++) {
         Vector2f vector2f = N(afloat[i * 3], afloat[i * 3 + 1], afloat[i * 3 + 2]);
         if (vector2f != null) {
            vector2f = vector2f.round();
            vector4f.set(
               Math.min(vector2f.x, vector4f.x()), Math.min(vector2f.y, vector4f.y()), Math.max(vector2f.x, vector4f.z()), Math.max(vector2f.y, vector4f.w())
            );
         }
      }

      return vector4f.x() == Float.MAX_VALUE && vector4f.y() == Float.MAX_VALUE && vector4f.z() == Float.MIN_VALUE && vector4f.w() == Float.MIN_VALUE
         ? null
         : vector4f;
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      GlStateManager._glBindFramebuffer(36008, var0);
      GlStateManager._glBindFramebuffer(36009, var1);
      GlStateManager._glBlitFrameBuffer(0, 0, var2, var3, 0, 0, var4, var5, var6, var7);
   }

   public static Vector2f N(float var0, float var1, float var2) {
      Vector4f vector4f = new Vector4f(var0, var1, var2, 1.0F);
      vector4f.mul((Matrix4f)y_4);
      if (vector4f.w <= 0.01F) {
         return null;
      } else {
         float f = vector4f.x / vector4f.w;
         float f1 = vector4f.y / vector4f.w;
         class08844 class08844 = ((class06202)L_2).Nt();
         float f2 = (f * 0.5F + 0.5F) * class08844.U();
         float f3 = (1.0F - (f1 * 0.5F + 0.5F)) * class08844.E();
         return new Vector2f(f2, f3);
      }
   }

   public static int N(class08066 var0) {
      return ((class08893)var0.L()).N();
   }

   public static void N(class09093 var0, class11213 var1, String var2, int var3, float var4, float var5, class06584 var6, int var7) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, -1.0F);
   }

   public static void N(class09093 var0, class11213 var1, String var2, int var3, float var4, float var5, class06584 var6, int var7, float var8) {
      String s = String.valueOf(Math.max(Math.round(var7 * 50.0F / 100.0F) / 10.0F, 0.0F));
      float f = var0.N(var3, class09079.REGULAR, false);
      boolean flag = !var2.isEmpty();
      float f1 = flag ? var0.y(var2, (float)var3, class09079.REGULAR, false) : 0.0F;
      float f2 = flag ? var0.y(" ", (float)var3, class09079.REGULAR, false) : 0.0F;
      float f3 = var0.y(s, (float)var3, class09079.REGULAR, false);
      float f4 = Math.max(35.0F, (float)Math.ceil(f3 / 5.0F) * 5.0F);
      float f5 = f1 + f2 + f4;
      float f6 = f5 + 20.0F + 8.0F;
      float f7 = 24.0F;
      float f8 = class04995.y(var4 - f6 / 2.0F);
      float f9 = class04995.y(var5 - f7 / 2.0F);
      float f10 = f8 + 4.0F + 20.0F;
      float f11 = f9 + (f7 - f) / 2.0F;
      class11176.N(var1, f8 - 2.0F, f9, f6 + 4.0F + 4.0F, f7 + (var8 >= 0.0F ? 2 : 0), -1442182646);
      class11938.k().N(var6, f8 + 4.0F, f9 + 4.0F, 16.0F);
      if (flag) {
         var0.y(var2).N(f10, f11).N((float)var3).N(class09079.REGULAR).i(-1).L();
      }

      var0.y(s).N(f10 + f5 - f3, f11).N((float)var3).N(class09079.REGULAR).i(-1).L();
      if (var8 >= 0.0F) {
         float f12 = Math.min(var8, 1.0F);
         float f13 = f6 + 4.0F + 4.0F;
         int i = class04995.M(f12 / 3.0F, 1.0F, 1.0F) | 0xFF000000;
         class11176.N(var1, f8 - 2.0F, f9 + f7, f13 * f12, 2.0F, i);
      }
   }

   public static void N(class08066 var0, class08066 var1) {
      RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var0.L(), var1.L(), 0, 0, 0, 0, 0, var1.N, var1.y);
   }

   public static Matrix4f N() {
      class08844 class08844 = class06202.Nq().Nt();
      float f = class08844.U();
      float f1 = class08844.E();
      return y(f, f1);
   }

   public static float N(class07049 var0) {
      return ((class06202)L_2).NK().N((class03448)((class06202)L_2).T_3 == null || !((class03448)((class06202)L_2).T_3).method_54719().N(var0));
   }

   public static void N(class08066 var0, class09064 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var4 > 0 && var5 > 0 && var8 > 0 && var9 > 0) {
         int i = ((class08893)var0.L()).N(((class08879)RenderSystem.getDevice()).y(), var0.i());
         class09060 class09060 = class09060.N();
         class09086 class09086x = class09060.N(i, var0.N, var0.y);
         class09086 class09086x = ((class09065)class09065.y_0).L(var1);
         class09060.N(class09086x, class09086x, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   public static void N(class01054 var0, class06584 var1, float var2, float var3) {
      var0.N(var1, class04995.y(var2), class04995.y(var3));
   }

   public static void N(class08066 var0, boolean var1) {
      ((class09065)class09065.y_0).N(var0, var1);
   }

   public static void N(GpuTexture var0) {
      if (var0 instanceof class08893 class08893) {
         GlStateManager._activeTexture(33984);
         GlStateManager._bindTexture(class08893.N());
         GL33C.glBindSampler(0, 0);
         GL12.glTexParameteri(3553, 10241, 9729);
         GL12.glTexParameteri(3553, 10240, 9729);
         GL12.glTexParameteri(3553, 10242, 33071);
         GL12.glTexParameteri(3553, 10243, 33071);
         GL12.glTexParameteri(3553, 33084, 0);
         GL12.glTexParameteri(3553, 33085, 0);
      }
   }

   public static boolean N(class00734 var0) {
      return (class01383)L_4 != null && ((class01383)L_4).method_23093(var0);
   }

   public static void N(class08066 var0, class09064 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 16384, 9728);
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var4 > 0 && var5 > 0 && var8 > 0 && var9 > 0) {
         int i = GlStateManager.getFrameBuffer(36008);
         int j = GlStateManager.getFrameBuffer(36009);
         GlStateManager._glBindFramebuffer(36008, var0);
         GlStateManager._glBindFramebuffer(36009, var1);
         GlStateManager._glBlitFrameBuffer(var2, var3, var2 + var4, var3 + var5, var6, var7, var6 + var8, var7 + var9, var10, var11);
         GlStateManager._glBindFramebuffer(36009, j);
         GlStateManager._glBindFramebuffer(36008, i);
      }
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5) {
      N(var0, var1, var2, var3, var4, var5, 16384, 9728);
   }
}
