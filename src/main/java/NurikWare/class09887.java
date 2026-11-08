package NurikWare;

record class09887(float minX, float minY, float maxX, float maxY) {
   public float L() {
      return this.minY;
   }


   public float i() {
      return this.maxY;
   }

   public float u() {
      return this.maxX;
   }

   public float y() {
      return this.minX;
   }

   boolean N() {
      return this.maxX > this.minX && this.maxY > this.minY;
   }
}
