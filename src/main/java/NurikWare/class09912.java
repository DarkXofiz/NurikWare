package NurikWare;

public record class09912(float x, float y, float width, float height, int targetWidth, int targetHeight, float uiScale) {
   public float L() {
      return this.width;
   }

   public float M() {
      return this.uiScale;
   }


   public int i() {
      return this.targetWidth;
   }

   public float u() {
      return this.height;
   }

   public float N() {
      return this.x;
   }

   public int R() {
      return this.targetHeight;
   }
}
