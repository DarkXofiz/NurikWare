package NurikWare;

import minecraft.class06889;

public class class11401 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public static Object y_0 = new class11401();

   public class11401() {
      super();
      this.i();
   }

   static {
      u();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
      }
   }

   private static void u() {
   }

   public float y() {
      return (Float)this.N_0;
   }

   public class06889 N() {
      return (class06889)this.N_1;
   }

   public static class11401 N(float var0, class06889 var1) {
      ((class11401)y_0).N_0 = var0;
      ((class11401)y_0).N_1 = var1;
      return (class11401)y_0;
   }
}
