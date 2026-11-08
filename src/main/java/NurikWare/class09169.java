package NurikWare;

public record class09169(float yawDelta, float pitchDelta, float yawSpeed, float pitchSpeed, boolean holdPitch) {

   public float L() {
      return this.yawSpeed;
   }


   public boolean i() {
      return this.holdPitch;
   }

   public float u() {
      return this.pitchDelta;
   }

   public float y() {
      return this.yawDelta;
   }

   public float N() {
      return this.pitchSpeed;
   }
}
