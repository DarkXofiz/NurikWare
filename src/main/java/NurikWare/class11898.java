package NurikWare;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import minecraft.class08394;

public class class11898 {
   public static Object N_0 = class08394.N(
      RenderPipeline.builder(new Snippet[]{class08394.v})
         .withLocation(class11911.N("pipeline/mojang_logo_shadows"))
         .withBlend(new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE))
         .build()
   );

   private static void L() {
      N_0 = null;
   }

   private class11898() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }
}
