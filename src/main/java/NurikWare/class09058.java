package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL33;

public class class09058 implements class09060 {
   public class09058() {
      super();
   }

   @Override
   public void N(class09086 var1, class09086 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if (var5 > 0 && var6 > 0 && var9 > 0 && var10 > 0) {
         int i = GlStateManager.getFrameBuffer(36008);
         int j = GlStateManager.getFrameBuffer(36009);
         GlStateManager._glBindFramebuffer(36008, var1.i());
         GlStateManager._glBindFramebuffer(36009, var2.i());
         GlStateManager._glBlitFrameBuffer(var3, var4, var3 + var5, var4 + var6, var7, var8, var7 + var9, var8 + var10, var11, var12);
         GlStateManager._glBindFramebuffer(36009, j);
         GlStateManager._glBindFramebuffer(36008, i);
      }
   }

   @Override
   public class09086 N(class09057 var1, class09057 var2, String var3) {
      return new class09088(var1, var2, var3);
   }

   @Override
   public class09057 N(class09073 var1) {
      class11183 class11183 = class11203.N(var1.y());
      int i = GL30.glGenTextures();
      GlStateManager._bindTexture(i);
      GL30.glTexImage2D(3553, 0, class11183.y(), var1.B(), var1.N(), 0, class11183.L(), class11183.N(), (ByteBuffer)null);
      GL30.glTexParameteri(3553, 10241, class11203.N(var1.M()));
      GL30.glTexParameteri(3553, 10240, class11203.N(var1.R()));
      GL30.glTexParameteri(3553, 10242, class11203.N(var1.L()));
      GL30.glTexParameteri(3553, 10243, class11203.N(var1.i()));
      if (var1.u()) {
         GL30.glGenerateMipmap(3553);
      }

      return new class09098(var1, i);
   }

   @Override
   public class09086 N(int var1, int var2, int var3) {
      return new class11180(var1, var2, var3);
   }

   @Override
   public void N(int var1, class09057 var2) {
      GlStateManager._activeTexture(33984 + var1);
      GlStateManager._bindTexture(var2 == null ? 0 : var2.i());
      GL33.glBindSampler(var1, 0);
   }
}
