package NurikWare;

public class class10983 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public static Object y_0 = new class10983();

   private static void L() {
      y_0 = null;
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
      }
   }

   public class10983() {
      super();
      this.M();
   }

   static {
      L();
   }

   public int y() {
      return (Integer)this.N_1;
   }

   public static class10983 N(int var0, int var1) {
      ((class10983)y_0).N_0 = var0;
      ((class10983)y_0).N_1 = var1;
      return (class10983)y_0;
   }

   public int N() {
      return (Integer)this.N_0;
   }
}
