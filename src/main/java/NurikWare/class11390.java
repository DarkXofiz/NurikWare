package NurikWare;

public class class11390 {
   private static double[] L;
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = new class11390();

   public class11390() {
      super();
      this.R();
   }

   static {
      i();
      u();
   }

   private static void i() {
      L = new double[1];
      L[0] = Double.longBitsToDouble(0L);
   }

   private static void u() {
   }

   public static class11390 y(double var0) {
      ((class11390)y_0).N_0 = var0;
      return (class11390)y_0;
   }

   public double N() {
      return (Double)this.N_0;
   }

   public class11390 N(double var1) {
      this.N_0 = var1;
      return this;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = L[0];
      }
   }
}
