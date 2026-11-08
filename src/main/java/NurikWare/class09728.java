package NurikWare;

public record class09728(float durationSeconds, class09759 easing, float delaySeconds) implements class09743 {
   public float L() {
      return this.delaySeconds;
   }

   public class09728(float durationSeconds, class09759 easing, float delaySeconds) {
      super();
      durationSeconds = Float.isFinite(durationSeconds) ? Math.max(0.0F, durationSeconds) : 0.0F;
      easing = easing == null ? class09759.EASE : easing;
      delaySeconds = Float.isFinite(delaySeconds) ? Math.max(0.0F, delaySeconds) : 0.0F;
      this.durationSeconds = durationSeconds;
      this.easing = easing;
      this.delaySeconds = delaySeconds;
   }

   public class09728(float var1, class09759 var2) {
      this(var1, var2, 0.0F);
   }

   @Override
   public boolean u() {
      return this.durationSeconds > 0.0F;
   }

   public class09759 y() {
      return this.easing;
   }

   public float N() {
      return this.durationSeconds;
   }

   public class09728 N(float var1) {
      return new class09728(this.durationSeconds, this.easing, var1);
   }
}
