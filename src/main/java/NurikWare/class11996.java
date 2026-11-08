package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;

public record class11996(boolean enabled) implements class12007 {
   public static Object N_0 = new class11996(true);
   public static Object N_1 = new class11996(false);


   static {
      u();
   }

   private static void u() {
      N_0 = null;
      N_1 = null;
   }

   public boolean y() {
      return this.enabled;
   }

   @Override
   public void N() {
      if (this.enabled) {
         GlStateManager._enableCull();
      } else {
         GlStateManager._disableCull();
      }
   }
}
