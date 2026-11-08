package NurikWare;

public class class11209 {
   private static double[] R;
   private static double[] U;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public static Object y_0;

   public long L() {
      return (Long)this.N_2;
   }

   public double M() {
      return ((Long)this.N_1).longValue() / R[1];
   }

   private static void P() {
      y_0 = U[3];
   }

   private static void T() {
      R = new double[5];
      R[0] = Double.longBitsToDouble(0L);
      R[1] = Double.longBitsToDouble(4696837146684686336L);
      R[2] = Double.longBitsToDouble(4696837146684686336L);
      R[3] = Double.longBitsToDouble(0L);
      R[4] = Double.longBitsToDouble(4696837146684686336L);
      U = new double[4];
      U[0] = Double.longBitsToDouble(0L);
      U[1] = Double.longBitsToDouble(4696837146684686336L);
      U[2] = Double.longBitsToDouble(0L);
      U[3] = Double.longBitsToDouble(4696837146684686336L);
   }

   public class11209(String var1, long var2) {
      super();
      this.m();
      this.N_2 = Long.MAX_VALUE;
      this.N_3 = Long.MIN_VALUE;
      this.N_0 = var1;
      this.N(var2);
   }

   static {
      T();
      P();
   }

   public double B() {
      return (Long)this.N_5 == 0L ? R[3] : ((Long)this.N_2).longValue() / R[4];
   }

   public long Z() {
      return (Long)this.N_5;
   }

   public long i() {
      return (Long)this.N_1;
   }

   private void m() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0L;
         this.N_4 = U[2];
         this.N_5 = 0L;
      }
   }

   public double U() {
      return (Double)this.N_4;
   }

   public long z() {
      return (Long)this.N_3;
   }

   public void u() {
      this.N_1 = 0L;
      this.N_2 = Long.MAX_VALUE;
      this.N_3 = Long.MIN_VALUE;
      this.N_4 = R[0];
      this.N_5 = 0L;
   }

   public double y() {
      return (Double)this.N_4 / R[2];
   }

   public String N() {
      return (String)this.N_0;
   }

   public void N(long var1) {
      if (var1 >= 0L) {
         this.N_1 = var1;
         if (var1 < (Long)this.N_2) {
            this.N_2 = var1;
         }

         if (var1 > (Long)this.N_3) {
            this.N_3 = var1;
         }

         this.N_5 = (Long)this.N_5 + 1L;
         this.N_4 = (Double)this.N_4 + (var1 - (Double)this.N_4) / ((Long)this.N_5).longValue();
      }
   }

   public double R() {
      return (Long)this.N_5 == 0L ? U[0] : ((Long)this.N_3).longValue() / U[1];
   }
}
