package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;

public class class11640 {
   private static String[] i;
   public static Object N_0 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_3).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 6, 6))
      .N();

   private class11640() {
      super();
   }

   static {
      N();
      u();
   }

   private static void u() {
   }

   private static void N() {
      i = new String[4];
      i[0] = "u_projection";
      i[1] = "u_view";
      i[2] = "u_size";
      i[3] = "u_color";
   }

   public static void N(int var0, float var1, float var2, float var3, float var4) {
      byte b0 = -1;
      class11176.N(((class11174)N_0).u(), var1, var2, var3, var4, 0.0F, 0.0F, 1.0F, 1.0F, b0);
      ((class11174)N_0).N(var3x -> {
         var3x.z(i[0]).N(class11925.L());
         var3x.z(i[1]).N(RenderSystem.getModelViewMatrix());
         var3x.R(i[2]).N(var3, var4);
         var3x.N(i[3]).N(class11300.N(var0, 255));
      });
   }
}
