package NurikWare;

import java.lang.reflect.Method;

/**
 * Telefon (Android / Mali, Zink, MobileGlues) uyumlulugu.
 * Client'in instanced GL cagrilari bu katmanlarda GL_INVALID_OPERATION verip oyunu cokertiyor.
 * Android'de bu uc cagri atlanir. Masaustunde (veya -Dnurikware.instancing=true ile) gercek GL33 cagrilir.
 */
public final class PhoneCompat {
   private static final boolean SKIP =
      String.valueOf(System.getProperty("os.version")).contains("Android") && !Boolean.getBoolean("nurikware.instancing");
   private static boolean warned;
   private static Method divisor, drawElements, drawArrays;

   private PhoneCompat() {
   }

   private static void warn() {
      if (!warned) {
         warned = true;
         System.out.println("[NurikWare] Telefon uyumlulugu: instanced GL cagrilari atlaniyor (acmak icin -Dnurikware.instancing=true).");
      }
   }

   private static Method find(String name, Class<?>... types) {
      try {
         return Class.forName("org.lwjgl.opengl.GL33").getMethod(name, types);
      } catch (Throwable t) {
         return null;
      }
   }

   private static void invoke(Method m, Object... args) {
      if (m == null) {
         return;
      }
      try {
         m.invoke(null, args);
      } catch (Throwable t) {
      }
   }

   public static void glVertexAttribDivisor(int index, int divisor) {
      if (SKIP) {
         warn();
         return;
      }
      if (PhoneCompat.divisor == null) {
         PhoneCompat.divisor = find("glVertexAttribDivisor", int.class, int.class);
      }
      invoke(PhoneCompat.divisor, index, divisor);
   }

   public static void glDrawElementsInstanced(int mode, int count, int type, long indices, int instances) {
      if (SKIP) {
         warn();
         return;
      }
      if (drawElements == null) {
         drawElements = find("glDrawElementsInstanced", int.class, int.class, int.class, long.class, int.class);
      }
      invoke(drawElements, mode, count, type, indices, instances);
   }

   public static void glDrawArraysInstanced(int mode, int first, int count, int instances) {
      if (SKIP) {
         warn();
         return;
      }
      if (drawArrays == null) {
         drawArrays = find("glDrawArraysInstanced", int.class, int.class, int.class, int.class);
      }
      invoke(drawArrays, mode, first, count, instances);
   }
}
