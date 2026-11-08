package page.langeweile.ok_zoomer.key_binds;

import minecraft.class04655;
import minecraft.class06384;
import minecraft.class06428;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.utils.ModUtils;

public class ZoomKeyBinds {
   private static final boolean ENABLE_EXTRA_KEY_BINDS = (Boolean)OkZoomerConfigManager.CONFIG.controls.extraKeyBinds.getRealValue();
   public static final class06384 ZOOM_CATEGORY = class06384.N(ModUtils.id("zoom"));
   public static final class06428 ZOOM_KEY = new class06428("key.ok_zoomer.zoom", 67, ZOOM_CATEGORY);
   public static final class06428 DECREASE_ZOOM_KEY = getExtraKeyBind("key.ok_zoomer.decrease_zoom");
   public static final class06428 INCREASE_ZOOM_KEY = getExtraKeyBind("key.ok_zoomer.increase_zoom");
   public static final class06428 RESET_ZOOM_KEY = getExtraKeyBind("key.ok_zoomer.reset_zoom");

   public ZoomKeyBinds() {
      super();
   }

   public static boolean areExtraKeyBindsEnabled() {
      return ENABLE_EXTRA_KEY_BINDS;
   }

   public static class06428 getExtraKeyBind(String var0) {
      return areExtraKeyBindsEnabled() ? new class06428(var0, class04655.yI.y(), ZOOM_CATEGORY) : null;
   }
}
