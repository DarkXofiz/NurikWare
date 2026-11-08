package page.langeweile.ok_zoomer.zoom.overlays;

import minecraft.class01054;
import minecraft.class02233;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;

public interface ZoomOverlay {
   void tick(boolean var1, double var2, EasedTransitionMode var4);

   boolean getActive();

   default boolean cancelOverlayRendering() {
      return false;
   }

   void renderOverlay(class01054 var1, class02233 var2, EasedTransitionMode var3);

   default void tickBeforeRender(class02233 var1) {
   }
}
