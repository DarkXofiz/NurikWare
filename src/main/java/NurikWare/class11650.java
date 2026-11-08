package NurikWare;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
public class class11650 {
   static {
      try {
         N[QuadAtlas.BLOCK.ordinal()] = 1;
      } catch (NoSuchFieldError nosuchfielderror1) {
      }

      try {
         N[QuadAtlas.ITEM.ordinal()] = 2;
      } catch (NoSuchFieldError nosuchfielderror) {
      }
   }
}
