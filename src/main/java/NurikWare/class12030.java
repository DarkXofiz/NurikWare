package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;

public record class12030(boolean enabled) implements class12007 {
   public static Object N_0 = new class12030(true);
   public static Object N_1 = new class12030(false);


   static {
      i();
   }

   private static void i() {
      N_0 = null;
      N_1 = null;
   }

   public boolean y() {
      return this.enabled;
   }

   @Override
   public void N() {
      if (this.enabled) {
         GlStateManager._enableDepthTest();
      } else {
         GlStateManager._disableDepthTest();
      }
   }
}
