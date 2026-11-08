package NurikWare;

public record class09150(float yawDelta, float pitchDelta) {

   class09150(float yawDelta, float pitchDelta) {
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
