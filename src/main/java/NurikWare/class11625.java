package NurikWare;

public record class11625(float minX, float minY, float maxX, float maxY) {

   public float L() {
      return this.minX;
   }

   public class11625(float minX, float minY, float maxX, float maxY) {
      super();
      this.minX = minX;
      this.minY = minY;
      this.maxX = maxX;
      this.maxY = maxY;
   }

   public float i() {
      return this.maxX - this.minX;
   }

   public float u() {
      return this.minY;
   }

   public float y() {
      return this.maxX;
   }

   public float N() {
      return this.maxY;
   }

   public class11625 N(class11625 var1) {
      float f = Math.max(this.minX, var1.minX);
      float f1 = Math.max(this.minY, var1.minY);
      float f2 = Math.min(this.maxX, var1.maxX);
      float f3 = Math.min(this.maxY, var1.maxY);
      return !(f2 - f <= 0.0F) && !(f3 - f1 <= 0.0F) ? new class11625(f, f1, f2, f3) : null;
   }

   public float R() {
      return this.maxY - this.minY;
   }
}
