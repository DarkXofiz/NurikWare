package NurikWare;

record class10026(String text, float width, float height, int lineCount) {
   public float L() {
      return this.height;
   }

   class10026(String text, float width, float height, int lineCount) {
      super();
      this.text = text;
      this.width = width;
      this.height = height;
      this.lineCount = lineCount;
   }

   public int u() {
      return this.lineCount;
   }

   public float y() {
      return this.width;
   }

   public String N() {
      return this.text;
   }
}
