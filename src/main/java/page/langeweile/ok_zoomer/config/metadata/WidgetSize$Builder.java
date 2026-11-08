package page.langeweile.ok_zoomer.config.metadata;

import org.quiltmc.config.api.metadata.MetadataType.Builder;

public final class WidgetSize$Builder implements Builder<WidgetSize$Size> {
   private WidgetSize$Size size = WidgetSize$Size.FULL;

   public WidgetSize$Builder() {
      super();
   }

   public void set(WidgetSize$Size var1) {
      this.size = var1;
   }

   public WidgetSize$Size build() {
      return this.size;
   }
}
