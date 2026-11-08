package page.langeweile.ok_zoomer.events;

import minecraft.class05096;
import minecraft.class06202;
import page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen;
import page.langeweile.ok_zoomer.utils.FabricZoomUtils;

public class OpenScreenEvent {
   public OpenScreenEvent() {
      super();
   }

   public static void endClientTick(class06202 var0) {
      if (FabricZoomUtils.shouldOpenCommandScreen()) {
         var0.N(new OkZoomerConfigScreen((class05096)var0.v_3));
         FabricZoomUtils.setOpenCommandScreen(false);
      }
   }
}
