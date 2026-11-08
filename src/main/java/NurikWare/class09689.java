package NurikWare;

public record class09689(float u0, float v0, float u1, float v1) {
   public static final class09689 N = new class09689(0.0F, 0.0F, 1.0F, 1.0F);

   public float L() {
      return this.v0;
   }

   public class09689(float u0, float v0, float u1, float v1) {
      super();
      this.u0 = u0;
      this.v0 = v0;
      this.u1 = u1;
      this.v1 = v1;
   }

   public float i() {
      return this.v1;
   }

   public float u() {
      return this.u1;
   }

   public float y() {
      return this.u0;
   }

   public boolean N() {
      return this.u0 == 0.0F && this.v0 == 0.0F && this.u1 == 1.0F && this.v1 == 1.0F;
   }
}
