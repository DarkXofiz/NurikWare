package NurikWare;

public class class11299 implements AutoCloseable {
   public static Object N_0 = ThreadLocal.withInitial(() -> false);
   public Object y_0;
   public boolean y_init;

   private class11299() {
      super();
      this.i();
      this.y_0 = (Boolean)((ThreadLocal)N_0).get();
      ((ThreadLocal)N_0).set(true);
   }

   static {
      R();
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }

   @Override
   public void close() {
      ((ThreadLocal)N_0).set((Boolean)this.y_0);
   }

   public static boolean y() {
      return (Boolean)((ThreadLocal)N_0).get();
   }

   public static class11299 N() {
      return new class11299();
   }

   private static void R() {
   }
}
