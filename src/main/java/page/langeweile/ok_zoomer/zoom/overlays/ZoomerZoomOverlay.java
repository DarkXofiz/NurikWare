package page.langeweile.ok_zoomer.zoom.overlays;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class02566;
import minecraft.class08394;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;

public class ZoomerZoomOverlay implements ZoomOverlay {
   private final class01894 textureId;
   private boolean active;

   @Override
   public void tick(boolean var1, double var2, EasedTransitionMode var4) {
      if (var1 || !var4.getActive()) {
         this.active = var1;
      }
   }

   public ZoomerZoomOverlay(class01894 var1) {
      super();
      this.textureId = var1;
      this.active = false;
   }

   @Override
   public boolean getActive() {
      return this.active;
   }

   @Override
   public void renderOverlay(class01054 var1, class02233 var2, EasedTransitionMode var3) {
      float f = var3.getFade(var2.N(true));
      int i = class02566.N(1.0F, f, f, f);
      var1.N(class08394.NS, this.textureId, 0, 0, 0.0F, 0.0F, var1.N(), var1.y(), var1.N(), var1.y(), i);
   }
}
