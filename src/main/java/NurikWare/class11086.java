package NurikWare;

public record class11086(boolean active, float yawOffset, float pitchOffset, boolean releaseAim) {

   public boolean L() {
      return this.releaseAim;
   }


   public float i() {
      return this.pitchOffset;
   }

   public static class11086 u() {
      return new class11086(false, 0.0F, 0.0F, false);
   }

   public float y() {
      return this.yawOffset;
   }

   public boolean N() {
      return this.active;
   }
}
