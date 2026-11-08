package NurikWare;

public class class10986 {
   public static Object N_0 = new class10986();
   public Object y_0;
   public boolean y_init;

   public class10986() {
      super();
      this.u();
   }

   static {
      y();
   }

   private void u() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
      }
   }

   private static void y() {
   }

   public class10986 y(int var1) {
      this.y_0 = var1;
      return this;
   }

   public static class10986 N(int var0) {
      ((class10986)N_0).y_0 = var0;
      return (class10986)N_0;
   }

   public int N() {
      return (Integer)this.y_0;
   }
}
