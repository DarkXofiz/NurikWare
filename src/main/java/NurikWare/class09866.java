package NurikWare;

public record class09866(float animationUpdateRateHz, class09833 inertialScroll, class09770 loggingOptions, boolean debugOverlay) {
   private static final float i = 120.0F;
   private static final float R = 1.0E-6F;

   public class09833 L() {
      return this.inertialScroll;
   }

   public class09866(float animationUpdateRateHz, class09833 inertialScroll, class09770 loggingOptions, boolean debugOverlay) {
      super();
      animationUpdateRateHz = y(animationUpdateRateHz);
      inertialScroll = inertialScroll == null ? class09833.N() : inertialScroll;
      loggingOptions = loggingOptions == null ? class09770.N : loggingOptions;
      this.animationUpdateRateHz = animationUpdateRateHz;
      this.inertialScroll = inertialScroll;
      this.loggingOptions = loggingOptions;
      this.debugOverlay = debugOverlay;
   }

   public boolean i() {
      return this.debugOverlay;
   }

   public class09770 u() {
      return this.loggingOptions;
   }

   public float y() {
      return this.animationUpdateRateHz;
   }

   private static float y(float var0) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0) && !(var0 <= 1.0E-6F) ? var0 : 0.0F;
   }

   public class09866 N(class09770 var1) {
      return new class09866(this.animationUpdateRateHz, this.inertialScroll, var1, this.debugOverlay);
   }

   public static class09866 N() {
      return new class09866(120.0F, class09833.N(), class09770.N, false);
   }

   public class09866 N(float var1) {
      return new class09866(var1, this.inertialScroll, this.loggingOptions, this.debugOverlay);
   }

   public class09866 N(class09833 var1) {
      return new class09866(this.animationUpdateRateHz, var1, this.loggingOptions, this.debugOverlay);
   }

   public class09866 N(boolean var1) {
      return new class09866(this.animationUpdateRateHz, this.inertialScroll, this.loggingOptions, var1);
   }
}
