package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;

public class class11606 {
   private static String[] u;
   public static Object N_0 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_5).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 6, 6))
      .N();

   private class11606() {
      super();
   }

   static {
      N();
      y();
      i();
   }

   private static void i() {
   }

   private static void y() {
      u = new String[3];
      u[0] = "u_projection";
      u[1] = "u_view";
      u[2] = "u_size";
   }

   public static void N(float var0, float var1, float var2, float var3) {
      byte b0 = -1;
      class11176.N(((class11174)N_0).u(), var0, var1, var2, var3, 0.0F, 0.0F, 1.0F, 1.0F, b0);
      ((class11174)N_0).N(var2x -> {
         var2x.z(u[0]).N(class11925.L());
         var2x.z(u[1]).N(RenderSystem.getModelViewMatrix());
         var2x.R(u[2]).N(var2, var3);
      });
   }

   private static void N() {
   }
}
