package page.langeweile.ok_zoomer.utils;

import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06581;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import page.langeweile.ok_zoomer.config.ConfigEnums$SeeDistantEntitiesModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.zoom.Zoom;

public class ZoomUtils {
   public static Logger LOGGER = LoggerFactory.getLogger("Ok Zoomer");
   public static final class03530<class06581> ZOOM_DEPENDENCIES_TAG = class03530.N(class04227.F, ModUtils.id("zoom_dependencies"));
   public static final class04891 ZOOM_IN_SOUND = class04891.N(ModUtils.id("zoom.zoom_in"));
   public static final class04891 ZOOM_OUT_SOUND = class04891.N(ModUtils.id("zoom.zoom_out"));
   public static final class04891 SCROLL_SOUND = class04891.N(ModUtils.id("zoom.scroll"));
   public static int zoomStep = 0;
   private static Predicate<class04453> hasSpyglass = var0 -> var0.method_68878();
   private static boolean safeSmartOcclusion = false;
   private static Float fadeModifier = null;

   public ZoomUtils() {
      super();
   }

   public static void enableSafeSmartOcclusion() {
      safeSmartOcclusion = true;
   }

   public static void keepZoomStepsWithinBounds() {
      zoomStep = class04995.N(zoomStep, 0, (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollStepLimit.value());
   }

   public static void addSpyglassProvider(Predicate<class04453> var0) {
      hasSpyglass = hasSpyglass.or(var0);
   }

   public static boolean canSeeDistantEntities() {
      return switch ((ConfigEnums$SeeDistantEntitiesModes)OkZoomerConfigManager.CONFIG.appearance.seeDistantEntities.value()) {
         case SAFE -> safeSmartOcclusion;
         case ON -> true;
         case OFF -> false;
      };
   }

   public static Float getFadeModifier() {
      return fadeModifier;
   }

   public static void setFadeModifier(Float var0) {
      fadeModifier = var0;
   }

   public static boolean hasSpyglass(class04453 var0) {
      return hasSpyglass.test(var0);
   }

   public static void resetZoomDivisor(boolean var0) {
      if (var0 || (Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.forgetScrollStep.value()) {
         int i = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollBase.value();
         int j = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollResolution.value();
         zoomStep = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.defaultScrollStep.value();
         Zoom.setZoomDivisor(Math.pow(i, (double)zoomStep / j));
      }
   }

   public static void changeZoomDivisor(boolean var0) {
      class06202 class06202 = class06202.Nq();
      int i = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollBase.value();
      int j = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollResolution.value();
      int k = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollStepLimit.value();
      byte b0 = 0;
      int l = zoomStep;
      zoomStep = var0 ? Math.min(zoomStep + 1, k) : Math.max(zoomStep - 1, -b0);
      double d0 = 1.0;
      if (zoomStep != 0) {
         d0 = Math.pow(i, (double)zoomStep / j);
         Zoom.setZoomDivisor(d0);
      } else {
         Zoom.setZoomDivisor(1.0);
      }

      if (l != zoomStep && (Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollSounds.value()) {
         ((class04453)class06202.T_4).method_5783(SCROLL_SOUND, 1.0F, 1.0F);
      }

      if ((Boolean)OkZoomerConfigManager.CONFIG.tweaks.debugScrolling.value()) {
         ((class04453)class06202.T_4).method_7353(class00392.y(zoomStep + " - " + d0), true);
      }
   }

   public static boolean hasSmartOcclusion() {
      return (Boolean)OkZoomerConfigManager.CONFIG.appearance.smartOcclusion.value() && safeSmartOcclusion;
   }
}
