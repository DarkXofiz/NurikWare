package NurikWare;

public record class09136(float speed, float acceleration) {

   public class09136(float speed, float acceleration) {
      super();
      this.speed = speed;
      this.acceleration = acceleration;
   }

   public float y() {
      return this.speed;
   }

   public float N() {
      return this.acceleration;
   }
}
