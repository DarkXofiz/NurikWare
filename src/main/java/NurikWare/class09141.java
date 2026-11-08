package NurikWare;

public record class09141(
   boolean active,
   float yawMultiplier,
   float pitchMultiplier,
   float acceleration,
   float yawShare,
   float pitchShare,
   float yawOffset,
   float pitchOffset,
   boolean angularOffset
) {

   public float L() {
      return this.acceleration;
   }

   public float M() {
      return this.pitchMultiplier;
   }

   public class09141(
      boolean active,
      float yawMultiplier,
      float pitchMultiplier,
      float acceleration,
      float yawShare,
      float pitchShare,
      float yawOffset,
      float pitchOffset,
      boolean angularOffset
   ) {
      super();
      this.active = active;
      this.yawMultiplier = yawMultiplier;
      this.pitchMultiplier = pitchMultiplier;
      this.acceleration = acceleration;
      this.yawShare = yawShare;
      this.pitchShare = pitchShare;
      this.yawOffset = yawOffset;
      this.pitchOffset = pitchOffset;
      this.angularOffset = angularOffset;
   }

   public float B() {
      return this.pitchShare;
   }

   public static class09141 Z() {
      return new class09141(false, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
   }

   public float i() {
      return this.yawMultiplier;
   }

   public float z() {
      return this.pitchOffset;
   }

   public float u() {
      return this.yawShare;
   }

   public boolean y() {
      return this.active;
   }

   public boolean N() {
      return this.angularOffset;
   }

   public float R() {
      return this.yawOffset;
   }
}
