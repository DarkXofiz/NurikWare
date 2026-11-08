package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig.Section;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

public final class OkZoomerConfig$TweaksConfig extends Section {
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"a"})
   public final TrackedValue<Boolean> numericSliders = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Adds a button to open Ok Zoomer settings next to the zoom key bind."})
   public final TrackedValue<Boolean> showSettingsOnKey = this.value(true);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Displays debug information for exponential zoom scrolling. Currently it may help with configuring the zoom scrolling."})
   public final TrackedValue<Boolean> debugScrolling = this.value(false);
   @WidgetSize(WidgetSize$Size.HALF)
   @Comment({"Prints a random owo in the console when the game starts."})
   public final TrackedValue<Boolean> printOwoOnStart = this.value(true);

   public OkZoomerConfig$TweaksConfig() {
      super();
   }
}
