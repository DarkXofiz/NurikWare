package NurikWare;

public record class11627(int width, int height, byte[] rgbaPixels) {

   public int L() {
      return this.width;
   }


   public byte[] y() {
      return this.rgbaPixels;
   }

   public int N() {
      return this.height;
   }
}
