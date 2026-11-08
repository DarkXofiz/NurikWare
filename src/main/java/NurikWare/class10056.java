package NurikWare;

record class10056(float unwrappedWidth, float lineHeight, float longestWordWidth) {
   public float L() {
      return this.longestWordWidth;
   }

   class10056(float unwrappedWidth, float lineHeight, float longestWordWidth) {
      super();
      this.unwrappedWidth = unwrappedWidth;
      this.lineHeight = lineHeight;
      this.longestWordWidth = longestWordWidth;
   }

   public float y() {
      return this.lineHeight;
   }

   public float N() {
      return this.unwrappedWidth;
   }
}
