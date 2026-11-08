package page.langeweile.wrench_wrapper.impl.fabric;

import net.fabricmc.loader.api.FabricLoader;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.Serializer;
import org.quiltmc.config.api.serializers.Json5Serializer;
import org.quiltmc.config.implementor_api.ConfigEnvironment;
import org.quiltmc.config.implementor_api.ConfigFactory;

public class FabricWrapper {
   private static final ConfigEnvironment CONFIG_ENVIRONMENT = new ConfigEnvironment(
      FabricLoader.getInstance().getConfigDir(), Json5Serializer.INSTANCE, new Serializer[]{Json5Serializer.INSTANCE}
   );

   public static <C extends ReflectiveConfig> C create(String var0, String var1, Class<C> var2) {
      return (C)ConfigFactory.create(CONFIG_ENVIRONMENT, var0, var1, var2);
   }

   public FabricWrapper() {
      super();
   }

   public static ConfigEnvironment getConfigEnvironment() {
      return CONFIG_ENVIRONMENT;
   }
}
