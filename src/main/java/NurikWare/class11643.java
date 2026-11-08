package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class08893;
import minecraft.class08918;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL33;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class11643 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private static class11596 M(String var0) {
      if (var0.isEmpty()) {
         return (class11596)class11596.E_0;
      } else {
         class01894 class01894 = class01894.L(var0);
         if (class01894 == null) {
            class01894 = class01894.y(var0);
         }

         class08918 class08918 = class06202.Nq().NO().y(class01894);
         if (class08918 != null && class08918.method_68004() instanceof class08893 class08893) {
            int i = class08893.N();
            if (i <= 0) {
               return (class11596)class11596.E_0;
            } else {
               y(i);
               return class11596.N(i, 0, 0);
            }
         } else {
            return (class11596)class11596.E_0;
         }
      }
   }

   public class11643(class11742 var1) {
      super();
      this.u();
      this.L_0 = new ConcurrentLinkedQueue();
      this.L_1 = new Object2ObjectOpenHashMap();
      this.L_2 = new Object2ObjectOpenHashMap();
      this.L_3 = new ArrayDeque();
      this.L_4 = new class11770();
      this.y_0 = new class11735();
      this.y_2 = new class09723(class09940.ALPHA8, 512, 512, 1, 64);
      this.y_1 = var1;
   }

   static {
      z();
   }

   private ByteBuffer Z(int var1) {
      if ((ByteBuffer)this.y_3 == null) {
         this.y_3 = MemoryUtil.memAlloc(var1);
         ((ByteBuffer)this.y_3).clear();
         return (ByteBuffer)this.y_3;
      } else {
         if (((ByteBuffer)this.y_3).capacity() < var1) {
            this.y_3 = MemoryUtil.memRealloc((ByteBuffer)this.y_3, var1);
         }

         ((ByteBuffer)this.y_3).clear();
         return (ByteBuffer)this.y_3;
      }
   }

   private void i(String var1) {
      ((Map)this.L_1).put(var1, class11597.u());
      ((ExecutorService)class11938.L_1).execute(() -> this.R(var1));
   }

   private void i() {
      String s;
      while ((s = (String)((Queue)this.L_3).poll()) != null) {
         ((Logger)N_0).warn(s);
      }
   }

   private class11596 m(String var1) {
      int i = var1.indexOf(47, 5);
      if (i > 5 && i != var1.length() - 1) {
         String s = var1.substring(5, i);
         String s1 = var1.substring(i + 1);
         class11731 class11731 = ((class11742)this.y_1).N(s);
         if (class11731 == null) {
            return (class11596)class11596.E_0;
         } else {
            class11773 class11773 = class11731.N(s1);
            if (class11773 == null) {
               return (class11596)class11596.E_0;
            } else {
               float f = class11773.u() <= 0.0F ? 1.0F : class11773.L() / class11773.u();
               int j = class11731.y();
               class11596 class11596 = class11596.N(
                  j, class11731.u(), class11731.i(), class11773.i(), class11773.y(), class11773.R(), class11773.N(), class11731.L(), f
               );
               ((Map)this.L_2).put(var1, new class11774(class11731, j, class11596));
               return class11596;
            }
         }
      } else {
         return (class11596)class11596.E_0;
      }
   }

   private class11596 z(String var1) {
      class11774 class11774 = (class11774)((Map)this.L_2).get(var1);
      return class11774 != null && class11774.L().y() == class11774.y() ? class11774.N() : this.m(var1);
   }

   private static void z() {
      N_0 = null;
      N_1 = 512;
      N_2 = 512;
      N_3 = 1;
      N_4 = 64;
      N_5 = 256;
      N_6 = 0;
   }

   private void u() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_4 = 0;
         this.y_5 = 0;
      }
   }

   private static void y(int var0) {
      if (var0 != (Integer)N_6) {
         int i = GL33.glGetInteger(32873);
         GlStateManager._bindTexture(var0);
         GlStateManager._texParameter(3553, 10240, 9728);
         GlStateManager._texParameter(3553, 10241, 9728);
         GlStateManager._bindTexture(i);
         N_6 = var0;
      }
   }

   public void y() {
      this.E();
      this.i();
   }

   private void E() {
      boolean flag = false;

      class11637 class11637;
      while ((class11637 = (class11637)((Queue)this.L_0).poll()) != null) {
         class11597 class11597 = (class11597)((Map)this.L_1).get(class11637.N());
         if (class11597 != null && (class11737)class11597.N_0 == class11737.LOADING) {
            if (class11637.y() != null) {
               class11597.N_0 = class11737.FAILED;
               ((Queue)this.L_3).add("Failed to decode UI texture '" + class11637.N() + "': " + class11637.y());
            } else {
               if (class11637.L() != null) {
                  class09946 class09946 = this.N(class11637);
                  if (class09946 != null) {
                     class11597.N_0 = class11737.READY;
                     class11597.N_1 = class09946;
                     class11597.N_3 = class11637.R();
                     class11597.N_4 = class11637.i();
                     flag = true;
                     continue;
                  }

                  ((Queue)this.L_3).add("Atlas is full, using direct fallback for UI texture '" + class11637.N() + "'");
               }

               int i = this.N(class11637.R(), class11637.i(), class11637.u());
               if (i <= 0) {
                  class11597.N_0 = class11737.FAILED;
                  ((Queue)this.L_3).add("Failed to upload UI texture '" + class11637.N() + "'");
               } else {
                  class11597.N_0 = class11737.READY;
                  class11597.N_2 = i;
                  class11597.N_3 = class11637.R();
                  class11597.N_4 = class11637.i();
                  class11597.N_7 = class11596.N(i, class11637.R(), class11637.i());
               }
            }
         }
      }

      if (flag) {
         this.R();
      }
   }

   public class11596 N(String var1) {
      if (var1.isEmpty()) {
         return (class11596)class11596.E_0;
      } else if (var1.startsWith("icon:")) {
         return this.z(var1);
      } else if (var1.startsWith("glidfy:")) {
         return N(var1, 7, true);
      } else if (var1.startsWith("glid:")) {
         return N(var1, 5, false);
      } else if (var1.startsWith("mcatlas:")) {
         return M(var1.substring(8));
      } else {
         class11597 class11597 = (class11597)((Map)this.L_1).get(var1);
         if (class11597 == null) {
            this.i(var1);
            return (class11596)class11596.E_0;
         } else {
            return (class11737)class11597.N_0 != class11737.LOADING && (class11737)class11597.N_0 != class11737.FAILED
               ? class11597.N((Integer)this.y_4, ((class09723)this.y_2).L())
               : (class11596)class11596.E_0;
         }
      }
   }

   private class09946 N(class11637 var1) {
      try {
         return ((class09723)this.y_2).N(var1.L(), var1.R(), var1.i());
      } catch (IllegalStateException illegalstateexception) {
         return null;
      }
   }

   public int N() {
      return (Integer)this.y_4;
   }

   private int N(int var1, int var2, byte[] var3) {
      ByteBuffer bytebuffer = this.Z(var3.length);
      bytebuffer.put(var3);
      bytebuffer.flip();
      return ((class11741)this.y_0).N(var1, var2, bytebuffer);
   }

   private static byte[] N(class11627 var0) {
      byte[] abyte = var0.y();
      byte[] abyte1 = new byte[var0.L() * var0.N()];
      byte b0 = 0;

      for (int i = 0; b0 < abyte.length; i++) {
         int j = abyte[b0] & 255;
         int k = abyte[b0 + 1] & 255;
         int l = abyte[b0 + 2] & 255;
         int i1 = abyte[b0 + 3] & 255;
         if (i1 == 0) {
            abyte1[i] = 0;
         } else {
            if (j != k || k != l) {
               return null;
            }

            int j1 = (i1 * j + 127) / 255;
            abyte1[i] = (byte)j1;
         }

         b0 += 4;
      }

      return abyte1;
   }

   private ByteBuffer N(int var1, int var2, int var3, int var4) {
      int i = var3 * var4;
      ByteBuffer bytebuffer = this.Z(i);
      byte[] abyte = ((class09723)this.y_2).M();
      int j = ((class09723)this.y_2).y();

      for (int k = 0; k < var4; k++) {
         int l = (var2 + k) * j + var1;
         bytebuffer.put(abyte, l, var3);
      }

      bytebuffer.flip();
      return bytebuffer;
   }

   private static class11627 N(byte[] var0, String var1) {
      ByteBuffer bytebuffer = null;
      ByteBuffer bytebuffer1 = null;

      try {
         MemoryStack memorystack = MemoryStack.stackPush();

         Object object;
         label136: {
            class11627 class11627;
            try {
               bytebuffer = MemoryUtil.memAlloc(var0.length);
               bytebuffer.put(var0).flip();
               IntBuffer intbuffer = memorystack.mallocInt(1);
               IntBuffer intbuffer1 = memorystack.mallocInt(1);
               IntBuffer intbuffer2 = memorystack.mallocInt(1);
               bytebuffer1 = STBImage.stbi_load_from_memory(bytebuffer, intbuffer, intbuffer1, intbuffer2, 4);
               if (bytebuffer1 == null) {
                  ((Logger)N_0).warn("Failed to decode texture '{}': {}", var1, STBImage.stbi_failure_reason());
                  object = null;
                  break label136;
               }

               int i = intbuffer.get(0);
               int j = intbuffer1.get(0);
               byte[] abyte = new byte[i * j * 4];
               bytebuffer1.get(abyte);
               class11627 = new class11627(i, j, abyte);
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

            return class11627;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return (class11627)object;
      } finally {
         if (bytebuffer1 != null) {
            STBImage.stbi_image_free(bytebuffer1);
         }

         if (bytebuffer != null) {
            MemoryUtil.memFree(bytebuffer);
         }
      }
   }

   private static class11596 N(String var0, int var1, boolean var2) {
      try {
         int i = Integer.parseInt(var0, var1, var0.length(), 10);
         if (i <= 0) {
            return (class11596)class11596.E_0;
         } else {
            return var2 ? class11596.y(i, 0, 0) : class11596.N(i, 0, 0);
         }
      } catch (NumberFormatException numberformatexception) {
         return (class11596)class11596.E_0;
      }
   }

   private void R(String var1) {
      try {
         byte[] abyte = ((class11758)this.L_4).N(var1);
         if (abyte == null || abyte.length == 0) {
            ((Queue)this.L_0).add(class11637.N(var1, "Resource not found"));
            return;
         }

         class11627 class11627 = N(abyte, var1);
         if (class11627 == null) {
            ((Queue)this.L_0).add(class11637.N(var1, "Image decode failed"));
            return;
         }

         byte[] abyte1 = N(class11627);
         boolean flag = abyte1 != null && class11627.L() <= 256 && class11627.N() <= 256;
         ((Queue)this.L_0).add(class11637.N(var1, class11627.L(), class11627.N(), class11627.y(), flag ? abyte1 : null));
      } catch (Exception exception) {
         ((Queue)this.L_0).add(class11637.N(var1, exception.getMessage()));
      }
   }

   private void R() {
      class09960[] aclass09960 = ((class09723)this.y_2).z();
      if (aclass09960.length != 0 || (Integer)this.y_4 == 0) {
         int i = ((class09723)this.y_2).L();
         boolean flag = (Integer)this.y_4 == 0 || (Integer)this.y_5 != i;
         if ((Integer)this.y_4 == 0) {
            this.y_4 = ((class11741)this.y_0).N();
         }

         if ((Integer)this.y_4 == 0) {
            ((Queue)this.L_3).add("Failed to create UI atlas texture");
         } else if (flag) {
            ByteBuffer bytebuffer1 = this.N(0, 0, ((class09723)this.y_2).y(), i);
            ((class11741)this.y_0).N((Integer)this.y_4, 0, 0, ((class09723)this.y_2).y(), i, ((class09723)this.y_2).y(), i, true, bytebuffer1);
            this.y_5 = i;
         } else {
            for (class09960 class09960 : aclass09960) {
               ByteBuffer bytebuffer = this.N(class09960.L(), class09960.u(), class09960.i(), class09960.R());
               ((class11741)this.y_0)
                  .N((Integer)this.y_4, class09960.L(), class09960.u(), class09960.i(), class09960.R(), ((class09723)this.y_2).y(), i, false, bytebuffer);
            }
         }
      }
   }
}
