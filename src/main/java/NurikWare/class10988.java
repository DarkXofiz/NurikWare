package NurikWare;

import minecraft.class07049;

public class class10988 {
   public static Object N_0 = new class10988();
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class10988() {
      super();
      this.R();
   }

   static {
      i();
   }

   private static void i() {
   }

   public boolean y() {
      return (Boolean)this.y_0;
   }

   public static class10988 N(boolean var0, class07049 var1) {
      ((class10988)N_0).y_0 = var0;
      ((class10988)N_0).y_1 = var1;
      return (class10988)N_0;
   }

   public class10988 N(boolean var1) {
      this.y_0 = var1;
      return this;
   }

   public class10988 N(class07049 var1) {
      this.y_1 = var1;
      return this;
   }

   public class07049 N() {
      return (class07049)this.y_1;
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }
}
