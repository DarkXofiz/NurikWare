package page.langeweile.ok_zoomer.zoom;

import page.langeweile.ok_zoomer.zoom.modifiers.MouseModifier;
import page.langeweile.ok_zoomer.zoom.modifiers.ZoomDivisorMouseModifier;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomOverlay;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;

public class Zoom {
   private static boolean zooming = false;
   private static double zoomDivisor = 4.0;
   private static EasedTransitionMode transitionMode = new EasedTransitionMode(var0 -> 1.0F, var0 -> 1.0F, var0 -> 1.0F, 0, 0, 0, false, false);
   private static MouseModifier mouseModifier = new ZoomDivisorMouseModifier();
   private static ZoomOverlay zoomOverlay = null;

   public Zoom() {
      super();
   }

   public static double getZoomDivisor() {
      return zoomDivisor;
   }

   public static void setZooming(boolean var0) {
      zooming = var0;
   }

   public static boolean isZooming() {
      return zooming;
   }

   public static EasedTransitionMode getTransitionMode() {
      return transitionMode;
   }

   public static MouseModifier getMouseModifier() {
      return mouseModifier;
   }

   public static boolean isModifierActive() {
      return mouseModifier != null && mouseModifier.getActive();
   }

   public static boolean isOverlayActive() {
      return zoomOverlay != null && zoomOverlay.getActive();
   }

   public static boolean isTransitionActive() {
      return transitionMode.getActive();
   }

   public static ZoomOverlay getZoomOverlay() {
      return zoomOverlay;
   }

   public static void setZoomDivisor(double var0) {
      zoomDivisor = var0;
   }

   public static void setMouseModifier(MouseModifier var0) {
      mouseModifier = var0;
   }

   public static void setTransitionMode(EasedTransitionMode var0) {
      transitionMode = var0;
   }

   public static void setZoomOverlay(ZoomOverlay var0) {
      zoomOverlay = var0;
   }
}
