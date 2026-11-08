package NurikWare;

public record class09962(class09982 mode, float min, float max, float value) {
   private static final float i = Float.POSITIVE_INFINITY;

   public float L(float var1) {
      float f = Math.max(0.0F, this.min);
      float f1 = Math.max(this.max, f);
      return class09693.N(var1, f, f1);
   }

   public boolean L() {
      return this.mode == class09982.PERCENT;
   }

   private static float M(float var0) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(0.0F, var0);
   }

   public float M() {
      return this.value;
   }


   private static float B(float var0) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(0.0F, var0);
   }

   public float i() {
      return this.min;
   }

   public float i(float var1) {
      return Math.max(0.0F, var1) * this.value / 100.0F;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float u(float var1) {
      float f = Math.max(0.0F, var1);

      return switch (this.mode) {
         case FIT -> this.L(f);
         case GROW -> this.L(f);
         case PERCENT -> this.i(f);
         case FIXED -> this.value;
      };
   }

   public class09982 u() {
      return this.mode;
   }

   public boolean y() {
      return this.mode == class09982.GROW;
   }

   public static class09962 y(float var0) {
      float f = M(var0);
      return new class09962(class09982.FIXED, f, f, f);
   }

   public static class09962 y(float var0, float var1) {
      return new class09962(class09982.GROW, M(var0), B(var1), 0.0F);
   }

   public static class09962 N(float var0) {
      float f = class09693.N(var0, 0.0F, 100.0F);
      return new class09962(class09982.PERCENT, 0.0F, Float.POSITIVE_INFINITY, f);
   }

   public static class09962 N() {
      return new class09962(class09982.FIT, 0.0F, Float.POSITIVE_INFINITY, 0.0F);
   }

   public static class09962 N(float var0, float var1) {
      return new class09962(class09982.FIT, M(var0), B(var1), 0.0F);
   }

   public static class09962 R(float var0) {
      float f = M(var0);
      return N(f, f);
   }

   public float R() {
      return this.max;
   }
}
