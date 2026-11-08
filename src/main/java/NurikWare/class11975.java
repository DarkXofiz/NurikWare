package NurikWare;

public class class11975 implements class11951<class09276> {
   private static double[] i;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public double L() {
      return (Double)this.N_0;
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = i[0];
         this.N_1 = i[1];
         this.N_2 = i[2];
      }
   }

   public class11975() {
      super();
      this.M();
   }

   public class11975(double var1, double var3, double var5) {
      super();
      this.M();
      this.N_0 = var1;
      this.N_1 = var3;
      this.N_2 = var5;
   }

   static {
      i();
   }

   private static void i() {
      i = new double[3];
      i[0] = Double.longBitsToDouble(0L);
      i[1] = Double.longBitsToDouble(0L);
      i[2] = Double.longBitsToDouble(0L);
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.i();
      this.N_1 = var1.i();
      this.N_2 = var1.i();
   }

   public double y() {
      return (Double)this.N_2;
   }

   public double N() {
      return (Double)this.N_1;
   }

   @Override
   public void N(class11940 var1) {
      var1.N((Double)this.N_0);
      var1.N((Double)this.N_1);
      var1.N((Double)this.N_2);
   }

   public void N(class09276 var1) {
      var1.N(this);
   }
}
