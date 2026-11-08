package NurikWare;

public record class09123(class11499 rotation, float yawSpeed, float pitchSpeed) {

   public float L() {
      return this.pitchSpeed;
   }

   public class09123(class11499 rotation, float yawSpeed, float pitchSpeed) {
      super();
      this.rotation = rotation;
      this.yawSpeed = yawSpeed;
      this.pitchSpeed = pitchSpeed;
   }

   public class11499 y() {
      return this.rotation;
   }

   public float N() {
      return this.yawSpeed;
   }
}
