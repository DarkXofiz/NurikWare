package NurikWare;

import minecraft.class01421;
import minecraft.class07070;

public class class10977 extends class11784 {
   public static Object y_0 = new class10977();
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   public float L() {
      this.M();
      return (Float)this.L_0;
   }

   private void M() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
      }
   }

   public class10977() {
      super();
      this.M();
   }

   static {
      z();
   }

   public class07070 i() {
      this.M();
      return (class07070)this.L_2;
   }

   private static void z() {
   }

   public class01421 u() {
      this.M();
      return (class01421)this.L_3;
   }

   public static class10977 N(class07070 var0, class01421 var1, float var2, float var3) {
      ((class10977)y_0).L_2 = var0;
      ((class10977)y_0).L_3 = var1;
      ((class10977)y_0).L_1 = var2;
      ((class10977)y_0).L_0 = var3;
      return (class10977)y_0;
   }

   public float R() {
      this.M();
      return (Float)this.L_1;
   }
}
