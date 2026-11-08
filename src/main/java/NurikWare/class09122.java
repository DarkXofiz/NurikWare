package NurikWare;

public record class09122(
   class11499 rotation,
   float yawSpeed,
   float pitchSpeed,
   boolean holdPitch,
   boolean detachedAim,
   boolean fastCorrection,
   boolean overflight,
   boolean closeRange,
   float closeFactor,
   boolean overlapRange,
   boolean constrainedSpace
) {

   public boolean L() {
      return this.overflight;
   }

   public boolean M() {
      return this.holdPitch;
   }

   public class09122(
      class11499 rotation,
      float yawSpeed,
      float pitchSpeed,
      boolean holdPitch,
      boolean detachedAim,
      boolean fastCorrection,
      boolean overflight,
      boolean closeRange,
      float closeFactor,
      boolean overlapRange,
      boolean constrainedSpace
   ) {
      super();
      this.rotation = rotation;
      this.yawSpeed = yawSpeed;
      this.pitchSpeed = pitchSpeed;
      this.holdPitch = holdPitch;
      this.detachedAim = detachedAim;
      this.fastCorrection = fastCorrection;
      this.overflight = overflight;
      this.closeRange = closeRange;
      this.closeFactor = closeFactor;
      this.overlapRange = overlapRange;
      this.constrainedSpace = constrainedSpace;
   }

   public class09122(class11499 var1, float var2, float var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, false, false, 0.0F, false, false);
   }

   public class11499 B() {
      return this.rotation;
   }

   public float Z() {
      return this.closeFactor;
   }

   public boolean i() {
      return this.constrainedSpace;
   }

   public boolean U() {
      return this.overlapRange;
   }

   public boolean z() {
      return this.fastCorrection;
   }

   public float u() {
      return this.yawSpeed;
   }

   public float y() {
      return this.pitchSpeed;
   }

   public boolean N() {
      return this.closeRange;
   }

   public boolean R() {
      return this.detachedAim;
   }
}
