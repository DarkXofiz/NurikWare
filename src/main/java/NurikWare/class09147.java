package NurikWare;

public record class09147(class11499 rotation, float yawOffset, float pitchOffset, float yawSpeed, float pitchSpeed, boolean active) {

   public float L() {
      return this.pitchOffset;
   }

   public class09147(class11499 rotation, float yawOffset, float pitchOffset, float yawSpeed, float pitchSpeed, boolean active) {
      super();
      this.rotation = rotation;
      this.yawOffset = yawOffset;
      this.pitchOffset = pitchOffset;
      this.yawSpeed = yawSpeed;
      this.pitchSpeed = pitchSpeed;
      this.active = active;
   }

   public class11499 i() {
      return this.rotation;
   }

   public float u() {
      return this.yawSpeed;
   }

   public boolean y() {
      return this.active;
   }

   public static class09147 N(class11499 var0, float var1, float var2) {
      return new class09147(var0, 0.0F, 0.0F, var1, var2, false);
   }

   public float N() {
      return this.yawOffset;
   }

   public float R() {
      return this.pitchSpeed;
   }
}
