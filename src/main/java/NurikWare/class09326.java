package NurikWare;

import minecraft.class04891;
import minecraft.class04911;

public class class09326 extends class11784 {
   private static double[] z;
   public static Object y_0 = new class09326();
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;

   public void L(double var1) {
      this.P();
      this.L_4 = var1;
   }

   public class04911 L() {
      this.P();
      return (class04911)this.L_1;
   }

   public double M() {
      this.P();
      return (Double)this.L_4;
   }

   private void P() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = z[0];
         this.L_5 = z[1];
         this.L_6 = z[2];
      }
   }

   public class09326() {
      super();
      this.P();
   }

   static {
      s();
      m();
   }

   public double B() {
      this.P();
      return (Double)this.L_6;
   }

   public class04891 Z() {
      this.P();
      return (class04891)this.L_0;
   }

   public float i() {
      this.P();
      return (Float)this.L_2;
   }

   private static void s() {
      z = new double[3];
      z[0] = Double.longBitsToDouble(0L);
      z[1] = Double.longBitsToDouble(0L);
      z[2] = Double.longBitsToDouble(0L);
   }

   private static void m() {
   }

   public double u() {
      this.P();
      return (Double)this.L_5;
   }

   public void y(float var1) {
      this.P();
      this.L_2 = var1;
   }

   public void y(double var1) {
      this.P();
      this.L_5 = var1;
   }

   public void N(class04891 var1) {
      this.P();
      this.L_0 = var1;
   }

   public static class09326 N(class04891 var0, class04911 var1, float var2, float var3, double var4, double var6, double var8) {
      ((class09326)y_0).L_0 = var0;
      ((class09326)y_0).L_1 = var1;
      ((class09326)y_0).L_2 = var3;
      ((class09326)y_0).L_3 = var2;
      ((class09326)y_0).L_4 = var4;
      ((class09326)y_0).L_5 = var6;
      ((class09326)y_0).L_6 = var8;
      return (class09326)y_0;
   }

   public void N(class04911 var1) {
      this.P();
      this.L_1 = var1;
   }

   public void N(float var1) {
      this.P();
      this.L_3 = var1;
   }

   public void N(double var1) {
      this.P();
      this.L_6 = var1;
   }

   public float R() {
      this.P();
      return (Float)this.L_3;
   }
}
