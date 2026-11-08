package NurikWare;

public record class09888(float radius) implements class09914 {
   public class09888(float radius) {
      super();
      this.radius = radius;
   }

   public float y() {
      return this.radius;
   }

   @Override
   public float N() {
      return Math.max(0.0F, this.radius);
   }
}
