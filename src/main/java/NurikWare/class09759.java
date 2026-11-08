package NurikWare;

public enum class09759 {
   LINEAR,
   EASE,
   EASE_IN,
   EASE_OUT,
   EASE_IN_OUT,
   EASE_OUT_QUINT,
   STEP_START,
   STEP_END;

   private class09759() {
   }

   public float N(float var1) {
      float f = class09693.N(var1);

      return switch (this) {
         case LINEAR -> f;
         case EASE -> f * f * (3.0F - 2.0F * f);
         case EASE_IN -> f * f;
         case EASE_OUT -> 1.0F - (1.0F - f) * (1.0F - f);
         case EASE_IN_OUT -> f < 0.5F ? 2.0F * f * f : 1.0F - 2.0F * (1.0F - f) * (1.0F - f);
         case EASE_OUT_QUINT -> {
            float f1 = 1.0F - f;
            yield 1.0F - f1 * f1 * f1 * f1 * f1;
         }
         case STEP_START -> f <= 0.0F ? 0.0F : 1.0F;
         case STEP_END -> f < 1.0F ? 0.0F : 1.0F;
      };
   }
}
