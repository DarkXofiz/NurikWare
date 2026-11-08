package NurikWare;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.util.ArrayDeque;
import java.util.Deque;

public class class09081 {
   public static Object N_0 = new ArrayDeque(3);
   public static Object N_1;

   public static GpuBufferSlice L() {
      return (GpuBufferSlice)N_1;
   }

   public class09081() {
      super();
   }

   static {
      R();
   }

   public static void y() {
      ((Deque)N_0).clear();
      N_1 = null;
   }

   public static void N() {
      if (((Deque)N_0).isEmpty()) {
         N_1 = null;
      } else {
         N_1 = (GpuBufferSlice)((Deque)N_0).removeLast();
      }
   }

   public static void N(GpuBufferSlice var0) {
      if ((GpuBufferSlice)N_1 != null) {
         ((Deque)N_0).addLast((GpuBufferSlice)N_1);
      }

      N_1 = var0;
   }

   private static void R() {
      N_0 = null;
      N_1 = null;
   }
}
