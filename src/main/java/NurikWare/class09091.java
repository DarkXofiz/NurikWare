package NurikWare;

public record class09091(int glTextureId, float u0, float v0, float u1, float v1, float minX, float maxX, float minY, float maxY, float advance) {

   public float L() {
      return this.u0;
   }

   public int M() {
      return this.glTextureId;
   }

   public class09091(int glTextureId, float u0, float v0, float u1, float v1, float minX, float maxX, float minY, float maxY, float advance) {
      super();
      this.glTextureId = glTextureId;
      this.u0 = u0;
      this.v0 = v0;
      this.u1 = u1;
      this.v1 = v1;
      this.minX = minX;
      this.maxX = maxX;
      this.minY = minY;
      this.maxY = maxY;
      this.advance = advance;
   }

   public float B() {
      return this.advance;
   }

   public float Z() {
      return this.maxY;
   }

   public float i() {
      return this.v1;
   }

   public float z() {
      return this.v0;
   }

   public float u() {
      return this.minY;
   }

   public float y() {
      return this.minX;
   }

   public float N() {
      return this.u1;
   }

   public float R() {
      return this.maxX;
   }
}
