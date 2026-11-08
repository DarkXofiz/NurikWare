package NurikWare;

public class class09329 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public static Object y_0 = new class09329();

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
         this.N_1 = 0.0F;
      }
   }

   public class09329() {
      super();
      this.L();
   }

   static {
      R();
   }

   public static class09329 y(float var0) {
      ((class09329)y_0).N_1 = var0;
      ((class09329)y_0).N_0 = true;
      return (class09329)y_0;
   }

   public float y() {
      return (Float)this.N_1;
   }

   public class09329 N(float var1) {
      this.N_1 = var1;
      return this;
   }

   public class09329 N(boolean var1) {
      this.N_0 = var1;
      return this;
   }

   public boolean N() {
      return (Boolean)this.N_0;
   }

   private static void R() {
   }
}
