package NurikWare;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.EXTThreadLocalContext;

public class class11886 {
   private static String[] B;
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2 = Executors.newSingleThreadExecutor(var0 -> {
      Thread thread = new Thread(var0, B[6]);
      thread.setDaemon(true);
      return thread;
   });
   public static Object N_3 = new class11932();
   public static Object N_4 = new HashMap();
   public static Object N_5 = new ArrayList();
   public static Object N_6;
   public static Object N_7;

   private static float L() {
      return class11938.u().NB().m().i() / 100.0F;
   }

   private static boolean M() {
      return !class11938.u().NB().U();
   }

   private class11886() {
      super();
      throw new UnsupportedOperationException(B[5]);
   }

   static {
      U();
      N();
   }

   private static int B() {
      for (int i : (List)N_5) {
         if (AL10.alGetSourcei(i, 4112) != 4114) {
            return i;
         }
      }

      if (((List)N_5).size() < 16) {
         int k = AL10.alGenSources();
         if (k != 0) {
            ((List)N_5).add(k);
         }

         return k;
      } else {
         int j = (Integer)((List)N_5).getFirst();
         AL10.alSourceStop(j);
         return j;
      }
   }

   private static boolean i() {
      if ((Boolean)N_6) {
         return true;
      } else if ((Boolean)N_7) {
         return false;
      } else {
         try {
            long i = ALC10.alcOpenDevice((ByteBuffer)null);
            if (i == 0L) {
               N_7 = true;
               ((Logger)N_0).error(B[1]);
               return false;
            } else {
               long j = ALC10.alcCreateContext(i, (IntBuffer)null);
               if (j == 0L) {
                  N_7 = true;
                  ((Logger)N_0).error(B[2]);
                  ALC10.alcCloseDevice(i);
                  return false;
               } else {
                  ALCCapabilities alccapabilities = ALC.createCapabilities(i);
                  if (alccapabilities.ALC_EXT_thread_local_context ? !EXTThreadLocalContext.alcSetThreadContext(j) : !ALC10.alcMakeContextCurrent(j)) {
                     N_7 = true;
                     ((Logger)N_0).error(B[3]);
                     ALC10.alcDestroyContext(j);
                     ALC10.alcCloseDevice(i);
                     return false;
                  } else {
                     AL.createCapabilities(alccapabilities);
                     N_6 = true;
                     return true;
                  }
               }
            }
         } catch (Throwable throwable) {
            N_7 = true;
            ((Logger)N_0).error(B[4], throwable);
            return false;
         }
      }
   }

   private static void U() {
      B = new String[7];
      B[0] = "Failed to load sound";
      B[1] = "Failed to open OpenAL device";
      B[2] = "Failed to create OpenAL context";
      B[3] = "Failed to make OpenAL context current";
      B[4] = "Failed to initialize OpenAL sound backend";
      B[5] = "This is a utility class and cannot be instantiated";
      B[6] = "nurikware-sound";
   }

   private static void y(String var0, class11916 var1, float var2) {
      if (i()) {
         Integer integer = (Integer)((Map)N_4).get(var0);
         if (integer == null) {
            integer = N(var1);
            if (integer == null) {
               return;
            }

            ((Map)N_4).put(var0, integer);
         }

         int i = B();
         if (i != 0) {
            AL10.alSourcei(i, 4105, integer);
            AL10.alSourcef(i, 4106, var2);
            AL10.alSourcePlay(i);
         }
      }
   }

   public static void y(Path var0) {
      if (!M()) {
         N(var0.toString(), () -> Files.newInputStream(var0));
      }
   }

   private static Integer N(class11916 var0) {
      try {
         Integer integer;
         try (InputStream inputstream = var0.open()) {
            class11885 class11885 = ((class11932)N_3).N(inputstream);
            int i = AL10.alGenBuffers();
            AL10.alBufferData(i, N(class11885.L(), class11885.y()), class11885.u(), class11885.N());
            integer = i;
         }

         return integer;
      } catch (Exception exception) {
         ((Logger)N_0).error(B[0], exception);
         return null;
      }
   }

   public static void N(class11901 var0) {
      if (!M()) {
         N(var0.name(), var0::N);
         class11938.L().L(new class11369(var0));
      }
   }

   private static int N(int var0, int var1) {
      boolean flag = var1 == 8;
      if (var0 == 1) {
         return flag ? 4352 : 4353;
      } else {
         return flag ? 4354 : 4355;
      }
   }

   private static void N() {
      N_1 = 16;
      N_6 = false;
      N_7 = false;
   }

   public static void N(Path var0) {
      String s = var0.toString();
      ((ExecutorService)N_2).execute(() -> {
         Integer integer = (Integer)((Map)N_4).remove(s);
         if (integer != null) {
            AL10.alDeleteBuffers(integer);
         }
      });
   }

   private static void N(String var0, class11916 var1) {
      float f = L();
      ((ExecutorService)N_2).execute(() -> y(var0, var1, f));
   }
}
