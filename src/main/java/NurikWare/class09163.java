package NurikWare;

public record class09163(float yawDelta, float pitchDelta) {

   class09163(float yawDelta, float pitchDelta) {
      super();
      this.yawDelta = yawDelta;
      this.pitchDelta = pitchDelta;
   }

   public float y() {
      return this.pitchDelta;
   }

   public float N() {
      return this.yawDelta;
   }
}
