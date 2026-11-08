package NurikWare;

public class class09354 {
   public static Object N_0 = new class09354();
   public Object y_0;
   public boolean y_init;

   public class09354() {
      super();
      this.i();
   }

   static {
      u();
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
      }
   }

   private static void u() {
   }

   public static class09354 y(int var0) {
      ((class09354)N_0).y_0 = var0;
      return (class09354)N_0;
   }

   public class09354 N(int var1) {
      this.y_0 = var1;
      return this;
   }

   public int N() {
      return (Integer)this.y_0;
   }
}
