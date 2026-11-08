package NurikWare;

public class class11384 extends class11784 {
   private static double[] B;
   public Object y_0;
   public Object y_1;
   public boolean y_init;
   public static Object L_0 = new class11384();

   public double L() {
      this.R();
      return (Double)this.y_1;
   }

   private static void M() {
      B = new double[2];
      B[0] = Double.longBitsToDouble(0L);
      B[1] = Double.longBitsToDouble(0L);
   }

   public class11384() {
      super();
      this.R();
   }

   static {
      M();
      Z();
   }

   private static void Z() {
   }

   public double u() {
      this.R();
      return (Double)this.y_0;
   }

   public class11384 y(double var1) {
      this.R();
      this.y_1 = var1;
      return this;
   }

   public class11384 N(double var1) {
      this.R();
      this.y_0 = var1;
      return this;
   }

   public static class11384 N(double var0, double var2) {
      ((class11384)L_0).y_0 = var0;
      ((class11384)L_0).y_1 = var2;
      return (class11384)L_0;
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = B[0];
         this.y_1 = B[1];
      }
   }
}
