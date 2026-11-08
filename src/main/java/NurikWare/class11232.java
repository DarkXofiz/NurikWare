package NurikWare;

import minecraft.class06889;

public class class11232 {
   private static double[] R;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   public class11232(class06889 var1, class06889 var2, float var3, int var4) {
      super();
      this.u();
      this.y_0 = var1;
      this.y_1 = var2;
      this.N_0 = var3;
      this.N_1 = var4;
      double d0 = Math.random() - R[0];
      double d1 = R[1] + Math.random() * R[2];
      double d2 = Math.random() - R[3];
      this.y_2 = new class06889(d0, d1, d2).L(R[4]);
      this.y_4 = new class06889(Math.random() - R[5], Math.random() - R[6], Math.random() - R[7]).u();
   }

   static {
      i();
   }

   private static void i() {
      R = new double[8];
      R[0] = Double.longBitsToDouble(4602678819172646912L);
      R[1] = Double.longBitsToDouble(4590429028186199163L);
      R[2] = Double.longBitsToDouble(4602678819172646912L);
      R[3] = Double.longBitsToDouble(4602678819172646912L);
      R[4] = Double.longBitsToDouble(4596373779694328218L);
      R[5] = Double.longBitsToDouble(4602678819172646912L);
      R[6] = Double.longBitsToDouble(4602678819172646912L);
      R[7] = Double.longBitsToDouble(4602678819172646912L);
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
      }
   }

   public void y() {
      this.N_2 = (Integer)this.N_2 + 1;
      this.y_1 = (class06889)this.y_0;
      byte b0 = 5;
      if ((Integer)this.N_2 % b0 == 0 || (class06889)this.y_3 == null) {
         this.y_3 = ((class06889)this.y_4).u().B((class06889)this.y_2).L(Math.min(((Integer)this.N_2).intValue() / 15.0F, 1.0F)).i((class06889)this.y_0);
         this.N_3 = (Integer)this.N_2 + b0;
      }

      this.y_0 = ((class06889)this.y_0).N((class06889)this.y_3, 1.0F / ((Integer)this.N_3 - (Integer)this.N_2));
   }

   public boolean N() {
      return (Integer)this.N_2 > (Integer)this.N_1;
   }
}
