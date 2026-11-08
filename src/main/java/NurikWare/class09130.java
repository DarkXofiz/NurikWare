package NurikWare;

public record class09130(float yawDelta, float pitchDelta) {


   public float y() {
      return this.yawDelta;
   }

   public float N() {
      return this.pitchDelta;
   }
}
