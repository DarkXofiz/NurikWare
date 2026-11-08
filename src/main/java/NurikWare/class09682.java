package NurikWare;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import minecraft.class05096;

public class class09682 implements ModMenuApi {
   public class09682() {
      super();
   }

   public ConfigScreenFactory<?> getModConfigScreenFactory() {
      return var0 -> new class09663(var0);
   }
}
