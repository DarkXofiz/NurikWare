package NurikWare;

public class class09286 implements class11951<class09263> {
   private static double[] Z;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public double L() {
      return (Double)this.N_4;
   }

   private static void M() {
      Z = new double[3];
      Z[0] = Double.longBitsToDouble(0L);
      Z[1] = Double.longBitsToDouble(0L);
      Z[2] = Double.longBitsToDouble(0L);
   }

   public class09286() {
      super();
      this.z();
   }

   public class09286(String var1, int var2, double var3, double var5, double var7, int var9) {
      super();
      this.z();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var5;
      this.N_4 = var7;
      this.N_5 = var9;
   }

   static {
      M();
   }

   public String i() {
      return (String)this.N_0;
   }

   private void z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
         this.N_2 = Z[0];
         this.N_3 = Z[1];
         this.N_4 = Z[2];
         this.N_5 = 0;
      }
   }

   public double u() {
      return (Double)this.N_2;
   }

   public int y() {
      return (Integer)this.N_1;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.P();
      this.N_1 = var1.R();
      this.N_2 = var1.i();
      this.N_3 = var1.i();
      this.N_4 = var1.i();
      this.N_5 = var1.R();
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   public double N() {
      return (Double)this.N_3;
   }

   @Override
   public void N(class11940 var1) {
      var1.N((String)this.N_0);
      var1.y((Integer)this.N_1);
      var1.N((Double)this.N_2);
      var1.N((Double)this.N_3);
      var1.N((Double)this.N_4);
      var1.y((Integer)this.N_5);
   }

   public int R() {
      return (Integer)this.N_5;
   }
}
