package page.langeweile.wrench_wrapper.api;

import net.fabricmc.loader.api.FabricLoader;
import org.jspecify.annotations.NonNull;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.implementor_api.ConfigEnvironment;
import page.langeweile.wrench_wrapper.impl.fabric.FabricWrapper;
import page.langeweile.wrench_wrapper.impl.quilt.QuiltWrapper;

public class WrenchWrapper {
   @NonNull
   public static <C extends ReflectiveConfig> C create(String var0, String var1, Class<C> var2) {
      return FabricLoader.getInstance().isModLoaded("quilt_loader") ? QuiltWrapper.create(var0, var1, var2) : FabricWrapper.create(var0, var1, var2);
   }

   public WrenchWrapper() {
      super();
   }

   @NonNull
   public static ConfigEnvironment getConfigEnvironment() {
      return FabricLoader.getInstance().isModLoaded("quilt_loader") ? QuiltWrapper.getConfigEnvironment() : FabricWrapper.getConfigEnvironment();
   }
}
