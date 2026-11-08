package NurikWare;

public record class09132(class11499 rotation, float yawSpeed, float pitchSpeed, boolean active) {

   public float L() {
      return this.pitchSpeed;
   }

   public class09132(class11499 rotation, float yawSpeed, float pitchSpeed, boolean active) {
      super();
      this.rotation = rotation;
      this.yawSpeed = yawSpeed;
      this.pitchSpeed = pitchSpeed;
      this.active = active;
   }

   public boolean u() {
      return this.active;
   }

   public float y() {
      return this.yawSpeed;
   }

   public class11499 N() {
      return this.rotation;
   }

   public static class09132 N(class11499 var0, float var1, float var2) {
      return new class09132(var0, var1, var2, false);
   }
}
