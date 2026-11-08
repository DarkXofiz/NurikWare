package NurikWare;

public class class09339 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = new class09339();

   public class09339() {
      super();
      this.u();
   }

   static {
      i();
   }

   private static void i() {
      y_0 = null;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
      }
   }

   public float y() {
      return (Float)this.N_0;
   }

   public void N(float var1) {
      this.N_0 = var1;
   }

   public static class09339 N() {
      ((class09339)y_0).N_0 = 1.0F;
      return (class09339)y_0;
   }
}
