package NurikWare;

public class class11987 implements class11951<class09276> {
   private static double[] L;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public int L() {
      return (Integer)this.N_3;
   }

   public class11987() {
      super();
      this.i();
   }

   public class11987(double var1, double var3, double var5, int var7) {
      super();
      this.i();
      this.N_0 = var1;
      this.N_1 = var3;
      this.N_2 = var5;
      this.N_3 = var7;
   }

   static {
      Z();
   }

   private static void Z() {
      L = new double[3];
      L[0] = Double.longBitsToDouble(0L);
      L[1] = Double.longBitsToDouble(0L);
      L[2] = Double.longBitsToDouble(0L);
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = L[0];
         this.N_1 = L[1];
         this.N_2 = L[2];
         this.N_3 = 0;
      }
   }

   public double u() {
      return (Double)this.N_1;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.i();
      this.N_1 = var1.i();
      this.N_2 = var1.i();
      this.N_3 = var1.R();
   }

   public double y() {
      return (Double)this.N_0;
   }

   public double N() {
      return (Double)this.N_2;
   }

   @Override
   public void N(class11940 var1) {
      var1.N((Double)this.N_0);
      var1.N((Double)this.N_1);
      var1.N((Double)this.N_2);
      var1.y((Integer)this.N_3);
   }

   public void N(class09276 var1) {
      var1.N(this);
   }
}
