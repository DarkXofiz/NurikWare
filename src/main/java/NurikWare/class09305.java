package NurikWare;

public class class09305 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = new class09305();

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   public class09305() {
      super();
      this.L();
   }

   static {
      y();
   }

   public static class09305 y(boolean var0) {
      ((class09305)y_0).N_0 = var0;
      return (class09305)y_0;
   }

   private static void y() {
   }

   public void N(boolean var1) {
      this.N_0 = var1;
   }

   public boolean N() {
      return (Boolean)this.N_0;
   }
}
