package NurikWare;

public record class09666(float pixels, float percent) {
   public static final class09666 N = N(0.0F);

   public float L(float var1) {
      return this.pixels + this.percent * 0.01F * Math.max(0.0F, var1);
   }

   public float L() {
      return this.percent;
   }

   public class09666(float pixels, float percent) {
      super();
      pixels = u(pixels);
      percent = u(percent);
      this.pixels = pixels;
      this.percent = percent;
   }

   private static float u(float var0) {
      return Float.isFinite(var0) ? var0 : 0.0F;
   }

   public float y() {
      return this.pixels;
   }

   public static class09666 y(float var0) {
      return new class09666(0.0F, var0);
   }

   public static class09666 N(float var0, float var1) {
      return new class09666(var0, var1);
   }

   public static class09666 N(float var0) {
      return new class09666(var0, 0.0F);
   }

   public boolean N() {
      return this.pixels == 0.0F && this.percent == 0.0F;
   }
}
