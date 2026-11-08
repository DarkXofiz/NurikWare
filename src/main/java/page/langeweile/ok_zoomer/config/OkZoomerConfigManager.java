package page.langeweile.ok_zoomer.config;

import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class08173;
import org.quiltmc.config.api.Config;
import page.langeweile.ok_zoomer.utils.ModUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;
import page.langeweile.ok_zoomer.zoom.modifiers.CinematicCameraMouseModifier;
import page.langeweile.ok_zoomer.zoom.modifiers.ContainingMouseModifier;
import page.langeweile.ok_zoomer.zoom.modifiers.MouseModifier;
import page.langeweile.ok_zoomer.zoom.modifiers.ZoomDivisorMouseModifier;
import page.langeweile.ok_zoomer.zoom.overlays.SpyglassZoomOverlay;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomOverlay;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomerZoomOverlay;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;
import page.langeweile.wrench_wrapper.api.WrenchWrapper;

public class OkZoomerConfigManager {
   public static final OkZoomerConfig CONFIG = WrenchWrapper.create("ok_zoomer", "config", OkZoomerConfig.class);

   public OkZoomerConfigManager() {
      super();
   }

   public static void init() {
      configureZoomInstance();
      CONFIG.registerCallback(var0 -> configureZoomInstance());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static FloatUnaryOperator getZoomTransitionOperator(ConfigEnums$ZoomTransitionModes var0) {
      return switch (var0) {
         case INSTANT -> var0x -> 1.0F;
         case LINEAR -> var0x -> var0x;
         case SMOOTH -> class08173::T;
         case SINE -> class08173::v;
         case BALANCED -> class08173::l;
         case SPRING -> var0x -> (float)(Math.pow(2.0, -10.0F * var0x) * class04995.m((var0x * 10.0F - 0.75F) * 1.5F) + 1.0);
      };
   }

   public static int getEndTransitionTicks() {
      return CONFIG.zoomTransition.endTransition.value() != ConfigEnums$ZoomTransitionModes.INSTANT
         ? (Integer)CONFIG.zoomTransition.endTransitionTicks.value()
         : 0;
   }

   public static int getScrollTransitionTicks() {
      return CONFIG.zoomScrolling.transition.value() != ConfigEnums$ZoomTransitionModes.INSTANT ? (Integer)CONFIG.zoomScrolling.transitionTicks.value() : 0;
   }

   public static int getStartTransitionTicks() {
      return CONFIG.zoomTransition.startTransition.value() != ConfigEnums$ZoomTransitionModes.INSTANT
         ? (Integer)CONFIG.zoomTransition.startTransitionTicks.value()
         : 0;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void configureZoomInstance() {
      Zoom.setTransitionMode(
         new EasedTransitionMode(
            getZoomTransitionOperator((ConfigEnums$ZoomTransitionModes)CONFIG.zoomTransition.startTransition.value()),
            getZoomTransitionOperator((ConfigEnums$ZoomTransitionModes)CONFIG.zoomTransition.endTransition.value()),
            getZoomTransitionOperator((ConfigEnums$ZoomTransitionModes)CONFIG.zoomScrolling.transition.value()),
            getStartTransitionTicks(),
            getEndTransitionTicks(),
            getScrollTransitionTicks(),
            (Boolean)CONFIG.zoomTransition.invertStartTransition.value(),
            (Boolean)CONFIG.zoomTransition.invertEndTransition.value()
         )
      );
      configureZoomModifier();
      class01894 class01894 = CONFIG.appearance.zoomOverlay.value() == ConfigEnums$ZoomOverlays.SPYGLASS
         ? class01894.y("textures/misc/spyglass_scope.png")
         : ModUtils.id("textures/misc/zoom_overlay.png");

      Zoom.setZoomOverlay((ZoomOverlay)(switch ((ConfigEnums$ZoomOverlays)CONFIG.appearance.zoomOverlay.value()) {
         case VIGNETTE -> new ZoomerZoomOverlay(class01894);
         case SPYGLASS -> new SpyglassZoomOverlay(class01894);
         default -> null;
      }));
   }

   public static void configureZoomModifier() {
      boolean flag = (Boolean)CONFIG.controls.cinematicCamera.value();
      boolean flag1 = (Boolean)CONFIG.controls.reduceSensitivity.value();
      if (flag) {
         CinematicCameraMouseModifier cinematiccameramousemodifier = new CinematicCameraMouseModifier((Float)CONFIG.controls.cinematicCameraSpeed.value());
         Zoom.setMouseModifier(
            (MouseModifier)(flag1 ? new ContainingMouseModifier(cinematiccameramousemodifier, new ZoomDivisorMouseModifier()) : cinematiccameramousemodifier)
         );
      } else {
         Zoom.setMouseModifier(flag1 ? new ZoomDivisorMouseModifier() : null);
      }
   }
}
