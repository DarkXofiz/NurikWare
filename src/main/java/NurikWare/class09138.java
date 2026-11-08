package NurikWare;

public record class09138(
   float yawDelta,
   float pitchDelta,
   float minYawShare,
   float minPitchShare,
   float maxYawShare,
   float maxPitchShare,
   float yawJerkScale,
   float pitchJerkScale,
   boolean breakSmoothing,
   boolean outputBurst
) {

   public float L() {
      return this.yawJerkScale;
   }

   public float M() {
      return this.pitchDelta;
   }


   public float B() {
      return this.maxYawShare;
   }

   public float Z() {
      return this.maxPitchShare;
   }

   public float i() {
      return this.minPitchShare;
   }

   public float z() {
      return this.yawDelta;
   }

   public boolean u() {
      return this.breakSmoothing;
   }

   public float y() {
      return this.pitchJerkScale;
   }

   public boolean N() {
      return this.outputBurst;
   }

   public float R() {
      return this.minYawShare;
   }
}
