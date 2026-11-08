package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig.Section;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.annotations.FloatRange;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

public final class OkZoomerConfig$ControlsConfig extends Section {
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Uses the game's cinematic camera while zooming."})
   public final TrackedValue<Boolean> cinematicCamera = this.value(false);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Changes the speed of the cinematic camera."})
   @FloatRange(
      min = Float.MIN_NORMAL,
      max = 32.0
   )
   @RangeSubset(
      min = 1,
      max = 16
   )
   public final TrackedValue<Float> cinematicCameraSpeed = this.value(1.0F);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Reduces the mouse sensitivity proportionally to how far the zoom is."})
   public final TrackedValue<Boolean> reduceSensitivity = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"\"HOLD\": The zoom will require the zoom key to be held.\n\"TOGGLE\": The zoom will be toggled by the zoom key.\n\"PERSISTENT\": The zoom will always be enabled, with the zoom key being used for zoom scrolling.\n"})
   public final TrackedValue<ConfigEnums$ZoomModes> zoomMode = this.value(ConfigEnums$ZoomModes.HOLD);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Adds the spyglass's sounds effects on alternating zoom."})
   public final TrackedValue<Boolean> spyglassSounds = this.value(false);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Adds zoom manipulation keys along with the zoom key. A game restart will be required in order to apply the changes."})
   public final TrackedValue<Boolean> extraKeyBinds = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"\"OFF\": Zooming won't require a spyglass and won't replace its zoom.\n\"REQUIRE_ITEM\": Zooming will require a spyglass in order to work. This option is configurable through the ok_zoomer:zoom_dependencies item tag.\n\"REPLACE_ZOOM\": Zooming will replace the spyglass zoom but it won't require one in order to work.\n\"BOTH\": Zooming will act as a complete replacement of the spyglass zoom, requiring one to work and replacing its zoom as well.\n"})
   public final TrackedValue<ConfigEnums$SpyglassModes> spyglassMode = this.value(ConfigEnums$SpyglassModes.OFF);

   public OkZoomerConfig$ControlsConfig() {
      super();
   }
}
