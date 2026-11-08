package NurikWare;

record class10063(float width, float height, float minWidth, float minHeight) {
   public float L() {
      return this.minWidth;
   }

   class10063(float width, float height, float minWidth, float minHeight) {
      super();
      this.width = width;
      this.height = height;
      this.minWidth = minWidth;
      this.minHeight = minHeight;
   }

   public float u() {
      return this.minHeight;
   }

   public float y() {
      return this.height;
   }

   public float N() {
      return this.width;
   }
}
