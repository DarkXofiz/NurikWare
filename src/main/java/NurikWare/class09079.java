package NurikWare;

import java.util.Optional;

public enum class09079 {
   BLACK(900.0F),
   THIN(100.0F),
   EXTRA_LIGHT(200.0F),
   LIGHT(300.0F),
   REGULAR(400.0F),
   MEDIUM(500.0F),
   SEMI_BOLD(600.0F),
   BOLD(700.0F),
   EXTRA_BOLD(800.0F);
   public Float fields_0317b48171f8c3affbbd04c18f174f04f_0;
   public boolean fields_0317b48171f8c3affbbd04c18f174f04f_init;
   public static class09079[] staticFields_1317b48171f8c3affbbd04c18f174f04f_1 = values();
   // $VF: synthetic field
   private static final class09079[] $VALUES = L();

   private class09079(float var3) {
      this.R();
      this.fields_0317b48171f8c3affbbd04c18f174f04f_0 = var3;
   }

   private static void y() {
      THIN = null;
      EXTRA_LIGHT = null;
      LIGHT = null;
      REGULAR = null;
      MEDIUM = null;
      SEMI_BOLD = null;
      BOLD = null;
      EXTRA_BOLD = null;
      BLACK = null;
      staticFields_1317b48171f8c3affbbd04c18f174f04f_1 = null;
   }

   public static Optional<class09079> N(float var0) {
      for (class09079 class09079 : staticFields_1317b48171f8c3affbbd04c18f174f04f_1) {
         if (class09079.fields_0317b48171f8c3affbbd04c18f174f04f_0 == var0) {
            return Optional.of(class09079);
         }
      }

      return Optional.empty();
   }

   public float N() {
      return this.fields_0317b48171f8c3affbbd04c18f174f04f_0;
   }

   private void R() {
      if (!this.fields_0317b48171f8c3affbbd04c18f174f04f_init) {
         this.fields_0317b48171f8c3affbbd04c18f174f04f_init = true;
         this.fields_0317b48171f8c3affbbd04c18f174f04f_0 = 0.0F;
      }
   }
}
