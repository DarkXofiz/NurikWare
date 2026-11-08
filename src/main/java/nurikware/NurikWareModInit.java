package nurikware;

import net.fabricmc.api.ClientModInitializer;

public class NurikWareModInit implements ClientModInitializer {
   public NurikWareModInit() {
      super();
   }

   public void onInitializeClient() {
      System.out.println("[NurikWareMod] Initializing NurikWare Client Mod (Fabric)...");

      try {
         try {
            Class<?> oclass = Class.forName("NurikWare.class09948");
            oclass.getMethod("N").invoke(null);
            System.out.println("[NurikWareMod] NurikWare Remapper initialized successfully.");
         } catch (Throwable throwable1) {
            System.out.println("[NurikWareMod] Remapper init: " + throwable1.getMessage());
         }

         try {
            Class<?> oclass1 = Class.forName("NurikWare.class11938");
            oclass1.getMethod("l").invoke(null);
            System.out.println("[NurikWareMod] NurikWare Core engine initialized successfully.");
         } catch (Throwable throwable) {
            System.out.println("[NurikWareMod] Core engine init: " + throwable.getMessage());
         }

         System.out.println("[NurikWareMod] NurikWare Mod Ready!");
      } catch (Throwable throwable2) {
         System.err.println("[NurikWareMod] Error during NurikWare initialization: " + throwable2.getMessage());
         throwable2.printStackTrace();
      }
   }
}
