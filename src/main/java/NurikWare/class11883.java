package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.net.http.HttpClient;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import nurikware.NurikWareUserDataFix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class11883 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(20L)).executor((Executor)class11938.L_1).build();

   private class11883() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      u();
   }

   private static List<String> B(String var0) {
      return Arrays.asList(var0.substring(1, var0.length() - 1).split("\\s*,\\s*"));
   }

   private static void l(String var0) {
   }

   private static void u() {
   }

   private static void y(class11914 var0) {
      ByteBuffer bytebuffer = null;
      int i = 0;
      int j = 0;
      boolean flag = false;
      boolean flag1 = false;

      try {
         bytebuffer = MemoryUtil.memAlloc(var0.y().length);
         bytebuffer.put(var0.y()).flip();
         j = GL12.glGetInteger(32873);
         flag = true;
         i = GL12.glGenTextures();
         if (i != 0) {
            GlStateManager._bindTexture(i);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL12.glTexImage2D(3553, 0, 32856, var0.L(), var0.N(), 0, 6408, 5121, bytebuffer);
            int k = ((class11472)class11938.L_2).U();
            GlStateManager._bindTexture(j == k ? 0 : j);
            flag1 = true;
            ((class11472)class11938.L_2).N(i);
            i = 0;
            if (k > 0) {
               GL12.glDeleteTextures(k);
            }

            return;
         }

         ((Logger)N_0).warn("Failed to allocate avatar GL texture");
      } catch (Exception exception) {
         ((Logger)N_0).error("Failed to upload avatar texture", exception);
         return;
      } finally {
         if (flag && !flag1) {
            GlStateManager._bindTexture(j);
         }

         if (i != 0) {
            GL12.glDeleteTextures(i);
         }

         if (bytebuffer != null) {
            MemoryUtil.memFree(bytebuffer);
         }
      }
   }

   public static void N(String[] var0, OptionParser var1) {
      N_1 = System.nanoTime();
      var1.allowsUnrecognizedOptions();
      ArgumentAcceptingOptionSpec<Long> argumentacceptingoptionspec = var1.accepts("subscribeTimeLeft").withRequiredArg().ofType(Long.class);
      ArgumentAcceptingOptionSpec<String> argumentacceptingoptionspec1 = var1.accepts("login").withRequiredArg();
      ArgumentAcceptingOptionSpec<Integer> argumentacceptingoptionspec2 = var1.accepts("uid").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec<String> argumentacceptingoptionspec3 = var1.accepts("role").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> argumentacceptingoptionspec4 = var1.accepts("hash").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> argumentacceptingoptionspec5 = var1.accepts("avatar").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> argumentacceptingoptionspec6 = var1.accepts("boughtProducts").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> argumentacceptingoptionspec7 = var1.accepts("apiToken").withRequiredArg();
      var1.accepts("debug");
      var1.accepts("checkLocalization");
      OptionSet optionset = var1.parse(var0);
      ((class11472)class11938.L_2).N(N(optionset, argumentacceptingoptionspec1, "No such userdata: login!"));
      ((class11472)class11938.L_2).y(N(optionset, argumentacceptingoptionspec2, "No such userdata: uid!"));
      ((class11472)class11938.L_2).N(N(optionset, argumentacceptingoptionspec, "No such userdata: subscribe time left!") / 60L);
      ((class11472)class11938.L_2).N(new class11802(N(optionset, argumentacceptingoptionspec3, "No such userdata: role!")));
      ((class11472)class11938.L_2).u(N(optionset, argumentacceptingoptionspec4, "No such userdata: hash!"));
      ((class11472)class11938.L_2).L(N(optionset, argumentacceptingoptionspec7, "No such userdata: api token!"));
      List<String> list = B(N(optionset, argumentacceptingoptionspec6, "No such userdata: bought products!"));
      ((class11472)class11938.L_2).N(list.contains("premium"));
      l(N(optionset, argumentacceptingoptionspec5, "No such userdata: user avatar!"));
      if (optionset.has("debug")) {
         class11938.L_3 = true;
      }

      if (optionset.has("checkLocalization")) {
         class11938.L_4 = true;
      }
   }

   private static class11914 N(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         ByteBuffer bytebuffer = null;
         ByteBuffer bytebuffer1 = null;

         try {
            MemoryStack memorystack = MemoryStack.stackPush();

            Object object;
            label226: {
               Object object1;
               label227: {
                  class11914 class11914;
                  label228: {
                     try {
                        bytebuffer = MemoryUtil.memAlloc(var0.length);
                        bytebuffer.put(var0).flip();
                        IntBuffer intbuffer = memorystack.mallocInt(1);
                        IntBuffer intbuffer1 = memorystack.mallocInt(1);
                        IntBuffer intbuffer2 = memorystack.mallocInt(1);
                        if (!STBImage.stbi_info_from_memory(bytebuffer, intbuffer, intbuffer1, intbuffer2)) {
                           ((Logger)N_0).warn("Failed to read avatar texture info: {}", STBImage.stbi_failure_reason());
                           object = null;
                           break label226;
                        }

                        int i = intbuffer.get(0);
                        int j = intbuffer1.get(0);
                        if (i > 0 && j > 0) {
                           bytebuffer.position(0);
                           bytebuffer1 = STBImage.stbi_load_from_memory(bytebuffer, intbuffer, intbuffer1, intbuffer2, 4);
                           if (bytebuffer1 == null) {
                              ((Logger)N_0).warn("Failed to decode avatar texture: {}", STBImage.stbi_failure_reason());
                              object1 = null;
                              break label227;
                           }

                           int k = intbuffer.get(0);
                           j = intbuffer1.get(0);
                           byte[] abyte = new byte[k * j * 4];
                           bytebuffer1.get(abyte);
                           class11914 = new class11914(k, j, abyte);
                           break label228;
                        }

                        ((Logger)N_0).warn("Failed to load avatar texture: invalid dimensions {}x{}", i, j);
                        object1 = null;
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

                     return (class11914)object1;
                  }

                  if (memorystack != null) {
                     memorystack.close();
                  }

                  return class11914;
               }

               if (memorystack != null) {
                  memorystack.close();
               }

               return (class11914)object1;
            }

            if (memorystack != null) {
               memorystack.close();
            }

            return (class11914)object;
         } finally {
            if (bytebuffer1 != null) {
               STBImage.stbi_image_free(bytebuffer1);
            }

            if (bytebuffer != null) {
               MemoryUtil.memFree(bytebuffer);
            }
         }
      } else {
         ((Logger)N_0).warn("Failed to load avatar texture: empty response body");
         return null;
      }
   }

   private static <T> T N(OptionSet var0, OptionSpec<T> var1, String var2) {
      return (T)NurikWareUserDataFix.resolve(var0, var1, var2);
   }

   public static long N() {
      return (Long)N_1;
   }
}
