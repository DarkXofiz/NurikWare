package page.langeweile.ok_zoomer.events;

import minecraft.class04453;
import minecraft.class06202;
import page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.key_binds.ZoomKeyBinds;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

public class ManageZoomEvent {
   private static boolean lastZooming = false;
   private static boolean persistentZoom = false;
   private static boolean lastZoomWasSpyglass = false;

   public ManageZoomEvent() {
      super();
   }

   public static void startClientTick(class06202 var0) {
      if ((class04453)var0.T_4 != null) {
         boolean flag7;
         switch ((ConfigEnums$SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()) {
            case REQUIRE_ITEM:
            case BOTH:
               if (!ZoomUtils.hasSpyglass((class04453)var0.T_4)) {
                  flag7 = true;
                  break;
               }
            default:
               flag7 = false;
         }

         boolean flag = flag7;
         if (flag) {
            Zoom.setZooming(false);
            ZoomUtils.resetZoomDivisor(false);
            lastZooming = false;
         } else {
            if (!((ConfigEnums$ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()).equals(ConfigEnums$ZoomModes.HOLD)) {
               if (!persistentZoom) {
                  persistentZoom = true;
                  lastZooming = true;
                  ZoomUtils.resetZoomDivisor(false);
               }
            } else if (persistentZoom) {
               persistentZoom = false;
               lastZooming = true;
            }
            boolean flag1 = switch ((ConfigEnums$SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()) {
               case BOTH, REPLACE_ZOOM -> true;
               default -> false;
            };
            boolean flag2 = ZoomKeyBinds.ZOOM_KEY.R();
            boolean flag3 = ((class04453)var0.T_4).method_31550();
            boolean flag4 = flag2 || flag1 && flag3;
            if (flag4 != lastZooming) {
               boolean flag5 = (Boolean)OkZoomerConfigManager.CONFIG.controls.spyglassSounds.value();
               switch ((ConfigEnums$ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()) {
                  case HOLD:
                     Zoom.setZooming(flag4);
                     ZoomUtils.resetZoomDivisor(false);
                     break;
                  case TOGGLE:
                     if (flag4) {
                        Zoom.setZooming(!Zoom.isZooming());
                        ZoomUtils.resetZoomDivisor(false);
                     } else {
                        flag5 = false;
                     }
                     break;
                  case PERSISTENT:
                     Zoom.setZooming(true);
                     ZoomUtils.keepZoomStepsWithinBounds();
               }

               if (flag5 && !flag3 && !lastZoomWasSpyglass) {
                  boolean flag6 = !((ConfigEnums$ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()).equals(ConfigEnums$ZoomModes.PERSISTENT)
                     ? Zoom.isZooming()
                     : flag2;
                  ((class04453)var0.T_4).method_5783(flag6 ? ZoomUtils.ZOOM_IN_SOUND : ZoomUtils.ZOOM_OUT_SOUND, 1.0F, 1.0F);
               }

               lastZooming = flag4;
               lastZoomWasSpyglass = flag3 && !flag2;
            }
         }
      }
   }
}
