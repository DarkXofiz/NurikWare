package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.annotations.SerializedNameConvention;
import org.quiltmc.config.api.metadata.NamingSchemes;

@SerializedNameConvention(NamingSchemes.SNAKE_CASE)
public class OkZoomerConfig extends ReflectiveConfig {
   @Comment({"Options affecting the transitions between zooming in and zooming out."})
   public final OkZoomerConfig$ZoomTransitionConfig zoomTransition = new OkZoomerConfig$ZoomTransitionConfig();
   @Comment({"Options affecting the visual aspects of zooming."})
   public final OkZoomerConfig$AppearanceConfig appearance = new OkZoomerConfig$AppearanceConfig();
   @Comment({"Options affecting the way zooming is controlled."})
   public final OkZoomerConfig$ControlsConfig controls = new OkZoomerConfig$ControlsConfig();
   @Comment({"Options affecting the Zoom Scrolling feature."})
   public final OkZoomerConfig$ZoomScrollingConfig zoomScrolling = new OkZoomerConfig$ZoomScrollingConfig();
   @Comment({"Technical options that don't fit elsewhere."})
   public final OkZoomerConfig$TweaksConfig tweaks = new OkZoomerConfig$TweaksConfig();

   public OkZoomerConfig() {
      super();
   }
}
