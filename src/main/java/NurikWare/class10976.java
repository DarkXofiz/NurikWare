package NurikWare;

public class class10976 {
   public static Object N_0 = new class10976();
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   private static void L() {
   }

   private void M() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
         this.y_1 = false;
      }
   }

   public class10976() {
      super();
      this.M();
   }

   static {
      L();
   }

   public boolean y() {
      return (Boolean)this.y_0;
   }

   public void y(boolean var1) {
      this.y_1 = var1;
   }

   public static class10976 N(boolean var0, boolean var1) {
      ((class10976)N_0).y_0 = var0;
      ((class10976)N_0).y_1 = var1;
      return (class10976)N_0;
   }

   public boolean N() {
      return (Boolean)this.y_1;
   }

   public void N(boolean var1) {
      this.y_0 = var1;
   }
}
