package NurikWare;

public record class09965(float topLeft, float topRight, float bottomRight, float bottomLeft) {
   public static final class09965 N = N(0.0F);

   public boolean L() {
      return Float.compare(this.topLeft, this.topRight) == 0
         && Float.compare(this.topRight, this.bottomRight) == 0
         && Float.compare(this.bottomRight, this.bottomLeft) == 0;
   }

   public float M() {
      return this.bottomLeft;
   }

   public class09965(float topLeft, float topRight, float bottomRight, float bottomLeft) {
      super();
      topLeft = y(topLeft);
      topRight = y(topRight);
      bottomRight = y(bottomRight);
      bottomLeft = y(bottomLeft);
      this.topLeft = topLeft;
      this.topRight = topRight;
      this.bottomRight = bottomRight;
      this.bottomLeft = bottomLeft;
   }

   public float i() {
      return this.topRight;
   }

   public float u() {
      return this.topLeft;
   }

   public boolean y() {
      return this.N() > 0.0F;
   }

   private static float y(float var0) {
      return !Float.isFinite(var0) ? 0.0F : Math.max(0.0F, var0);
   }

   public static class09965 N(float var0) {
      float f = y(var0);
      return new class09965(f, f, f, f);
   }

   public float N() {
      return Math.max(Math.max(this.topLeft, this.topRight), Math.max(this.bottomRight, this.bottomLeft));
   }

   public float R() {
      return this.bottomRight;
   }
}
