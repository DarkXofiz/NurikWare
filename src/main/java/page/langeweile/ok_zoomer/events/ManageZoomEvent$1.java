package page.langeweile.ok_zoomer.events;

import page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomModes;

// $VF: synthetic class
class ManageZoomEvent$1 {
   static {
      try {
         $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes[ConfigEnums$ZoomModes.HOLD.ordinal()] = 1;
      } catch (NoSuchFieldError nosuchfielderror5) {
      }

      try {
         $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes[ConfigEnums$ZoomModes.TOGGLE.ordinal()] = 2;
      } catch (NoSuchFieldError nosuchfielderror4) {
      }

      try {
         $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes[ConfigEnums$ZoomModes.PERSISTENT.ordinal()] = 3;
      } catch (NoSuchFieldError nosuchfielderror3) {
      }

      $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes = new int[ConfigEnums$SpyglassModes.values().length];

      try {
         $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[ConfigEnums$SpyglassModes.REQUIRE_ITEM.ordinal()] = 1;
      } catch (NoSuchFieldError nosuchfielderror2) {
      }

      try {
         $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[ConfigEnums$SpyglassModes.BOTH.ordinal()] = 2;
      } catch (NoSuchFieldError nosuchfielderror1) {
      }

      try {
         $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[ConfigEnums$SpyglassModes.REPLACE_ZOOM.ordinal()] = 3;
      } catch (NoSuchFieldError nosuchfielderror) {
      }
   }
}
