package NurikWare;

public record class09148(float speed, boolean boosting) {

   public class09148(float speed, boolean boosting) {
      super();
      this.speed = speed;
      this.boosting = boosting;
   }

   public boolean y() {
      return this.boosting;
   }

   public float N() {
      return this.speed;
   }
}
