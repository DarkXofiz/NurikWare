package NurikWare;

import java.util.Locale;

public record class09838(String family, float weight, class09870 slant) {
   public static final class09838 N = new class09838(null, 0.0F, null);

   public class09870 L() {
      return this.slant;
   }

   public class09838(String family, float weight, class09870 slant) {
      super();
      family = N(family);
      weight = N(weight);
      slant = slant == null ? class09870.NORMAL : slant;
      this.family = family;
      this.weight = weight;
      this.slant = slant;
   }

   public class09838(String var1, float var2) {
      this(var1, var2, class09870.NORMAL);
   }

   public float y() {
      return this.weight;
   }

   public String N() {
      return this.family;
   }

   private static String N(String var0) {
      return var0 != null && !var0.isBlank() ? var0.trim().toLowerCase(Locale.ROOT) : "default";
   }

   private static float N(float var0) {
      if (var0 < 1.0F) {
         return 400.0F;
      } else {
         return var0 < 100.0F ? 100.0F : Math.min(var0, 900.0F);
      }
   }
}
