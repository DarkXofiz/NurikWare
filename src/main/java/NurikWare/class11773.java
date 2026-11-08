package NurikWare;

public record class11773(float u0, float v0, float u1, float v1, float planeWidth, float planeHeight) {

   public float L() {
      return this.planeWidth;
   }


   public float i() {
      return this.u0;
   }

   public float u() {
      return this.planeHeight;
   }

   public float y() {
      return this.v0;
   }

   public float N() {
      return this.v1;
   }

   public float R() {
      return this.u1;
   }
}
