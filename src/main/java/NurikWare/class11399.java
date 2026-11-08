package NurikWare;

public class class11399 extends class11784 {
   public Object y_0;
   public boolean y_init;
   public static Object L_0 = new class11399();

   public int L() {
      this.u();
      return (Integer)this.y_0;
   }

   public class11399() {
      super();
      this.u();
   }

   static {
      R();
   }

   private void u() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
      }
   }

   public class11399 y(int var1) {
      this.u();
      this.y_0 = var1;
      return this;
   }

   public static class11399 N(int var0) {
      ((class11399)L_0).y_0 = var0;
      return (class11399)L_0;
   }

   private static void R() {
   }
}
