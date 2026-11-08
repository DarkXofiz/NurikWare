package NurikWare;

public record class11097(
   class11499 rotation,
   boolean currentHardRaycast,
   boolean serverHardRaycast,
   boolean urgentCatchup,
   boolean holdPitch,
   boolean detachedAim,
   boolean overshootAim,
   boolean pullbackFlick,
   float yawError,
   float pitchError,
   double distance
) {

   public float L() {
      return this.pitchError;
   }

   public boolean M() {
      return this.detachedAim;
   }

   public class11097(
      class11499 rotation,
      boolean currentHardRaycast,
      boolean serverHardRaycast,
      boolean urgentCatchup,
      boolean holdPitch,
      boolean detachedAim,
      boolean overshootAim,
      boolean pullbackFlick,
      float yawError,
      float pitchError,
      double distance
   ) {
      super();
      this.rotation = rotation;
      this.currentHardRaycast = currentHardRaycast;
      this.serverHardRaycast = serverHardRaycast;
      this.urgentCatchup = urgentCatchup;
      this.holdPitch = holdPitch;
      this.detachedAim = detachedAim;
      this.overshootAim = overshootAim;
      this.pullbackFlick = pullbackFlick;
      this.yawError = yawError;
      this.pitchError = pitchError;
      this.distance = distance;
   }

   public boolean B() {
      return this.pullbackFlick;
   }

   public boolean Z() {
      return this.urgentCatchup;
   }

   public boolean i() {
      return this.serverHardRaycast;
   }

   public float U() {
      return this.yawError;
   }

   public boolean z() {
      return this.currentHardRaycast;
   }

   public double u() {
      return this.distance;
   }

   public class11499 y() {
      return this.rotation;
   }

   public boolean N() {
      return this.holdPitch;
   }

   public boolean R() {
      return this.overshootAim;
   }
}
