package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryStack;

public class class12039 implements class12037 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   private static void M() {
      y_0 = null;
   }

   public class12039() {
      super();
      this.u();
      int i = 0;
      int j = 0;

      try {
         MemoryStack memorystack = MemoryStack.stackPush();

         try {
            ByteBuffer bytebuffer = memorystack.malloc(4);
            bytebuffer.put((byte)-1).put((byte)-1).put((byte)-1).put((byte)-1).flip();
            i = GL11.glGenTextures();
            j = GL11.glGetInteger(32873);
            GlStateManager._bindTexture(i);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL11.glTexImage2D(3553, 0, 32856, 1, 1, 0, 6408, 5121, bytebuffer);
         } catch (Throwable throwable1) {
            if (memorystack != null) {
               try {
                  memorystack.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (memorystack != null) {
            memorystack.close();
         }
      } catch (Exception exception) {
         ((Logger)y_0).error("Failed to create blank texture", exception);
         if (i != 0) {
            GL11.glDeleteTextures(i);
            i = 0;
         }

         throw new RuntimeException(exception);
      } finally {
         if (i != 0) {
            GlStateManager._bindTexture(j);
         }
      }

      this.N_0 = i;
   }

   static {
      M();
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   @Override
   public int N() {
      return (Integer)this.N_0;
   }
}
