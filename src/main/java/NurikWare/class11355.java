package NurikWare;

public class class11355 extends class11784 {
   private static double[] m;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;
   public static Object L_0 = new class11355();

   public boolean L() {
      this.z();
      return (Boolean)this.y_6;
   }

   public class11355 L(double var1) {
      this.z();
      this.y_0 = var1;
      return this;
   }

   public class11355 L(boolean var1) {
      this.z();
      this.y_6 = var1;
      return this;
   }

   public float M() {
      this.z();
      return (Float)this.y_3;
   }

   private static void P() {
   }

   public class11355() {
      super();
      this.z();
   }

   static {
      U();
      P();
   }

   public double B() {
      this.z();
      return (Double)this.y_0;
   }

   public float Z() {
      this.z();
      return (Float)this.y_4;
   }

   public double i() {
      this.z();
      return (Double)this.y_1;
   }

   private static void U() {
      m = new double[3];
      m[0] = Double.longBitsToDouble(0L);
      m[1] = Double.longBitsToDouble(0L);
      m[2] = Double.longBitsToDouble(0L);
   }

   private void z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = m[0];
         this.y_1 = m[1];
         this.y_2 = m[2];
         this.y_3 = 0.0F;
         this.y_4 = 0.0F;
         this.y_5 = false;
         this.y_6 = false;
      }
   }

   public double u() {
      this.z();
      return (Double)this.y_2;
   }

   public class11355 y(boolean var1) {
      this.z();
      this.y_5 = var1;
      return this;
   }

   public class11355 y(float var1) {
      this.z();
      this.y_4 = var1;
      return this;
   }

   public class11355 y(double var1) {
      this.z();
      this.y_1 = var1;
      return this;
   }

   public class11355 N(double var1) {
      this.z();
      this.y_2 = var1;
      return this;
   }

   public static class11355 N(double var0, double var2, double var4, float var6, float var7, boolean var8, boolean var9) {
      ((class11355)L_0).y_0 = var0;
      ((class11355)L_0).y_1 = var2;
      ((class11355)L_0).y_2 = var4;
      ((class11355)L_0).y_3 = var6;
      ((class11355)L_0).y_4 = var7;
      ((class11355)L_0).y_5 = var8;
      ((class11355)L_0).y_6 = var9;
      return (class11355)L_0;
   }

   public class11355 N(float var1) {
      this.z();
      this.y_3 = var1;
      return this;
   }

   public boolean R() {
      this.z();
      return (Boolean)this.y_5;
   }
}
