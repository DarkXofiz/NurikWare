package NurikWare;

import minecraft.class07050;

public class class11375 extends class11784 {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;
   public static Object L_0 = new class11375();

   public float L() {
      this.z();
      return (Float)this.y_1;
   }

   public class11375() {
      super();
      this.z();
   }

   static {
      B();
   }

   private static void B() {
   }

   public class07050 i() {
      this.z();
      return (class07050)this.y_0;
   }

   private void z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
      }
   }

   public float u() {
      this.z();
      return (Float)this.y_2;
   }

   public class11375 y(float var1) {
      this.z();
      this.y_2 = var1;
      return this;
   }

   public class11375 N(class07050 var1) {
      this.z();
      this.y_0 = var1;
      return this;
   }

   public static class11375 N(class07050 var0, float var1, float var2) {
      ((class11375)L_0).y_0 = var0;
      ((class11375)L_0).y_1 = var1;
      ((class11375)L_0).y_2 = var2;
      return (class11375)L_0;
   }

   public class11375 N(float var1) {
      this.z();
      this.y_1 = var1;
      return this;
   }
}
