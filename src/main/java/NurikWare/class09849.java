package NurikWare;

public record class09849(float x, float y, float width, float height) {
   public float L() {
      return this.x + this.width * 0.5F;
   }

   public float M() {
      return this.width;
   }


   public float B() {
      return this.height;
   }

   public float i() {
      return this.x;
   }

   public float u() {
      return this.y + this.height * 0.5F;
   }

   public float y() {
      return this.y + this.height;
   }

   public float N() {
      return this.x + this.width;
   }

   public float R() {
      return this.y;
   }
}
