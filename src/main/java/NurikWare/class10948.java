package NurikWare;

import minecraft.class01054;
import minecraft.class06584;

public class class10948 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public static Object y_0 = new class10948();

   public int L() {
      return (Integer)this.N_2;
   }

   public class10948() {
      super();
      this.R();
   }

   static {
      Z();
   }

   private static void Z() {
   }

   public class01054 u() {
      return (class01054)this.N_0;
   }

   public class06584 y() {
      return (class06584)this.N_1;
   }

   public static class10948 N(class01054 var0, class06584 var1, int var2, int var3) {
      ((class10948)y_0).N_0 = var0;
      ((class10948)y_0).N_1 = var1;
      ((class10948)y_0).N_2 = var2;
      ((class10948)y_0).N_3 = var3;
      return (class10948)y_0;
   }

   public int N() {
      return (Integer)this.N_3;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
         this.N_3 = 0;
      }
   }
}
