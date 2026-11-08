package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;

public class class11611 {
   private static String[] i;
   private static String[] B;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_4).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 6, 6))
      .N();

   private class11611() {
      super();
   }

   static {
      N();
      R();
   }

   public static void N(int var0, int var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      byte b0 = -1;
      class11176.N(((class11174)N_2).u(), var4, var5, var6, var7, 0.0F, 0.0F, 1.0F, 1.0F, b0);
      ((class11174)N_2).N(var6x -> {
         var6x.z(i[0]).N(class11925.L());
         var6x.z(i[1]).N(RenderSystem.getModelViewMatrix());
         var6x.R(i[2]).N(var6, var7);
         var6x.i(i[3]).N(10.0F * class09222.L());
         var6x.i(i[4]).N(1.0F * class09222.L());
         var6x.N(i[5]).N(class11300.N(var0, 255));
         var6x.N(i[6]).N(class11300.N(var1, 255));
         var6x.N(i[7]).N(class11300.N(var2, 255));
         var6x.N(B[0]).N(class11300.N(var3, 255));
         var6x.N(B[1]).N((Integer)class09181.L_2);
      });
   }

   private static void N() {
      i = new String[8];
      i[0] = "u_projection";
      i[1] = "u_view";
      i[2] = "u_size";
      i[3] = "u_radius";
      i[4] = "u_border_width";
      i[5] = "u_top_left";
      i[6] = "u_top_right";
      i[7] = "u_bottom_left";
      B = new String[2];
      B[0] = "u_bottom_right";
      B[1] = "u_border_color";
   }

   private static void R() {
      N_0 = 10.0F;
      N_1 = 1.0F;
   }
}
