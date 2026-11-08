package NurikWare;

public record class09761(byte[] pixels, int width, int height, int channels, double planeL, double planeB, double planeR, double planeT, double advance) {
   public int L() {
      return this.width;
   }

   public double M() {
      return this.planeB;
   }


   public double B() {
      return this.planeR;
   }

   public double Z() {
      return this.planeT;
   }

   public int i() {
      return this.channels;
   }

   public double z() {
      return this.advance;
   }

   public int u() {
      return this.height;
   }

   public byte[] y() {
      return this.pixels;
   }

   public boolean N() {
      return this.width == 0 || this.height == 0;
   }

   public double R() {
      return this.planeL;
   }
}
