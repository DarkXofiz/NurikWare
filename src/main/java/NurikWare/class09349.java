package NurikWare;

public class class09349 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = new class09349();

   public class09349() {
      super();
      this.i();
   }

   static {
      u();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
      }
   }

   private static void u() {
   }

   public static class09349 y(long var0) {
      ((class09349)y_0).N_0 = var0;
      return (class09349)y_0;
   }

   public class09349 N(long var1) {
      this.N_0 = var1;
      return this;
   }

   public long N() {
      return (Long)this.N_0;
   }
}
