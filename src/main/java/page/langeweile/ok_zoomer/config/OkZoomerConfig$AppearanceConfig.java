package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig.Section;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

public final class OkZoomerConfig$AppearanceConfig extends Section {
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Retains the interface when zooming."})
   public final TrackedValue<Boolean> persistentInterface = this.value(false);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Hides the crosshair while zooming."})
   public final TrackedValue<Boolean> hideCrosshair = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Divides the amount of view bobbing with the zoom divisor while zooming."})
   public final TrackedValue<Boolean> reduceViewBobbing = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Zooms the hand when zooming."})
   public final TrackedValue<Boolean> zoomHands = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"\"OFF\": Disables the zoom overlay.\n\"VIGNETTE\": Uses a vignette as the zoom overlay. The vignette texture can be found at assets/ok_zoomer/textures/misc/zoom_overlay.png\n\"SPYGLASS\": Uses the spyglass overlay as the zoom overlay.\n"})
   public final TrackedValue<ConfigEnums$ZoomOverlays> zoomOverlay = this.value(ConfigEnums$ZoomOverlays.OFF);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Improves performance by making the game render less of the world while zoomed in. This feature depends on the Sodium mod in order to work."})
   public final TrackedValue<Boolean> smartOcclusion = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Expands the entity distance while zooming in, allowing creatures and certain blocks to be seen from afar. This may have a performance impact during zoom."})
   public final TrackedValue<ConfigEnums$SeeDistantEntitiesModes> seeDistantEntities = this.value(ConfigEnums$SeeDistantEntitiesModes.SAFE);

   public OkZoomerConfig$AppearanceConfig() {
      super();
   }
}
