package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Objects;
import java.util.function.IntSupplier;
import org.lwjgl.opengl.GL33;

public record class11189(int unit, IntSupplier texture) implements class11211 {

   class11189(int unit, IntSupplier texture) {
      super();
      Objects.requireNonNull(texture, "texture");
      this.unit = unit;
      this.texture = texture;
   }

   @Override
   public int y() {
      return this.unit;
   }

   public IntSupplier N() {
      return this.texture;
   }

   @Override
   public void N(class09076 var1) {
      GlStateManager._activeTexture(this.unit);
      GlStateManager._bindTexture(this.texture.getAsInt());
      GL33.glBindSampler(this.unit - 33984, 0);
   }
}
