package page.langeweile.ok_zoomer.config.metadata;

import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;

public final class WidgetSize$Processor implements ConfigFieldAnnotationProcessor<WidgetSize> {
   public WidgetSize$Processor() {
      super();
   }

   public void process(WidgetSize var1, MetadataContainerBuilder<?> var2) {
      var2.metadata(WidgetSize.TYPE, var1x -> var1x.set(var1.value()));
   }
}
