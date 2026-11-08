package page.langeweile.ok_zoomer.utils;

import java.util.function.Predicate;
import minecraft.class04453;
import minecraft.class06584;
import net.fabricmc.fabric.api.tag.client.v1.ClientTags;
import net.fabricmc.loader.api.FabricLoader;

public class FabricZoomUtils {
   public static final Predicate<class06584> IS_VALID_SPYGLASS = var0 -> ClientTags.isInWithLocalFallback(ZoomUtils.ZOOM_DEPENDENCIES_TAG, var0.B());
   private static boolean openCommandScreen = false;

   public FabricZoomUtils() {
      super();
   }

   public static void setOpenCommandScreen(boolean var0) {
      openCommandScreen = var0;
   }

   public static boolean shouldOpenCommandScreen() {
      return openCommandScreen;
   }

   public static void addInitialPredicates() {
      ZoomUtils.addSpyglassProvider(var0 -> var0.method_31548().y(IS_VALID_SPYGLASS));
   }

   public static void defineSafeSmartOcclusion() {
      if (FabricLoader.getInstance().isModLoaded("sodium")) {
         ZoomUtils.enableSafeSmartOcclusion();
      }
   }
}
