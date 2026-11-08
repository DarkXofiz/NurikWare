package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;

public record class12014(boolean enabled) implements class12007 {
   public static Object y_0 = new class12014(true);
   public static Object y_1 = new class12014(false);

   private static void L() {
      y_0 = null;
      y_1 = null;
   }

   public class12014(boolean enabled) {
      super();
      this.enabled = enabled;
   }

   static {
      L();
   }

   public boolean y() {
      return this.enabled;
   }

   @Override
   public void N() {
      GlStateManager._depthMask(this.enabled);
   }
}
