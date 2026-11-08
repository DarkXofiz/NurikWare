package page.langeweile.ok_zoomer.config.screen;

import java.util.Locale;
import minecraft.class00392;
import minecraft.class01894;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.annotations.SerializedNameConvention;
import org.quiltmc.config.api.metadata.NamingScheme;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.ConfigEnums$ConfigEnum;

public class ConfigTextUtils {
   private final Config config;
   private final NamingScheme scheme;

   public ConfigTextUtils(Config var1) {
      super();
      this.config = var1;
      this.scheme = (NamingScheme)this.config.metadata(SerializedNameConvention.TYPE);
   }

   public class00392 getOptionTextTooltip(TrackedValue<?> var1) {
      return class00392.L(String.format("config.%s.%s.tooltip", this.config.family(), this.scheme.coerce(var1.key().toString())));
   }

   public class00392 getEnumOptionTextTooltip(TrackedValue<?> var1, ConfigEnums$ConfigEnum var2) {
      return class00392.L(
         String.format("config.%s.%s.%s.tooltip", this.config.family(), this.scheme.coerce(var1.key().toString()), var2.toString().toLowerCase(Locale.ROOT))
      );
   }

   public class00392 getSliderOptionText(TrackedValue<?> var1) {
      return class00392.L(String.format("config.%s.%s.%s", this.config.family(), this.scheme.coerce(var1.key().toString()), var1.value()));
   }

   public static class00392 getConfigTitle(class01894 var0) {
      return class00392.L("config." + var0.y() + ".title");
   }

   public class00392 getEnumOptionText(TrackedValue<?> var1, ConfigEnums$ConfigEnum var2) {
      return class00392.L(
         String.format("config.%s.%s.%s", this.config.family(), this.scheme.coerce(var1.key().toString()), var2.toString().toLowerCase(Locale.ROOT))
      );
   }

   public class00392 getCategoryText(String var1) {
      return class00392.L("config." + this.config.family() + "." + this.scheme.coerce(var1));
   }

   public class00392 getOptionText(TrackedValue<?> var1) {
      return class00392.L(String.format("config.%s.%s", this.config.family(), this.scheme.coerce(var1.key().toString())));
   }
}
