package NurikWare;

public record class09163(float yawDelta, float pitchDelta) {


   public float y() {
      return this.pitchDelta;
   }

   public float N() {
      return this.yawDelta;
   }
}
