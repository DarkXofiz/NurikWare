package NurikWare;

public record class09755(float[] pixels, int width, int height, int channels, double advance) {
   public int L() {
      return this.height;
   }

   public class09755(float[] pixels, int width, int height, int channels, double advance) {
      super();
      this.pixels = pixels;
      this.width = width;
      this.height = height;
      this.channels = channels;
      this.advance = advance;
   }

   public double i() {
      return this.advance;
   }

   public int u() {
      return this.channels;
   }

   public int y() {
      return this.width;
   }

   public float N(int var1, int var2, int var3) {
      return this.pixels[(var2 * this.width + var1) * this.channels + var3];
   }

   public float[] N() {
      return this.pixels;
   }
}
