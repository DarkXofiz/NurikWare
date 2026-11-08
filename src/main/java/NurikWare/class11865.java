package NurikWare;

import java.time.Duration;

public class class11865 implements class09819 {
   private static double[] Z;
   public Object N_0;
   public Object N_1;
   public Object N_2;

   private static void L() {
      Z = new double[2];
      Z[0] = Double.longBitsToDouble(0L);
      Z[1] = Double.longBitsToDouble(4607182418800017408L);
   }

   boolean M() {
      return (String)this.N_2 != null;
   }

   public class11865() {
      super();
      this.u();
      this.N_0 = new class11934(class11903.FORWARDS);
   }

   static {
      L();
   }

   float i() {
      return class09693.N(((class11934)this.N_0).E().floatValue());
   }

   private void u() {
   }

   String y() {
      return (String)this.N_2;
   }

   @Override
   public boolean N(float var1) {
      ((class11934)this.N_0).N();
      if ((String)this.N_2 != null && !((class11934)this.N_0).M()) {
         this.N_2 = null;
      }

      return true;
   }

   @Override
   public boolean N() {
      return (String)this.N_2 != null || ((class11934)this.N_0).M();
   }

   void N(String var1) {
      if ((String)this.N_1 == null) {
         this.N_1 = var1;
      } else if (!((String)this.N_1).equals(var1)) {
         this.N_2 = (String)this.N_1;
         this.N_1 = var1;
         ((class11934)this.N_0).N(Z[0], Duration.ZERO, (class11887)class11905.u_4);
         ((class11934)this.N_0).N(Z[1], (Duration)class11857.y_2, (class11887)class11905.u_4);
      }
   }
}
