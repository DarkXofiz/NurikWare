package NurikWare;

public record class09160(float yawSpeed, float pitchSpeed, boolean fastCorrection, float yawOffset, float pitchOffset, boolean angularFlick) {

   public boolean L() {
      return this.angularFlick;
   }


   public boolean i() {
      return this.fastCorrection;
   }

   public float u() {
      return this.yawSpeed;
   }

   public float y() {
      return this.yawOffset;
   }

   public float N() {
      return this.pitchSpeed;
   }

   public float R() {
      return this.pitchOffset;
   }
}
