package NurikWare;

public class class09298 implements class11951<class09263> {
   private static double[] u;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   public double L() {
      return (Double)this.N_2;
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = u[0];
         this.N_3 = u[1];
         this.N_4 = u[2];
      }
   }

   public class09298(String var1, String var2, double var3, double var5, double var7) {
      super();
      this.M();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var5;
      this.N_4 = var7;
   }

   public class09298() {
      super();
      this.M();
   }

   static {
      R();
   }

   public String i() {
      return (String)this.N_1;
   }

   public String u() {
      return (String)this.N_0;
   }

   public double y() {
      return (Double)this.N_4;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.P();
      this.N_1 = var1.P();
      this.N_2 = var1.i();
      this.N_3 = var1.i();
      this.N_4 = var1.i();
   }

   public double N() {
      return (Double)this.N_3;
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   @Override
   public void N(class11940 var1) {
      var1.N((String)this.N_0);
      var1.N((String)this.N_1);
      var1.N((Double)this.N_2);
      var1.N((Double)this.N_3);
      var1.N((Double)this.N_4);
   }

   private static void R() {
      u = new double[3];
      u[0] = Double.longBitsToDouble(0L);
      u[1] = Double.longBitsToDouble(0L);
      u[2] = Double.longBitsToDouble(0L);
   }
}
