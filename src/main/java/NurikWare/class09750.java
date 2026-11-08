package NurikWare;

record class09750(int cp, float planeL, float planeB, float planeR, float planeT, float advance, int x, int y, int w, int h, int page) implements class09724 {
   public float L() {
      return this.planeB;
   }

   public int M() {
      return this.x;
   }


   public int B() {
      return this.y;
   }

   public int Z() {
      return this.w;
   }

   public float i() {
      return this.planeT;
   }

   public int U() {
      return this.page;
   }

   public int z() {
      return this.h;
   }

   public float u() {
      return this.planeR;
   }

   public float y() {
      return this.planeL;
   }

   public int N() {
      return this.cp;
   }

   public float R() {
      return this.advance;
   }
}
