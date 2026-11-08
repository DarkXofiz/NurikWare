package NurikWare;

import java.time.Duration;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;

public class class11483 extends class11479 {
   private static double[] B;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   public class11934 L() {
      this.t();
      return (class11934)this.N_1;
   }

   public class11934 M() {
      this.t();
      return (class11934)this.N_0;
   }

   public class11483(String var1, int var2, class06889 var3, String var4, int var5) {
      super(var1, var3, Duration.ofSeconds(30L), var4);
      this.t();
      this.N_0 = new class11934(class11903.FORWARDS);
      this.N_1 = new class11934(class11903.FORWARDS);
      this.N_2 = var2;
      this.N_3 = var5;
      this.N_4 = var3;
      ((class11934)this.N_0).N(B[0], Duration.ofMillis(2200L), (class11887)class11905.u_4);
      ((class11934)this.N_1).N(B[1], Duration.ofMillis(250L), (class11887)class11905.u_4);
   }

   static {
      n();
   }

   public class06889 B() {
      this.t();
      return (class06889)this.N_4;
   }

   public int i() {
      this.t();
      return (Integer)this.N_2;
   }

   private static void n() {
      B = new double[2];
      B[0] = Double.longBitsToDouble(4607182418800017408L);
      B[1] = Double.longBitsToDouble(4607182418800017408L);
   }

   private void t() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
         this.N_3 = 0;
      }
   }

   public class06889 u() {
      this.t();
      if ((Integer)this.N_3 == -1) {
         return super.W();
      } else {
         class06202 class06202 = class06202.Nq();
         if ((class03448)class06202.T_3 != null) {
            class07049 class07049 = ((class03448)class06202.T_3).method_8469((Integer)this.N_3);
            if (class07049 != null) {
               return new class06889(class11925.i(class07049), class11925.u(class07049) + class07049.method_17682() / 2.0F, class11925.L(class07049));
            }
         }

         return super.W();
      }
   }

   public int y() {
      this.t();
      return (Integer)this.N_3;
   }

   @Override
   public Class<? extends class11473<?>> N() {
      return class11476.class;
   }

   public boolean R() {
      this.t();
      return (Integer)this.N_3 != -1;
   }
}
