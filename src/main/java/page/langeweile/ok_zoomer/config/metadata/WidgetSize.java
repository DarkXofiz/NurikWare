package page.langeweile.ok_zoomer.config.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Optional;
import org.quiltmc.config.api.metadata.MetadataType;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface WidgetSize {
   MetadataType<WidgetSize$Size, WidgetSize$Builder> TYPE = MetadataType.create(() -> Optional.of(WidgetSize$Size.FULL), WidgetSize$Builder::new);

   WidgetSize$Size value();
}
