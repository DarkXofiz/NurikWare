package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL33;

public class class12026 extends class12003 {
   public class12026(int var1) {
      super(var1);
   }

   private static void y(int var0, int var1) {
      GL13.glActiveTexture(var0);
      GL11.glBindTexture(3553, var1);
      GL33.glBindSampler(var0 - 33984, 0);
      GlStateManager._activeTexture(var0);
      GlStateManager._bindTexture(var1);
   }

   public void N(int var1, int var2) {
      y(var1, var2);
      super.N(var1 - 33984);
   }

   @Override
   public void N(int var1) {
      y(33984, var1);
      super.N(0);
   }

   public void N(class09057 var1) {
      class09060.N().N(0, var1);
      super.N(0);
   }

   public void N(int var1, class09057 var2) {
      class09060.N().N(var1, var2);
      super.N(var1);
   }
}
