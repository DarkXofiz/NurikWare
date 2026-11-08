package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import minecraft.class01079;
import minecraft.class06202;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class12031 implements class12037 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   public class12031(String var1) {
      this(var1, 9729);
   }

   public class12031(String var1, int var2) {
      super();
      this.i();
      this.N_1 = var1;
      ByteBuffer bytebuffer = null;
      ByteBuffer bytebuffer1 = null;
      int i = 0;
      int j = 0;

      try {
         MemoryStack memorystack = MemoryStack.stackPush();

         try (InputStream inputstream = this.y()) {
            byte[] abyte = IOUtils.toByteArray(inputstream);
            bytebuffer = MemoryUtil.memAlloc(abyte.length);
            bytebuffer.put(abyte).flip();
            IntBuffer intbuffer = memorystack.mallocInt(1);
            IntBuffer intbuffer1 = memorystack.mallocInt(1);
            IntBuffer intbuffer2 = memorystack.mallocInt(1);
            bytebuffer1 = STBImage.stbi_load_from_memory(bytebuffer, intbuffer, intbuffer1, intbuffer2, 4);
            if (bytebuffer1 == null) {
               throw new IllegalStateException("Failed to decode image " + var1 + ": " + STBImage.stbi_failure_reason());
            }

            i = GL11.glGenTextures();
            j = GL11.glGetInteger(32873);
            GlStateManager._bindTexture(i);
            GlStateManager._texParameter(3553, 10240, var2);
            GlStateManager._texParameter(3553, 10241, var2);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL11.glTexImage2D(3553, 0, 32856, intbuffer.get(0), intbuffer1.get(0), 0, 6408, 5121, bytebuffer1);
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
      } catch (RuntimeException | IOException ioexception) {
         ((Logger)y_0).error("Failed to load texture: {}", var1, ioexception);
         if (i != 0) {
            GL11.glDeleteTextures(i);
            i = 0;
         }
      } finally {
         if (bytebuffer1 != null) {
            STBImage.stbi_image_free(bytebuffer1);
         }

         if (bytebuffer != null) {
            MemoryUtil.memFree(bytebuffer);
         }

         if (i != 0) {
            GlStateManager._bindTexture(j);
         }
      }

      this.N_0 = i;
   }

   static {
      Z();
   }

   private static void Z() {
      y_0 = null;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   public InputStream y() throws IOException {
      return ((class01079)class06202.Nq().Nm().method_14486(class11911.N((String)this.N_1)).orElseThrow()).method_14482();
   }

   @Override
   public int N() {
      return (Integer)this.N_0;
   }
}
