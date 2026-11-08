package NurikWare;

public record class11863(float stiffness, float damping, float mass, float positionEpsilon, float velocityEpsilon, float maxStepSeconds) implements class09815 {
   public static Object R_0;
   public static Object R_1;
   public static Object R_2;
   public static Object R_3;
   public static Object R_4;
   public static Object R_5;
   public static Object R_6 = new class11863(260.0F, 34.0F, 1.0F, 0.35F, 8.0F, 0.008333334F);

   public float L() {
      return this.stiffness;
   }

   public float M() {
      return this.mass;
   }

   public class11863(float stiffness, float damping, float mass, float positionEpsilon, float velocityEpsilon, float maxStepSeconds) {
      super();
      stiffness = N(stiffness);
      damping = N(damping);
      mass = N(mass, 1.0F);
      positionEpsilon = N(positionEpsilon);
      velocityEpsilon = N(velocityEpsilon);
      maxStepSeconds = N(maxStepSeconds, 0.008333334F);
      this.stiffness = stiffness;
      this.damping = damping;
      this.mass = mass;
      this.positionEpsilon = positionEpsilon;
      this.velocityEpsilon = velocityEpsilon;
      this.maxStepSeconds = maxStepSeconds;
   }

   static {
      E();
   }

   public float B() {
      return this.velocityEpsilon;
   }

   public float i() {
      return this.damping;
   }

   @Override
   public boolean u() {
      return true;
   }

   public float y() {
      return this.positionEpsilon;
   }

   private static void E() {
      R_0 = 260.0F;
      R_1 = 34.0F;
      R_2 = 1.0F;
      R_3 = 0.35F;
      R_4 = 8.0F;
      R_5 = 0.008333334F;
      R_6 = null;
   }

   private static float N(float var0) {
      return Float.isFinite(var0) ? Math.max(0.0F, var0) : 0.0F;
   }

   @Override
   public boolean N(class09782 var1) {
      return var1 == class09782.FLOAT || var1 == class09782.AXIS_SIZE || var1 == class09782.COLOR || var1 == class09782.TRANSLATE_LENGTH;
   }

   @Override
   public class09780 N(class09736 var1, class09753 var2, class09753 var3) {
      if (var2.N() != var3.N()) {
         throw new IllegalArgumentException("Spring transitions require matching value kinds");
      } else {
         return (class09780)(switch (((int[])class11873.N_0)[var2.N().ordinal()]) {
            case 1 -> new class11833(var2.y(), var3.y(), this);
            case 2 -> new class11832(var2.u(), var3.u(), this);
            case 3 -> new class11879(var2.L(), var3.L(), this);
            case 4 -> new class11607(var2.i(), var3.i(), this);
            default -> throw new MatchException(null, null);
         });
      }
   }

   private static float N(float var0, float var1) {
      return Float.isFinite(var0) && var0 > 0.0F ? var0 : var1;
   }

   public static class11863 N() {
      return (class11863)R_6;
   }

   public float R() {
      return this.maxStepSeconds;
   }
}
