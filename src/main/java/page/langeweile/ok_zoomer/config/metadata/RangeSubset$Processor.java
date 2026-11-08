package page.langeweile.ok_zoomer.config.metadata;

import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;

public final class RangeSubset$Processor implements ConfigFieldAnnotationProcessor<RangeSubset> {
   public RangeSubset$Processor() {
      super();
   }

   public void process(RangeSubset var1, MetadataContainerBuilder<?> var2) {
      var2.metadata(RangeSubset.TYPE, var1x -> var1x.set(var1.min(), var1.max()));
   }
}
