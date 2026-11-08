package NurikWare;

public class class11376 extends class11784 {
   public static Object y_0 = new class11376();
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   public double L() {
      this.i();
      return (Double)this.L_0;
   }

   public class11376() {
      super();
      this.i();
   }

   static {
      R();
   }

   private void i() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0;
         this.L_1 = 0.0;
      }
   }

   public double u() {
      this.i();
      return (Double)this.L_1;
   }

   public static class11376 N(double var0, double var2) {
      ((class11376)y_0).L_0 = var0;
      ((class11376)y_0).L_1 = var2;
      return (class11376)y_0;
   }

   private static void R() {
      y_0 = null;
   }
}
