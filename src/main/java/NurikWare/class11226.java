package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08066;
import org.joml.Matrix4f;

public class class11226 {
   private static String[] L;
   public static Object N_0;
   public static Object N_1 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.E_0).N(4).N())
      .N(class11213.N((class09087)class09063.N_3, 1024))
      .N(36)
      .N();
   public static Object N_2 = ((class09322)class11185.E_0).z(L[1]);
   public static Object N_3 = ((class09322)class11185.E_0).z(L[2]);
   public static Object N_4 = ((class09322)class11185.E_0).L(L[3]);
   public static Object N_5 = ((class09322)class11185.E_0).R(L[4]);
   public static Object N_6 = new Matrix4f();
   public static Object N_7 = new Matrix4f();

   private class11226() {
      super();
      throw new UnsupportedOperationException(L[0]);
   }

   static {
      N();
      R();
   }

   private static void N() {
      L = new String[5];
      L[0] = "This is a utility class and cannot be instantiated";
      L[1] = "invProjection";
      L[2] = "invView";
      L[3] = "depth_in";
      L[4] = "texel_size";
   }

   public static void N(class06889 var0, class06889 var1, float var2, int var3) {
      ((class11174)N_1).R().N((float)(var1.M - var0.M), (float)(var1.B - var0.B), (float)(var1.Z - var0.Z)).N(var2).y(var3).y();
   }

   public static void N(class09321 var0) {
      if (((class11174)N_1).R().i() != 0) {
         class08066 class08066 = class06202.Nq().e();
         ((Matrix4f)N_6).set(var0.i()).invert();
         ((Matrix4f)N_7).set(var0.N()).invert();
         class11925.N(class08066, true);
         ((class11216)class11925.L_6).N(var0.i(), var0.N());
         ((class11174)N_1).y(var1x -> {
            GlStateManager._activeTexture(33984);
            GlStateManager._bindTexture(class11925.y(class08066));
            ((class12003)N_4).N(0);
            ((class11993)N_5).N(1.0F / class08066.N, 1.0F / class08066.y);
            ((class12038)N_2).N((Matrix4f)N_6);
            ((class12038)N_3).N((Matrix4f)N_7);
         });
      }
   }

   private static void R() {
      N_0 = 36;
   }
}
