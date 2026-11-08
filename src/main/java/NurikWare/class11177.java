package NurikWare;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11177 {
   private static String[] E;
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2 = new LinkedHashMap();
   public static Object N_3 = new ArrayDeque();
   public static Object N_4 = new LinkedHashMap();
   public static Object N_5;
   public static Object N_6;
   public static Object y_0;
   public static Object y_1;

   public static class11209 L(String var0) {
      return (class11209)((Map)N_4).get(var0);
   }

   public static boolean L() {
      return (Boolean)N_5;
   }

   private static void M() {
      E = new String[3];
      E[0] = "GpuProfiler.beginFrame() called twice without endFrame()";
      E[1] = "GpuProfiler.endFrame() with {} unclosed scope(s); auto-closing";
      E[2] = "GpuProfiler.end() called without matching begin()";
   }

   private class11177() {
      super();
   }

   static {
      M();
      m();
   }

   private static void Z() {
      ((Deque)N_3).clear();
      ((Map)N_2).values().forEach(class11188::N);
      ((Map)N_2).clear();
      ((Map)N_4).clear();
      N_6 = 0L;
      y_0 = 0;
      y_1 = false;
   }

   public static void i() {
      if ((Boolean)N_5 && (Boolean)y_1) {
         if (!((Deque)N_3).isEmpty()) {
            ((Logger)N_0).warn(E[1], ((Deque)N_3).size());
            z();
         }

         N_6 = (Long)N_6 + 1L;
         y_1 = false;
      }
   }

   private static void m() {
      N_1 = 3;
      N_5 = false;
      N_6 = 0L;
      y_0 = 0;
      y_1 = false;
   }

   private static void z() {
      while (!((Deque)N_3).isEmpty()) {
         ((class11188)((Deque)N_3).pollFirst()).L((Integer)y_0);
      }
   }

   public static void u() {
      ((Map)N_4).values().forEach(class11209::u);
   }

   public static void y() {
      if ((Boolean)N_5 && (Boolean)y_1) {
         class11188 class11188 = (class11188)((Deque)N_3).pollFirst();
         if (class11188 == null) {
            ((Logger)N_0).warn(E[2]);
         } else {
            class11188.L((Integer)y_0);
         }
      }
   }

   public static class11197 y(String var0) {
      if ((Boolean)N_5 && (Boolean)y_1) {
         N(var0);
         return (class11197)class11197.y[0];
      } else {
         return (class11197)class11197.y[1];
      }
   }

   public static void N(String var0) {
      if ((Boolean)N_5 && (Boolean)y_1) {
         class11188 class11188 = ((Map)N_2).computeIfAbsent(var0, var0x -> new class11188(3));
         class11188.y((Integer)y_0);
         ((Deque)N_3).push(class11188);
      }
   }

   public static void N(boolean var0) {
      if (var0 != (Boolean)N_5) {
         N_5 = var0;
         if (!var0) {
            Z();
         }
      }
   }

   public static void N() {
      if ((Boolean)N_5) {
         if ((Boolean)y_1) {
            ((Logger)N_0).warn(E[0]);
            z();
         }

         y_1 = true;
         y_0 = (int)((Long)N_6 % 3L);
         if ((Long)N_6 >= 3L) {
            R((Integer)y_0);
         }
      }
   }

   public static Map<String, class11209> R() {
      return Collections.unmodifiableMap(new LinkedHashMap<>((Map<? extends String, ? extends class11209>)N_4));
   }

   private static void R(int var0) {
      for (Entry entry : ((Map)N_2).entrySet()) {
         long i = ((class11188)entry.getValue()).N(var0);
         if (i >= 0L) {
            class11209 class11209 = (class11209)((Map)N_4).get(entry.getKey());
            if (class11209 == null) {
               ((Map)N_4).put((String)entry.getKey(), new class11209((String)entry.getKey(), i));
            } else {
               class11209.N(i);
            }
         }
      }
   }
}
