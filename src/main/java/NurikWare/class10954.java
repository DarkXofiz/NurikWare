package NurikWare;

import com.mojang.blaze3d.buffers.GpuBufferSlice;

public class class10954 {
   public Object N_0;
   public static Object y_0 = new class10954();

   public class10954() {
      super();
      this.u();
   }

   static {
      y();
   }

   private void u() {
   }

   public class10954 y(GpuBufferSlice var1) {
      this.N_0 = var1;
      return this;
   }

   private static void y() {
      y_0 = null;
   }

   public GpuBufferSlice N() {
      return (GpuBufferSlice)this.N_0;
   }

   public static class10954 N(GpuBufferSlice var0) {
      ((class10954)y_0).N_0 = var0;
      return (class10954)y_0;
   }
}
