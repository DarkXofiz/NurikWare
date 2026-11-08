package NurikWare;

public record class11627(int width, int height, byte[] rgbaPixels) {

   public int L() {
      return this.width;
   }

   class11627(int width, int height, byte[] rgbaPixels) {
      super();
      this.width = width;
      this.height = height;
      this.rgbaPixels = rgbaPixels;
   }

   public byte[] y() {
      return this.rgbaPixels;
   }

   public int N() {
      return this.height;
   }
}
