package NurikWare;

public class class11197 implements AutoCloseable {
   private static byte[] L;
   public static Object[] y;
   public Object N_0;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   private class11197(boolean var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   static {
      u();
      N();
      y[0] = new class11197(true);
      y[1] = new class11197(false);
   }

   @Override
   public void close() {
      if ((Boolean)this.N_0) {
         class11177.y();
      }
   }

   private static void u() {
      L = new byte[1];
      L[0] = 2;
   }

   private static void N() {
      y = new Object[L[0]];
   }
}
