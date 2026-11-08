package NurikWare;

public class class10991 {
   public static Object N_0 = new class10991();
   public Object y_0;
   public boolean y_init;

   public class10991() {
      super();
      this.i();
   }

   static {
      u();
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }

   private static void u() {
   }

   public static class10991 y(boolean var0) {
      ((class10991)N_0).y_0 = var0;
      return (class10991)N_0;
   }

   public boolean N() {
      return (Boolean)this.y_0;
   }

   public void N(boolean var1) {
      this.y_0 = var1;
   }
}
