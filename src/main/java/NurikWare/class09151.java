package NurikWare;

public record class09151(class11499 rotation, float yawSpeed, float pitchSpeed, boolean active) {

   public boolean L() {
      return this.active;
   }


   public float u() {
      return this.pitchSpeed;
   }

   public class11499 y() {
      return this.rotation;
   }

   public float N() {
      return this.yawSpeed;
   }

   public static class09151 N(class11499 var0, float var1, float var2) {
      return new class09151(var0, var1, var2, false);
   }
}
