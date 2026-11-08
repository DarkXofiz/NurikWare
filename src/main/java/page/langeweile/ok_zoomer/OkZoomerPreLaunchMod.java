package page.langeweile.ok_zoomer;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Processor;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Processor;

public class OkZoomerPreLaunchMod implements PreLaunchEntrypoint {
   public OkZoomerPreLaunchMod() {
      super();
   }

   public void onPreLaunch() {
      ConfigFieldAnnotationProcessor.register(WidgetSize.class, new WidgetSize$Processor());
      ConfigFieldAnnotationProcessor.register(RangeSubset.class, new RangeSubset$Processor());
   }
}
