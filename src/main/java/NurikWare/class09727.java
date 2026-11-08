package NurikWare;

record class09727(int x, int y, int paddedWidth, int paddedHeight, int newHeight, int newRowHeight, boolean appended) {
   public int L() {
      return this.paddedWidth;
   }

   public boolean M() {
      return this.appended;
   }

   class09727(int x, int y, int paddedWidth, int paddedHeight, int newHeight, int newRowHeight, boolean appended) {
      super();
      this.x = x;
      this.y = y;
      this.paddedWidth = paddedWidth;
      this.paddedHeight = paddedHeight;
      this.newHeight = newHeight;
      this.newRowHeight = newRowHeight;
      this.appended = appended;
   }

   public int i() {
      return this.newHeight;
   }

   public int u() {
      return this.paddedHeight;
   }

   public int N() {
      return this.x;
   }

   public int R() {
      return this.newRowHeight;
   }
}
