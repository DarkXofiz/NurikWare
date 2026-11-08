package NurikWare;

public record class09149(class11499 rotation, float yawSpeed, float pitchSpeed, boolean active) {

   public class11499 L() {
      return this.rotation;
   }


   public boolean u() {
      return this.active;
   }

   public float y() {
      return this.yawSpeed;
   }

   public float N() {
      return this.pitchSpeed;
   }

   public static class09149 N(class11499 var0, float var1, float var2) {
      return new class09149(var0, var1, var2, false);
   }
}
