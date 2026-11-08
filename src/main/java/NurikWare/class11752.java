package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class11752 {
   public static Object N_0 = LogManager.getLogger(String.class);

   private static void L() {
      N_0 = null;
   }

   private static class11724 M(String var0) {
      byte[] abyte;
      try (InputStream inputstream = class11911.L(var0).method_14482()) {
         abyte = IOUtils.toByteArray(inputstream);
      } catch (Exception exception) {
         throw new IllegalStateException("Failed to read icon atlas image: " + var0, exception);
      }

      ByteBuffer bytebuffer1 = MemoryUtil.memAlloc(abyte.length);
      ByteBuffer bytebuffer = null;

      class11724 class11724;
      try {
         MemoryStack memorystack = MemoryStack.stackPush();

         try {
            bytebuffer1.put(abyte).flip();
            IntBuffer intbuffer = memorystack.mallocInt(1);
            IntBuffer intbuffer1 = memorystack.mallocInt(1);
            IntBuffer intbuffer2 = memorystack.mallocInt(1);
            bytebuffer = STBImage.stbi_load_from_memory(bytebuffer1, intbuffer, intbuffer1, intbuffer2, 4);
            if (bytebuffer == null) {
               throw new IllegalStateException("Failed to decode icon atlas image '" + var0 + "': " + STBImage.stbi_failure_reason());
            }

            int i = intbuffer.get(0);
            int j = intbuffer1.get(0);
            byte[] abyte1 = new byte[i * j * 4];
            bytebuffer.get(abyte1);
            class11724 = new class11724(i, j, abyte1);
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
      } finally {
         if (bytebuffer != null) {
            STBImage.stbi_image_free(bytebuffer);
         }

         MemoryUtil.memFree(bytebuffer1);
      }

      return class11724;
   }

   private class11752() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   private static Map<String, Integer> i(String var0) {
      Map map = class11911.N(class11911.N(var0), new class11747());
      if (map != null && !map.isEmpty()) {
         return map;
      } else {
         throw new IllegalStateException("Icon atlas names map invalid or empty: " + var0);
      }
   }

   private static class11729 y(String var0) {
      class11729 class11729 = class11911.N(class11911.N(var0), class11729.class);
      if (class11729 != null && class11729.y != null && class11729.N != null) {
         return class11729;
      } else {
         throw new IllegalStateException("Icon atlas layout invalid or empty: " + var0);
      }
   }

   private static Map<String, class11773> N(class11729 var0, Map<String, Integer> var1) {
      HashMap hashmap = new HashMap(var0.N.size());
      float f = var0.y.L;
      float f1 = var0.y.y;

      for (class11755 class11755 : var0.N) {
         if (class11755.L != null) {
            float f2 = class11755.L.L / f;
            float f3 = class11755.L.y / f;
            float f4 = class11755.L.u / f1;
            float f5 = class11755.L.N / f1;
            float f6 = class11755.N == null ? 1.0F : class11755.N.u - class11755.N.y;
            float f7 = class11755.N == null ? 1.0F : Math.abs(class11755.N.L - class11755.N.N);
            hashmap.put(class11755.y, new class11773(f2, f4, f3, f5, f6, f7));
         }
      }

      HashMap hashmap1 = new HashMap(var1.size());

      for (Entry entry : var1.entrySet()) {
         class11773 class11773 = (class11773)hashmap.get(entry.getValue());
         if (class11773 == null) {
            ((Logger)N_0).warn("Icon '{}' (codepoint {}) is missing from atlas layout — skipping", entry.getKey(), entry.getValue());
         } else {
            hashmap1.put((String)entry.getKey(), class11773);
         }
      }

      return hashmap1;
   }

   private static int N(class11724 var0) {
      int i = GL12.glGenTextures();
      if (i == 0) {
         throw new IllegalStateException("Failed to allocate GL texture for icon atlas");
      } else {
         ByteBuffer bytebuffer = MemoryUtil.memAlloc(var0.y().length);

         try {
            bytebuffer.put(var0.y()).flip();
            int j = GL12.glGetInteger(32873);
            GlStateManager._bindTexture(i);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL12.glTexImage2D(3553, 0, 32856, var0.N(), var0.L(), 0, 6408, 5121, bytebuffer);
            GlStateManager._bindTexture(j);
         } finally {
            MemoryUtil.memFree(bytebuffer);
         }

         return i;
      }
   }

   public static class11731 N(String var0) {
      class11729 class11729 = y(var0 + ".json");
      Map<String, Integer> map = i(var0 + ".names.json");
      Map<String, class11773> map1 = N(class11729, map);
      class11724 class11724 = M(var0 + ".png");
      int i = N(class11724);
      return new class11731(i, class11724.N(), class11724.L(), class11729.y.N, map1);
   }
}
