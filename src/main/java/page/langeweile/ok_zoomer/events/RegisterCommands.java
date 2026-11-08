package page.langeweile.ok_zoomer.events;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class04348;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import page.langeweile.ok_zoomer.utils.FabricZoomUtils;

public class RegisterCommands {
   public RegisterCommands() {
      super();
   }

   public static void registerCommands(CommandDispatcher<FabricClientCommandSource> var0, class04348 var1) {
      var0.register((LiteralArgumentBuilder)ClientCommandManager.literal("ok_zoomer").executes(var0x -> {
         FabricZoomUtils.setOpenCommandScreen(true);
         return 0;
      }));
   }
}
