package NurikWare;

import minecraft.class01054;
import minecraft.class06584;

public class class10946 {
   public static Object N_0 = new class10946();
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public boolean y_init;

   public int L() {
      return (Integer)this.y_2;
   }

   private void M() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0;
         this.y_3 = 0;
      }
   }

   public class10946() {
      super();
      this.M();
   }

   static {
      B();
   }

   private static void B() {
   }

   public class06584 u() {
      return (class06584)this.y_1;
   }

   public int y() {
      return (Integer)this.y_3;
   }

   public class01054 N() {
      return (class01054)this.y_0;
   }

   public static class10946 N(class01054 var0, class06584 var1, int var2, int var3) {
      ((class10946)N_0).y_0 = var0;
      ((class10946)N_0).y_1 = var1;
      ((class10946)N_0).y_2 = var2;
      ((class10946)N_0).y_3 = var3;
      return (class10946)N_0;
   }
}
