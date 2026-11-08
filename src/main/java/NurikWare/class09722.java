package NurikWare;

record class09722(int x, int y, int width, int height, int paddedWidth, int paddedHeight) {
   public int L() {
      return this.width;
   }

   int M() {
      return this.y + this.height;
   }

   class09722(int x, int y, int width, int height, int paddedWidth, int paddedHeight) {
      super();
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.paddedWidth = paddedWidth;
      this.paddedHeight = paddedHeight;
   }

   int B() {
      return this.y + this.paddedHeight;
   }

   public int i() {
      return this.paddedWidth;
   }

   public int u() {
      return this.height;
   }

   public int N() {
      return this.x;
   }

   public int R() {
      return this.paddedHeight;
   }
}
