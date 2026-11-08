package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig.Section;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.annotations.IntegerRange;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

public final class OkZoomerConfig$ZoomTransitionConfig extends Section {
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"\"INSTANT\": The zoom will abruptly transition between its off and on states.\n\"LINEAR\": The zoom will linearly transition between its off and on states.\n\"SMOOTH\": The zoom will smoothly transition between its off and on states using the game's smooth curve.\n\"SINE\": The zoom will smoothly transition between its off and on states using a sine curve.\n\"BALANCED\": The zoom will smoothly transition between its off and on states using cubic interpolation, balancing between linearity and smoothness.\n\"SPRING\": The zoom will bouncily transition between its off and on states. Avoid using it too often!\n"})
   public final TrackedValue<ConfigEnums$ZoomTransitionModes> startTransition = this.value(ConfigEnums$ZoomTransitionModes.SMOOTH);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"\"INSTANT\": The zoom will abruptly transition between its on and off states.\n\"LINEAR\": The zoom will linearly transition between its on and off states.\n\"SMOOTH\": The zoom will smoothly transition between its on and off states using the game's smooth curve.\n\"SINE\": The zoom will smoothly transition between its on and off states using a sine curve.\n\"BALANCED\": The zoom will smoothly transition between its on and off states using cubic interpolation, balancing between linearity and smoothness.\n\"SPRING\": The zoom will bouncily transition between its on and off states. Avoid using it too often!\n"})
   public final TrackedValue<ConfigEnums$ZoomTransitionModes> endTransition = this.value(ConfigEnums$ZoomTransitionModes.SMOOTH);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Controls how long the end transition should last for. 20 ticks is equal to 1 second."})
   @IntegerRange(
      min = 0L,
      max = 2147483647L
   )
   @RangeSubset(
      min = 0,
      max = 100
   )
   public final TrackedValue<Integer> startTransitionTicks = this.value(8);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Controls how long the start transition should last for. 20 ticks is equal to 1 second."})
   @IntegerRange(
      min = 0L,
      max = 2147483647L
   )
   @RangeSubset(
      min = 0,
      max = 100
   )
   public final TrackedValue<Integer> endTransitionTicks = this.value(8);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Inverts the start transition's curve."})
   public final TrackedValue<Boolean> invertStartTransition = this.value(false);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Inverts the end transition's curve."})
   public final TrackedValue<Boolean> invertEndTransition = this.value(false);

   public OkZoomerConfig$ZoomTransitionConfig() {
      super();
   }
}
