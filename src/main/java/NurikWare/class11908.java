package NurikWare;

import java.util.concurrent.ThreadLocalRandom;
import minecraft.class04995;

public class class11908 {
   private static double[] N;
   private static String[] u;
   private static double[] i;

   public static double L(double var0, double var2) {
      double d0 = Math.max(N[1], var2 - var0);
      return class04995.N(N(var0 + d0 * N[2], d0 * N[3], d0 * N[4]), var0, var2);
   }

   private class11908() {
      super();
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      N();
      u();
   }

   private static void u() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }

   public static float y(float var0) {
      return (float)ThreadLocalRandom.current().nextGaussian() * var0;
   }

   public static float y(float var0, float var1) {
      return var0 + (var1 - var0) * ThreadLocalRandom.current().nextFloat();
   }

   public static double y(double var0, double var2) {
      return var0 * Math.exp(var2 * ThreadLocalRandom.current().nextGaussian());
   }

   public static float y(double var0) {
      return (float)var0 * (180.0F / (float)Math.PI);
   }

   public static int N(int var0, int var1) {
      return ThreadLocalRandom.current().nextInt(var1 - var0 + 1) + var0;
   }

   public static double N(double var0, double var2) {
      return Math.round(Math.round(var0 / var2) * var2 * i[0]) / i[1];
   }

   public static float N(float var0, float var1) {
      return Math.round(Math.round(var0 / var1) * var1 * 100.0F) / 100.0F;
   }

   public static double N(double var0, double var2, double var4) {
      double d0 = var0 + var2 * ThreadLocalRandom.current().nextGaussian();
      double d1 = -var4 * Math.log(N[0] - ThreadLocalRandom.current().nextDouble());
      return d0 + d1;
   }

   private static void N() {
      i = new double[2];
      i[0] = Double.longBitsToDouble(4636737291354636288L);
      i[1] = Double.longBitsToDouble(4636737291354636288L);
      N = new double[7];
      N[0] = Double.longBitsToDouble(4607182418800017408L);
      N[1] = Double.longBitsToDouble(0L);
      N[2] = Double.longBitsToDouble(4597094355634707497L);
      N[3] = Double.longBitsToDouble(4593311331947716280L);
      N[4] = Double.longBitsToDouble(4599796515411129795L);
      N[5] = Double.longBitsToDouble(4652007308841189376L);
      N[6] = Double.longBitsToDouble(4652007308841189376L);
   }

   public static float N(float var0) {
      return var0 * (float) (Math.PI / 180.0);
   }

   public static double N(double var0) {
      return Math.round(var0 * N[5]) / N[6];
   }
}
