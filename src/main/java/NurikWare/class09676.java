package NurikWare;

import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06613;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AfterMouseScroll;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseRelease;

public class class09676 implements ClientModInitializer {
   public class09676() {
      super();
   }

   public void onInitializeClient() {
      class09678.N();
      ScreenEvents.BEFORE_INIT.register((BeforeInit)(var0, var1, var2, var3) -> {
         ScreenMouseEvents.allowMouseClick(var1).register((AllowMouseClick)(var1x, var2x) -> {
            class09690 class09690 = class09690.N(var2x.v());
            return class09690 != null ? !class09678.N(var1, var2x.n(), var2x.t(), class09690) : true;
         });
         ScreenMouseEvents.allowMouseRelease(var1).register((AllowMouseRelease)(var1x, var2x) -> {
            class09690 class09690 = class09690.N(var2x.v());
            return class09690 != null ? !class09678.y(var1, var2x.n(), var2x.t(), class09690) : true;
         });
         ScreenMouseEvents.afterMouseScroll(var1).register((AfterMouseScroll)(var1x, var2x, var4, var6, var8, var10) -> class09678.N(var1, var2x, var4, var8));
      });
   }
}
