package NurikWare;

public class class11354 {
   public static Object N_0 = new class11354();
   public Object y_0;
   public boolean y_init;

   private void L() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
      }
   }

   public class11354() {
      super();
      this.L();
   }

   static {
      i();
   }

   private static void i() {
   }

   public static class11354 y(float var0) {
      ((class11354)N_0).y_0 = var0;
      return (class11354)N_0;
   }

   public float N() {
      return (Float)this.y_0;
   }

   public class11354 N(float var1) {
      this.y_0 = var1;
      return this;
   }
}
