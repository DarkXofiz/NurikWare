package NurikWare;

public record class09916(float x, float y, float width, float height) {
   public float L() {
      return this.y;
   }

   public class09916(float x, float y, float width, float height) {
      super();
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }

   public float i() {
      return this.height;
   }

   public float u() {
      return this.width;
   }

   public float y() {
      return this.x;
   }

   public boolean N() {
      return this.width <= 0.0F || this.height <= 0.0F;
   }
}
