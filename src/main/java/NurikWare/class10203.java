package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class08066;
import org.jspecify.annotations.Nullable;

public class class10203 extends class08066 {
   public class10203(@Nullable String var1, int var2, int var3, boolean var4) {
      super(var1, var4);
      RenderSystem.assertOnRenderThread();
      this.N(var2, var3);
   }
}
