package NurikWare;

import java.time.Duration;
import minecraft.class07438;

public class class11745 implements class09819 {
   private static double[] L;
   private static String[] B;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   boolean L() {
      return this.m() && ((String)this.N_3).length() != ((String)this.N_2).length();
   }

   boolean M(int var1) {
      return this.m() && ((String)this.N_3).length() == ((String)this.N_2).length() && ((String)this.N_3).charAt(var1) != ((String)this.N_2).charAt(var1);
   }

   public class11745() {
      super();
      this.u();
      this.N_0 = new class11934(class11903.FORWARDS);
      this.N_2 = B[0];
      this.N_5 = 1;
   }

   static {
      Z();
      i();
   }

   private static void Z() {
      L = new double[3];
      L[0] = Double.longBitsToDouble(0L);
      L[1] = Double.longBitsToDouble(0L);
      L[2] = Double.longBitsToDouble(4607182418800017408L);
   }

   private static void i() {
      B = new String[1];
      B[0] = "";
   }

   private boolean m() {
      return (String)this.N_3 != null;
   }

   int U() {
      return (Integer)this.N_5;
   }

   String z() {
      return (String)this.N_2;
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = 0.0F;
         this.N_5 = 0;
      }
   }

   float E() {
      return class09693.N(((class11934)this.N_0).E().floatValue());
   }

   @Override
   public boolean N() {
      return (String)this.N_3 != null || ((class11934)this.N_0).M();
   }

   @Override
   public boolean N(float var1) {
      ((class11934)this.N_0).N();
      if ((String)this.N_3 != null && !((class11934)this.N_0).M()) {
         this.N_3 = null;
      }

      return true;
   }

   void N(class07438 var1, String var2, float var3) {
      if ((class07438)this.N_1 != var1) {
         this.N_1 = var1;
         this.N_2 = var2;
         this.N_3 = null;
         this.N_4 = var3;
         ((class11934)this.N_0).N(L[0], Duration.ZERO, (class11887)class11905.u_4);
      } else if (((String)this.N_2).equals(var2)) {
         this.N_4 = var3;
      } else {
         this.N_5 = var3 < (Float)this.N_4 ? 1 : -1;
         this.N_3 = (String)this.N_2;
         this.N_2 = var2;
         this.N_4 = var3;
         ((class11934)this.N_0).N(L[1], Duration.ZERO, (class11887)class11905.u_4);
         ((class11934)this.N_0).N(L[2], (Duration)TargetInfoHud.U_2, (class11887)class11905.u_4);
      }
   }

   String W() {
      return (String)this.N_3;
   }
}
