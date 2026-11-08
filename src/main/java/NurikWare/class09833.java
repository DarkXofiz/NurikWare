package NurikWare;

public record class09833(boolean enabled, float impulse, float friction, float stopVelocity) {
   private static final float i = 1800.0F;
   private static final float R = 14.0F;
   private static final float M = 4.0F;

   public boolean L() {
      return this.enabled;
   }

   public class09833(boolean enabled, float impulse, float friction, float stopVelocity) {
      super();
      impulse = N(impulse);
      friction = N(friction);
      stopVelocity = N(stopVelocity);
      this.enabled = enabled;
      this.impulse = impulse;
      this.friction = friction;
      this.stopVelocity = stopVelocity;
   }

   public float i() {
      return this.friction;
   }

   public float u() {
      return this.impulse;
   }

   public static class09833 y() {
      return new class09833(false, 1800.0F, 14.0F, 4.0F);
   }

   private static float N(float var0) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0) ? Math.max(0.0F, var0) : 0.0F;
   }

   public static class09833 N() {
      return new class09833(true, 1800.0F, 14.0F, 4.0F);
   }

   public float R() {
      return this.stopVelocity;
   }
}
