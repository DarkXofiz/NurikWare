package NurikWare;

import minecraft.class07438;

public class class11820 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;
   public static Object y_0 = new class11820();

   public boolean L() {
      return (Boolean)this.N_2;
   }

   public class11820() {
      super();
      this.i();
   }

   static {
      R();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = false;
      }
   }

   public class07438 y() {
      return (class07438)this.N_0;
   }

   public class11820 N(class11499 var1) {
      this.N_1 = var1;
      return this;
   }

   public static class11820 N(class07438 var0, class11499 var1, boolean var2) {
      ((class11820)y_0).N_0 = var0;
      ((class11820)y_0).N_1 = var1;
      ((class11820)y_0).N_2 = var2;
      return (class11820)y_0;
   }

   public class11499 N() {
      return (class11499)this.N_1;
   }

   public class11820 N(boolean var1) {
      this.N_2 = var1;
      return this;
   }

   public class11820 N(class07438 var1) {
      this.N_0 = var1;
      return this;
   }

   private static void R() {
   }
}
