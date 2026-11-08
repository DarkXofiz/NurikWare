package NurikWare;

public record class09153(class11499 rotation, float yawSpeed, float pitchSpeed) {

   public class11499 L() {
      return this.rotation;
   }

   public class09153(class11499 rotation, float yawSpeed, float pitchSpeed) {
      super();
      this.rotation = rotation;
      this.yawSpeed = yawSpeed;
      this.pitchSpeed = pitchSpeed;
   }

   public float y() {
      return this.yawSpeed;
   }

   public float N() {
      return this.pitchSpeed;
   }
}
