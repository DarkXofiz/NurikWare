package NurikWare;

public record class09126(float yawDelta, float pitchDelta) {

   public class09126(float yawDelta, float pitchDelta) {
      super();
      this.yawDelta = yawDelta;
      this.pitchDelta = pitchDelta;
   }

   public float y() {
      return this.yawDelta;
   }

   public float N() {
      return this.pitchDelta;
   }
}
