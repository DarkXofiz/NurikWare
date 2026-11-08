package NurikWare;

public class class09316 extends class11784 {
   private static double[] z;
   public static Object y_0 = new class09316();
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public boolean L_init;

   public class09316 L(double var1) {
      this.U();
      this.L_2 = var1;
      return this;
   }

   public double L() {
      this.U();
      return (Double)this.L_3;
   }

   public float M() {
      this.U();
      return (Float)this.L_1;
   }

   public class09316() {
      super();
      this.U();
   }

   static {
      W();
      E();
   }

   public float i() {
      this.U();
      return (Float)this.L_0;
   }

   private void U() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = z[0];
         this.L_3 = z[1];
         this.L_4 = z[2];
      }
   }

   public double u() {
      this.U();
      return (Double)this.L_4;
   }

   public class09316 y(float var1) {
      this.U();
      this.L_1 = var1;
      return this;
   }

   public class09316 y(double var1) {
      this.U();
      this.L_3 = var1;
      return this;
   }

   private static void E() {
   }

   public class09316 N(float var1) {
      this.U();
      this.L_0 = var1;
      return this;
   }

   public class09316 N(double var1) {
      this.U();
      this.L_4 = var1;
      return this;
   }

   public static class09316 N(float var0, float var1, double var2, double var4, double var6) {
      ((class09316)y_0).L_0 = var0;
      ((class09316)y_0).L_1 = var1;
      ((class09316)y_0).L_2 = var2;
      ((class09316)y_0).L_3 = var4;
      ((class09316)y_0).L_4 = var6;
      return (class09316)y_0;
   }

   private static void W() {
      z = new double[3];
      z[0] = Double.longBitsToDouble(0L);
      z[1] = Double.longBitsToDouble(0L);
      z[2] = Double.longBitsToDouble(0L);
   }

   public double R() {
      this.U();
      return (Double)this.L_2;
   }
}
