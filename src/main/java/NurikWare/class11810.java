package NurikWare;

public class class11810 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = new class11810();

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
      }
   }

   public class11810() {
      super();
      this.L();
   }

   static {
      u();
   }

   private static void u() {
   }

   public static class11810 y(float var0) {
      ((class11810)y_0).N_0 = var0;
      return (class11810)y_0;
   }

   public float N() {
      return (Float)this.N_0;
   }

   public class11810 N(float var1) {
      this.N_0 = var1;
      return this;
   }
}
