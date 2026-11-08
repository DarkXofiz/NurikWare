package page.langeweile.ok_zoomer.config.sodium;

import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen;
import page.langeweile.ok_zoomer.utils.ModUtils;

public class OkZoomerSodiumEntry implements ConfigEntryPoint {
   public OkZoomerSodiumEntry() {
      super();
   }

   public void registerConfigLate(ConfigBuilder var1) {
      var1.registerOwnModOptions()
         .setIcon(ModUtils.id("textures/sodium/icon.png"))
         .setColorTheme(var1.createColorTheme().setBaseThemeRGB(16768093))
         .addPage(
            var1.createExternalPage()
               .setName(class00392.L("config.ok_zoomer.sodium.page.zoom"))
               .setScreenConsumer(var0 -> class06202.Nq().N(new OkZoomerConfigScreen(var0)))
         );
   }
}
